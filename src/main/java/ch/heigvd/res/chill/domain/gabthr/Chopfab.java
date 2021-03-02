package ch.heigvd.res.chill.domain.gabthr;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Chopfab implements IProduct {
    public final static String NAME = "Chopfab";
    public final static BigDecimal PRICE = new BigDecimal(2.1);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
