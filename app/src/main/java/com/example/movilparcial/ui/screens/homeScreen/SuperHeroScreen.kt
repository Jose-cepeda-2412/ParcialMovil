package com.example.movilparcial.ui.screens.homeScreen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import com.example.movilparcial.data.dataClassScreens.InfoSuperHero
import androidx.compose.ui.Modifier
import com.example.movilparcial.ui.utils.FondoPantalla
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import com.example.movilparcial.ui.screens.homeScreen.components.TitleScreen
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import com.example.movilparcial.ui.screens.homeScreen.components.CardSuperHero
@Composable
fun SuperHeroScreen(
    infoSuperHero: InfoSuperHero,
    modifier: Modifier = Modifier
) {
    SuperHeroContent(
        infoSuperHero = infoSuperHero
    )
}

@Composable
fun SuperHeroContent(
    infoSuperHero: InfoSuperHero,
    modifier: Modifier = Modifier
) {
    Box(modifier = modifier.fillMaxSize()){
        FondoPantalla()
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            TitleScreen()
            LazyColumn() {
                items(9){
                    CardSuperHero(infoSuperHero = infoSuperHero)
                }
            }
        }


    }

}

@Preview
@Composable
fun SuperHeroScreenPreview() {
    SuperHeroScreen(infoSuperHero = InfoSuperHero(
        id = 1,
        nameSuperHero = "Spiderman",
        fullNameSuperHero = "Peter Parker",
        publisherSuperHero = "Marvel"
    ))
}




