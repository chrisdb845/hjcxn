package com.christiandb845.sokohub.ui.screens.service

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun ServiceScreen(navcontroller: NavController){
    Column(
        modifier = Modifier.fillMaxSize()
    ){


    }






}
@Preview(showBackground = true)
@Composable
fun ServiceScreenPreview(){
    ServiceScreen(rememberNavController())
}
