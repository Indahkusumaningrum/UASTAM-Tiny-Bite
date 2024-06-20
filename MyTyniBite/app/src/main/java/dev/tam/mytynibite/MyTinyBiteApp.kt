package dev.tam.mytynibite

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import dev.tam.mytynibite.features.fastfood_recipe.presentation.FastFoodDetailScreen
import dev.tam.mytynibite.features.fastfood_recipe.presentation.FastFoodScreen
import dev.tam.mytynibite.features.home.HomeScreen
import dev.tam.mytynibite.features.mainfood_recipe.presentation.MainFoodDetailScreen
import dev.tam.mytynibite.features.mainfood_recipe.presentation.MainFoodScreen
import dev.tam.mytynibite.features.myth_fact.presentation.MythOrFactScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTinyBiteApp(
    navController: NavHostController = rememberNavController(),
) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text(text = getCurrentRouteTitle(route = currentRoute)) },
                navigationIcon = {
                    if (currentRoute !in listOf(Screen.Home.route)) {
                        IconButton(onClick = { navController.navigateUp() }) {
                            Icon(
                                imageVector = Icons.Default.ArrowBack,
                                contentDescription = "Kembali"
                            )
                        }
                    }
                }
            )
        }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = Screen.Home.route, modifier = Modifier.padding(innerPadding)
        ) {
            composable(Screen.Home.route) {
                HomeScreen(navController = navController)
            }
            composable(Screen.MainFood.route) {
                MainFoodScreen(navController = navController)
            }
            composable(route = "${Screen.MainFoodDetail.route}/{mainFoodTitle}") { backStackEntry ->
                val mainFoodTitle = backStackEntry.arguments?.getString("mainFoodTitle")
                MainFoodDetailScreen(mainFoodTitle)
            }
            composable(Screen.FastFood.route) {
                FastFoodScreen(navController = navController)
            }
            composable("${Screen.FastFoodDetail.route}/{fastFoodTitle}") { backStackEntry ->
                val fastFoodTitle = backStackEntry.arguments?.getString("fastFoodTitle")
                FastFoodDetailScreen(fastFoodTitle)
            }
            composable(Screen.MythOrFact.route) {
                 MythOrFactScreen()
            }
        }
    }
}


sealed class Screen(val route: String) {
    data object MainFood : Screen("main_food")
    data object MainFoodDetail : Screen("main_food_detail")
    data object FastFood : Screen("fast_food")
    data object FastFoodDetail : Screen("fast_food_detail")
    data object Home : Screen("home")
    data object MythOrFact : Screen("myth_or_fact")
}

@Composable
fun getCurrentRouteTitle(route: String?): String {
    return when {
        route == null -> ""
        route == Screen.MainFood.route -> "Menu Utama"
        route.startsWith(Screen.MainFoodDetail.route) -> "Rincian Resep"
        route == Screen.FastFood.route -> "Menu Camilan"
        route.startsWith(Screen.FastFoodDetail.route) -> "Rincian Resep"
        route == Screen.Home.route -> "Tiny Bite"
        route == Screen.MythOrFact.route -> "Mitos Fakta"
        else -> ""
    }
}