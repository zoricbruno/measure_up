package hr.ferit.measureup.ui.viewmodels

import androidx.lifecycle.ViewModel
import hr.ferit.measureup.sensing.MeasurableSensor
import kotlinx.coroutines.flow.MutableStateFlow

class ThermometerViewModel(private val thermometer: MeasurableSensor) : ViewModel() {

    var temperature = MutableStateFlow(0.0f)

    init {
        thermometer.startListening()
        thermometer.setOnSensorValueChangedListener { values ->
            temperature.value = values[0]
        }
    }
}
