package hr.ferit.measureup.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
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
import hr.ferit.measureup.ui.navigation.Screen
import hr.ferit.measureup.ui.viewmodels.AccelerometerViewModel
import hr.ferit.measureup.ui.viewmodels.LightSensorViewModel
import org.koin.androidx.compose.koinViewModel

@Composable
fun AccelerometerScreen(viewModel: AccelerometerViewModel = koinViewModel()) {
    val x by viewModel.x.collectAsStateWithLifecycle()
    val y by viewModel.y.collectAsStateWithLifecycle()
    val z by viewModel.z.collectAsStateWithLifecycle()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "x: ${x.toString()}",
            color = colorResource(id = R.color.dark_yellow),
        )
        Text(
            text = "y: ${y.toString()}",
            color = colorResource(id = R.color.dark_yellow),
        )
        Text(
            text = "z: ${z.toString()}",
            color = colorResource(id = R.color.dark_yellow),
        )
    }
}

@Preview
@Composable
fun PreviewAccelerometerScreen() {
    AccelerometerScreen()
}
