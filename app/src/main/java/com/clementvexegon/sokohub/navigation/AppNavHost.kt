package com.clementvexegon.sokohub.navigation

import android.R.attr.type
import android.app.Service
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.christiandb845.sokohub.ui.screens.about.AboutScreen
import com.christiandb845.sokohub.ui.screens.auth.LoginScreen
import com.christiandb845.sokohub.ui.screens.auth.RegisterScreen
import com.christiandb845.sokohub.ui.screens.onboarding.OnboardingScreen
import com.christiandb845.sokohub.ui.screens.service.ServiceScreen
import com.clementvexegon.sokohub.ui.screens.intent.IntentScreen
import com.clementvexegon.sokohub.ui.screens.products.AddProductScreen
import com.clementvexegon.sokohub.ui.screens.products.UpdateProductScreen
import com.clementvexegon.sokohub.ui.screens.products.ViewProductScreen


@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUT_ONBOARDING
) {

    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(ROUT_HOME) {
            HomeScreen(navController)
        }
        composable(ROUT_ABOUT) {
            AboutScreen(navController)
        }

        composable(ROUT_LOGIN) {
            LoginScreen(navController)
        }


        composable(ROUT_REGISTER) {
            RegisterScreen(navController)
        }

        composable(ROUT_ONBOARDING) {
            OnboardingScreen(navController)
        }

        composable(ROUT_SERVICE) {
             ServiceScreen(navController)
        }

        composable(ROUT_INTENT) {
            IntentScreen(navController)
        }

        composable(ROUTE_ADD_PRODUCT) { AddProductScreen(navController) }

        composable(ROUTE_VIEW_PRODUCTS) { ViewProductScreen(navController) }

        composable(
            ROUTE_UPDATE_PRODUCT,
            arguments = listOf(navArgument("productId") { type = NavType.StringType })
        ) { backStackEntry ->
            val productId = backStackEntry.arguments?.getString("productId")!!
            UpdateProductScreen(navController, productId)
        }


    }
}

@Composable
fun HomeScreen(x0: NavHostController) {
    TODO("Not yet implemented")
}