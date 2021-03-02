package ch.heigvd.res.chill.domain.yanik23;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PaulanerTest {

  @Test
  void thePriceAndNameForPunkIPAShouldBeCorrect() {
    Paulaner beer = new Paulaner();
    assertEquals(beer.getName(), Paulaner.NAME);
    assertEquals(beer.getPrice(), Paulaner.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForPunkIPA() {
    Bartender jane = new Bartender();
    //String productName = "ch.heigvd.res.chill.domain.wasadigi.PunkIPA";
    String productName = "ch.heigvd.res.chill.domain.yanik23.Paulaner";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Paulaner.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}