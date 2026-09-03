package com.senai.carteirinhadigital.feature.Login.domain.model

data class UsuarioLogado(
    val id: String,
    val nome: String,
    val curso: String,
    val turma: String,
    val token: String,
    val trabalho: String


)