package ch.heigvd.res.chill.domain.Otabiel;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Eve_LitchiTest {

    @Test
    void thePriceAndNameForEve_LitchiShouldBeCorrect() {
        Eve_Litchi beer = new Eve_Litchi();
        assertEquals(beer.getName(), Eve_Litchi.NAME);
        assertEquals(beer.getPrice(), Eve_Litchi.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForEve_Litchi() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.Otabiel.Eve_Litchi";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Eve_Litchi.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}