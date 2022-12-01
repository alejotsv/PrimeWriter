package com.java21days;

public class PrimeWriter {

    PrimeWriter(int numOfPrimes){
        int primeCount = 0;
        int currentNum = 2;
        while(primeCount<numOfPrimes){
            if(isPrime(currentNum)){
                System.out.println(currentNum + " is prime.");
                primeCount++;
            }
            currentNum++;
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
