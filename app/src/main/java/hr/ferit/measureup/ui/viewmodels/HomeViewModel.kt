package hr.ferit.measureup.ui.viewmodels

import androidx.lifecycle.ViewModel
import hr.ferit.measureup.sensing.repository.SensorRepository
import kotlinx.coroutines.flow.MutableStateFlow

class HomeViewModel(sensorRepository: SensorRepository) : ViewModel(){
    val sensorInfos = MutableStateFlow(sensorRepository.GetSupportedSensorInfos())
}
