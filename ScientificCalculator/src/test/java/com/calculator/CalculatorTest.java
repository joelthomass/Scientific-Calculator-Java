package com.calculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class CalculatorTest {
    @Test
    void testSquareRoot() {
        assertEquals(4, Calculator.squareRoot(16), 0.001);
    }

    @Test
    void testFactorial() {
        assertEquals(120, Calculator.factorial(5));
    }

    @Test
    void testNaturalLog() {
        assertEquals(2.302, Calculator.naturalLog(10), 0.001);
    }

    @Test
    void testPower() {
        assertEquals(8, Calculator.power(2, 3), 0.001);
    }
}

