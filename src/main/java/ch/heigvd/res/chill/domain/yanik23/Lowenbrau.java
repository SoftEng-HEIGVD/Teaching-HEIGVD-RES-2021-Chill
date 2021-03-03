package ch.heigvd.res.chill.domain.yanik23;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Lowenbrau implements IProduct {

  public final static String NAME = "Lowenbrau";
  public final static BigDecimal PRICE = new BigDecimal(6.6);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
