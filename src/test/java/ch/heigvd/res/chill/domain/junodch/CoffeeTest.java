package ch.heigvd.res.chill.domain.junodch;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CoffeeTest {

  @Test
  void thePriceAndNameForCoffeeShouldBeCorrect() {
    Coffee coffee = new Coffee();
    assertEquals(coffee.getName(), Coffee.NAME);
    assertEquals(coffee.getPrice(), Coffee.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForCoffee() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.junodch.Coffee";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Coffee.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}