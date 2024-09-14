package demo.parallel;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    @org.junit.jupiter.api.Test
    void minus() {
        Complex a = new Complex(2, 3);
        Complex b = new Complex(1, 1);
        Complex result = a.minus(b);
        assertEquals(1.0, result.getRe(), 0.0001);
        assertEquals(2.0, result.getIm(), 0.0001);
    }
}