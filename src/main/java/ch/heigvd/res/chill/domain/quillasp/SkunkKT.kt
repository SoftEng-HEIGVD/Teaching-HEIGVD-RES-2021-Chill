package ch.heigvd.res.chill.domain.quillasp

import ch.heigvd.res.chill.domain.IProduct
import java.math.BigDecimal

/*
 * Je me suis dit: "pourquoi pas en Kotlin", c'est un peu comme un Java en plus
 * lisible, imho
 *
 * Bon, c'était un peu tard la nuit, du coup le premier checkout n'a pas
 * vraiment checkouté… Mais bon, c'est je trouvais ça amusant
 */
class SkunkKT: IProduct {
    override fun getName(): String { return NAME; }

    override fun getPrice(): BigDecimal { return PRICE }

    companion object {
        const val NAME = "Skunk but in Kotlin"
        val PRICE      = BigDecimal(10.0)
    }
}