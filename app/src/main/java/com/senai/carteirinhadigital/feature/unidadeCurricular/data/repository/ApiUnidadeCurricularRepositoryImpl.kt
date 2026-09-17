package com.senai.carteirinhadigital.feature.unidadeCurricular.data.repository

import com.senai.carteirinhadigital.feature.unidadeCurricular.data.remote.service.UnidadeCurricularApi
import com.senai.carteirinhadigital.feature.unidadeCurricular.domain.model.UnidadeCurricular
import com.senai.carteirinhadigital.feature.unidadeCurricular.domain.repository.UnidadeCurricularRepository
import okio.IOException
import retrofit2.HttpException


class ApiUnidadeCurricularRepositoryImpl(
    private val api: UnidadeCurricularApi
) : UnidadeCurricularRepository {

    override suspend fun listarUnidadesCurriculares(): Result<List<UnidadeCurricular>> {
        return runCatching {
            api.listarUnidadesCurriculares().map {
                it.toDomain()
            }
        }.recoverCatching { throwable ->
            throw when (throwable) {
                is HttpException -> {
                    if (throwable.code() == 401) {
                        IllegalStateException("Sua sessão expirou. Faça login novamente.")
                    } else {
                        IllegalStateException("Erro ao carregar unidades curriculares (${throwable.code()}).")
                    }
                }
                is IOException ->
                    IllegalStateException("Não foi possível conectar à API.")
                else ->
                    IllegalStateException(throwable.message ?: "Erro ao carregar unidades curriculares.")
            }
        }
    }
}