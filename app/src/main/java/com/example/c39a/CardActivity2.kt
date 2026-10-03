package com.example.c39a

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.CreditCard
import androidx.compose.material.icons.filled.Description
import androidx.compose.material.icons.filled.FilterHdr
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.c39a.ui.theme.C39ATheme

class CardActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            C39ATheme {
                CardListScreen()
            }
        }
    }
}

@Composable
fun CardListScreen() {
    val dargreen = Color(0xFF2CD38D)

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        floatingActionButton = {
            FloatingActionButton(
                onClick = { /* TODO */ },
                containerColor = dargreen,
                contentColor = Color.White,
                shape = CircleShape
            ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "Add"
                )
            }
        }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFF5F5F5))
        ) {
            // Top Green Background
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(180.dp)
                    .background(dargreen)
            )

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues)
            ) {
                // Header
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 48.dp, start = 24.dp, end = 24.dp, bottom = 16.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Card",
                        style = TextStyle(
                            fontSize = 32.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                    )
                    Box(
                        modifier = Modifier
                            .size(50.dp)
                            .clip(CircleShape)
                            .background(Color.White.copy(alpha = 0.2f)),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(R.drawable.img),
                            contentDescription = "Profile",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )
                    }
                }

                // Cards Column
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp)
                        .verticalScroll(rememberScrollState()),
                    verticalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    // Card 1
                    WideCard(
                        color = Color(0xFFFFB74D),
                        icon = Icons.Default.Lock
                    ) {
                        Text("Dribbble", fontWeight = FontWeight.Bold, color = Color.White, fontSize = 20.sp)
                        Spacer(modifier = Modifier.height(4.dp))
                        Text("Paidax", color = Color.White, fontSize = 14.sp)
                        Spacer(modifier = Modifier.height(4.dp))
                        Text("********", color = Color.White, fontSize = 14.sp)
                    }

                    // Card 2
                    WideCard(
                        color = Color(0xFF42A5F5),
                        icon = Icons.Default.Description
                    ) {
                        Text("HJM", fontWeight = FontWeight.Bold, color = Color.White, fontSize = 20.sp)
                        Spacer(modifier = Modifier.height(4.dp))
                        Text("173****8838", color = Color.White, fontSize = 14.sp)
                    }

                    // Card 3
                    WideCard(
                        color = Color(0xFF66BB6A),
                        icon = Icons.Default.FilterHdr
                    ) {
                        Text("Tom", fontWeight = FontWeight.Bold, color = Color.White, fontSize = 20.sp)
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            "Room 601, Building 8, Zhongnan Century\nCity, No.8, Taoyuan Road...",
                            color = Color.White,
                            fontSize = 12.sp,
                            maxLines = 2
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text("130****3920", color = Color.White, fontSize = 14.sp)
                    }

                    // Card 4
                    WideCard(
                        color = Color(0xFF7E57C2),
                        icon = Icons.Default.CreditCard
                    ) {
                        Text("1882 **** **** 8695", fontWeight = FontWeight.Bold, color = Color.White, fontSize = 20.sp)
                        Spacer(modifier = Modifier.height(4.dp))
                        Text("ICBC", color = Color.White, fontSize = 14.sp)
                        Spacer(modifier = Modifier.weight(1f))
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Text("Debit Card", color = Color.White.copy(alpha = 0.8f), fontSize = 12.sp)
                            Text("12/19", color = Color.White.copy(alpha = 0.8f), fontSize = 12.sp)
                        }
                    }

                    // Card 5
                    WideCard(
                        color = Color(0xFFBCAAA4),
                        icon = Icons.Default.FilterHdr
                    ) {
                        Text("Young", fontWeight = FontWeight.Bold, color = Color.White, fontSize = 20.sp)
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            "This is the story of me and them, very...",
                            color = Color.White,
                            fontSize = 12.sp
                        )
                    }

                    // Card 6
                    WideCard(
                        color = Color(0xFF5C6BC0),
                        icon = Icons.Default.LocationOn
                    ) {
                        Text(
                            "Jinjun street, golden chrysanthemum\nRoad, Haizhuqu District...",
                            color = Color.White,
                            fontSize = 14.sp
                        )
                    }

                    // Bottom Spacer for FAB
                    Spacer(modifier = Modifier.height(80.dp))
                }
            }
        }
    }
}

@Composable
fun WideCard(
    color: Color,
    icon: ImageVector,
    content: @Composable ColumnScope.() -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(130.dp),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(containerColor = color),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Box(modifier = Modifier.fillMaxSize()) {
            // Background Watermark Icon
            Icon(
                imageVector = icon,
                contentDescription = null,
                modifier = Modifier
                    .size(120.dp)
                    .align(Alignment.BottomEnd)
                    .offset(x = 20.dp, y = 20.dp),
                tint = Color.White.copy(alpha = 0.15f)
            )

            // Foreground Content
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
            ) {
                content()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CardListPreview() {
    C39ATheme {
        CardListScreen()
    }
}