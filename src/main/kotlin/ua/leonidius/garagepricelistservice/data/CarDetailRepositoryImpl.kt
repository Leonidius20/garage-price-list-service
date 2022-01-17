package ua.leonidius.garagepricelistservice.data

class CarDetailRepositoryImpl: CarDetailRepository {

    private val carDetails = listOf(
        CarDetail(10, 5, 1, null, "BRUH Automotive", "Manual transmission for Tesla Model X", 666.0, "BRUH Manual Transmission for Tesla Model X"),
        CarDetail(11, 6, 7, null, "Kriukiv Carriage Factory", "Powerful train horn to scare the traffic and pedestrians away", 42.0, "Train Horn"),
        CarDetail(12, 8, 6, null, "Dyadya Vanya", "Efficient and environmentaly-friendly car engine running on vodka", 42.0, "Vodka engine for Lada Priora"),
    )


    override fun getAll(): List<CarDetail> {
        return carDetails.toList() // cloning
    }

    override fun getById(id: Int): CarDetail? {
        return carDetails.find { it.id == id }
    }

    override fun getNumberOfPages(): Int {
        return carDetails.size // 1 item per page
    }


}