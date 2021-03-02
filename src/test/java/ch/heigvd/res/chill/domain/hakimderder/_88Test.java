package ch.heigvd.res.chill.domain.hakimderder;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.hakimderder._88;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class _88Test {

  @Test
  void thePriceAndNameFor88ShouldBeCorrect() {
    _88 beer = new _88();
    assertEquals(beer.getName(), _88.NAME);
    assertEquals(beer.getPrice(), _88.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderFor88() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.hakimderder._88";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = _88.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}