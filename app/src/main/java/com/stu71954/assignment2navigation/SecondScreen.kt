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



// This is the SecondScreen composable function
@Composable
fun SecondScreen(navController: NavController, userName:  String){

    // Same as the landing page, here I have the SecondScreen composable function
    // that takes a NavController parameter navController to manage the navigation.
    // I also have a String parameter userName to get the username passed from the LandingPage composable function.

    Column (
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,

        ) {

        Text(text = "$userName".uppercase())
        // Text composable function to display the username passed from the LandingPage composable function.
        // The username will be displayed in uppercase with the .uppercase() function.

        Button(onClick = {
            navController.navigate("LandingPage")
        }) {
            Text(text = "Click here for Start Screen ")
        }

        Button(onClick = {
            navController.navigate("ThirdScreen/$userName")
        }) {
            Text(text = "Click here for Third Screen")
        }

        //Here I have the Button composable function to navigate to the LandingPage or the ThirdScreen.
    }
}