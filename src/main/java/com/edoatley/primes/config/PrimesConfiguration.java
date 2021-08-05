package com.edoatley.primes.config;

import com.edoatley.primes.generator.BruteForcePrimeGenerator;
import com.edoatley.primes.generator.PrimeGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrimesConfiguration {

    @Bean
    PrimeGenerator primeGenerator() {
        return new BruteForcePrimeGenerator();
    }

}
