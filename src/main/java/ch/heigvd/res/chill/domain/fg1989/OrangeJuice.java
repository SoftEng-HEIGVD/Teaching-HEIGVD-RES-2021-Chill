package ch.heigvd.res.chill.domain.fg1989;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class OrangeJuice implements IProduct {
    public final static String NAME = "Orange Juice";
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