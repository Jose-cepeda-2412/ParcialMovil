package com.example.movilparcial.ui.screens.detailSuperHero.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.movilparcial.data.dataClassScreens.InfoSuperHero
import androidx.compose.material3.Card
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.CardDefaults
import com.example.movilparcial.ui.theme.fondoTarjeta
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.unit.dp
import com.example.movilparcial.ui.utils.PublisherSuperhero
import com.example.movilparcial.ui.utils.FullNameSuperHero
import com.example.movilparcial.ui.utils.NameSuperhero

@Composable
fun CardDetailSuperHero(
    infoSuperHero: InfoSuperHero,
    modifier: Modifier = Modifier
){
    Card(
        modifier = modifier.fillMaxWidth()
            .padding(8.dp),
        colors = CardDefaults.cardColors(
            containerColor = fondoTarjeta
        )
    ){
        Column(
            modifier = modifier.fillMaxWidth()
        ){
            NameSuperhero(
                nameSuperHero = infoSuperHero.nameSuperHero
            )
            FullNameSuperHero(
                fullNameSuperHero = infoSuperHero.fullNameSuperHero
            )
            PublisherSuperhero(
                publisherSuperHero = infoSuperHero.publisherSuperHero
            )

        }
    }
}
