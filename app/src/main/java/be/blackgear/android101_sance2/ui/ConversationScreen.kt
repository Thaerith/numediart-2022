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

@Composable
fun MessageCard(message: String, author: String, date: String, modifier: Modifier = Modifier) {
}

@Preview
@Composable
private fun MessageCardPreview() = MessageCard(
    message = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
    author = "Moi",
    date = "9 novembre 2022 à 19h50",
)

@Preview
@Composable
private fun ConversationScreenPreview() = ConversationScreen(
    message = "",
    onMessageChange = {},
)