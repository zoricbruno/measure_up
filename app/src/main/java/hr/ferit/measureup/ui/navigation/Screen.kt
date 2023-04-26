package hr.ferit.measureup.ui.navigation

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object LightSensorScreen : Screen("light")
    object ThermometerScreen : Screen("thermometer")
    object AccelerometerScreen : Screen("acceleration")
}
