package com.senai.carteirinhadigital.feature.unidadeCurricular.presentation.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.senai.carteirinhadigital.feature.unidadeCurricular.domain.model.UnidadeCurricular
import com.senai.carteirinhadigital.feature.unidadeCurricular.presentation.component.UnidadeCurricularCard


@Composable
fun UnidadeCurricularContent(
    modifier: Modifier = Modifier,
    unidadesCurriculares: List<UnidadeCurricular>
) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        items(unidadesCurriculares) { unidadeCurricular ->
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
    UnidadeCurricularContent(
        unidadesCurriculares = listOf(
            UnidadeCurricular(
                id = "1",
                nome = "Matematica",
                professor = "jorge",
                nota1 = 8.5,
                nota2 = 7.0,
                media = 8.90,
                faltas = 2),
            UnidadeCurricular(
                id = "2",
                nome = "Português",
                professor = "jacy",
                nota1 = 8.5,
                nota2 = 7.0,
                media = 8.90,
                faltas = 2),
            UnidadeCurricular(
                id = "3",
                nome = "Englesh",
                professor = "kley",
                nota1 = 8.5,
                nota2 = 7.0,
                media = 8.90,
                faltas = 2),
            )
    )
}