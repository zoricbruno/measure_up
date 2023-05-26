package hr.ferit.measureup.sensing.repository

data class SensorInfo(
    val type: Int,
    val name: String,
    var isAvailable: Boolean = false,
)
