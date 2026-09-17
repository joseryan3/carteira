package com.senai.carteirinhadigital.app.di

import com.senai.carteirinhadigital.core.auth.SessionTokenStore
import com.senai.carteirinhadigital.feature.Login.domain.repository.LoginRepository
import com.senai.carteirinhadigital.feature.unidadeCurricular.domain.repository.UnidadeCurricularRepository

interface AppContainer {
    val sessionTokenStore : SessionTokenStore

    val loginRepository : LoginRepository

    val unidadeCurricularRepository : UnidadeCurricularRepository
}