package com.example.movilparcial.ui.screens.detailSuperHero.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import com.example.movilparcial.ui.theme.textoPrincipal
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun TitleHomeScreen(
    title: String,
    modifier: Modifier = Modifier
){
    Text(
        text = title,
        fontSize = 29.sp,
        color = textoPrincipal,
        modifier = modifier.padding(14.dp),
        fontWeight = FontWeight.Bold
    )
}