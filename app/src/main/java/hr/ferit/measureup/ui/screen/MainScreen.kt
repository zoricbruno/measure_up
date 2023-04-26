package hr.ferit.measureup.ui.screen

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import hr.ferit.measureup.ui.navigation.Screen

@Composable
fun MainScreen() {
    val navigationController = rememberNavController()
    NavHost(navController = navigationController, startDestination = Screen.Home.route) {
        composable(Screen.Home.route) { HomeScreen(navigationController) }
        composable(Screen.LightSensorScreen.route) { LightSensorScreen() }
        composable(Screen.AccelerometerScreen.route) { AccelerometerScreen() }
        composable(Screen.ThermometerScreen.route) { ThermometerScreen() }
    }
}
