package johnny;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarreTest {

    @Test
    void calculAire() {
        Carre carre = new Carre();
        carre.calculAire(10,10);
    }
}