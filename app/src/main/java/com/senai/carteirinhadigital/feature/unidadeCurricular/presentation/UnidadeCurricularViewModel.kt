package com.senai.carteirinhadigital.feature.unidadeCurricular.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.senai.carteirinhadigital.feature.unidadeCurricular.domain.model.UnidadeCurricular
import com.senai.carteirinhadigital.feature.unidadeCurricular.presentation.data.repository.UnidadeCurricularRepositoryProvider
import com.senai.carteirinhadigital.feature.unidadeCurricular.presentation.data.repository.UnidadeCurricularrRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class UnidadeCurricularViewModel (
    private val repository: UnidadeCurricularrRepository = UnidadeCurricularRepositoryProvider.provide()
): ViewModel() {
    private val _uiState = MutableStateFlow(UnidadeCurricularUiState())
    val uiState: StateFlow<UnidadeCurricularUiState> = _uiState.asStateFlow()

    fun carregar(token: String){
        viewModelScope.launch {
            _uiState.update {
                it.copy(
                    isLoading = true,
                    errorMensage = null
                )
            }

            repository.listarUnidades(token)
                .onSuccess { listaUnidades ->
                    _uiState.update {
                        it.copy(
                            isLoading = false,
                            listaUnidades = listaUnidades,
                            errorMensage = null
                        )
                    }
                }
                .onFailure { throwable ->
                    _uiState.update {
                        it.copy(
                            isLoading = false,
                            errorMensage = throwable.message ?: "Error ao carregar as unidades curriculares."
                        )
                    }
                }
        }
    }

}