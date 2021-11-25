package ua.leonidius.garagepricelistservice.service

import org.springframework.stereotype.Service
import ua.leonidius.garagepricelistservice.data.DatabaseConnection
import ua.leonidius.garagepricelistservice.presentation.CarDetailReturnResult
import ua.leonidius.garagepricelistservice.presentation.SearchReturnResult

@Service
class PriceListFacadeImpl: PriceListFacade {

    override fun getAllDetails(): SearchReturnResult {
        return SearchReturnResult(DatabaseConnection.getInstance().executeQuery("get").map {
            CarDetailReturnResult(it.id!!, it.price, it.name, it.description, it.manufacturer)
        }.toMutableList())
    }

    override fun getDetailById(id: Int): CarDetailReturnResult {
        val results = DatabaseConnection.getInstance().executeQuery("get", id)

        if (results.isEmpty()) throw IllegalArgumentException("There is no car detail with such an id")

        val result = results[0]

        return CarDetailReturnResult(result.id!!, result.price, result.name, result.description, result.manufacturer)
    }

}