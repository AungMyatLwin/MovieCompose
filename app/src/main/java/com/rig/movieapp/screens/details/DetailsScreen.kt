package com.rig.movieapp.screens.details

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.surfaceColorAtElevation
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailsScreen(navController: NavController, movieData:String?){
    Scaffold(
        topBar = {
            TopAppBar(title = {
                              Text(text = "Movie")
            }, colors = TopAppBarDefaults.mediumTopAppBarColors(Color.LightGray),
                navigationIcon = { navigationIcon(navController = navController) })
        },
    ){
        it->
           Surface(modifier = Modifier.padding(it)
       .fillMaxWidth()
       .fillMaxHeight()) {
       Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
           Text(text = movieData.toString(), style = MaterialTheme.typography.titleMedium)
           Spacer(modifier = Modifier.height(23.dp))

       }
   }
    }
}

@Composable
fun navigationIcon(navController: NavController){
    Icon(imageVector = Icons.Default.ArrowBack,
        contentDescription = "Back to Homescreen",
        Modifier.clickable {
            navController.popBackStack()
        })
}