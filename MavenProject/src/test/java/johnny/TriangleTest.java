package johnny;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @org.junit.jupiter.api.Test
    void calculAir() {
        Triangle testTriangle = new Triangle();
        assertEquals(50, testTriangle.calculAir(10,10));
    }

    @org.junit.jupiter.api.Test
    void calculPerimetre() {
        Triangle testTriangle = new Triangle();
        assertEquals(25, testTriangle.calculPerimetre(10,10,5));
    }


}