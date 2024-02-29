package com.example.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void testRoot() {
        double result = calculator.root(9.0);
        assertEquals(3.0, result, 0.001);
    }

    @Test
    public void testFactorial() {
        int result = calculator.factorial(5.0);
        assertEquals(120, result, 0.001);
    }

    @Test
    public void testLog() {
        double result = calculator.log(5.0);
        assertEquals(1.61, result, 0.001);
    }

    @Test
    public void testPower() {
        int result = calculator.power(5.0, 2.0);
        assertEquals(25, result, 0.001);
    }
}
