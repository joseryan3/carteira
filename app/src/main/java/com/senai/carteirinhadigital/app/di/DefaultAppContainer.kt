package com.senai.carteirinhadigital.app.di

import com.senai.carteirinhadigital.core.auth.SessionTokenStore
import com.senai.carteirinhadigital.core.network.NetworkClient
import com.senai.carteirinhadigital.feature.Login.data.remote.service.AuthApi
import com.senai.carteirinhadigital.feature.Login.data.repository.ApiAuthRepositoryImpl
import com.senai.carteirinhadigital.feature.Login.data.repository.FakeLoginRepositoryImpl
import com.senai.carteirinhadigital.feature.Login.domain.repository.LoginRepository
import com.senai.carteirinhadigital.feature.unidadeCurricular.data.remote.service.UnidadeCurricularApi
import com.senai.carteirinhadigital.feature.unidadeCurricular.data.repository.ApiUnidadeCurricularRepositoryImpl
import com.senai.carteirinhadigital.feature.unidadeCurricular.domain.repository.UnidadeCurricularRepository

class DefaultAppContainer : AppContainer {
    override val sessionTokenStore : SessionTokenStore = SessionTokenStore()
    private val networkClient =
        NetworkClient(
            baseUrl = BASE_URL,
            sessionTokenStore = sessionTokenStore
        )

    private val authApi : AuthApi by lazy {
        networkClient.createPublic(
            AuthApi::class.java
        )
    }
    private val unidadeCurricularApi : UnidadeCurricularApi by lazy {
        networkClient.createAuthenticated(
            UnidadeCurricularApi::class.java
        )
    }
    override val loginRepository : LoginRepository by lazy {
        if (USE_FAKE_LOGIN_REPOSITORY ) {
            FakeLoginRepositoryImpl()
        } else {
            ApiAuthRepositoryImpl(
                api = authApi
            )
        }
    }
    override val unidadeCurricularRepository : UnidadeCurricularRepository by lazy {
        ApiUnidadeCurricularRepositoryImpl(
            api = unidadeCurricularApi
        )
    }
    companion object {
        private const val BASE_URL = "http://10.0.2.2:8080/"
        private const val USE_FAKE_LOGIN_REPOSITORY = false
    }
}