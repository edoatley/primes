package com.edoatley.primes.generator

import java.util.stream.Collectors
import java.util.stream.IntStream
import kotlin.math.sqrt

class BruteForcePrimeGenerator : PrimeGenerator {
    override fun primesInRange(min: Int, max: Int): List<Int> {
        validate(min, max)
        return IntStream.range(min, max + 1)
            .filter { potentialPrime: Int -> prime(potentialPrime) }
            .boxed()
            .collect(Collectors.toList())
    }

    private fun prime(potentialPrime: Int): Boolean {
        if (potentialPrime < 2) return false
        if (potentialPrime == 2) return true
        var i = 2
        while (i < sqrt(potentialPrime.toDouble()) + 1) {
            if (potentialPrime % i == 0) {
                return false
            }
            i++
        }
        return true
    }
}