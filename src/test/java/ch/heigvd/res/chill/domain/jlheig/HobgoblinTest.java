package ch.heigvd.res.chill.domain.jlheig;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HobgoblinTest {

  @Test
  void thePriceAndNameForHobgoblinShouldBeCorrect() {
    Hobgoblin beer = new Hobgoblin();
    assertEquals(beer.getName(), Hobgoblin.NAME);
    assertEquals(beer.getPrice(), Hobgoblin.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForHobgoblin() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.jlheig.Hobgoblin";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Hobgoblin.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}