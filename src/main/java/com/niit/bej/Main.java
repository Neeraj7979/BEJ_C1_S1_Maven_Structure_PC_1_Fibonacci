package com.niit.bej;

public class Main {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        int fibonacciSeries = fibonacci.printFibonacciSeries(5);
        System.out.println(fibonacciSeries);
    }
}