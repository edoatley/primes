package com.edoatley.primes.channel;

import com.edoatley.primes.generator.PrimeGenerator;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Component
public class PrimesHandler {

    private final PrimeGenerator primeGenerator;

    public Mono<ServerResponse> fetchPrimes(@RequestParam("start") int start, @RequestParam("end") int end) {
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
                .body(BodyInserters.fromValue(primeGenerator.primesInRange(start, end)));
    }
}
