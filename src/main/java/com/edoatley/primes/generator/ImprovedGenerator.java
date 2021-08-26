package com.edoatley.primes.generator;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ImprovedGenerator implements PrimeGenerator {
    private static final byte ONE = (byte) 1;
    private static final byte ZERO = (byte) 0;
    private static final int defaultMax = 10000;
    private Set<Integer> primes;
    private int max;

    public ImprovedGenerator() {
        this(defaultMax);
    }

    public ImprovedGenerator(int max) {
        this.max = max;
        sieveOfErastothenes(max);
    }

    private void sieveOfErastothenes(int size) {
        Boolean[] sieve = new Boolean[size + 1];
        Arrays.fill(sieve, true);
        sieve[1] = false;
        for (int i = 2; i < size; i++) {
            if(sieve[i]) {
                int multiplier = 2;
                while (i*multiplier < size) {
                    sieve[i*multiplier++] = false;
                }
            }
        }
        primes = IntStream.range(1, sieve.length).filter(i -> sieve[i]).boxed().collect(Collectors.toUnmodifiableSet());
    }


    @Override
    public List<Integer> primesInRange(int min, int max) {
        validate(min, max);
        return IntStream.range(min, max+1)
                .filter(this::prime)
                .boxed()
                .collect(Collectors.toList());
    }

    private boolean prime(int potentialPrime) {
        if(potentialPrime < 0) return false;
        if (primes.contains(potentialPrime)) return true;
        if(potentialPrime > max) {
            for(int potentialDivisor: primes) {
                if(potentialPrime % potentialDivisor == 0) return false;
            }
            for (int j = max; j < Math.sqrt(potentialPrime) + 1; j++) {
                if (potentialPrime%j == 0) return false;
            }
            return true;
        }
        else {
            return false;
        }
    }
}
