package ch.heigvd.res.chill.domain.quillasp

import ch.heigvd.res.chill.domain.Bartender
import ch.heigvd.res.chill.protocol.OrderRequest
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.assertEquals

import java.math.BigDecimal

class SkunkKTTest {

    @Test
    fun thePriceAndNameForSkunkKTShouldBeCorrect() {
        var skunkKT = SkunkKT
        assertEquals(skunkKT.NAME, SkunkKT.NAME)
        assertEquals(skunkKT.PRICE, SkunkKT.PRICE)
    }

    @Test
    fun aBartenderShouldAcceptAnOrderForSkunkKT() {
        var jane = Bartender()
        var productName = "ch.heigvd.res.chill.domain.quillasp.SkunkKT"
        var request = OrderRequest(3, productName)
        var response = jane.order(request)
        var expectedTotalPrice = SkunkKT.PRICE.multiply(BigDecimal(3.0))
        assertEquals(expectedTotalPrice, response.totalPrice)
    }
}