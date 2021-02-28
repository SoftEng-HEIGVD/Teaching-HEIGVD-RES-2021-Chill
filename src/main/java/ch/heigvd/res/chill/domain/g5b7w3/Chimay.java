package ch.heigvd.res.chill.domain.g5b7w3;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Chimay implements IProduct {

    public final static String NAME = "Chimay";
    public final static BigDecimal PRICE = new BigDecimal(3.5);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}



