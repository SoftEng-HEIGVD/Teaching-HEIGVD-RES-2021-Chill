package ch.heigvd.res.chill.domain.doublei;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AmsterdamNavigatorTest {
    @Test
    void thePriceAndNameForAmsterdamNavigatorShouldBeCorrect() {
        AmsterdamNavigator beer = new AmsterdamNavigator();
        assertEquals(beer.getName(), AmsterdamNavigator.NAME);
        assertEquals(beer.getPrice(), AmsterdamNavigator.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForAmsterdamNavigator() {
        int nbBear = 4;
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.doublei.AmsterdamNavigator";
        OrderRequest request = new OrderRequest(nbBear, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = AmsterdamNavigator.PRICE.multiply(new BigDecimal(nbBear));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }


}