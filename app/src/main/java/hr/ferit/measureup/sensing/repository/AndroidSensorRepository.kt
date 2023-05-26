package hr.ferit.measureup.sensing.repository

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorManager

class AndroidSensorRepository(val context: Context) : SensorRepository {

    val sensorInfos = listOf<SensorInfo>(
        SensorInfo(Sensor.TYPE_ACCELEROMETER, "Accelerometer"),
        SensorInfo(Sensor.TYPE_AMBIENT_TEMPERATURE, "Ambient temperature"),
        SensorInfo(Sensor.TYPE_LIGHT, "Light"),
    )

    init {
        val sensorManager = context.getSystemService(Context.SENSOR_SERVICE) as SensorManager
        sensorInfos.forEach {
            it.isAvailable = sensorManager.getDefaultSensor(it.type) != null
        }
    }

    override fun GetSupportedSensorInfos(): List<SensorInfo> = sensorInfos
}
