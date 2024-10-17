package com.stu71954.assignment2navigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

// This is the LandingPage composable function,
// it will be the first screen that the user will see when the app is launched.

@Composable
fun LandingPage(navCont: NavHostController) {
    //here I have the LandingPage composable function that takes a NavHostController parameter navCont to manage the navigation.
    var userName by rememberSaveable { mutableStateOf("") }
    // Here I have a mutableState variable called userName to store the value of the username entered by the user in the TextField.

    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {

        Text(text = "Navigation")

        TextField(
            value = userName,
            onValueChange = { userName = it },
            label = { Text("UserName") },
        )
        // Here I have a TextField composable function to get the username from the user and store it in the userName variable.

        Button(onClick = {
            navCont.navigate("SecondScreen/" + userName)
        }) {
            Text(text = "Click here for Second Screen")
        }
    }
    // The Button composable function will navigate to the SecondScreen composable function when clicked.
    // The value of the userName variable will be passed as an argument to the SecondScreen composable function.


}