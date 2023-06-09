package hr.ferit.measureup.ui.viewmodels

import androidx.lifecycle.ViewModel
import hr.ferit.measureup.sensing.MeasurableSensor
import kotlinx.coroutines.flow.MutableStateFlow

class LightSensorViewModel(private val lightSensor: MeasurableSensor) : ViewModel() {

    var lux = MutableStateFlow(0.0f)

    init {
        lightSensor.startListening()
        lightSensor.setOnSensorValueChangedListener { values ->
            lux.value = values[0]
        }
    }
}
