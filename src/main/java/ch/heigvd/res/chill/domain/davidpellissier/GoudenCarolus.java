package ch.heigvd.res.chill.domain.davidpellissier;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class GoudenCarolus implements IProduct {

  public final static String NAME = "Gouden Carolus";
  public final static BigDecimal PRICE = new BigDecimal(4.99);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
