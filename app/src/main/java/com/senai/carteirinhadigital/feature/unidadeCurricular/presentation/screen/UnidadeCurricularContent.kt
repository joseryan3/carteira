package com.senai.carteirinhadigital.feature.unidadeCurricular.presentation.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role.Companion.Button
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.senai.carteirinhadigital.feature.unidadeCurricular.domain.model.UnidadeCurricular
import com.senai.carteirinhadigital.feature.unidadeCurricular.presentation.UnidadeCurricularUiState
import com.senai.carteirinhadigital.feature.unidadeCurricular.presentation.UnidadeCurricularViewModel
import com.senai.carteirinhadigital.feature.unidadeCurricular.presentation.component.UnidadeCurricularCard


@Composable
fun UnidadeCurricularContent(
    modifier: Modifier = Modifier,
    uiState: UnidadeCurricularUiState,
    viewModel: UnidadeCurricularViewModel = viewModel(),
    token: String
) {
    when{
        uiState.isLoading ->{

        }
        uiState.errorMensage != null ->{
            Column(
                modifier = modifier
                    .fillMaxSize()
                    .padding(24.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = uiState.errorMensage,
                    color = MaterialTheme.colorScheme.error
                )
                Button(
                    modifier = Modifier.padding(16.dp),
                    onClick = { viewModel.carregar(token)}
                ) {
                    Text(text = "Tentar Novamente")
                }
            }
        }
        uiState.listaUnidades.isEmpty() ->{
            Box(
                modifier = modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ){
                Text(
                    "Nenhuma unidade curricular foi encontrada"
                )
            }
        }
    }
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {




        items(uiState.listaUnidades) { unidadeCurricular ->
            UnidadeCurricularCard(unidadeCurricular = unidadeCurricular)
        }
    }



}

@Preview(
    showBackground = true,
    showSystemUi = true
)

@Composable
fun UnidadeCurricularContentPreview() {

}