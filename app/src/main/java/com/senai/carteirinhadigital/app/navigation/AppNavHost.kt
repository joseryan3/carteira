package com.senai.carteirinhadigital.app.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.senai.carteirinhadigital.app.navigation.Routes.unidadeCurricular
import com.senai.carteirinhadigital.feature.auth.navigation.authScreen
import com.senai.carteirinhadigital.feature.carterinha.navigation.carterinhaScreen
import com.senai.carteirinhadigital.feature.home.presentation.navigation.homeScreen
import com.senai.carteirinhadigital.feature.home.presentation.screen.HomeScreen
import com.senai.carteirinhadigital.feature.unidadeCurricular.domain.model.UnidadeCurricular
import com.senai.carteirinhadigital.feature.unidadeCurricular.navigation.unidadeCurrilar


@Composable
fun AppNavHost() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Routes.Login
    ){
        authScreen(
            navController
        )
        carterinhaScreen(
            onNavigateToLogin = {
                navController.navigate(Routes.Login)
            }
        )
        homeScreen(
            navController
        )
        unidadeCurrilar(
            navController
        )
    }
}