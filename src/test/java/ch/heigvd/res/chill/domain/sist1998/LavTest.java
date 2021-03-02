package ch.heigvd.res.chill.domain.sist1998;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.sist1998.Lav;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LavTest {

    @Test
    void thePriceAndNameForLavShouldBeCorrect() {
        Lav lavBeer = new Lav();
        assertEquals(lavBeer.getName(), Lav.NAME);
        assertEquals(lavBeer.getPrice(), Lav.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForLav() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.sist1998.Lav";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Lav.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}
