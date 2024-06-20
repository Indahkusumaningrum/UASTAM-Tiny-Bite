package dev.tam.mytynibite.features.mainfood_recipe.presentation

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
import dev.tam.mytynibite.features.mainfood_recipe.data.MainFood
import dev.tam.mytynibite.features.mainfood_recipe.data.MainFoodData
import dev.tam.mytynibite.ui.component.RecipeListItem
import dev.tam.mytynibite.ui.theme.background

@Composable
fun MainFoodScreen(navController: NavController) {
    MainFood(navigateToDetail = { mainFood ->
        navController.navigate("${Screen.MainFoodDetail.route}/${mainFood.title}")
    })
}

@Composable
fun MainFood(navigateToDetail: (MainFood) -> Unit) {
    LazyColumn(
        modifier = Modifier
            .fillMaxWidth()
            .background(background)
            .padding(16.dp)
    ) {
        items(MainFoodData.mainFoodDummies) {
            RecipeListItem(
                title = it.title,
                image = it.image,
                modifier = Modifier
                    .padding(vertical = 4.dp)
                    .clickable { navigateToDetail(it) }
            )
        }
    }
}

@Composable
@Preview(showSystemUi = true)
private fun MainFoodPreview() {
    MainFood(navigateToDetail = {})
}