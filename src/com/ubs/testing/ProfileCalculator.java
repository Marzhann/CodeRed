package com.ubs.testing;

public class ProfileCalculator {

    public int calculator(int[] arr){
        int sum = 0;
        for(int i : arr){
            sum += i;
        }
        return sum;
    }
}
