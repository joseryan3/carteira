package com.senai.carteirinhadigital.feature.unidadeCurricular.presentation.data.repository

import com.senai.carteirinhadigital.feature.unidadeCurricular.domain.model.UnidadeCurricular

interface UnidadeCurricularrRepository {
    suspend fun listarUnidades(
        token: String
    ): Result<List<UnidadeCurricular>>
}