package com.christiandb845.sokohub.ui.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.christiandb845.sokohub.R
import com.christiandb845.sokohub.ui.theme.Blueberry
import com.clementvexegon.sokohub.navigation.ROUT_INTENT

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Home(navcontroller: NavController){




    Column(
        modifier = Modifier.fillMaxSize()
    ) {

        //TopAppBar
        TopAppBar(
            title = { Text(text = "Home") },
            navigationIcon = {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Menu, contentDescription = "Menu")
                }
            },
            actions = {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.ShoppingCart, contentDescription = "Cart")
                }
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Notifications, contentDescription = "Notifications")
                }
            },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Blueberry,
                titleContentColor = Color.White,
                navigationIconContentColor = Color.White,
                actionIconContentColor = Color.White
            )
        )
        //End of TopAppBar

        Spacer(modifier = Modifier.height(20.dp))

        //Searchbar
        var search by remember { mutableStateOf("") }

        TextField(
            value = search,
            onValueChange = { search = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = "Search") },
            placeholder = { Text(text = "Search products, Category....") }
        )
        //End of searchbar

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Featured Products",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = 20.dp),
        )

        Spacer(modifier = Modifier.height(20.dp))

        //Row
        Row(
            modifier = Modifier.horizontalScroll(rememberScrollState()).padding(horizontal = 20.dp)
        ) {
            Column {
                Image(
                    painter = painterResource(R.drawable.grocery),
                    contentDescription = "Groceries",
                    modifier = Modifier.size(200.dp).clip(shape = RoundedCornerShape(20.dp)),
                    contentScale = ContentScale.Crop
                )
                Text(
                    text = "Groceries",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(top = 8.dp),
                    )
                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(Blueberry),
                    shape = RoundedCornerShape(10.dp),
                    modifier = Modifier.width(150.dp)

                ) {
                    Text(text = "Shop Now")
                }
            }

            Spacer(modifier = Modifier.width(20.dp)) // Fixed: was height(20.dp)

            Column {
                Image(
                    painter = painterResource(R.drawable.grocery),
                    contentDescription = "Groceries",
                    modifier = Modifier.size(200.dp).clip(shape = RoundedCornerShape(20.dp)),
                    contentScale = ContentScale.Crop
                )
                Text(
                    text = "Groceries",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(top = 8.dp),
                )
                Button(
                    onClick = {navcontroller.navigate(route = ROUT_INTENT)},
                    colors = ButtonDefaults.buttonColors(Blueberry),
                    shape = RoundedCornerShape(10.dp),
                    modifier = Modifier.width(150.dp)

                ) {
                    Text(text = "Shop Now")
                }
            }

            Spacer(modifier = Modifier.width(20.dp)) // Fixed: was height(20.dp)

            Column {
                Image(
                    painter = painterResource(R.drawable.grocery),
                    contentDescription = "Groceries",
                    modifier = Modifier.size(200.dp).clip(shape = RoundedCornerShape(20.dp)),
                    contentScale = ContentScale.Crop
                )
                Text(
                    text = "Groceries",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(top = 8.dp),
                )
                Button(
                    onClick = {navcontroller.navigate(route = ROUT_INTENT)},
                    colors = ButtonDefaults.buttonColors(Blueberry),
                    shape = RoundedCornerShape(10.dp),
                    modifier = Modifier.width(150.dp)

                ) {
                    Text(text = "Shop Now")
                }
            }

            Spacer(modifier = Modifier.width(20.dp)) // Fixed: was height(20.dp)

            Column {
                Image(
                    painter = painterResource(R.drawable.grocery),
                    contentDescription = "Groceries",
                    modifier = Modifier.size(200.dp).clip(shape = RoundedCornerShape(20.dp)),
                    contentScale = ContentScale.Crop
                )
                Text(
                    text = "Groceries",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(top = 8.dp),
                )
                Button(
                    onClick = {navcontroller.navigate(route = ROUT_INTENT)},
                    colors = ButtonDefaults.buttonColors(Blueberry),
                    shape = RoundedCornerShape(10.dp),
                    modifier = Modifier.width(150.dp)

                ) {
                    Text(text = "Shop Now")
                }
            }
        }
        //End of Row



    }
}

@Preview(showBackground = true)
@Composable
fun HomePreview(){
    Home(rememberNavController())
}
