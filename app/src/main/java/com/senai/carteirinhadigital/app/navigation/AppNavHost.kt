package com.senai.carteirinhadigital.app.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.senai.carteirinhadigital.feature.carterinha.navigation.carterinhaScreen


fun authScreen(onNavigateToCarterinha: Any) {}

@Composable
fun AppNavHost() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Routes.Login
    ){
        authScreen(
            onNavigateToCarterinha = {
                navController.navigate(Routes.Carteirinha)
            }
        )
        carterinhaScreen(
            onNavigateToLogin = {
                navController.navigate(Routes.Login)
            }
        )
    }
}