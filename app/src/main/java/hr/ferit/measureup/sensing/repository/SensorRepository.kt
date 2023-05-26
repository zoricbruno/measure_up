package hr.ferit.measureup.sensing.repository

interface SensorRepository {
    fun GetSupportedSensorInfos(): List<SensorInfo>
}
