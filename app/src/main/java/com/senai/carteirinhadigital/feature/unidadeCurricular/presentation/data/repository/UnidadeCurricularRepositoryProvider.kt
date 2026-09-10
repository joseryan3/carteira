package com.senai.carteirinhadigital.feature.unidadeCurricular.presentation.data.repository

import com.senai.carteirinhadigital.feature.Login.data.remote.network.NetworkFactory

object UnidadeCurricularRepositoryProvider {
    fun provide(): UnidadeCurricularrRepository{
        return ApiUnidadeCurricularRepositoryImpl(
            NetworkFactory.createUnidadeCurricularApi()
        )
    }
}