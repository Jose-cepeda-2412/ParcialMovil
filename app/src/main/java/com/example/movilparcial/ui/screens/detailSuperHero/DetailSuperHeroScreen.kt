package com.example.movilparcial.ui.screens.detailSuperHero

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import com.example.parcialmovil.data.dataClassScreens.InfoAppearance
import com.example.parcialmovil.data.dataClassScreens.StatisticsInfo
import com.example.movilparcial.data.dataClassScreens.InfoSuperHero
import androidx.compose.ui.Modifier
import com.example.movilparcial.ui.utils.FondoPantalla
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.ui.Alignment
import com.example.movilparcial.ui.screens.detailSuperHero.components.BackArrow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.movilparcial.ui.screens.detailSuperHero.components.CardAppearance
import com.example.movilparcial.ui.screens.detailSuperHero.components.TitleHomeScreen
import com.example.movilparcial.ui.utils.ImageHomeSuperHero
import com.example.movilparcial.ui.screens.detailSuperHero.components.CardDetailSuperHero
import com.example.movilparcial.ui.screens.detailSuperHero.components.CardStatistic

@Composable
fun DetailSuperHeroContent(
    infoAppearance: InfoAppearance,
    infoSuperHero: InfoSuperHero,
    statisticsInfo: StatisticsInfo,
    onBackClick: () -> Unit,
    modifier: Modifier = Modifier
){
    Box(
        modifier = modifier.fillMaxSize()
    ){
        FondoPantalla()
        Column(
            modifier = modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Start
            ) {
                BackArrow(onBackClick = onBackClick)
            }
            TitleHomeScreen(title = "Detalle del Superheroe")

            ImageHomeSuperHero(modifier = Modifier.size(200.dp))

            CardDetailSuperHero(infoSuperHero = infoSuperHero)


            TitleHomeScreen(title = "Estadisticas")

            CardStatistic(statisticsInfo = statisticsInfo)


            TitleHomeScreen(title = "Apariencia")

            CardAppearance(infoAppearance = infoAppearance)


        }

    }

}


@Composable
fun DetailSuperHeroScreen(
    infoAppearance: InfoAppearance,
    infoSuperHero: InfoSuperHero,
    statisticsInfo: StatisticsInfo,
    onBackClick: () -> Unit,
    modifier: Modifier = Modifier
){
    DetailSuperHeroContent(
        infoAppearance = infoAppearance,
        infoSuperHero = infoSuperHero,
        statisticsInfo = statisticsInfo,
        onBackClick = onBackClick
    )
}



@Preview(showBackground = true)
@Composable
fun DetailSuperHeroScreenPreview() {
    DetailSuperHeroScreen(
        infoSuperHero = previewInfoSuperHero,
        statisticsInfo = previewStatistics,
        infoAppearance = previewAppearance,
        onBackClick = {}
    )
}



private val previewInfoSuperHero = InfoSuperHero(
    id = 1,
    nameSuperHero = "Spider-Man",
    fullNameSuperHero = "Peter Parker",
    publisherSuperHero = "Marvel Comics"
)

private val previewStatistics = StatisticsInfo(
    intelligence = 90,
    strength = 80,
    speed = 75,
    durability = 85,
    power = 95,
    combat = 70
)

private val previewAppearance = InfoAppearance(
    gender = "Male",
    race = "Human",
    height = "178 cm",
    weight = "75 kg",
    eyeColor = "Brown",
    hairColor = "Brown"
)