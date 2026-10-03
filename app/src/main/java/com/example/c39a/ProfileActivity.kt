package com.example.c39a

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.c39a.ui.theme.C39ATheme

class ProfileActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            C39ATheme {
                ProfileBody()
            }
        }
    }
}

@Composable
fun ProfileBody() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .verticalScroll(rememberScrollState())
    ) {
        // Top Bar
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(all = 8.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                modifier = Modifier.size(40.dp),
                painter = painterResource(R.drawable.outline_5g_24),
                contentDescription = null
            )
            Text(
                "rahul_2003",
                style = TextStyle(
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    fontStyle = FontStyle.Italic
                )
            )
            Icon(
                modifier = Modifier.size(40.dp),
                painter = painterResource(R.drawable.ic_launcher_foreground),
                contentDescription = null
            )
        }

        // Stats Row
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(all = 8.dp),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(R.drawable.img),
                contentDescription = null,
                modifier = Modifier
                    .clip(shape = CircleShape)
                    .height(80.dp)
                    .width(88.dp),
                contentScale = ContentScale.Crop
            )
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text("714", fontWeight = FontWeight.Bold, fontSize = 18.sp)
                Text("Posts")
            }
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text("1M", fontWeight = FontWeight.Bold, fontSize = 18.sp)
                Text("Followers")
            }
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text("10", fontWeight = FontWeight.Bold, fontSize = 18.sp)
                Text("Following")
            }
        }

        // Profile Details / Bio Section
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 4.dp)
        ) {
            Text(
                text = "Username",
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                )
            )
            Text(text = "Pvt:Personal Vlog🍾.")
            Text(text = "me & god v/s the world🫡")

            // Link Section
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(top = 6.dp)
            ) {
                Spacer(modifier = Modifier.width(4.dp))
            }

            // Top Full-width "Button"
            Button(
                onClick = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 12.dp)
                    .height(36.dp),
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White,
                    contentColor = Color.Black
                ),
                border = BorderStroke(1.dp, Color(0xFFDBDBDB)),
                contentPadding = PaddingValues(0.dp)
            ) {
                Text("Button", fontWeight = FontWeight.SemiBold, fontSize = 14.sp)
            }

            // Action Buttons Row (Follow, Message, Email, Dropdown)
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp),
                horizontalArrangement = Arrangement.spacedBy(6.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Button(
                    onClick = {},
                    modifier = Modifier
                        .weight(1f)
                        .height(36.dp),
                    shape = RoundedCornerShape(8.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF0095F6),
                        contentColor = Color.White
                    ),
                    contentPadding = PaddingValues(0.dp)
                ) {
                    Text("Follow", fontWeight = FontWeight.Bold, fontSize = 14.sp)
                }

                Button(
                    onClick = {},
                    modifier = Modifier
                        .weight(1f)
                        .height(36.dp),
                    shape = RoundedCornerShape(8.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.White,
                        contentColor = Color.Black
                    ),
                    border = BorderStroke(1.dp, Color(0xFFDBDBDB)),
                    contentPadding = PaddingValues(0.dp)
                ) {
                    Text("Message", fontWeight = FontWeight.SemiBold, fontSize = 14.sp)
                }

                Button(
                    onClick = {},
                    modifier = Modifier
                        .weight(1f)
                        .height(36.dp),
                    shape = RoundedCornerShape(8.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.White,
                        contentColor = Color.Black
                    ),
                    border = BorderStroke(1.dp, Color(0xFFDBDBDB)),
                    contentPadding = PaddingValues(0.dp)
                ) {
                    Text("Email", fontWeight = FontWeight.SemiBold, fontSize = 14.sp)
                }

                Button(
                    onClick = {},
                    modifier = Modifier.size(36.dp),
                    shape = RoundedCornerShape(8.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.White,
                        contentColor = Color.Black
                    ),
                    border = BorderStroke(1.dp, Color(0xFFDBDBDB)),
                    contentPadding = PaddingValues(0.dp)
                ) {
                    Text("⌄", fontSize = 14.sp, fontWeight = FontWeight.Bold)
                }
            }

            // Stories Row (Story 1, Story 2, Story 3, Story 4, Story 5)
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp, bottom = 16.dp)
                    .horizontalScroll(rememberScrollState()),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                StoryItem(imageRes = R.drawable.img_1, title = "Story 1")
                StoryItem(imageRes = R.drawable.img, title = "Story 2")
                StoryItem(imageRes = R.drawable.img_1, title = "Story 3")
                StoryItem(imageRes = R.drawable.img, title = "Story 4")
                StoryItem(imageRes = R.drawable.img_1, title = "Story 5")
            }
        }
    }
}

@Composable
fun StoryItem(imageRes: Int, title: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Box(
            modifier = Modifier
                .size(64.dp)
                .clip(CircleShape)
                .background(Color(0xFFEFEFEF))
                .padding(2.dp),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(imageRes),
                contentDescription = title,
                modifier = Modifier
                    .fillMaxSize()
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )
        }
        Spacer(modifier = Modifier.height(4.dp))
        Text(title, fontSize = 12.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun ProfilePreview() {
    C39ATheme {
        ProfileBody()
    }
}
