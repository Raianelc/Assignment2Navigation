package com.stu71954.assignment2navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument


@Composable
fun Navigation() {
    val navCont = rememberNavController()
    NavHost(navController = navCont, startDestination = "LandingPage", builder = {
        composable(route = "LandingPage")
        {
            LandingPage(navCont)
        }
        composable(
            route = "SecondScreen/{name}",
            arguments = listOf(navArgument("name") {
                type = NavType.StringType
            })
        )
        { backStackentry ->
            val uname =
                backStackentry.arguments?.getString("name") // Need to get value from here
            println(uname)
            SecondScreen(navCont, uname ?: "No name")
        }
    })
}

