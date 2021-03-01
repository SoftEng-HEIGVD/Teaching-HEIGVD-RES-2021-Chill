package ch.heigvd.res.chill.domain.wilfried01;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KadjiTest {

  @Test
  void thePriceAndNameForKadjiShouldBeCorrect() {
    Kadji beer = new Kadji();
    assertEquals(beer.getName(), Kadji.NAME);
    assertEquals(beer.getPrice(), Kadji.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForKadji() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.wilfried01.Kadji";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Kadji.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}