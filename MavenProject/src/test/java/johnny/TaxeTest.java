package johnny;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaxeTest {

    @Test
    void calculTaxe() {
        Taxe taxe = new Taxe();
        assertEquals(1.48, taxe.calculTaxe(10,true,true), 0.01);
        assertEquals(2.96, taxe.calculTaxe(20,true,true), 0.01);
    }
}