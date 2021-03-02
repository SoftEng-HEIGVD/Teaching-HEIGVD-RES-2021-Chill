package ch.heigvd.res.chill.domain.gabthr;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PepsiMaxTest {

  @Test
  void thePriceAndNameForPepsiMaxShouldBeCorrect() {
    PepsiMax beer = new PepsiMax();
    assertEquals(beer.getName(), PepsiMax.NAME);
    assertEquals(beer.getPrice(), PepsiMax.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForPepsiMax() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.gabthr.PepsiMax";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = PepsiMax.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}