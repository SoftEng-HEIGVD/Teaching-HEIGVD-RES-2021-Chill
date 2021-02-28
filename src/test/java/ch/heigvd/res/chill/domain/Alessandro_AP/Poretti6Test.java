package ch.heigvd.res.chill.domain.Alessandro_AP;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Poretti6Test {

    @Test
    void thePriceAndNameForPoretti6ShouldBeCorrect() {
        Poretti6 poretti6 = new Poretti6();
        assertEquals(poretti6.getName(), Poretti6.NAME);
        assertEquals(poretti6.getPrice(), Poretti6.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForPoretti6() {
        Bartender alex = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.Alessandro_AP.Poretti6";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = alex.order(request);
        BigDecimal expectedTotalPrice = Poretti6.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}