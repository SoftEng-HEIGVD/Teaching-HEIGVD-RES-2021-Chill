package ch.heigvd.res.chill.domain.nilsbasset;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CocaTest {

  @Test
  void thePriceAndNameForCocaShouldBeCorrect() {
    Coca beer = new Coca();
    assertEquals(beer.getName(), Coca.NAME);
    assertEquals(beer.getPrice(), Coca.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForCoca() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.nilsbasset.Coca";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Coca.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}