package com.example.movilparcial.ui.screens.detailSuperHero.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.movilparcial.R
import androidx.compose.foundation.layout.size
import com.example.movilparcial.ui.theme.textoPrincipal

@Composable
fun BackArrow(
    onBackClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    IconButton(
        onClick = {
            onBackClick()
        }
    ) {
        Icon(
            painter = painterResource(id = R.drawable.retroceso),
            contentDescription = "Back Arrow",
            tint = textoPrincipal,
            modifier = modifier.size(80.dp)
                .padding(7.dp)
        )
    }
}
