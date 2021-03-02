package ch.heigvd.res.chill.domain.yanik23;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Paulaner implements IProduct{
    public final static String NAME = "Paulaner";
    public final static BigDecimal PRICE = new BigDecimal(7.0);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
