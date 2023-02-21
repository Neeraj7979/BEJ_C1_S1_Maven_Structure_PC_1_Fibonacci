package com.niit.bej;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FibonacciTest {

    Fibonacci fibonacci;

    @BeforeEach
    void setUp() {
        fibonacci = new Fibonacci();
    }

    @AfterEach
    void tearDown() {
        fibonacci = null;
    }

    @Test
    void printFibonacciSeries() {


    }

    @Test
    void testPrintFibonacciSeries() {
    }
}