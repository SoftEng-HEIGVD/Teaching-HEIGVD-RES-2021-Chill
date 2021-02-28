package ch.heigvd.res.chill.domain.wilfried01;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Beer33ExportTest {

  @Test
  void thePriceAndNameForBeer33ExportShouldBeCorrect() {
    Beer33Export beer = new Beer33Export();
    assertEquals(beer.getName(), Beer33Export.NAME);
    assertEquals(beer.getPrice(), Beer33Export.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForBeer33Export() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.wilfried01.Beer33Export";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Beer33Export.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}