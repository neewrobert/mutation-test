package com.neewrobert.mutationtest;

import org.junit.Assert;
import org.junit.Test;

public class CounterTest {

    @Test
    public void testEvenNumberCounterWithPositives(){

        //Given
        int begin = 0;
        int end = 4;

        //When
        Counter counter = new Counter();
        int result = counter.countEvenNumbersInARangeOfPositives(begin, end);

        //then
        Assert.assertEquals(2, result);

    }

    @Test
    public void testEvenNumberCounterWithNegatives(){

        //Given
        int begin = -3;
        int end = -1;

        //When
        Counter counter = new Counter();
        int result = counter.countEvenNumbersInARangeOfPositives(begin, end);

        //then
        Assert.assertEquals(0, result);

    }

    @Test
    public void testEvenNumberCounterWithZero(){

        //Given
        int begin = 0;
        int end = 0;

        //When
        Counter counter = new Counter();
        int result = counter.countEvenNumbersInARangeOfPositives(begin, end);

        //then
        Assert.assertEquals(0, result);
    }

    @Test
    public void testEvenNumberCounterWithNoEvenNumber(){

        //Given
        int begin = 0;
        int end = 1;

        //When
        Counter counter = new Counter();
        int result = counter.countEvenNumbersInARangeOfPositives(begin, end);

        //then
        Assert.assertEquals(0, result);
    }
}
