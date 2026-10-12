package com.example.movilparcial.ui.screens.homeScreen.components

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.material3.Text
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.movilparcial.ui.theme.textoPrincipal


@Composable
fun TitleScreen(
    modifier: Modifier = Modifier
) {
    Text(
        text = "SuperHeroes",
        color = textoPrincipal,
        fontSize = 30.sp,
        modifier = modifier.padding(8.dp)
    )
}
