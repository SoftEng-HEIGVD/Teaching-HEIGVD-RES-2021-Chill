package ch.heigvd.res.chill.domain.LoisDiserens;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Barbeblanche implements IProduct
{

    public final static String NAME = "Frimousse - Barbeblanche";
    public final static BigDecimal PRICE = new BigDecimal(3.0); // Prix Chillout

    @Override
    public String getName()
    {
        return NAME;
    }

    @Override
    public BigDecimal getPrice()
    {
        return PRICE;
    }
}
