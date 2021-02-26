package ch.heigvd.res.chill.domain.Meridas;
import ch.heigvd.res.chill.domain.IProduct;
import java.math.BigDecimal;

public class Asahi implements IProduct {

    public final static String NAME = "Asahi";
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
