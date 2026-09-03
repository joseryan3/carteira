package com.senai.carteirinhadigital.feature.unidadeCurricular.presentation.screen

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.senai.carteirinhadigital.feature.unidadeCurricular.presentation.data.dataSouce


@Composable
fun UnidadeCurricularScreen(
    modifier: Modifier = Modifier
) {
    val unidadesCurriculares = dataSouce()

    UnidadeCurricularContent(
        unidadesCurriculares = unidadesCurriculares
    )


}