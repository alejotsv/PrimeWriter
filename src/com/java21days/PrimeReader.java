package com.java21days;

import java.io.*;

public class PrimeReader {
    int prime;
    PrimeReader(){
        try (
                FileInputStream file = new FileInputStream("400primes.dat");
                BufferedInputStream buffer = new BufferedInputStream(file);
                DataInputStream stream = new DataInputStream(buffer);
                ) {
            do {
                prime = stream.readInt();
                if(prime != -1){
                    System.out.println(prime + " is prime.");
                } else {
                    stream.close();
                }
            } while (prime != -1);

        } catch (FileNotFoundException e){
            System.out.println("Exception: " + e.getMessage());
        } catch (EOFException e){
            System.out.println("File reading completed. " + e.getMessage());
        } catch (IOException e){
            System.out.println("Exception: " + e.getMessage());
        }

    }
}
