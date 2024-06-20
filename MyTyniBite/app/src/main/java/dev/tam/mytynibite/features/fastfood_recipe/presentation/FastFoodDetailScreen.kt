package dev.tam.mytynibite.features.fastfood_recipe.presentation

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import dev.tam.mytynibite.features.fastfood_recipe.data.FastFood
import dev.tam.mytynibite.features.fastfood_recipe.data.FastFoodData
import dev.tam.mytynibite.ui.component.RecipeDetailItem

@Composable
fun FastFoodDetailScreen(fastFoodTitle: String?) {
    val fastFood = FastFoodData.fastFoodDummies.find { it.title == fastFoodTitle }
    fastFood?.let {
        FastFoodDetail(fastFood = it)
    }

}

@Composable
fun FastFoodDetail(fastFood: FastFood) {
    RecipeDetailItem(
        title = fastFood.title,
        image = fastFood.image,
        ageGroup = fastFood.ageGroup,
        energy = fastFood.nutrition.energy,
        protein = fastFood.nutrition.protein,
        fat = fastFood.nutrition.fat,
        ingredients = fastFood.ingredients,
        instructions = fastFood.instructions
    )
}

@Composable
@Preview(showSystemUi = true)
private fun MainFoodDetailPreview() {
    FastFoodDetail(fastFood = FastFoodData.fastFoodDummies.first())
}