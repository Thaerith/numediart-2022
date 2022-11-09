package be.blackgear.android101_sance2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import be.blackgear.android101_sance2.ui.theme.Android101Séance2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Android101Séance2Theme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name comment ça va ?!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Android101Séance2Theme {
        Greeting("Blabla")
    }
}

@Preview(showBackground = true)
@Composable
fun Preview2() {
    Android101Séance2Theme {
        Greeting("Yo")
    }
}