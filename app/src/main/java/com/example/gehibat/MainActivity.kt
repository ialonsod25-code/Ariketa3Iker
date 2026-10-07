package com.example.gehibat

import android.R.id.bold
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusRestorer
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gehibat.ui.theme.GehibatTheme
import kotlin.collections.mutableSetOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GehibatTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {

    var nota by remember { mutableStateOf(0) }

    Box(modifier = modifier.fillMaxSize()) {
        val irudia = painterResource(R.drawable.pizarra2)
        Image(
            painter = irudia,
            contentDescription = null,
            modifier = Modifier.fillMaxSize()
        )
        Text(
            text = "Nota igotzeko klik egin",
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier =  Modifier
                .align(Alignment.TopCenter)
                .padding(top = 100.dp)
        )
        Text(
            text = "Ikaslearen nota: $nota ",
            fontSize = 20.sp,
            fontWeight = FontWeight.Normal,
            color = Color.White,
            modifier =  Modifier
                .align(Alignment.TopStart)
                .padding(start = 60.dp, top = 300.dp)
        )
       Button(onClick ={nota = nota +1 },
           colors = ButtonDefaults.buttonColors(containerColor = Color.Red),
           modifier =  Modifier
               .align(Alignment.TopCenter)
               .padding(top = 400.dp),
       ) {
           Text ("Klik")
       }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GehibatTheme {
        Greeting("Android")
    }
}