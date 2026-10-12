package com.example.movilparcial.ui.utils

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.movilparcial.ui.theme.fondoPantalla
import androidx.compose.ui.tooling.preview.Preview
@Composable
fun FondoPantalla(
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier.fillMaxSize()
            .background(color = fondoPantalla)

    ){

    }
}

@Preview
@Composable
fun FondoPantallaPreview() {
    FondoPantalla()
}

