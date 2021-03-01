package ch.heigvd.res.chill.domain.OvichHeigVD;

import static org.junit.jupiter.api.Assertions.*;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.OvichHeigVD.Monster;


import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MonsterTest {
    @Test
    void thePriceAndNameForMonsterShouldBeCorrect(){
        Monster drink = new Monster();
        assertEquals(drink.getName(), Monster.NAME);
        assertEquals(drink.getPrice(), Monster.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForMonster() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.OvichHeigVD.Monster";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Monster.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}