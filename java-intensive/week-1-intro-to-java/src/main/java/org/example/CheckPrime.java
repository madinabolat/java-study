package org.example;

import java.util.Scanner;

public class CheckPrime {
    public static boolean isPrime(int n){
        for (int i = 2; i < n-1; i++){
            if (n % i == 0 ) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(n + " is prime: " + isPrime(n));

    }
}
