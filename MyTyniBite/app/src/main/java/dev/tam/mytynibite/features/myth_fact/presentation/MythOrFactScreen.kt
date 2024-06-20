package dev.tam.mytynibite.features.myth_fact.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import dev.tam.mytynibite.features.myth_fact.data.MythOrFactData
import dev.tam.mytynibite.ui.theme.background

@Composable
fun MythOrFactScreen() {
    MythOrFact()
}

@Composable
fun MythOrFact() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(background)
            .padding(16.dp)
    ) {
        items(MythOrFactData.mythOrFactDummies) {
            FlipCard(mythOrFact = it, modifier = Modifier.padding(vertical = 8.dp))
        }
    }
}