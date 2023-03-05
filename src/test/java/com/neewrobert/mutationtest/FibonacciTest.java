package com.neewrobert.mutationtest;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FibonacciTest {

    @Test
    public void getAValidListOfFibonacci() {

        //given
        int fibonacciUntil = 55;
        List<Integer> expectedList = List.of(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55);

        //when
        Fibonacci fibonacci = new Fibonacci();
        List<Integer> returnedList = fibonacci.getFibonacciSequenceUntil(fibonacciUntil);

        //then
        Assert.assertArrayEquals(expectedList.toArray(), returnedList.toArray());
    }

    @Test
    public void getAValidListOfFibonacciUntilZero() {
        //given
        int fibonacciUntil = 0;
        List<Integer> expectedList = List.of(0);

        //when
        Fibonacci fibonacci = new Fibonacci();
        List<Integer> returnedList = fibonacci.getFibonacciSequenceUntil(fibonacciUntil);

        //then
        Assert.assertArrayEquals(expectedList.toArray(), returnedList.toArray());
    }

    @Test
    public void testFibonacciRecursion() {

        //given
        int given = 10;
        int expected = 55;

        //when
        Fibonacci fibonacci = new Fibonacci();
        int result = fibonacci.fibonacciRecursion(given);

        //then
        Assert.assertEquals(expected, result);
    }
}
