package com.edoatley.primes.channel

import lombok.RequiredArgsConstructor
import com.edoatley.primes.generator.PrimeGenerator
import org.springframework.http.MediaType
import org.springframework.stereotype.Component
import org.springframework.web.bind.annotation.RequestParam
import reactor.core.publisher.Mono
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.BodyInserters

@RequiredArgsConstructor
@Component
class PrimesHandler(val primeGenerator: PrimeGenerator) {
    fun fetchPrimes(@RequestParam("start") start: Int, @RequestParam("end") end: Int): Mono<ServerResponse> {
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
            .body(BodyInserters.fromValue(primeGenerator.primesInRange(start, end)))
    }
}