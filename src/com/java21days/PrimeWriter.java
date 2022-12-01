package com.java21days;

public class PrimeWriter {


    boolean isPrime(int num){
        double root = Math.sqrt(num);
        for(int i=2; i<=root; i++){
            if(num % i ==0){
                return false;
            }
        }
        return true;
    }
}
