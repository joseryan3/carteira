package com.senai.carteirinhadigital.feature.auth.presentation

sealed interface LoginEvent {
    data class OnUsuarioioChange(val value: String) : LoginEvent
    data class OnSenhaChange(val  value: String) : LoginEvent
    data object OnEntrarClick: LoginEvent
    data object OnNavigacaoRealizada: LoginEvent
}