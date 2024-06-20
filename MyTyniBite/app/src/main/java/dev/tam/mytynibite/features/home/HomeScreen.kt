package dev.tam.mytynibite.features.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Fastfood
import androidx.compose.material.icons.filled.FoodBank
import androidx.compose.material.icons.filled.Psychology
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import dev.tam.mytynibite.Screen
import dev.tam.mytynibite.ui.component.CardDashboard
import dev.tam.mytynibite.ui.theme.background

@Composable
fun HomeScreen(navController: NavController) {
    Home(
        moveTo = { screen -> navController.navigate(screen.route) }
    )
}

@Composable
fun Home(
    moveTo: (Screen) -> Unit,
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(background)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Pilih Category",
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.titleLarge.copy(fontWeight = FontWeight.Bold),
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 24.dp),
        )
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            CardDashboard(
                title = "Menu Utama",
                icon = Icons.Default.FoodBank,
                navigateTo = { moveTo(Screen.MainFood) })
            CardDashboard(
                title = "Menu Camilan",
                icon = Icons.Default.Fastfood,
                navigateTo = { moveTo(Screen.FastFood) })
            CardDashboard(
                title = "Fun Fact",
                icon = Icons.Default.Psychology,
                navigateTo = { moveTo(Screen.MythOrFact) })
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun HomePreview() {
    Home(moveTo = {})
}