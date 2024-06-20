package dev.tam.mytynibite.features.mainfood_recipe.presentation

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import dev.tam.mytynibite.features.mainfood_recipe.data.MainFood
import dev.tam.mytynibite.features.mainfood_recipe.data.MainFoodData
import dev.tam.mytynibite.ui.component.RecipeDetailItem

@Composable
fun MainFoodDetailScreen(mainFoodTitle: String?) {
    val mainFood = MainFoodData.mainFoodDummies.find { it.title == mainFoodTitle }
    mainFood?.let {
        MainFoodDetail(mainFood = it)
    }
}

@Composable
fun MainFoodDetail(mainFood: MainFood) {
    RecipeDetailItem(
        title = mainFood.title,
        image = mainFood.image,
        ageGroup = mainFood.ageGroup,
        energy = mainFood.nutrition.energy,
        protein = mainFood.nutrition.protein,
        fat = mainFood.nutrition.fat,
        ingredients = mainFood.ingredients,
        instructions = mainFood.instructions
    )
}

@Composable
@Preview(showSystemUi = true)
private fun MainFoodDetailPreview() {
    MainFoodDetail(mainFood = MainFoodData.mainFoodDummies.first())
}