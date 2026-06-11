package com.senai.carteirinhadigital.feature.auth.presentation

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.senai.carteirinhadigital.app.navigation.Routes
import com.senai.carteirinhadigital.core.designesystem.component.theme.CarteirinhaDigitalTheme

@Composable
fun LoginScreen(
    modifier: Modifier = Modifier,
    navController: NavController
) {
    var login by remember { mutableStateOf("") }
    var senha by remember { mutableStateOf("") }
    var erro by remember { mutableStateOf(false) }

    Column(
        modifier = modifier.fillMaxSize(), // Faz a tela ocupar todo o espaço disponível
        verticalArrangement = Arrangement.Center, // Centraliza os itens na vertical, ou seja, no meio da tela de cima para baixo
        horizontalAlignment = Alignment.CenterHorizontally, // Centraliza os itens na horizontal, ou seja, no meio da tela da esquerda para direita
    ) {
        Text(
            text = "Login",
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(modifier = Modifier.height(16.dp))

        TextField(
            value = login,
            onValueChange = {
                login = it
                erro = false
            },
            label = { Text("Login") },
            isError = erro,
            singleLine = true,

        )

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = senha,
            onValueChange = {
                senha = it
                erro = false
            },
            label = { Text("Senha") },
            isError = erro,
            singleLine = true

        )

        // Exibe a mensagem de erro abaixo dos campos se 'erro' for true
        if (erro) {
            Text(
                text = "E-mail ou senha incorretos",
                color = MaterialTheme.colorScheme.secondary,
                style = MaterialTheme.typography.bodySmall
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {
                if (login == "teste" && senha == "1234") {
                    erro = false
                    navController.navigate(Routes.TelaHome)
                } else {
                    erro = true
                }
            },
            colors = ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.error, // Cor corrigida para legibilidade
                contentColor = MaterialTheme.colorScheme.onSecondary
            ),
            modifier = Modifier.width(200.dp),
            shape = RoundedCornerShape(8.dp), // Aumentei o arredondamento para ficar mais moderno
            border = BorderStroke(
                width = 1.dp,
                color = MaterialTheme.colorScheme.onSecondary
            ),
        ) {
            Text("Entrar")
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun LoginScreenPreview() {
    CarteirinhaDigitalTheme(darkTheme = false) {
        // Criamos um NavController falso apenas para o Preview não quebrar
        val navController = rememberNavController()
        LoginScreen(navController = navController)
    }
}