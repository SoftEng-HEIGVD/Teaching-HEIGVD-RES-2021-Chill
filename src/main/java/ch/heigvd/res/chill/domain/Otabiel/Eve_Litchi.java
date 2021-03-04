package ch.heigvd.res.chill.domain.Otabiel;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Eve_Litchi implements IProduct {
    public final static String NAME = "Eve Litchi";
    public final static BigDecimal PRICE = new BigDecimal(2.5);

    @Override
    public String getName() {return NAME;}

    @Override
    public BigDecimal getPrice() {return PRICE;}

}
