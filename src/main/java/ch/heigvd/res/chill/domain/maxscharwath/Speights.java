package ch.heigvd.res.chill.domain.maxscharwath;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Speights implements IProduct {
    public final static String NAME = "Speight's";
    public final static BigDecimal PRICE = new BigDecimal(3);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}