package com.senai.carteirinhadigital.feature.auth.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.senai.carteirinhadigital.app.navigation.Routes.Login
import com.senai.carteirinhadigital.feature.auth.data.repository.FakeLoginRepositoryImpl
import com.senai.carteirinhadigital.feature.auth.data.repository.LoginRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class LoginViewModel (
    private val repository: LoginRepository = FakeLoginRepositoryImpl()
): ViewModel(){


    private val _uiState = MutableStateFlow(LoginUiState())
    val uiState: StateFlow<LoginUiState> = _uiState.asStateFlow()

    fun OnEvent(event: LoginEvent){
        when(event){
            is LoginEvent.OnUsuarioioChange->{
                _uiState.update { state ->
                    state.copy(usuario = event.value,
                        errorMenssage = null,


                    )
                }
            }
            is LoginEvent.OnSenhaChange->{
                _uiState.update { state ->
                    state.copy(senha = event.value,
                        errorMenssage = null,
                    )

                }
            }

            LoginEvent.OnEntrarClick -> fazerlogin()


        }
    }
    private suspend fun fazerlogin(){
        val state = _uiState.value
        if (state.usuario.isBlank() || state.senha.isBlank()){
            _uiState.update {
                state -> state.copy(errorMenssage = "Preencha login e senha"


                )
            }
            return
        }
        viewModelScope.launch {
            _uiState.update {
                it.copy(
                    isLoading = true,
                    errorMenssage =  null,
                    usuarioLogado = null
                )
            }
        }
        val result = repository.login(state.usuario.trim(), state.senha.trim())
    }
}
