package hr.ferit.measureup.ui.viewmodels

import androidx.lifecycle.ViewModel
import hr.ferit.measureup.sensing.MeasurableSensor
import kotlinx.coroutines.flow.MutableStateFlow

class AccelerometerViewModel(private val accelerometer: MeasurableSensor) : ViewModel() {
    var x = MutableStateFlow(0.0f)
    var y = MutableStateFlow(0.0f)
    var z = MutableStateFlow(0.0f)

    init {
        accelerometer.startListening()
        accelerometer.setOnSensorValueChangedListener { values ->
            x.value = values[0]
            y.value = values[1]
            z.value = values[2]
        }
    }
}