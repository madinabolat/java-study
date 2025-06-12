package org.example;

import java.util.HashMap;

public class Fibonacci {

    public static HashMap<Integer, Long> cache = new HashMap<>();;

    public static long fibonacci(int n){
        if (n<=1){
            return (long) n;
        }

        if (cache.containsKey(n)){
            return cache.get(n);
        } else{
            long result = fibonacci(n-1)+fibonacci(n-2);
            cache.put(n, result);
            return result;
        }

    }
    public static void main(String[] args) {
        for (int i=0;i<101;i++){
            System.out.println("Fibonacci "+ i + ": " + fibonacci(i));
        }

    }
}
