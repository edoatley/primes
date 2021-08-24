package com.edoatley.primes.generator;

import java.util.List;

public interface PrimeGenerator {

    List<Integer> primesInRange(int min, int max);

    default void validate(int min, int max) {

        if(min < 0) {
            throw new IllegalArgumentException("Min " + min + " must be greater than or equal to zero");
        }

        if(min > max) {
            throw new IllegalArgumentException("Max " + max + " must be greater than or equal to min " + min);
        }

    }
}
