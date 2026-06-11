package com.senai.carteirinhadigital.feature.home.presentation.screen

import android.R.attr.button
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.senai.carteirinhadigital.app.navigation.Routes

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    navController: NavController
) {
    Column(
        modifier = modifier.fillMaxSize(), // Faz a tela ocupar todo o espaço disponível
        verticalArrangement = Arrangement.Center, // Centraliza os itens na vertical, ou seja, no meio da tela de cima para baixo
        horizontalAlignment = Alignment.CenterHorizontally, // Centraliza os itens na horizontal, ou seja, no meio da tela da esquerda para direita
    ) {

        Text(
            text = "Tela Home",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,

            style = TextStyle(
                shadow = Shadow(
                    color = Color(0xFF000000),
                    offset = Offset(2f, 2f),
                    blurRadius = 8f
                )
            )
        )
        Spacer(modifier = Modifier.height(8.dp))
        Button(
            onClick = {
                navController.navigate(Routes.Carteirinha)
            }
        ){
        Text("Carterinha")

        }

        Button(
            onClick = {
                navController.navigate(Routes.unidadeCurricular)
            }
        ) {
        Text("Unidade curricular")
        }



    }













}