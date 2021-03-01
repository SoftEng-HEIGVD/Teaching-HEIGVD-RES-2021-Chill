package ch.heigvd.res.chill.domain.JoanMaillard;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TrappeIsidOrTest {

  @Test
  void thePriceAndNameForTrappeIsidOrShouldBeCorrect() {
    TrappeIsidOr beer = new TrappeIsidOr();
    assertEquals(beer.getName(), TrappeIsidOr.NAME);
    assertEquals(beer.getPrice(), TrappeIsidOr.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForTrappeIsidOr() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.JoanMaillard.TrappeIsidOr";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = TrappeIsidOr.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}