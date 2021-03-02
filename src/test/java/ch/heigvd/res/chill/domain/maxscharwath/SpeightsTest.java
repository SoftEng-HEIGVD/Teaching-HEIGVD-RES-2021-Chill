package ch.heigvd.res.chill.domain.maxscharwath;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SpeightsTest {

  @Test
  void thePriceAndNameForSpeightsShouldBeCorrect() {
    Speights beer = new Speights();
    assertEquals(beer.getName(), Speights.NAME);
    assertEquals(beer.getPrice(), Speights.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForSpeights() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.maxscharwath.Speights";
    OrderRequest request = new OrderRequest(4, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Speights.PRICE.multiply(new BigDecimal(4));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}