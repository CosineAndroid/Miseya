package kr.cosine.miseya.domain.model

data class DustEntity(
    val info: DustInfoEntity
)

data class DustInfoEntity(
    val body: DustBodyEntity,
    val header: DustHeaderEntity
)

data class DustBodyEntity(
    val totalCount: Int,
    val items: List<DustItemEntity>?,
    val pageNo: Int,
    val numOfRows: Int
)

data class DustHeaderEntity(
    val resultCode: String,
    val resultMsg: String
)

data class DustItemEntity(
    val so2Grade: String?,
    val coFlag: String?,
    val khaiValue: String?,
    val so2Value: String?,
    val coValue: String?,
    val pm25Flag: String?,
    val pm10Flag: String?,
    val o3Grade: String?,
    val pm10Value: String?,
    val khaiGrade: String?,
    val pm25Value: String?,
    val sidoName: String,
    val no2Flag: String?,
    val no2Grade: String?,
    val o3Flag: String?,
    val pm25Grade: String?,
    val so2Flag: String?,
    val dataTime: String?,
    val coGrade: String?,
    val no2Value: String?,
    val stationName: String,
    val pm10Grade: String?,
    val o3Value: String?
)