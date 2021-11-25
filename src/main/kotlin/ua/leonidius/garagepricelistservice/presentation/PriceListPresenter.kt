package ua.leonidius.garagepricelistservice.presentation

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import ua.leonidius.garagepricelistservice.service.PriceListFacade

@RestController
class PriceListPresenter(private val priceListFacade: PriceListFacade) {

    @GetMapping("/price-list")
    fun getPriceList(): ReturnResult {
        try {
            return priceListFacade.getAllDetails()
        } catch (e: Exception) {
            e.printStackTrace()
            return ErrorReturnResult(e.message!!)
        }
    }

    @GetMapping("/details/{id}")
    fun getDetailInfoById(@PathVariable id: Int): ReturnResult  {
        try {
            return priceListFacade.getDetailById(id)
        } catch (e: Exception) {
            e.printStackTrace()
            return ErrorReturnResult(e.message!!)
        }
    }

}