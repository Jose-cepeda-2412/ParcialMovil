package com.example.movilparcial.ui.utils

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.movilparcial.ui.theme.textoPrincipal

@Composable
fun PublisherSuperhero(
    publisherSuperHero: String,
    modifier: Modifier = Modifier
){
    Text(
        text = "Publicador: " + publisherSuperHero,
        modifier = modifier.padding(8.dp),
        color = textoPrincipal,
        fontSize = 13.sp
    )

}