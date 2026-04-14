package com.christiandb845.sokohub.ui.screens.about

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.christiandb845.sokohub.ui.theme.Blueberry

// ✅ Data class
data class Contact(
    val name: String,
    val title: String,
    val phone: String,
    val email: String,
    val color: Color
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AboutScreen(navController: NavController) {

    var selectedIndex by remember { mutableStateOf(0) }
    val context = LocalContext.current

    val contacts = listOf(
        Contact("John Smith", "Business Consultant", "+254712345678", "john@gmail.com", Color(0xFF2196F3)),
        Contact("Amanda Black", "Dentist", "+254700111222", "amanda@gmail.com", Color(0xFFF44336)),
        Contact("David Hill", "Designer", "+254733555666", "david@gmail.com", Color(0xFFFF9800))
    )

    Scaffold(

        // 🔝 Top Bar
        topBar = {
            TopAppBar(
                title = { Text("Business Cards") },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back")
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Blueberry,
                    titleContentColor = Color.White,
                    navigationIconContentColor = Color.White
                )
            )
        },

        // 🔻 Bottom Bar
        bottomBar = {
            NavigationBar(containerColor = Blueberry) {

                NavigationBarItem(
                    icon = { Icon(Icons.Default.Home, contentDescription = "Home") },
                    label = { Text("Home") },
                    selected = selectedIndex == 0,
                    onClick = { selectedIndex = 0 }
                )

                NavigationBarItem(
                    icon = { Icon(Icons.Default.Favorite, contentDescription = "Favorites") },
                    label = { Text("Favorites") },
                    selected = selectedIndex == 1,
                    onClick = { selectedIndex = 1 }
                )

                NavigationBarItem(
                    icon = { Icon(Icons.Default.Person, contentDescription = "Profile") },
                    label = { Text("Profile") },
                    selected = selectedIndex == 2,
                    onClick = { selectedIndex = 2 }
                )
            }
        },

        // ➕ FAB
        floatingActionButton = {
            FloatingActionButton(
                onClick = { },
                containerColor = Blueberry
            ) {
                Icon(Icons.Default.Add, contentDescription = "Add")
            }
        }

    ) { paddingValues ->

        LazyColumn(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize()
                .padding(horizontal = 8.dp, vertical = 12.dp), // 🔥 smaller side padding
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {

            items(contacts) { contact ->

                Card(
                    modifier = Modifier
                        .fillMaxWidth(), // ✅ FULL WIDTH
                    shape = MaterialTheme.shapes.large, // rounded corners
                    colors = CardDefaults.cardColors(containerColor = contact.color),
                    elevation = CardDefaults.cardElevation(8.dp)
                ) {

                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(20.dp) // 🔥 more inner padding = bigger card feel
                    ) {

                        Text(
                            text = contact.name,
                            fontSize = 20.sp,
                            color = Color.White
                        )

                        Text(
                            text = contact.title,
                            fontSize = 14.sp,
                            color = Color.White
                        )

                        Spacer(modifier = Modifier.height(12.dp))

                        // 📞 Phone
                        Text(
                            text = "📞 ${contact.phone}",
                            color = Color.White,
                            modifier = Modifier.clickable {
                                val intent = Intent(Intent.ACTION_DIAL).apply {
                                    data = Uri.parse("tel:${contact.phone}")
                                }
                                context.startActivity(intent)
                            }
                        )

                        Spacer(modifier = Modifier.height(8.dp))

                        // ✉️ Email
                        Text(
                            text = "✉️ ${contact.email}",
                            color = Color.White,
                            modifier = Modifier.clickable {
                                val intent = Intent(Intent.ACTION_SENDTO).apply {
                                    data = Uri.parse("mailto:${contact.email}")
                                }
                                context.startActivity(intent)
                            }
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AboutScreenPreview() {
    AboutScreen(rememberNavController())
}