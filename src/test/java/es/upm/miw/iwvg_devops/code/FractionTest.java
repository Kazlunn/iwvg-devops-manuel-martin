package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FractionTest {

    @Test
    void testConstructorEmptyFraction() {
        Fraction fraction = new Fraction();
        assertEquals(1, fraction.getNumerator());
        assertEquals(1, fraction.getDenominator());
    }

    @Test
    void testConstructorFraction() {
        Fraction fraction = new Fraction(2, 3);
        assertEquals(2, fraction.getNumerator());
        assertEquals(3, fraction.getDenominator());
    }

    @Test
    void testDecimalFraction() {
        Fraction fraction = new Fraction(1, 2);
        assertEquals(0.5, fraction.decimal());
    }

    @Test
    void testToStringFraction() {
        String objectToString = new Fraction(3, 4).toString();
        assertNotNull(objectToString);
        assertEquals("Fraction{numerator=3, denominator=4}", objectToString);
    }

    @Test
    void testIsProper() {
        Fraction fraction = new Fraction(4, 5);
        assertTrue(fraction.isProper());
    }

    @Test
    void testIsImproper() {
        Fraction fraction = new Fraction(6, 5);
        assertTrue(fraction.isImproper());
    }

    @Test
    void testIsEquivalent() {
        Fraction fraction = new Fraction(2, 3);
        assertTrue(fraction.isEquivalent(new Fraction(4, 6)));
    }

    @Test
    void testAdd() {
        Fraction fraction1 = new Fraction(1, 5);
        Fraction fraction2 = new Fraction(2, 10);
        Fraction fraction3 = fraction1.add(fraction2);
        assertEquals(fraction3.getNumerator(), 20);
        assertEquals(fraction3.getDenominator(), 50);
    }

    @Test
    void testMultiply() {
        Fraction fraction1 = new Fraction(1, 5);
        Fraction fraction2 = new Fraction(2, 3);
        Fraction fraction3 = fraction1.multiply(fraction2);
        assertEquals(fraction3.getNumerator(), 2);
        assertEquals(fraction3.getDenominator(), 15);
    }

    @Test
    void testDivide() {
        Fraction fraction1 = new Fraction(1, 5);
        Fraction fraction2 = new Fraction(2, 3);
        Fraction fraction3 = fraction1.divide(fraction2);
        assertEquals(fraction3.getNumerator(), 3);
        assertEquals(fraction3.getDenominator(), 10);
    }

}
