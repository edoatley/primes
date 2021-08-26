package com.edoatley.primes.generator;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.util.concurrent.TimeUnit;


@State(Scope.Benchmark)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@BenchmarkMode(org.openjdk.jmh.annotations.Mode.AverageTime)
public class PrimesGeneratorBenchmark {

    @Benchmark
    public void bruteForce(Blackhole bh) {
        PrimeGenerator pg = new BruteForcePrimeGenerator();
        first10000(bh, pg);
    }
    @Benchmark
    public void improvedMethod(Blackhole bh) {
        PrimeGenerator pg = new ImprovedGenerator();
        first10000(bh, pg);
    }

    private void first10000(Blackhole bh, PrimeGenerator pg) {
        bh.consume(pg.primesInRange(1, 10000));
    }

}
