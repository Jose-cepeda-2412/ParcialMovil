package com.example.movilparcial.ui.screens.detailSuperHero.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.movilparcial.ui.theme.textoPrincipal
@Composable
fun ApparenceInfo(
    infoAppearance: String,
    modifier: Modifier = Modifier
){
    Text(
        text =  infoAppearance,
        color = textoPrincipal,
        fontSize = 13.sp,
        textAlign = TextAlign.Center,
        modifier = modifier.padding(8.dp)
    )
}

@Preview
@Composable
fun ApparenceInfoPreview() {
    ApparenceInfo(infoAppearance = "Genero : Male")
}