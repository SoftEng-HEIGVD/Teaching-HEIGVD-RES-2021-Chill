package ch.heigvd.res.chill.domain.g5b7w3;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LupusTest {

    @Test
    void thePriceAndNameForLupusShouldBeCorrect() {
        Lupus beer = new Lupus();
        assertEquals(beer.getName(), Lupus.NAME);
        assertEquals(beer.getPrice(), Lupus.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForLupus() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.g5b7w3.Lupus";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Lupus.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}
