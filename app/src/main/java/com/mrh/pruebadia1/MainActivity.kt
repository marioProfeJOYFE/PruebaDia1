package com.mrh.pruebadia1

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.mrh.pruebadia1.ui.theme.PruebaDia1Theme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PruebaDia1Theme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(), topBar = {
                        TopAppBar(
                            colors = TopAppBarDefaults.topAppBarColors(
                                containerColor = MaterialTheme.colorScheme.primaryContainer,
                                titleContentColor = MaterialTheme.colorScheme.primary,
                            ),
                            title = {
                                Text("Prueba Día 1")
                            }
                        )
                    }
                ) { innerPadding ->
                    FirstView(
                        name = "Clase 2ºDAM",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun FirstView(name: String, modifier: Modifier = Modifier) {

    Column(modifier = modifier) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.Top
        ) {
            Text("Elemento 1", fontSize = 24.sp, color = MaterialTheme.colorScheme.primary)
            Text("Elemento 1", color = Color.Magenta, fontSize = 14.sp)
        }
        Box(contentAlignment = Alignment.Center) {
            Text("Elemento 1", fontSize = 24.sp, color = MaterialTheme.colorScheme.primary)
            Text("Elemento 1", color = Color.Red, fontSize = 14.sp)
        }
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
                .clickable {
                    Log.i("Click Tarjeta", "Hola")
                }, colors = CardDefaults
                .cardColors(
                    containerColor = MaterialTheme.colorScheme.secondaryContainer,
                    contentColor = MaterialTheme.colorScheme.secondary
                )
        ) {
            Text("Elemento 1", fontSize = 54.sp)
            Box(contentAlignment = Alignment.Center) {
                AsyncImage(
                    modifier = Modifier.fillMaxWidth(),
                    model = "https://phantom-marca.unidadeditorial.es/dcff6a97469edbe13b375d1c76ec587e/resize/828/f/jpg/assets/multimedia/imagenes/2024/09/18/17266782559831.jpg",
                    contentDescription = "",
                    contentScale = ContentScale.Fit
                )
                Text("Elemento 1", fontSize = 54.sp, color = Color.Cyan)
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun FirstViewPreview() {
    PruebaDia1Theme {
        FirstView("Android")
    }
}