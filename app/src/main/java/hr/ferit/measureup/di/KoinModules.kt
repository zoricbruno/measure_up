package hr.ferit.measureup.di

import hr.ferit.measureup.sensing.repository.AndroidSensorRepository
import hr.ferit.measureup.sensing.repository.SensorRepository
import hr.ferit.measureup.sensing.sensors.Accelerometer
import hr.ferit.measureup.sensing.sensors.LightSensor
import hr.ferit.measureup.sensing.sensors.Thermometer
import hr.ferit.measureup.ui.viewmodels.AccelerometerViewModel
import hr.ferit.measureup.ui.viewmodels.HomeViewModel
import hr.ferit.measureup.ui.viewmodels.LightSensorViewModel
import hr.ferit.measureup.ui.viewmodels.ThermometerViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val sensorsModule = module {
    single<LightSensor> { LightSensor(androidContext()) }
    single<Accelerometer> { Accelerometer(androidContext()) }
    single<Thermometer> { Thermometer(androidContext()) }
    single<SensorRepository> { AndroidSensorRepository(androidContext()) }
}

val viewmodelModule = module {
    viewModel<LightSensorViewModel> { LightSensorViewModel(get<LightSensor>()) }
    viewModel<AccelerometerViewModel> { AccelerometerViewModel(get<Accelerometer>()) }
    viewModel<ThermometerViewModel> { ThermometerViewModel(get<Thermometer>()) }
    viewModel<HomeViewModel> { HomeViewModel(get<SensorRepository>()) }
}
