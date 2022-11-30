``` kotlin 
import androidx.compose.material.Scaffold
import androidx.compose.runtime.*
import androidx.lifecycle.ViewModel

@Composable
fun Screen(navController: NavController) {
    val viewModel = remember { BlablaViewModel() }

    LaunchedEffect(navController) {
        viewModel.onStart()
    }

    ViewWithViewModel(viewModel.data)
}

@Composable
fun ViewWithViewModel(data: ScreenData) = Scaffold {
}

class BlablaViewModel : ViewModel() {
    var data: ScreenData by mutableStateOf(ScreenData())
        private set

    fun onStart() {

    }
}

data class ScreenData()
```