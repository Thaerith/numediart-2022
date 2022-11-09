package be.blackgear.android101_sance2.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ConversationScreen() = Scaffold(
    topBar = {
        TopAppBar {
            Text("SemiSsenger")
        }
    }
) {
    Column {

    }
}

@Preview
@Composable
private fun ConversationScreenPreview() = ConversationScreen()
