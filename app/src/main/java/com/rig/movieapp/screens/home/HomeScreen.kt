package com.rig.movieapp.screens.home

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.rig.movieapp.MovieRow
import com.rig.movieapp.navigation.MovieScreens

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController:NavController){
    Scaffold(topBar ={
        TopAppBar(title = {  Text(text = "Movies") },
            colors = TopAppBarDefaults.smallTopAppBarColors(
                containerColor = Color.LightGray
            ))

    })
    {
            it-> Column(modifier = Modifier.padding(it)) {
                MainContent(navController)
    }
    }
}

@Composable
fun MainContent(navController: NavController,movieList:List<String> = listOf("Avatar","adfasd",
    "qqwe","werwerwe","werwerwe","werwerwe"),
){
    Column( modifier= Modifier.padding(12.dp)) {
        LazyColumn{
            items(items= movieList){
                MovieRow(movie = it){
                        movie->
                    Log.d("TAG", "MainContent: ${movie}")
                    navController.navigate(route=MovieScreens.DetailsScreen.name+"/$movie")
                }
            }
        }
    }
}
