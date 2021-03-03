package ch.heigvd.res.chill.domain.yanik23;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LowenbrauTest {

  @Test
  void thePriceAndNameForLowenbrauShouldBeCorrect() {
    Lowenbrau beer = new Lowenbrau();
    assertEquals(beer.getName(), Lowenbrau.NAME);
    assertEquals(beer.getPrice(), Lowenbrau.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForLowenbrau() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.yanik23.Lowenbrau";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Lowenbrau.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}