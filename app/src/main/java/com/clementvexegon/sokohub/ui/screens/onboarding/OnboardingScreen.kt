package com.christiandb845.sokohub.ui.screens.onboarding

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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.christiandb845.sokohub.R
import com.christiandb845.sokohub.ui.theme.Blueberry
import com.clementvexegon.sokohub.navigation.ROUT_HOME
import com.clementvexegon.sokohub.navigation.ROUT_REGISTER

@Composable
fun OnboardingScreen(navcontroller: NavController){
    Column(
        modifier = Modifier.fillMaxSize().padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){

        Image(
            painter = painterResource(R.drawable.products),
            contentDescription = "Products",
            modifier = Modifier.size(300.dp)
        )

        Spacer(modifier = Modifier.height(20.dp) )

        Text(
            text = "Welcome to Sokohub!!",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.SansSerif,
            color = Blueberry
        )
        
        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Shop Smarter,",
            fontSize = 20.sp,
            fontWeight = FontWeight.Medium
        )
        Text(
            text = "Everywhere you go,",
            fontSize = 20.sp,
            fontWeight = FontWeight.Medium
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Welcome to our store—where quality meets convenience. We’re committed to providing a smooth and enjoyable shopping experience with carefully selected products, secure payments, and fast, reliable delivery you can trust. Our team is always ready to assist you and ensure your satisfaction every step of the way. Thank you for choosing us as your shopping destination, and we look forward to serving you.",
            fontSize = 16.sp,
            textAlign = TextAlign.Justify
        )

        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = {navcontroller.navigate(ROUT_REGISTER)},
            colors = ButtonDefaults.buttonColors(Blueberry),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.width(350.dp)

        ) {
            Text(text = "Get Started")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun OnboardingScreenPreview(){
    OnboardingScreen(rememberNavController())
}
