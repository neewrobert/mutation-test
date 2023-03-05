package com.neewrobert.mutationtest;

public class Counter {


    public int countEvenNumbersInARangeOfPositives(int begin, int end){

        int count = 0;
        for(int i = begin; i <= end; i++){
            if (i > 0 && i % 2 == 0){
                count++;
            }
        }
        return count;
    }
}
