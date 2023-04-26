package hr.ferit.measureup.sensors

import android.content.Context
import android.content.pm.PackageManager
import android.hardware.Sensor

class Thermometer(context: Context) :
    AndroidSensor(
        context = context,
        sensorFeature = PackageManager.FEATURE_SENSOR_AMBIENT_TEMPERATURE,
        sensorType = Sensor.TYPE_AMBIENT_TEMPERATURE,
    )