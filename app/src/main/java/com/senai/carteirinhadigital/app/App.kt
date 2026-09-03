package com.senai.carteirinhadigital.app

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.senai.carteirinhadigital.app.navigation.AppNavHost
import com.senai.carteirinhadigital.core.designesystem.component.theme.CarteirinhaDigitalTheme
@Composable
fun App() {
    CarteirinhaDigitalTheme{
        val navController = rememberNavController()
        AppNavHost(
            navController = navController,
        )
    }
}