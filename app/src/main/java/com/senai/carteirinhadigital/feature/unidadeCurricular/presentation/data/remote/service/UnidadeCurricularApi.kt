package com.senai.carteirinhadigital.feature.unidadeCurricular.presentation.data.remote.service

import com.senai.carteirinhadigital.feature.unidadeCurricular.domain.model.UnidadeCurricular
import com.senai.carteirinhadigital.feature.unidadeCurricular.presentation.data.remote.dto.UnidadeCurricularDTO
import retrofit2.http.GET
import retrofit2.http.Header

interface UnidadeCurricularApi {
    @GET("unidades-curricular")
    suspend fun listar(
        @Header("Authorization")
        authorization: String
    ) : List<UnidadeCurricularDTO>
}