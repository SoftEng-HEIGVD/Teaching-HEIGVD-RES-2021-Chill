package ch.heigvd.res.chill.domain.RebeccaTevaearai;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class PomeloTest {
    @Test
    void thePriceAndNameForPomeloShouldBeCorrect() {
        Pomelo beer = new Pomelo();
        assertEquals(beer.getName(), Pomelo.NAME);
        assertEquals(beer.getPrice(), Pomelo.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForPomelo() {
        Bartender jesus = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.RebeccaTevaearai.Pomelo";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jesus.order(request);
        BigDecimal expectedTotalPrice = Pomelo.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}
