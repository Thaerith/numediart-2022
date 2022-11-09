package be.blackgear.android101_sance2.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material.icons.outlined.ThumbUp
import androidx.compose.material.icons.rounded.Close
import androidx.compose.material.icons.sharp.Favorite
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun PremierEcran() {
    var compteur by remember {
        mutableStateOf(0)
    }

    Scaffold() {
        Column {
            Text(
                "Valeur = $compteur",
                modifier = Modifier
                    .background(Color.Red)
                    .fillMaxWidth()
            )
            Button(
                onClick = {
                    compteur = compteur + 1
                },
                modifier = Modifier
                    .width(200.dp)
                    .height(40.dp)
                    .align(CenterHorizontally)
            ) {
                Text(
                    text = "Click me!",
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center
                )
            }

            Row() {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(Icons.Default.Email, contentDescription = null)
                }
                Icon(Icons.Outlined.ThumbUp, contentDescription = null)
                Icon(Icons.Rounded .Close, contentDescription = null)
                Icon(Icons.Sharp .Favorite, contentDescription = null)
            }
        }
    }
}

@Preview
@Composable
fun PremierEcranPreview() {
    PremierEcran()
}