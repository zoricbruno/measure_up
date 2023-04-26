package hr.ferit.measureup.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import hr.ferit.measureup.R
import hr.ferit.measureup.ui.viewmodels.LightSensorViewModel
import org.koin.androidx.compose.koinViewModel

@Composable
fun LightSensorScreen(viewModel: LightSensorViewModel = koinViewModel()) {
    val lux by viewModel.lux.collectAsStateWithLifecycle()
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),
        contentAlignment = Alignment.Center,
    ) {
        Text(
            text = lux.toString(),
            color = colorResource(id = R.color.dark_yellow),
        )
    }
}

@Preview
@Composable
fun PreviewLightSensorScreen() {
    LightSensorScreen()
}
