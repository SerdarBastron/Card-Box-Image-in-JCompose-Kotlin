package com.serdar.jcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.serdar.jcompose.ui.theme.JComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column {
                ListItem(name = "Margot Elise Robbie", prof = "Actress")
                ListItem(name = "Margot Elise Robbie", prof = "Actress")
                ListItem(name = "Margot Elise Robbie", prof = "Actress")
                ListItem(name = "Margot Elise Robbie", prof = "Actress")
                ListItem(name = "Margot Elise Robbie", prof = "Actress")
                ListItem(name = "Margot Elise Robbie", prof = "Actress")
            }
        }
    }
}
@Composable
private fun ListItem(name: String, prof: String){
    Card(modifier = Modifier
        .fillMaxWidth()
        .padding(10.dp),
        shape = RoundedCornerShape(15.dp),
        elevation = CardDefaults.cardElevation(5.dp)
    ){
        Box{
            Row(
                verticalAlignment = Alignment.CenterVertically) {
                Image(painter = painterResource(id = R.drawable.margo),
                    contentDescription = "image", contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(5.dp)
                        .size(64.dp)
                        .clip(CircleShape))
                Column(modifier = Modifier.padding(start = 10.dp)) {
                    Text(text = name)
                    Text(text = prof)
                }
            }
        }
    }
}



