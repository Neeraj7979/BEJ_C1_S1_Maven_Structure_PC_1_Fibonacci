package com.niit.bej;

public class Fibonacci {
    public int printFibonacciSeries(int numberOfTerms) {
        int firstTerm = 0;
        int secondTerm = 1;
        int count = 0;

        while (count < numberOfTerms) {
            System.out.print(firstTerm + ",");
            int thirdTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = thirdTerm;
            count = count + 1;
        }
        return firstTerm;


    }
}
