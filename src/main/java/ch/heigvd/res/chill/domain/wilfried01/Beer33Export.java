package ch.heigvd.res.chill.domain.wilfried01;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Beer33Export implements IProduct {

  public final static String NAME = "Beer33Export";
  public final static BigDecimal PRICE = new BigDecimal(2.8);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
