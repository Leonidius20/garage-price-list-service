package ua.leonidius.garagepricelistservice.presentation

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import ua.leonidius.garagepricelistservice.service.PriceListFacade
import java.util.concurrent.TimeUnit

@RestController
class PriceListPresenter(private val priceListFacade: PriceListFacade) {

    @GetMapping("/price-list")
    fun getPriceList(@RequestParam page: Int): ReturnResult {
        try {
            TimeUnit.SECONDS.sleep(10)
            return priceListFacade.getAllDetails(page)
        } catch (e: Exception) {
            e.printStackTrace()
            return ErrorReturnResult(e.message!!)
        }
    }

    @GetMapping("/search")
    fun search(@RequestParam query: String): ReturnResult {
        try {
            TimeUnit.SECONDS.sleep(10)
            return priceListFacade.search(query)
        } catch (e: Exception) {
            e.printStackTrace()
            return ErrorReturnResult(e.message!!)
        }
    }

    @GetMapping("/details/{id}")
    fun getDetailInfoById(@PathVariable id: Int): ReturnResult  {
        try {
            TimeUnit.SECONDS.sleep(10)
            return priceListFacade.getDetailById(id)
        } catch (e: Exception) {
            e.printStackTrace()
            return ErrorReturnResult(e.message!!)
        }
    }

}