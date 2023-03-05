package com.neewrobert.mutationtest;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {


    public List<Integer> getFibonacciSequenceUntil(int givenNumber) {

        List<Integer> fibonacciNumbers = new ArrayList<>();
        fibonacciNumbers.add(0);

        if (givenNumber == 0) {
            return fibonacciNumbers;
        }

        int prev = 0, curr = 1;
        while (curr <= givenNumber) {
            fibonacciNumbers.add(curr);
            int next = prev + curr;
            prev = curr;
            curr = next;
        }

        return fibonacciNumbers;
    }

    public int fibonacciRecursion(int number) {

        if (number == 0 || number == 1) {
            return number;
        }
        return fibonacciRecursion(number - 1) + fibonacciRecursion(number - 2);
    }
}
