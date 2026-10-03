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
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.History
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.c39a.ui.theme.C39ATheme

class Ui2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            C39ATheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    SpotifyScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun SpotifyScreen(modifier: Modifier = Modifier) {
    val backgroundColor = Color(0xFF121212)
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .verticalScroll(rememberScrollState())
            .padding(16.dp)
    ) {
        // Top section
        Row(
            modifier = Modifier.fillMaxWidth().padding(top = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Recently played",
                color = Color.White,
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold
            )
            Row(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                Icon(imageVector = Icons.Outlined.Notifications, contentDescription = "Notifications", tint = Color.White)
                Icon(imageVector = Icons.Outlined.History, contentDescription = "History", tint = Color.White)
                Icon(imageVector = Icons.Outlined.Settings, contentDescription = "Settings", tint = Color.White)
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        // Recently played row
        Row(
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            ArtistItem(name = "Anuv Jain", imageRes = R.drawable.anuv)
            ArtistItem(name = "Diljit Dosanjh", imageRes = R.drawable.diljit)
        }

        Spacer(modifier = Modifier.height(32.dp))

        // Spotify Wrapped Section
        Row(verticalAlignment = Alignment.CenterVertically) {
            Box(
                modifier = Modifier
                    .size(56.dp)
                    .background(Color(0xFFE5F196)), // Placeholder for 2021 graphic
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "2021",
                    color = Color(0xFF6C2B8E),
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp
                )
            }
            Spacer(modifier = Modifier.width(12.dp))
            Column {
                Text(
                    text = "#SPOTIFYWRAPPED",
                    color = Color.Gray,
                    fontSize = 10.sp,
                    letterSpacing = 1.sp
                )
                Text(
                    text = "Your 2021 in review",
                    color = Color.White,
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            WrappedCardItem(
                title = "Your Top Songs 2026",
                insideText = null, // Removed text from being laid over image
                backgroundColor = Color(0xFFE5F196),
                textColor = Color.White,
                imageRes = R.drawable.top,
                modifier = Modifier.weight(1f)
            )
            WrappedCardItem(
                title = "Your Artists Revealed",
                insideText = null,
                backgroundColor = Color(0xFFB0A4E3),
                textColor = Color(0xFF2C2266),
                imageRes = R.drawable.best,
                modifier = Modifier.weight(1f)
            )
        }

        Spacer(modifier = Modifier.height(32.dp))

        // Editor's picks Section
        Text(
            text = "Editor's picks",
            color = Color.White,
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            PlaylistItem(
                desc = "Arijit Singh, Prateek Kuhad,\nKing, Anuv Jain",
                backgroundColor = Color(0xFF1E3A25), // Mock image background
                title = "A1",
                imageRes = R.drawable.prateek,
                modifier = Modifier.weight(1f)
            )
            PlaylistItem(
                desc = "The Local Train, When Chai Met Toast, OAFF",
                backgroundColor = Color(0xFF8BA698), // Mock image background
                title = "FRONT\nLEFT",
                imageRes = R.drawable.arijit,
                modifier = Modifier.weight(1f)
            )
        }
        
        Spacer(modifier = Modifier.height(32.dp))
    }
}

@Composable
fun ArtistItem(name: String, imageRes: Int? = null) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        if (imageRes != null) {
            Image(
                painter = painterResource(id = imageRes),
                contentDescription = name,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(100.dp)
                    .clip(CircleShape)
            )
        } else {
            Box(
                modifier = Modifier
                    .size(100.dp)
                    .clip(CircleShape)
                    .background(Color.DarkGray)
            )
        }
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = name,
            color = Color.White,
            fontSize = 12.sp,
            fontWeight = FontWeight.Medium
        )
    }
}

@Composable
fun WrappedCardItem(
    title: String,
    insideText: String?, // Make nullable to optionally hide
    backgroundColor: Color,
    textColor: Color,
    modifier: Modifier = Modifier,
    imageRes: Int? = null
) {
    Column(modifier = modifier) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(1f)
                .background(backgroundColor)
        ) {
            if (imageRes != null) {
                Image(
                    painter = painterResource(id = imageRes),
                    contentDescription = title,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )
            }
            // Spotify logo placeholder
            Box(
                modifier = Modifier
                    .padding(8.dp)
                    .size(16.dp)
                    .clip(CircleShape)
                    .background(Color.Black)
            )
            if (insideText != null) {
                Text(
                    text = insideText,
                    color = textColor,
                    fontSize = 18.sp,
                    lineHeight = 22.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .align(Alignment.BottomStart)
                        .padding(12.dp)
                )
            }
        }
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = title,
            color = Color.White,
            fontSize = 13.sp,
            fontWeight = FontWeight.Medium
        )
    }
}

@Composable
fun PlaylistItem(
    desc: String,
    backgroundColor: Color,
    title: String,
    modifier: Modifier = Modifier,
    imageRes: Int? = null
) {
    Column(modifier = modifier) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(1f)
                .background(backgroundColor)
        ) {
            if (imageRes != null) {
                Image(
                    painter = painterResource(id = imageRes),
                    contentDescription = title,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )
            }
            // Spotify logo placeholder
            Box(
                modifier = Modifier
                    .padding(8.dp)
                    .size(16.dp)
                    .clip(CircleShape)
                    .background(Color.Black)
            )
            if (imageRes == null) {
                Text(
                    text = title,
                    color = Color.White.copy(alpha = 0.8f),
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    lineHeight = 28.sp,
                    modifier = Modifier.align(Alignment.Center)
                )
            }
        }
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = desc,
            color = Color(0xFFAAAAAA),
            fontSize = 12.sp,
            lineHeight = 16.sp,
            maxLines = 2
        )
    }
}

@Preview(showBackground = true, backgroundColor = 0xFF121212)
@Composable
fun SpotifyScreenPreview() {
    C39ATheme {
        SpotifyScreen()
    }
}