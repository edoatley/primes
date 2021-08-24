package com.edoatley.primes.config

import com.edoatley.primes.generator.PrimeGenerator
import com.edoatley.primes.generator.BruteForcePrimeGenerator
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class PrimesConfiguration {
    @Bean
    fun primeGenerator(): PrimeGenerator {
        return BruteForcePrimeGenerator()
    }
}