package ch.heigvd.res.chill.domain.OvichHeigVD;

import static org.junit.jupiter.api.Assertions.*;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.OvichHeigVD.RedBull;


import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RedBullTest {
    @Test
    void thePriceAndNameForRedbullShouldBeCorrect(){
        RedBull drink = new RedBull();
        assertEquals(drink.getName(), RedBull.NAME);
        assertEquals(drink.getPrice(), RedBull.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForRedbull() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.OvichHeigVD.RedBull";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = RedBull.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}