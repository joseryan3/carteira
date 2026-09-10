package com.senai.carteirinhadigital.feature.unidadeCurricular.presentation.screen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.senai.carteirinhadigital.feature.unidadeCurricular.presentation.UnidadeCurricularViewModel


@Composable
fun UnidadeCurricularScreen(
    modifier: Modifier = Modifier,
    viewModel: UnidadeCurricularViewModel = viewModel(),
    token: String
) {
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()

    LaunchedEffect(token) {
        viewModel.carregar(token)
    }

    UnidadeCurricularContent(
        uiState = uiState,
        modifier = modifier.fillMaxSize(),
        viewModel = viewModel,
        token = token
    )

}