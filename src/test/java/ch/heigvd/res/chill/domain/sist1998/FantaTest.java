package ch.heigvd.res.chill.domain.sist1998;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.sist1998.Fanta;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FantaTest {

    @Test
    void thePriceAndNameForFantaShouldBeCorrect() {
        Fanta fanta = new Fanta();
        assertEquals(fanta.getName(), Fanta.NAME);
        assertEquals(fanta.getPrice(), Fanta.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForFanta() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.sist1998.Fanta";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Fanta.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}
