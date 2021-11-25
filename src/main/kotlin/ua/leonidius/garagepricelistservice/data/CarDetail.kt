package ua.leonidius.garagepricelistservice.data

class CarDetail(

    var id: Int? = null,

    var carTypeId: Int,

    var detailTypeId: Int?,

    var detailTypeCustomName: String?,

    var manufacturer: String,

    var description: String,

    var price: Double,

    var name: String,

)