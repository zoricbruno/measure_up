package hr.ferit.measureup.ui.screen

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale.Companion.Crop
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavController
import hr.ferit.measureup.R
import hr.ferit.measureup.ui.components.NavigationButton
import hr.ferit.measureup.ui.navigation.Screen
import hr.ferit.measureup.ui.viewmodels.HomeViewModel
import org.koin.androidx.compose.koinViewModel

@Composable
fun HomeScreen(navController: NavController, homeViewModel: HomeViewModel = koinViewModel()) {
    val sensorInfos = homeViewModel.sensorInfos.collectAsStateWithLifecycle()

    Log.d("{Sensors}", sensorInfos.toString())

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Image(
            painter = painterResource(id = R.drawable.background),
            contentDescription = stringResource(id = R.string.description_image_background),
            modifier = Modifier.matchParentSize(),
            contentScale = Crop,
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly,
        ) {
            NavigationButton(
                textId = R.string.text_button_light,
                iconId = R.drawable.ic_lightbulb,
                iconDescriptionId = R.string.ic_lightbulb_description,
                onClick = { navController.navigate(Screen.LightSensorScreen.route) },
            )
            Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.spacing_button)))
            NavigationButton(
                textId = R.string.text_button_temperature,
                iconId = R.drawable.ic_thermometer,
                iconDescriptionId = R.string.ic_thermometer_description,
                onClick = { navController.navigate(Screen.ThermometerScreen.route) },
            )
            Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.spacing_button)))
            NavigationButton(
                textId = R.string.text_button_accelerometer,
                iconId = R.drawable.ic_accelerometer,
                iconDescriptionId = R.string.ic_accelerometer_description,
                onClick = { navController.navigate(Screen.AccelerometerScreen.route) },
            )
        }
    }
}
