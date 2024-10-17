package com.stu71954.assignment2navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument



// Here we sets up the navigation graph for the app,
// it will define the routes and arguments for each screen and will do the navigation between them.
// I did the navigation in a separate file from the MainActivity.kt file to make the code more organized and easier to read.
@Composable
fun Navigation() { // This function is called in the setContent block of the MainActivity.kt file.
    val navCont = rememberNavController() // Creates a navController to manage the app navigation and will make it remember the navigation controller.
    NavHost(navController = navCont, startDestination = "LandingPage", builder = {
        //Here I set up the navigation host with navCont and the start destination as "LandingPage".
        composable(route = "LandingPage")
        {
            LandingPage(navCont)
        }

        composable(
            route = "SecondScreen/{name}", //This is the route for the SecondScreen composable function and i declared an argument called "name" which will be passed to the SecondScreen composable function.
            arguments = listOf(navArgument("name") {
                type = NavType.StringType
                //type = NavType.StringType // Here I set the type of the argument to be passed to the SecondScreen composable function.
            })
        )
        { backStackentry ->
            // Here I get the value of the argument from the backStackentry and pass it to the SecondScreen composable function.
            val uname =
                backStackentry.arguments?.getString("name") // Need to get value from here
            println(uname)
            SecondScreen(navCont, uname ?: "No name")
        }

        // Here I set up the navigation for the ThirdScreen composable function and pass the argument to it.
        // I also declared an argument called "name" which will be passed to the ThirdScreen composable function,
        // and will be used to calculate the number of vowels in the name, or any string passed to the ThirdScreen.
        composable(
            route = "ThirdScreen/{name}",
            arguments = listOf(navArgument("name") {
                type = NavType.StringType
            })
        ) { backStackEntry ->
            val uname = backStackEntry.arguments?.getString("name")
            ThirdScreen(navCont, uname ?: "No name")
        }
    })
}

