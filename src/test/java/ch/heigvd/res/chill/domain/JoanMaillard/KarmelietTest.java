package ch.heigvd.res.chill.domain.JoanMaillard;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KarmelietTest {

  @Test
  void thePriceAndNameForKarmelietShouldBeCorrect() {
    Karmeliet karmeliet = new Karmeliet();
    assertEquals(karmeliet.getName(), Karmeliet.NAME);
    assertEquals(karmeliet.getPrice(), Karmeliet.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForKarmeliet() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.JoanMaillard.Karmeliet";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Karmeliet.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}