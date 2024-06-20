package dev.tam.mytynibite.features.fastfood_recipe.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import dev.tam.mytynibite.Screen
import dev.tam.mytynibite.features.fastfood_recipe.data.FastFood
import dev.tam.mytynibite.features.fastfood_recipe.data.FastFoodData
import dev.tam.mytynibite.ui.component.RecipeListItem
import dev.tam.mytynibite.ui.theme.background

@Composable
fun FastFoodScreen(navController: NavController) {
    FastFood(
        navigateToDetal = { fastFood ->
            navController.navigate("${Screen.FastFoodDetail.route}/${fastFood.title}")
        }
    )
}

@Composable
fun FastFood(navigateToDetal: (FastFood) -> Unit) {
    LazyColumn(
        modifier = Modifier
            .fillMaxWidth()
            .background(background)
            .padding(16.dp)
    ) {
        items(FastFoodData.fastFoodDummies) {
            RecipeListItem(
                title = it.title,
                image = it.image,
                modifier = Modifier
                    .padding(vertical = 4.dp)
                    .clickable { navigateToDetal(it) }
            )
        }
    }
}

@Composable
@Preview
private fun MainFoodPreview() {
    FastFood(navigateToDetal = {})
}