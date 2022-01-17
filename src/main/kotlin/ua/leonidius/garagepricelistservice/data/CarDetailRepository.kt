package ua.leonidius.garagepricelistservice.data

interface CarDetailRepository {

    fun getAll(): List<CarDetail>

    fun getById(id: Int): CarDetail?

    fun getNumberOfPages(): Int

}