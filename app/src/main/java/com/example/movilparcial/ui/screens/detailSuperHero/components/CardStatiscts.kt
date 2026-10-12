package com.example.movilparcial.ui.screens.detailSuperHero.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import com.example.parcialmovil.data.dataClassScreens.StatisticsInfo
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.movilparcial.ui.theme.fondoTarjeta
import androidx.compose.material3.CardDefaults
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun CardStatistic(
    statisticsInfo: StatisticsInfo,
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
            modifier = modifier.padding(8.dp)
        ) {
            InfoStatics(
                typeInfo = "Inteligencia",
                typeStatistics = statisticsInfo.intelligence,
                modifier = Modifier.weight(1f)
            )
            InfoStatics(
                typeInfo = "Fuerza",
                typeStatistics = statisticsInfo.strength,
                modifier = Modifier.weight(1f)
            )
        }

        Row(
            modifier = modifier.padding(8.dp)
        ) {
            InfoStatics(
                typeInfo = "Velocidad",
                typeStatistics = statisticsInfo.speed,
                modifier = Modifier.weight(1f)
            )
            InfoStatics(
                typeInfo = "Resistencia",
                typeStatistics = statisticsInfo.durability,
                modifier = Modifier.weight(1f)
            )
        }

        Row(
            modifier = modifier.padding(8.dp)
        ) {
            InfoStatics(
                typeInfo = "Poder",
                typeStatistics = statisticsInfo.power,
                modifier = Modifier.weight(1f)
            )
            InfoStatics(
                typeInfo = "Combate",
                typeStatistics = statisticsInfo.combat,
                modifier = Modifier.weight(1f)
            )
        }

    }
}


@Preview(showBackground = true)
@Composable
fun CardPowerstatsPreview() {
    CardStatistic(
        statisticsInfo = StatisticsInfo(
            intelligence = 85,
            strength = 90,
            speed = 75,
            durability = 80,
            power = 95,
            combat = 88
        )
    )
}