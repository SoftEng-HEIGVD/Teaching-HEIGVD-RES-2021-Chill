package ch.heigvd.res.chill.domain.robin_gaudin;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Desperados implements IProduct {

  public final static String NAME = "Desperados";
  public final static BigDecimal PRICE = new BigDecimal(2.5);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
