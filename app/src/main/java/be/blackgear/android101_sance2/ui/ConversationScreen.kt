package be.blackgear.android101_sance2.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ConversationScreen(
    message: String,
    onMessageChange: (String) -> Unit,
) = Scaffold(
    topBar = {
        TopAppBar {
            Text("SemiSsenger")
        }
    }
) {
    Box {
        LazyColumn(Modifier.fillMaxSize()) {}
        TextField(
            value = message, onValueChange = onMessageChange,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, bottom = 16.dp, end = 16.dp)
                .align(Alignment.BottomCenter)
        )
    }
}

@Preview
@Composable
private fun ConversationScreenPreview() = ConversationScreen(
    message = "",
    onMessageChange = {},
)
