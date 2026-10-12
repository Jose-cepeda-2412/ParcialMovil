package com.example.movilparcial.ui.utils

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.material3.Text
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.unit.sp
import com.example.movilparcial.ui.theme.textoPrincipal

@Composable
fun NameSuperhero(
    nameSuperHero: String,
    modifier: Modifier = Modifier
) {
    Text(
        text = "Nombre: " + nameSuperHero,
        modifier = modifier.padding(8.dp),
        color = textoPrincipal,
        fontSize = 13.sp
    )

}