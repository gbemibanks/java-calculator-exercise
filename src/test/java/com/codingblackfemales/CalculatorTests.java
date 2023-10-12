package com.codingblackfemales;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName(value = "The Calculator should")
public class CalculatorTests {
@Test
    @DisplayName("add two positive numbers")
    public void testAdditionWithPositiveNumbers() {
        final Integer sum = Calculator.add(2, 3);

        assertEquals(5, sum);
    }

@Test
    @DisplayName("add a positive number and zero")
    public void testAdditionWithZero() {
        final Integer sum = Calculator.add(5, 0);

        assertEquals(5, sum);
    }

@Test
    @DisplayName("add zero and a positive number")
    public void testAdditionToZero() {
        final Integer sum = Calculator.add(0, 5);
        assertEquals(5, sum);
    }

@Test
    @DisplayName("add a positive number and a negative number")
    public void testAdditionWithNegativeNumber() {
        final Integer sum = Calculator.add(8, -3);

        assertEquals(5, sum);
    }

@Test
    @DisplayName("add two negative numbers")
    public void testAdditionWithNegativeNumbers() {
        final Integer sum = Calculator.add(-2, -3);

        assertEquals(-5, sum);
    }

@Test
    @DisplayName("multiply a positive number with zero")
    public void testMultiplicationWithZero() {
        final Integer product = Calculator.multiply(2, 0);

        assertEquals(0, product);
    }

 @Test
    @DisplayName("multiply two positive numbers")
    public void testMultiplicationWithPositiveNumbers() {
        final Integer product = Calculator.multiply(2, 4);

        assertEquals(8, product);
    }
@Test
    @DisplayName("multiply a positive number with a negative number")
    public void testMultiplicationWithNegativeNumber() {
        final Integer product = Calculator.multiply(2, -4);

        assertEquals(-8, product);
    }
@Test
    @DisplayName("multiply two negative numbers")
    public void testMultiplicationWithNegativeNumbers() {
        final Integer product = Calculator.multiply(-2, -4);

        assertEquals(8, product);
    }

@Test
    @DisplayName("subtract zero from a positive number")
    public void testSubtractionWithZero() {
        final Integer difference = Calculator.subtract(5, 0);

        assertEquals(5, difference);
    }

@Test
    @DisplayName("subtract a positive number from zero")
    public void testSubtractionFromZero() {
        final Integer difference = Calculator.subtract(0, 5);

        assertEquals(-5, difference);
    }
@Test
    @DisplayName("subtract a negative number from a positive number")
    public void testSubtractionWithNegativeNumber() {
        final Integer difference = Calculator.subtract(8, -3);

        assertEquals(11, difference);
    }

@Test
    @DisplayName("subtract two negative numbers")
    public void testSubtractionWithNegativeNumbers() {
        final Integer difference = Calculator.subtract(-2, -4);

        assertEquals(2, difference);
    }

 @Test
    @DisplayName("divide two positive numbers")
    public void testDivisionWithPositiveNumbers() {
        final Integer quotient = Calculator.divide(10, 2);

        assertEquals(5, quotient);
    }

@Test
    @DisplayName("divide a positive number by zero")
    public void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> {
            Calculator.divide(5, 0);
        });
    }

@Test
    @DisplayName("divide zero by a positive number")
    public void testDivisionOfZero() {
        final Integer quotient = Calculator.divide(0, 5);

        assertEquals(0, quotient);
    }
@Test
    @DisplayName("divide a positive number by a negative number")
    public void testDivisionWithNegativeNumber() {
        final Integer quotient = Calculator.divide(10, -2);

        assertEquals(-5, quotient);
    }

@Test
    @DisplayName("divide two negative numbers")
    public void testDivisionWithNegativeNumbers() {
        final Integer quotient = Calculator.divide(-10, -2);

        assertEquals(5, quotient);
    }
}
