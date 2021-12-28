package ua.leonidius.garagepricelistservice.service

import ua.leonidius.garagepricelistservice.presentation.CarDetailReturnResult
import ua.leonidius.garagepricelistservice.presentation.SearchReturnResult

interface PriceListFacade {

    fun getAllDetails(page: Int): SearchReturnResult

    fun getDetailById(id: Int): CarDetailReturnResult

    fun search(query: String): SearchReturnResult

}