package com.senai.carteirinhadigital.feature.unidadeCurricular.domain.repository

import com.senai.carteirinhadigital.feature.unidadeCurricular.domain.model.UnidadeCurricular

interface UnidadeCurricularRepository {
    suspend fun listarUnidadesCurriculares(): Result<List<UnidadeCurricular>>
}