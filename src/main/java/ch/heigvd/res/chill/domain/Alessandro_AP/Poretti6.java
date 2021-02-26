package ch.heigvd.res.chill.domain.Alessandro_AP;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Poretti6 implements IProduct {

    public final static String NAME = "Poretti6";
    public final static BigDecimal PRICE = new BigDecimal(4.5);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
