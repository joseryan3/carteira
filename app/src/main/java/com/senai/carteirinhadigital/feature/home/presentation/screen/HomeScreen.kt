package com.senai.carteirinhadigital.feature.home.presentation.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.senai.carteirinhadigital.app.navigation.Routes
import com.senai.carteirinhadigital.feature.Login.domain.model.UsuarioLogado

@Composable
fun HomeScreen(
    navController: NavController,
    modifier: Modifier = Modifier,
    usuarioLogado: UsuarioLogado
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "Tela Home",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            style = TextStyle(
                shadow = Shadow(
                    color = Color.Gray,
                    offset = Offset(2f, 2f),
                    blurRadius = 8f
                )
            )
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Aluno",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = usuarioLogado.nome,
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = usuarioLogado.curso,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = usuarioLogado.turma,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = {
                navController.navigate(Routes.Carteirinha)
            }
        ) {
            Text("Carteirinha")
        }

        Spacer(modifier = Modifier.height(8.dp))

        Button(
            onClick = {
                navController.navigate(Routes.UCAluno)
            }
        ) {
            Text("Unidade Curricular")
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun HomeScreenPreview() {
    HomeScreen(
        navController = rememberNavController(),
        usuarioLogado = UsuarioLogado(
            id = "1",
            nome = "jose",
            curso = "Desenvolvimento de Sistemas",
            turma = "2DEVEST-A",
            token = "kandioanda",
            trabalho = "jhhhhhhh"

        )
    )
}
