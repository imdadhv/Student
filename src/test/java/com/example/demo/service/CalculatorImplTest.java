package com.example.demo.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;



class CalculatorImplTest {
   private CalculatorImpl calculator;

    @BeforeEach
    void setUp() {
        calculator = new CalculatorImpl();
    }

    @AfterEach
    void tearDown() {
        calculator = null;
    }

    @Test
    void testSum() {
        double sum = calculator.sum(10, 10);

        assertThat(sum).isEqualTo(20);
    }

    @Test
    void testSub() {
    }

    @Test
    void testDivide() {
        assertThatThrownBy(()->calculator.divide(10,0))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("b can not be 0");
    }

    @Test
    void testMultiple() {
    }
}