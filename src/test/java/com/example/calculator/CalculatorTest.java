package com.example.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void testRoot() {
        double result = calculator.root(9);
        assertEquals(3, result, 0.001);
    }

    @Test
    public void testFactorial() {
        double result = calculator.factorial(5);
        assertEquals(120, result, 0.001);
    }

    @Test
    public void testLog() {
        double result = calculator.log(5);
        assertEquals(1.61, result, 0.001);
    }

    @Test
    public void testPower() {
        double result = calculator.power(5, 2);
        assertEquals(25, result, 0.001);
    }
}
