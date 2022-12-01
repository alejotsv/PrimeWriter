package com.java21days;

public class PrimeWriter {

    PrimeWriter(int numOfPrimes){
        int num = 2;
        for(int i=0; i<=numOfPrimes; i++){
            if(isPrime(num)){
                System.out.println(num);
            }
        }
    }

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
