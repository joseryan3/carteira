package com.senai.carteirinhadigital.feature.home.presentation.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.senai.carteirinhadigital.app.navigation.Routes
import com.senai.carteirinhadigital.feature.Login.domain.model.UsuarioLogado
import com.senai.carteirinhadigital.feature.home.presentation.screen.HomeScreen

fun NavGraphBuilder.homeScreen(
    navController: NavController,
    usuarioLogado: UsuarioLogado
) {
    composable(Routes.HomeAluno.route) {
        HomeScreen(
            navController = navController,
            usuarioLogado = usuarioLogado
        )
    }
}
