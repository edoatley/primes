package com.edoatley.primes.generated;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import com.edoatley.primes.generator.BruteForcePrimeGenerator;
import org.junit.jupiter.api.Test;

public class BruteForcePrimeGeneratorDiffblueTest {
    @Test
    public void testPrimesInRange() {
        List<Integer> actualPrimesInRangeResult = (new BruteForcePrimeGenerator()).primesInRange(1, 3);
        assertEquals(2, actualPrimesInRangeResult.size());
        assertEquals(2, actualPrimesInRangeResult.get(0));
        assertEquals(3, actualPrimesInRangeResult.get(1));
    }

    @Test
    public void testPrimesInRange2() {
        assertTrue((new BruteForcePrimeGenerator()).primesInRange(0, 0).isEmpty());
    }
}

