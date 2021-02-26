package ch.heigvd.res.chill.domain.pozniako16;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FinDuMondeTest {
    @Test
    void thePriceAndNameForBoxerShouldBeCorrect() {
        FinDuMonde beer = new FinDuMonde();
        assertEquals(beer.getName(), FinDuMonde.NAME);
        assertEquals(beer.getPrice(), FinDuMonde.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForBoxer() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.pozniako16.FinDuMonde";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = FinDuMonde.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}