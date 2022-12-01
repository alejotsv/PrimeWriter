package com.java21days;

import java.io.*;

public class PrimeWriter {

    PrimeWriter(int numOfPrimes){
        int primeCount = 0;
        int currentNum = 2;
        try (
                FileOutputStream file = new FileOutputStream("400primes.dat");
                BufferedOutputStream buffer = new BufferedOutputStream(file);
                DataOutputStream stream = new DataOutputStream(buffer);
            ) {
            while(primeCount<numOfPrimes){
                if(isPrime(currentNum)){
                    stream.writeInt(currentNum);
                    primeCount++;
                }
                currentNum++;
            }
            buffer.close();
        } catch (IOException e){
            System.out.println("Exception: " + e.getMessage());
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
