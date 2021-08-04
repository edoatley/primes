package com.edoatley.primes.generator;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BruteForcePrimeGenerator implements PrimeGenerator {

    @Override
    public List<Integer> primesInRange(int min, int max) {
        validate(min, max);
        return IntStream.range(min, max+1)
                .filter(this::prime)
                .boxed()
                .collect(Collectors.toList());
    }

    private boolean prime(int potentialPrime) {
        if(potentialPrime < 2) return false;
        if(potentialPrime == 2) return true;
        for (int i = 2; i < Math.sqrt(potentialPrime) + 1; i++) {
            if(potentialPrime%i == 0) {
                return false;
            }
        }
        return true;
    }

}
