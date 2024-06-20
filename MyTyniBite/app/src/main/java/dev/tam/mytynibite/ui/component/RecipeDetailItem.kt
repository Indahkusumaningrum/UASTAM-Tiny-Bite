package dev.tam.mytynibite.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.tam.mytynibite.features.mainfood_recipe.data.MainFoodData
import dev.tam.mytynibite.ui.theme.background

@Composable
fun RecipeDetailItem(
    modifier: Modifier = Modifier,
    title: String,
    image: Int,
    ageGroup: String,
    energy: String,
    protein: String,
    fat: String,
    ingredients: List<String>,
    instructions: List<String>,
) {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .verticalScroll(rememberScrollState())
    ) {
        Image(
            painter = painterResource(id = image),
            contentDescription = title,
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(4f / 3f),
            contentScale = ContentScale.Crop
        )

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(background)
                .padding(16.dp)
        ) {
            Text(
                text = title,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = ageGroup,
                fontSize = 16.sp,
                color = Color.Gray,
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Informasi Nutrisi",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Energy: $energy",
                fontSize = 16.sp,
            )

            Text(
                text = "Protein: $protein",
                fontSize = 16.sp,
            )

            Text(
                text = "Fat: $fat",
                fontSize = 16.sp,
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Bahan-Bahan",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
            )

            Spacer(modifier = Modifier.height(8.dp))

            ingredients.forEach { ingredient ->
                Text(
                    text = "• $ingredient",
                    fontSize = 16.sp,
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Cara Membuat",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
            )

            Spacer(modifier = Modifier.height(8.dp))

            instructions.forEachIndexed { index, instruction ->
                Text(
                    text = "${index + 1}. $instruction",
                    fontSize = 16.sp,
                )
                Spacer(modifier = Modifier.height(4.dp))
            }

            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}

@Composable
@Preview(showSystemUi = true)
fun RecipeDetailItemPreview() {
    val recipe = MainFoodData.mainFoodDummies.first()
    RecipeDetailItem(
        title = recipe.title,
        image = recipe.image,
        ageGroup = recipe.ageGroup,
        energy = recipe.nutrition.energy,
        protein = recipe.nutrition.protein,
        fat = recipe.nutrition.fat,
        ingredients = recipe.ingredients,
        instructions = recipe.instructions
    )
}