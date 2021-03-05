package ch.heigvd.res.chill.domain.fg1989;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrangeJuiceTest {

    @Test
    void thePriceAndNameForAppleJuiceShouldBeCorrect() {
        OrangeJuice juice = new OrangeJuice();
        assertEquals(juice.getName(), OrangeJuice.NAME);
        assertEquals(juice.getPrice(), OrangeJuice.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForAppleJuice() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.fg1989.OrangeJuice";
        OrderRequest request = new OrderRequest(2, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = OrangeJuice.PRICE.multiply(new BigDecimal(2));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}
