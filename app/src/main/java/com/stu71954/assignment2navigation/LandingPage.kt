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

@Composable
fun LandingPage(navCont: NavHostController) {
    var userName by rememberSaveable { mutableStateOf("") }

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

        Button(onClick = {
            navCont.navigate("SecondScreen/" + userName)
        }) {
            Text(text = "Click here for Second Screen")
        }
    }


}