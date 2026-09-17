package com.senai.carteirinhadigital.feature.unidadeCurricular.presentation

import com.senai.carteirinhadigital.feature.unidadeCurricular.domain.model.UnidadeCurricular


data class UnidadeCurricularUiState(
    val listaUnidadesCurriculares: List<UnidadeCurricular> = emptyList(),
    val isLoading: Boolean = false,
    val errorMessage: String? = null
) {
}