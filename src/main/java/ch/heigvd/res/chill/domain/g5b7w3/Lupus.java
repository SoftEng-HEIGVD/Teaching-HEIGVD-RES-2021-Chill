package ch.heigvd.res.chill.domain.g5b7w3;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Lupus implements IProduct {

    public final static String NAME = "Lupus";
    public final static BigDecimal PRICE = new BigDecimal(3.2);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}



