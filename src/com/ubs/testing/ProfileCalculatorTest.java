package com.ubs.testing;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProfileCalculatorTest {

    @Test
    public void calculator() {

        ProfileCalculator calculator = new ProfileCalculator();

        int [] testArr = {10, 11, 7};
        assertEquals(28, calculator.calculator(testArr));
    }

    @Test
    public void shouldReturnZero(){

        ProfileCalculator calculator = new ProfileCalculator();

        int [] testArr = {};
        assertEquals(0,calculator.calculator(testArr));
    }
}