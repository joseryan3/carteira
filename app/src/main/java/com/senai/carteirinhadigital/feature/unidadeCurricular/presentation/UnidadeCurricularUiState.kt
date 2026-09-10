package com.senai.carteirinhadigital.feature.unidadeCurricular.presentation

import com.senai.carteirinhadigital.feature.unidadeCurricular.domain.model.UnidadeCurricular

data class UnidadeCurricularUiState (
    val isLoading: Boolean = false,
    val listaUnidades: List<UnidadeCurricular> = emptyList(),
    val errorMensage: String? = null
)