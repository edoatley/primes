package com.edoatley.primes.generator

interface PrimeGenerator {
    fun primesInRange(min: Int, max: Int): List<Int>
    fun validate(min: Int, max: Int) {
        require(min >= 0) { "Min $min must be greater than or equal to zero" }
        require(min <= max) { "Max $max must be greater than or equal to min $min" }
    }
}