package com.senai.carteirinhadigital.feature.Login.data.repository

import com.senai.carteirinhadigital.feature.Login.domain.model.UsuarioLogado

interface LoginRepository {
    suspend fun login(usuario:String, senha: String): Result<UsuarioLogado>


}