package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BasicCalculatorTest {

    private final CalculatorService calculatorService = new BasicCalculatorService();

    @Test
    public void testAdd() {
        assertEquals(4, calculatorService.add(2, 5));
        assertEquals(0, calculatorService.add(0, 0));
        assertEquals(-3, calculatorService.add(-1, -2));
    }

    @Test
    public void testSubtract() {
        assertEquals(2, calculatorService.subtract(4, 2));
        assertEquals(0, calculatorService.subtract(0, 0));
        assertEquals(-3, calculatorService.subtract(1, 4));
    }

    @Test
    public void testMultiply() {
        assertEquals(8, calculatorService.multiply(4, 2));
        assertEquals(0, calculatorService.multiply(0, 0));
        assertEquals(-6, calculatorService.multiply(2, -3));
    }

    @Test
    public void testDivide() {
        assertEquals(3, calculatorService.divide(6, 2));
        assertEquals(0, calculatorService.divide(0, 1));
        assertEquals(-2, calculatorService.divide(8, -4));
    }

    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calculatorService.divide(5, 0));
    }
}
