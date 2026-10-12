package com.example.movilparcial.ui.screens.detailSuperHero.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.parcialmovil.data.dataClassScreens.InfoAppearance
import com.example.movilparcial.ui.theme.fondoTarjeta
@Composable
fun CardAppearance(
    infoAppearance: InfoAppearance,
    modifier: Modifier = Modifier
){
    Card(
        modifier = modifier.fillMaxWidth()
            .padding(8.dp),
        colors = CardDefaults.cardColors(
            containerColor = fondoTarjeta
        )
    ) {
        Row(
            modifier = Modifier.padding(8.dp).fillMaxWidth()
        ) {
            ApparenceInfo(
                infoAppearance = "Genero :" + infoAppearance.gender,
                modifier = modifier.weight(1f)
            )
            ApparenceInfo(
                infoAppearance = "Raza :" + infoAppearance.race,
                modifier = modifier.weight(1f)
            )
        }
        Row(
            modifier = Modifier.padding(8.dp).fillMaxWidth()
        ){
            ApparenceInfo(
                infoAppearance = "Estatura :" + infoAppearance.height,
                modifier = modifier.weight(1f)
            )

            ApparenceInfo(
                infoAppearance = "Peso :" + infoAppearance.weight,
                modifier = modifier.weight(1f)
            )
        }
        Row(
            modifier = Modifier.padding(8.dp).fillMaxWidth()
        ) {
            ApparenceInfo(
                infoAppearance = "Color de ojos :" + infoAppearance.eyeColor,
                modifier = modifier.weight(1f)
            )

            ApparenceInfo(
                infoAppearance = "Color del pelo :" + infoAppearance.hairColor,
                modifier = modifier.weight(1f)
            )
        }

    }
}

@Preview(showBackground = false)
@Composable
fun CradAppearancePreview() {
    CardAppearance(

        infoAppearance = InfoAppearance(
            gender = "Male",
            race = "Human",
            height = "178 cm",
            weight = "75 kg",
            eyeColor = "Brown",
            hairColor = "Brown"
        )
    )
}