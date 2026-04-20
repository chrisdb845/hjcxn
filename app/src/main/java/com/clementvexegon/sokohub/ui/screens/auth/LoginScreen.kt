package com.christiandb845.sokohub.ui.screens.auth

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.christiandb845.sokohub.R
import com.christiandb845.sokohub.ui.theme.Blueberry
import com.clementvexegon.sokohub.data.AuthViewModel
import com.clementvexegon.sokohub.navigation.ROUT_HOME
import com.clementvexegon.sokohub.navigation.ROUT_REGISTER

@Composable
fun LoginScreen(navcontroller: NavController){

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){

        Image(
            painter = painterResource(R.drawable.products),
            contentDescription = "",
            modifier = Modifier.size(200.dp),

            )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Welcome Back",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold

        )

        Spacer(modifier = Modifier.height(20.dp))

        //Variables
        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }

        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            modifier = Modifier.width(350.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "") },
            placeholder = { Text(text = "Email Address") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = Blueberry,
                focusedTextColor = Color.Black,
                unfocusedLeadingIconColor = Blueberry

            )

        )

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            modifier = Modifier.width(350.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "") },
            placeholder = { Text(text = "Enter Password") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = Blueberry,
                focusedTextColor = Color.Black,
                unfocusedLeadingIconColor = Blueberry

            ),
            visualTransformation = PasswordVisualTransformation(),


        )

        Spacer(modifier = Modifier.height(20.dp))


        val context = LocalContext.current
        val authViewModel = AuthViewModel(navcontroller, context)
        Button(
            onClick = {

                authViewModel.login(email, password)

            },
            colors = ButtonDefaults.buttonColors(Blueberry),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.width(150.dp)

        ) {
            Text(text = "Login")
        }

        TextButton(onClick = {navcontroller.navigate(route = ROUT_REGISTER)}) {
            Text(
                text = "Don't have an Acoount?  Register",
                fontSize = 15.sp,)
        }


        TextButton(onClick = {navcontroller.navigate(route = ROUT_HOME)}) {
            Text(
                text = "Go to home",
                fontSize = 15.sp,)
        }








    }
}
@Preview(showBackground = true)
@Composable
fun LoginScreenPreview(){
    LoginScreen(rememberNavController())
}