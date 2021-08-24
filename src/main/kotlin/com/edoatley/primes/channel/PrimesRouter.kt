package com.edoatley.primes.channel

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.MediaType
import org.springframework.web.reactive.function.server.*

@Configuration(proxyBeanMethods = false)
class PrimesRouter(private val primesHandler: PrimesHandler) {

    @Bean
    fun route(): RouterFunction<ServerResponse> {
        return RouterFunctions.route(
            RequestPredicates.GET("/primes")
                .and(RequestPredicates.accept(MediaType.APPLICATION_JSON))
                .and(RequestPredicates.queryParam("start") { true })
                .and(RequestPredicates.queryParam("end") { true })
        ) { req: ServerRequest ->
            val start = req.queryParam("start").orElse("0").toInt()
            val end = req.queryParam("end").orElse("0").toInt()
            primesHandler.fetchPrimes(start, end)
        }
    }
}