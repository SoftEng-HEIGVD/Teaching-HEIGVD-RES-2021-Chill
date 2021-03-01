package ch.heigvd.res.chill.domain.JanisChiffelle;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class LaVaudruzienne implements IProduct {

  public final static String NAME = "La Vaudruzienne";
  public final static BigDecimal PRICE = new BigDecimal(5.0);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
