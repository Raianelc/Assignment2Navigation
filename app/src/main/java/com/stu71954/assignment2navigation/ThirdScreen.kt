package com.stu71954.assignment2navigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController



// This is the ThirdScreen composable function
@Composable
fun ThirdScreen(navController: NavController, userName: String) {
    val vowelCount  = userName.count { it.uppercase() in "AEIOU" }
//I'm using a val called vowelCount to count the number of vowels in the username passed from the SecondScreen composable function.
// I'm also using the .uppercase() function to convert the username to uppercase before counting the vowels.

    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Text(text = "Number of vowels: $vowelCount")
        //on this text composable function I'm displaying the number of vowels in the username passed from the SecondScreen composable function
        //using the $vowelCount variable

        Button(onClick = {
            navController.navigate("LandingPage")
        }) {
            Text(text = "Click here for LandingPage Screen ")
        }
        Button(onClick = {
            navController.navigate("SecondScreen/" + userName)
        }) {
            Text(text = "Click here for Second Screen")
        }
        //Here I have two Button composable functions to navigate to the LandingPage or the SecondScreen.
        //The value of the userName variable will be passed as an argument to the SecondScreen composable function.
    }
}