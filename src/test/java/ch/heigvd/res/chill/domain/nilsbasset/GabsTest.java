package ch.heigvd.res.chill.domain.nilsbasset;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GabsTest {

  @Test
  void thePriceAndNameForGabsShouldBeCorrect() {
    Gabs beer = new Gabs();
    assertEquals(beer.getName(), Gabs.NAME);
    assertEquals(beer.getPrice(), Gabs.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForGabs() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.nilsbasset.Gabs";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Gabs.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}