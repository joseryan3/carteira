package com.senai.carteirinhadigital.feature.carterinha.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.senai.carteirinhadigital.app.navigation.Routes
import com.senai.carteirinhadigital.feature.carterinha.presentation.CarterinhaScreen

fun NavGraphBuilder.carterinhaScreen(


    onNavigateToLogin: () -> Unit
){
    composable(Routes.Carteirinha) {
        CarterinhaScreen(
            onBackClick = onNavigateToLogin
        )
    }
}