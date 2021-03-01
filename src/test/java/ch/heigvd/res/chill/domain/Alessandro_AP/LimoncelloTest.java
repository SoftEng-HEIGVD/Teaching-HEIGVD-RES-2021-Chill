package ch.heigvd.res.chill.domain.Alessandro_AP;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LimoncelloTest {

    @Test
    void thePriceAndNameForLimoncelloShouldBeCorrect() {
        Limoncello limo = new Limoncello();
        assertEquals(limo.getName(), Limoncello.NAME);
        assertEquals(limo.getPrice(), Limoncello.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForLimoncello() {
        Bartender alex = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.Alessandro_AP.Limoncello";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = alex.order(request);
        BigDecimal expectedTotalPrice = Limoncello.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}