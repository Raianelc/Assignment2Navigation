package com.stu71954.assignment2navigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun SecondScreen(navController: NavController, userName:  String){

    Column (
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,

        ) {
        TextField(
            value = userName.uppercase(),
            onValueChange = {},
            label = { Text("User Name") },
        )

        Button(onClick = {
            navController.navigate("LandingPage")
        }) {
            Text(text = "Click here for Start Screen ")
        }

        Button(onClick = {
            navController.navigate("ThirdScreen/" + userName)
        }) {
            Text(text = "Click here for Third Screen")
        }
    }
}