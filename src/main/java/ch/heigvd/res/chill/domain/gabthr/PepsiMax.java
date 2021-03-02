package ch.heigvd.res.chill.domain.gabthr;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class PepsiMax implements IProduct {

  public final static String NAME = "PepsiMax";
  public final static BigDecimal PRICE = new BigDecimal(1.5);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
