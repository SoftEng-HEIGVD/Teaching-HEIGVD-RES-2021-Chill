package ch.heigvd.res.chill.domain.davidpellissier;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GoudenCarolusTest {

  @Test
  void thePriceAndNameForGoudenCarolusShouldBeCorrect() {
    GoudenCarolus beer = new GoudenCarolus();
    assertEquals(beer.getName(), GoudenCarolus.NAME);
    assertEquals(beer.getPrice(), GoudenCarolus.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForGoudenCarolus() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.davidpellissier.GoudenCarolus";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = GoudenCarolus.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}
