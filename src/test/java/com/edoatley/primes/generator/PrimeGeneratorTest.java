package com.edoatley.primes.generator;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowableOfType;

public class PrimeGeneratorTest {

    private final PrimeGenerator generator = new BruteForcePrimeGenerator();

    @Test
    void givenAOneDigitRangeThatIsPrimeReturnIt() {
        int min = 7;
        int max = 7;

        List<Integer> primes = generator.primesInRange(min, max);

        assertThat(primes).containsExactly(7);
    }

    @Test
    void givenAOneDigitRangeThatIsNOTPrimeDoNotReturnIt() {
        int min = 8;
        int max = 8;

        List<Integer> primes = generator.primesInRange(min, max);

        assertThat(primes).isEmpty();
    }

    @Test
    void givenATwoDigitRangeThatHasAPrimeReturnIt() {
        int min = 7;
        int max = 8;

        List<Integer> primes = generator.primesInRange(min, max);

        assertThat(primes).containsExactly(7);
    }

    @Test
    void givenOneTo10RangeReturnCorrectly2357() {
        int min = 1;
        int max = 10;

        List<Integer> primes = generator.primesInRange(min, max);

        assertThat(primes).containsExactly(2, 3, 5, 7);
    }

    @Test
    void largeRangeWorksAsExpected() {
        int min = 0;
        int max = 100;

        List<Integer> primes = generator.primesInRange(min, max);

        assertThat(primes).containsExactly(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97);
    }

    @Test
    void errorScenarioMinGreaterThanMax() {
        int min = 6;
        int max = 5;

        final IllegalArgumentException iae = catchThrowableOfType(() -> generator.primesInRange(min, max), IllegalArgumentException.class);
        assertThat(iae.getMessage()).contains("Max 5 must be greater than or equal to min 6");
    }


    @Test
    void errorScenarioMinLessThanZero() {
        int min = -1;
        int max = 2;

        final IllegalArgumentException iae = catchThrowableOfType(() -> generator.primesInRange(min, max), IllegalArgumentException.class);
        assertThat(iae.getMessage()).contains("Min -1 must be greater than or equal to zero");
    }
}
