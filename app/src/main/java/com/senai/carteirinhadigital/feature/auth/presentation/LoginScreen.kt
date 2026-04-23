package com.senai.carteirinhadigital.feature.auth.presentation

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.senai.carteirinhadigital.core.designesystem.component.theme.CarteirinhaDigitalTheme

@Composable

fun LoginScreen(
    onLoginClick: () -> Unit = {}
) {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        // Nome estilizado
        Text("Login")
        TextField(
            value = "",
            onValueChange = {},
            label = { Text("Email") }
        )
        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text("Senha") }
        )
        Button(
            onClick = onLoginClick,
            colors = ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.onError,
                contentColor = MaterialTheme.colorScheme.inverseSurface
            ),
            modifier = Modifier
                .width(200.dp),
                shape = RoundedCornerShape(2.dp),
                border = BorderStroke(
                    width = 2.dp,
                    color = MaterialTheme.colorScheme.scrim
                ),
        ) {
            Text("Entrar")
        }
    }
}
@Preview(showSystemUi = true,
showBackground = true
)
@Composable
fun LoginScreenPreview() {
    CarteirinhaDigitalTheme(
        darkTheme = true
    ) {
        LoginScreen()
    }
}





