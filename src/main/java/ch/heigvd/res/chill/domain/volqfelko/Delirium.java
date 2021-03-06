package ch.heigvd.res.chill.domain.volqfelko;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Delirium implements IProduct {

  public final static String NAME = "Delirium";
  public final static BigDecimal PRICE = new BigDecimal(3.0);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
