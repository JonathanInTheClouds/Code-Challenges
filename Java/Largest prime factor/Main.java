package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<Long> primeFactors(Long numbers) {
        Long n = numbers;
        List<Long> factors = new ArrayList<>();
        for (long i = 2; i <= n / i; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        } if (n > 1) {
            factors.add(n);
        }
        return factors;
    }

    public static void main(String[] args) {
        List<Long> longList = primeFactors(600851475143L);
        System.out.println(longList.get(longList.size() - 1));
    }
}
