package org;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        int result = calculator.add(10, 5);
        System.out.println("Result of 10 + 5 = " + result);
        assertEquals(15, result);
    }

    @Test
    public void testSubtract() {
        int result = calculator.subtract(10, 5);
        System.out.println("Result of 10 - 5 = " + result);
        assertEquals(5, result);
    }

    @Test
    public void testDivide() {
        int result = calculator.divide(20, 5);
        System.out.println("Result of 20 / 5 = " + result);
        assertEquals(4, result);
    }

    @Test
    public void testMultiply() {
        int result = calculator.multiply(4, 6);
        System.out.println("Result of 4 * 6 = " + result);
        assertEquals(24, result);
    }
}
