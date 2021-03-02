package ch.heigvd.res.chill.domain.JanisChiffelle;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.JanisChiffelle.LaVaudruzienne;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LaVaudruzienneTest {

  @Test
  void thePriceAndNameForLaVaudruzienneShouldBeCorrect() {
    LaVaudruzienne beer = new LaVaudruzienne();
    Assertions.assertEquals(beer.getName(), LaVaudruzienne.NAME);
    Assertions.assertEquals(beer.getPrice(), LaVaudruzienne.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForLaVaudruzienne() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.JanisChiffelle.LaVaudruzienne";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = LaVaudruzienne.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}