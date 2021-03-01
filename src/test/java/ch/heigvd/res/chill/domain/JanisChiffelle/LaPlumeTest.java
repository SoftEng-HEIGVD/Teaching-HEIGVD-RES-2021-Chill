package ch.heigvd.res.chill.domain.JanisChiffelle;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.JanisChiffelle.LaPlume;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LaPlumeTest {

  @Test
  void thePriceAndNameForLaPlumeShouldBeCorrect() {
    LaPlume beer = new LaPlume();
    assertEquals(beer.getName(), LaPlume.NAME);
    assertEquals(beer.getPrice(), LaPlume.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForLaPlume() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.JanisChiffelle.LaPlume";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = LaPlume.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}