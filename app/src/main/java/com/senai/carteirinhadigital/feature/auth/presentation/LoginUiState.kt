package com.senai.carteirinhadigital.feature.auth.presentation

import com.senai.carteirinhadigital.feature.auth.domain.model.UsuarioLogado


data class LoginUiState(
    val usuario: String = "",
    val senha: String = "",
    val isLoading: Boolean = false,
    val errorMenssage: String? = null,
    val usuarioLogado: UsuarioLogado? = null





){
    val loginRealizado: Boolean
        get() = usuarioLogado != null
}

