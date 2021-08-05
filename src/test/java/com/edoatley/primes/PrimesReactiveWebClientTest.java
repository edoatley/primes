package com.edoatley.primes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;

@ActiveProfiles("integration-test")
@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PrimesReactiveWebClientTest {

    @LocalServerPort
    int port;

    private WebClient webClient;

    @BeforeEach
    void setupWebClient() {
        webClient = WebClient.create("http://localhost:" + port);
    }

    @Test
    @DisplayName("Request all primes from 1 to 10")
    void saveAPersonAndGetById() {
        final List<Integer> primesActual = webClient.get().uri(uriBuilder -> uriBuilder
                        .path("/primes")
                        .queryParam("start", 1)
                        .queryParam("end", 10)
                        .build())
                .retrieve()
                .onStatus(HttpStatus::isError, error -> fail("Failed retrieving primes " + error.statusCode()))
                .bodyToFlux(Integer.class)
                .collect(Collectors.toList())
                .block();

        assertThat(primesActual).containsExactly(2, 3, 5, 7);
    }
}
