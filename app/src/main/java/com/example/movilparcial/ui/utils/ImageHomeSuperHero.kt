package com.example.movilparcial.ui.utils

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.movilparcial.R
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.draw.clip
import androidx.compose.foundation.border
import com.example.movilparcial.ui.theme.colorBorde
import androidx.compose.ui.layout.ContentScale

@Composable
fun ImageHomeSuperHero(
    modifier: Modifier = Modifier
) {
    Image(
        painter = painterResource(id = R.drawable.spiderman),
        contentDescription = "Spiderman",
        modifier = modifier.size(100.dp)
            .clip(CircleShape)
            .border(
                width = 4.dp,
                color = colorBorde,
                shape = CircleShape
            ),
        contentScale = ContentScale.Crop
    )
}