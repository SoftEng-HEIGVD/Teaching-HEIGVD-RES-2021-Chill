package ch.heigvd.res.chill.domain.LoisDiserens;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class BarbeblancheTest {

    @Test
    void PrixEtNomCorrectFinDuMonde() {
        Barbeblanche beer = new Barbeblanche();
        assertEquals(beer.getName(), Barbeblanche.NAME);
        assertEquals(beer.getPrice(), Barbeblanche.PRICE);
    }

    @Test
    void AccepterCommandePourFinDuMonde() {
        int nbBieresCommandees = 3;
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.LoisDiserens.Barbeblanche";
        OrderRequest request = new OrderRequest(nbBieresCommandees, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Barbeblanche.PRICE.multiply(new BigDecimal(nbBieresCommandees));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}