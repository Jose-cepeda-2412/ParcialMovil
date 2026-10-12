package com.example.movilparcial.ui.screens.homeScreen.components

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import com.example.movilparcial.data.dataClassScreens.InfoSuperHero
import androidx.compose.ui.Modifier
import androidx.compose.material3.Card
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Row
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.CardDefaults
import com.example.movilparcial.ui.theme.fondoTarjeta
import com.example.movilparcial.ui.utils.FullNameSuperHero
import com.example.movilparcial.ui.utils.ImageHomeSuperHero
import com.example.movilparcial.ui.utils.NameSuperhero
import com.example.movilparcial.ui.utils.PublisherSuperhero

@Composable
fun CardSuperHero(
    infoSuperHero: InfoSuperHero,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.fillMaxWidth().padding(8.dp),
        colors = CardDefaults.cardColors(
            containerColor = fondoTarjeta
        )
    ) {
        Row(
            modifier = Modifier.fillMaxWidth()
        ){
            ImageHomeSuperHero()
            Column() {
                NameSuperhero(nameSuperHero = infoSuperHero.nameSuperHero)
                FullNameSuperHero(fullNameSuperHero = infoSuperHero.fullNameSuperHero)
                PublisherSuperhero(publisherSuperHero = infoSuperHero.publisherSuperHero)

            }




        }

    }

}

@Preview
@Composable
fun CardSuperHeroPreview(){
    CardSuperHero(
        infoSuperHero = InfoSuperHero(
            id = 1,
            nameSuperHero = "Spiderman",
            fullNameSuperHero = "Peter Parker",
            publisherSuperHero = "Marvel"
        )
    )
}

