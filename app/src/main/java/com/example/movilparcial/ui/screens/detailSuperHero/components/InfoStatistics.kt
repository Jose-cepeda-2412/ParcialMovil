package com.example.movilparcial.ui.screens.detailSuperHero.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import com.example.movilparcial.ui.theme.textoPrincipal
import androidx.compose.ui.text.style.TextAlign

@Composable
fun InfoStatics(
    typeInfo: String,
    typeStatistics: Int,
    modifier: Modifier = Modifier
){
    Text(
        text = typeInfo + ": " + typeStatistics.toString(),
        color = textoPrincipal,
        fontSize = 13.sp,
        modifier = modifier,
        textAlign = TextAlign.Center
    )
}