package com.edoatley.primes.channel;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;

@Configuration(proxyBeanMethods = false)
public class PrimesRouter {
    @Bean
    public RouterFunction<ServerResponse> route(PrimesHandler primesHandler) {
        return RouterFunctions.route(
                GET("/primes")
                        .and(accept(MediaType.APPLICATION_JSON))
                        .and(queryParam("start", t -> true))
                        .and(queryParam("end", t -> true)),
                req -> {
                    int start = Integer.parseInt(req.queryParam("start").orElse("0"));
                    int end = Integer.parseInt(req.queryParam("end").orElse("0"));
                    return primesHandler.fetchPrimes(start, end);
                });
    }
}