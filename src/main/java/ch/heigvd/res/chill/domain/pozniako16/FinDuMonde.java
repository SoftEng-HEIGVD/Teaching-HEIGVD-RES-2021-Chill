package ch.heigvd.res.chill.domain.pozniako16;

import ch.heigvd.res.chill.domain.IProduct;

//test
import java.math.BigDecimal;

public class FinDuMonde implements IProduct {
    public final static String NAME = "FinDuMonde";
    public final static BigDecimal PRICE = new BigDecimal(6.6);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}