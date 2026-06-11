package com.senai.carteirinhadigital.feature.unidadeCurricular.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.senai.carteirinhadigital.app.navigation.Routes
import com.senai.carteirinhadigital.feature.home.presentation.screen.HomeScreen
import com.senai.carteirinhadigital.feature.unidadeCurricular.domain.model.UnidadeCurricular
import com.senai.carteirinhadigital.feature.unidadeCurricular.presentation.screen.UnidadeCurricularScreen

fun NavGraphBuilder.unidadeCurrilar(
    navController: NavController
) {
    composable(Routes.unidadeCurricular) {
        UnidadeCurricularScreen(
            navController = navController
        )
    }
}

