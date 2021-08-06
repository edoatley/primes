package com.edoatley.primes.generated;

import com.edoatley.primes.generator.BruteForcePrimeGenerator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class BruteForcePrimeGeneratorRandoopTest {

    @Test
    public void test001() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        Class<?> wildcardClass1 = bruteForcePrimeGenerator0.getClass();
        Assertions.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList3 = bruteForcePrimeGenerator0.primesInRange('#', (short) 1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 1 must be greater than or equal to min 35");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((byte) -1, '#');
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        java.lang.Object obj0 = new java.lang.Object();
        Class<?> wildcardClass1 = obj0.getClass();
        Assertions.assertNotNull(wildcardClass1);
    }

    @Test
    public void test005() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList3 = bruteForcePrimeGenerator0.primesInRange((-1), '4');
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList3 = bruteForcePrimeGenerator0.primesInRange(1, (short) -1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max -1 must be greater than or equal to min 1");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange((short) 10, (byte) -1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max -1 must be greater than or equal to min 10");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        Class<?> wildcardClass7 = bruteForcePrimeGenerator0.getClass();
        Assertions.assertNotNull(wildcardClass7);
    }

    @Test
    public void test009() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange(10, 0);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 0 must be greater than or equal to min 10");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        List<Integer> intList3 = bruteForcePrimeGenerator0.primesInRange((byte) 10, 'a');
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((short) 100, 0);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 0 must be greater than or equal to min 100");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList3);
    }

    @Test
    public void test011() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate(100, (byte) 1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 1 must be greater than or equal to min 100");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((-1), (byte) -1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate(0, (byte) -1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max -1 must be greater than or equal to min 0");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        List<Integer> intList3 = bruteForcePrimeGenerator0.primesInRange((byte) 10, 'a');
        List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange('4', (byte) 100);
        Class<?> wildcardClass7 = intList6.getClass();
        Assertions.assertNotNull(intList3);
        Assertions.assertNotNull(intList6);
        Assertions.assertNotNull(wildcardClass7);
    }

    @Test
    public void test015() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        List<Integer> intList3 = bruteForcePrimeGenerator0.primesInRange((byte) 10, 'a');
        List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange('4', (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange('a', (short) 0);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 0 must be greater than or equal to min 97");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList3);
        Assertions.assertNotNull(intList6);
    }

    @Test
    public void test016() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(0, (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((short) 100, '#');
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 35 must be greater than or equal to min 100");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList9);
    }

    @Test
    public void test017() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((short) 0, (short) -1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max -1 must be greater than or equal to min 0");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        List<Integer> intList3 = bruteForcePrimeGenerator0.primesInRange((byte) 10, 'a');
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((byte) 100, 0);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 0 must be greater than or equal to min 100");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList3);
    }

    @Test
    public void test019() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange((short) 10, '#');
        Class<?> wildcardClass7 = intList6.getClass();
        Assertions.assertNotNull(intList6);
        Assertions.assertNotNull(wildcardClass7);
    }

    @Test
    public void test020() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange('a', (short) 1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 1 must be greater than or equal to min 97");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange((short) 10, '#');
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((byte) -1, (short) 10);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList6);
    }

    @Test
    public void test022() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange((short) 10, '#');
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((short) 100, 0);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 0 must be greater than or equal to min 100");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList6);
    }

    @Test
    public void test023() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(' ', (byte) -1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max -1 must be greater than or equal to min 32");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange((short) 10, '#');
        Class<?> wildcardClass7 = bruteForcePrimeGenerator0.getClass();
        Assertions.assertNotNull(intList6);
        Assertions.assertNotNull(wildcardClass7);
    }

    @Test
    public void test025() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange((byte) 10, (short) 1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 1 must be greater than or equal to min 10");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((short) -1, (-1));
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(0, (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange('a', (short) 0);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 0 must be greater than or equal to min 97");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList9);
    }

    @Test
    public void test028() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        List<Integer> intList3 = bruteForcePrimeGenerator0.primesInRange((byte) 10, 'a');
        Class<?> wildcardClass4 = intList3.getClass();
        Assertions.assertNotNull(intList3);
        Assertions.assertNotNull(wildcardClass4);
    }

    @Test
    public void test029() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((byte) 100, (byte) 100);
        Class<?> wildcardClass4 = bruteForcePrimeGenerator0.getClass();
        Assertions.assertNotNull(wildcardClass4);
    }

    @Test
    public void test030() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(0, (byte) 100);
        Class<?> wildcardClass10 = intList9.getClass();
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(wildcardClass10);
    }

    @Test
    public void test031() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList3 = bruteForcePrimeGenerator0.primesInRange((short) 100, (byte) -1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max -1 must be greater than or equal to min 100");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(0, (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((byte) 100, 10);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 10 must be greater than or equal to min 100");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList9);
    }

    @Test
    public void test033() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        List<Integer> intList3 = bruteForcePrimeGenerator0.primesInRange((byte) 10, 'a');
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((short) -1, ' ');
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList3);
    }

    @Test
    public void test034() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        List<Integer> intList3 = bruteForcePrimeGenerator0.primesInRange((byte) 10, 'a');
        List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange('4', (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange('a', 10);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 10 must be greater than or equal to min 97");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList3);
        Assertions.assertNotNull(intList6);
    }

    @Test
    public void test035() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        List<Integer> intList3 = bruteForcePrimeGenerator0.primesInRange((byte) 10, 'a');
        Class<?> wildcardClass4 = bruteForcePrimeGenerator0.getClass();
        Assertions.assertNotNull(intList3);
        Assertions.assertNotNull(wildcardClass4);
    }

    @Test
    public void test036() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange((short) 10, '#');
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((byte) 0, (-1));
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max -1 must be greater than or equal to min 0");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList6);
    }

    @Test
    public void test037() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange((short) 10, '#');
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(1, '4');
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((byte) 0, (byte) -1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max -1 must be greater than or equal to min 0");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList6);
        Assertions.assertNotNull(intList9);
    }

    @Test
    public void test038() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((byte) 100, (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange((byte) 100, 1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 1 must be greater than or equal to min 100");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate('4', (short) 0);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 0 must be greater than or equal to min 52");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(0, (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange(' ', 10);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 10 must be greater than or equal to min 32");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList9);
    }

    @Test
    public void test041() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        Class<?> wildcardClass7 = bruteForcePrimeGenerator0.getClass();
        Assertions.assertNotNull(wildcardClass7);
    }

    @Test
    public void test042() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange((short) 10, '#');
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((short) -1, 100);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList6);
    }

    @Test
    public void test043() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(0, (byte) 100);
        Class<?> wildcardClass10 = bruteForcePrimeGenerator0.getClass();
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(wildcardClass10);
    }

    @Test
    public void test044() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((byte) -1, 0);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate(0, (short) 10);
        List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange(0, ' ');
        Class<?> wildcardClass7 = bruteForcePrimeGenerator0.getClass();
        Assertions.assertNotNull(intList6);
        Assertions.assertNotNull(wildcardClass7);
    }

    @Test
    public void test046() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange((short) 10, '#');
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((byte) -1, ' ');
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList6);
    }

    @Test
    public void test047() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((byte) 100, '4');
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 52 must be greater than or equal to min 100");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange((short) 10, '#');
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((byte) 100, (-1));
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max -1 must be greater than or equal to min 100");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList6);
    }

    @Test
    public void test049() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList3 = bruteForcePrimeGenerator0.primesInRange((short) -1, (byte) -1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange((short) 10, '#');
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(1, '4');
        Class<?> wildcardClass10 = intList9.getClass();
        Assertions.assertNotNull(intList6);
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(wildcardClass10);
    }

    @Test
    public void test051() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((byte) 100, (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((byte) 1, (-1));
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max -1 must be greater than or equal to min 1");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(0, (short) 100);
        Class<?> wildcardClass10 = bruteForcePrimeGenerator0.getClass();
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(wildcardClass10);
    }

    @Test
    public void test053() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((-1), '4');
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test054() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        List<Integer> intList3 = bruteForcePrimeGenerator0.primesInRange(1, 100);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange((short) 100, (byte) 10);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 10 must be greater than or equal to min 100");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList3);
    }

    @Test
    public void test055() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(0, (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((byte) -1, 1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList9);
    }

    @Test
    public void test056() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(0, (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((byte) 100, 10);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 10 must be greater than or equal to min 100");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList9);
    }

    @Test
    public void test057() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        bruteForcePrimeGenerator0.validate(10, (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((byte) 10, 0);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 0 must be greater than or equal to min 10");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        List<Integer> intList3 = bruteForcePrimeGenerator0.primesInRange(1, 100);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange('#', (byte) 10);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 10 must be greater than or equal to min 35");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList3);
    }

    @Test
    public void test059() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        bruteForcePrimeGenerator0.validate((byte) 10, 100);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange('#', (-1));
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max -1 must be greater than or equal to min 35");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test060() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate(0, (short) 10);
        bruteForcePrimeGenerator0.validate((short) 100, (byte) 100);
        Class<?> wildcardClass7 = bruteForcePrimeGenerator0.getClass();
        Assertions.assertNotNull(wildcardClass7);
    }

    @Test
    public void test061() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        List<Integer> intList3 = bruteForcePrimeGenerator0.primesInRange(1, 100);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange((byte) -1, 10);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList3);
    }

    @Test
    public void test062() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((byte) 100, (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((-1), (byte) 10);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test063() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange((short) 10, '#');
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange('#', (short) 0);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 0 must be greater than or equal to min 35");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList6);
    }

    @Test
    public void test064() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange((short) 10, '#');
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(1, '4');
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((byte) 100, (short) 0);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 0 must be greater than or equal to min 100");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList6);
        Assertions.assertNotNull(intList9);
    }

    @Test
    public void test065() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(0, (short) 100);
        Class<?> wildcardClass10 = intList9.getClass();
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(wildcardClass10);
    }

    @Test
    public void test066() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((byte) 100, (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((short) -1, (byte) 0);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test067() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        List<Integer> intList3 = bruteForcePrimeGenerator0.primesInRange((byte) 10, 'a');
        List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange('4', (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((byte) -1, (short) 100);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList3);
        Assertions.assertNotNull(intList6);
    }

    @Test
    public void test068() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        bruteForcePrimeGenerator0.validate((byte) 10, 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((byte) -1, (byte) 1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList12);
    }

    @Test
    public void test069() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange((byte) -1, (short) 100);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        bruteForcePrimeGenerator0.validate((byte) 10, 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList15 = bruteForcePrimeGenerator0.primesInRange((short) -1, ' ');
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList12);
    }

    @Test
    public void test071() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((byte) 100, (byte) 100);
        List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange((short) 1, (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((-1), 100);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList6);
    }

    @Test
    public void test072() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((byte) 100, (byte) 100);
        bruteForcePrimeGenerator0.validate((short) 0, (short) 1);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((short) 0, 100);
        Class<?> wildcardClass10 = intList9.getClass();
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(wildcardClass10);
    }

    @Test
    public void test073() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate(0, (short) 10);
        List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange(0, ' ');
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((short) 10, (byte) 0);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 0 must be greater than or equal to min 10");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList6);
    }

    @Test
    public void test074() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(0, (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((short) -1, 100);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList9);
    }

    @Test
    public void test075() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate(0, (short) 10);
        bruteForcePrimeGenerator0.validate((short) 100, (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((byte) 1, (short) -1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max -1 must be greater than or equal to min 1");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test076() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        List<Integer> intList3 = bruteForcePrimeGenerator0.primesInRange((byte) 10, 'a');
        List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange('4', (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((short) 1, (short) -1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max -1 must be greater than or equal to min 1");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList3);
        Assertions.assertNotNull(intList6);
    }

    @Test
    public void test077() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((byte) -1, (byte) -1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((byte) 100, (byte) 100);
        List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange((short) 1, (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((short) -1, (byte) 0);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList6);
    }

    @Test
    public void test079() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((byte) 100, (byte) 100);
        bruteForcePrimeGenerator0.validate((short) 0, (short) 1);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((short) 0, 100);
        Class<?> wildcardClass10 = bruteForcePrimeGenerator0.getClass();
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(wildcardClass10);
    }

    @Test
    public void test080() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        List<Integer> intList3 = bruteForcePrimeGenerator0.primesInRange(1, 100);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((byte) 10, (short) -1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max -1 must be greater than or equal to min 10");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList3);
    }

    @Test
    public void test081() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((byte) -1, (byte) -1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test082() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate(0, (short) 10);
        bruteForcePrimeGenerator0.validate((short) 100, (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((byte) 100, '4');
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 52 must be greater than or equal to min 100");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test083() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange((short) 10, '#');
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(1, '4');
        Class<?> wildcardClass10 = bruteForcePrimeGenerator0.getClass();
        Assertions.assertNotNull(intList6);
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(wildcardClass10);
    }

    @Test
    public void test084() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((byte) 100, (byte) 100);
        bruteForcePrimeGenerator0.validate((short) 0, (short) 1);
        Class<?> wildcardClass7 = bruteForcePrimeGenerator0.getClass();
        Assertions.assertNotNull(wildcardClass7);
    }

    @Test
    public void test085() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        List<Integer> intList3 = bruteForcePrimeGenerator0.primesInRange(1, 100);
        Class<?> wildcardClass4 = intList3.getClass();
        Assertions.assertNotNull(intList3);
        Assertions.assertNotNull(wildcardClass4);
    }

    @Test
    public void test086() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((byte) 100, (byte) 0);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 0 must be greater than or equal to min 100");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test087() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((byte) 100, (byte) 100);
        bruteForcePrimeGenerator0.validate((short) 0, (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange('4', (short) 0);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 0 must be greater than or equal to min 52");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test088() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate(0, (short) 10);
        bruteForcePrimeGenerator0.validate((short) 100, (byte) 100);
        bruteForcePrimeGenerator0.validate((byte) 10, (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange('#', (short) 1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 1 must be greater than or equal to min 35");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test089() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate(0, (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((short) 10, (byte) -1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max -1 must be greater than or equal to min 10");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test090() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        bruteForcePrimeGenerator0.validate((byte) 10, 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((byte) 1, 1);
        Class<?> wildcardClass13 = intList12.getClass();
        Assertions.assertNotNull(intList12);
        Assertions.assertNotNull(wildcardClass13);
    }

    @Test
    public void test091() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        List<Integer> intList3 = bruteForcePrimeGenerator0.primesInRange(1, 100);
        Class<?> wildcardClass4 = bruteForcePrimeGenerator0.getClass();
        Assertions.assertNotNull(intList3);
        Assertions.assertNotNull(wildcardClass4);
    }

    @Test
    public void test092() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange((short) 10, '#');
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(1, '4');
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate(0, (short) -1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max -1 must be greater than or equal to min 0");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList6);
        Assertions.assertNotNull(intList9);
    }

    @Test
    public void test093() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        bruteForcePrimeGenerator0.validate((byte) 10, 100);
        Class<?> wildcardClass10 = bruteForcePrimeGenerator0.getClass();
        Assertions.assertNotNull(wildcardClass10);
    }

    @Test
    public void test094() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange((short) 10, '#');
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(100, (byte) 100);
        Class<?> wildcardClass10 = intList9.getClass();
        Assertions.assertNotNull(intList6);
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(wildcardClass10);
    }

    @Test
    public void test095() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((byte) 100, (byte) 100);
        List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange((short) 1, (byte) 10);
        Class<?> wildcardClass7 = bruteForcePrimeGenerator0.getClass();
        Assertions.assertNotNull(intList6);
        Assertions.assertNotNull(wildcardClass7);
    }

    @Test
    public void test096() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange((short) 10, '#');
        bruteForcePrimeGenerator0.validate((short) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((short) 100, (-1));
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max -1 must be greater than or equal to min 100");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList6);
    }

    @Test
    public void test097() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        List<Integer> intList3 = bruteForcePrimeGenerator0.primesInRange((byte) 10, 'a');
        List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange('4', (byte) 100);
        Class<?> wildcardClass7 = bruteForcePrimeGenerator0.getClass();
        Assertions.assertNotNull(intList3);
        Assertions.assertNotNull(intList6);
        Assertions.assertNotNull(wildcardClass7);
    }

    @Test
    public void test098() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        List<Integer> intList3 = bruteForcePrimeGenerator0.primesInRange(1, 100);
        bruteForcePrimeGenerator0.validate('4', (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((byte) 100, 'a');
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 97 must be greater than or equal to min 100");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList3);
    }

    @Test
    public void test099() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        List<Integer> intList3 = bruteForcePrimeGenerator0.primesInRange(1, 100);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange((short) -1, (short) 0);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList3);
    }

    @Test
    public void test100() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((byte) 100, (byte) 100);
        bruteForcePrimeGenerator0.validate((short) 0, (short) 1);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((short) 0, 100);
        bruteForcePrimeGenerator0.validate(' ', (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((byte) 100, (byte) 0);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 0 must be greater than or equal to min 100");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList9);
    }

    @Test
    public void test101() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange((short) 10, '#');
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(1, '4');
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange(100, '#');
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 35 must be greater than or equal to min 100");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList6);
        Assertions.assertNotNull(intList9);
    }

    @Test
    public void test102() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange((short) 10, '#');
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((short) -1, 'a');
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList6);
    }

    @Test
    public void test103() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((byte) 1, (short) 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange(0, '4');
        Class<?> wildcardClass13 = intList12.getClass();
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(intList12);
        Assertions.assertNotNull(wildcardClass13);
    }

    @Test
    public void test104() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((byte) 100, (byte) 100);
        List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange((short) 1, (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(100, (byte) -1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max -1 must be greater than or equal to min 100");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList6);
    }

    @Test
    public void test105() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList3 = bruteForcePrimeGenerator0.primesInRange((byte) -1, '#');
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test106() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        bruteForcePrimeGenerator0.validate((byte) 10, 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange(0, '4');
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList15 = bruteForcePrimeGenerator0.primesInRange('a', (byte) 1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 1 must be greater than or equal to min 97");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList12);
    }

    @Test
    public void test107() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '4');
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((short) 100, '4');
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 52 must be greater than or equal to min 100");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test108() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate(0, (short) 10);
        bruteForcePrimeGenerator0.validate((short) 100, (byte) 100);
        bruteForcePrimeGenerator0.validate((byte) 10, (short) 100);
        Class<?> wildcardClass10 = bruteForcePrimeGenerator0.getClass();
        Assertions.assertNotNull(wildcardClass10);
    }

    @Test
    public void test109() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange((short) 10, '#');
        bruteForcePrimeGenerator0.validate((short) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange(10, (byte) -1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max -1 must be greater than or equal to min 10");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList6);
    }

    @Test
    public void test110() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        bruteForcePrimeGenerator0.validate((byte) 10, 100);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((short) -1, ' ');
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test111() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        bruteForcePrimeGenerator0.validate(10, (byte) 100);
        Class<?> wildcardClass10 = bruteForcePrimeGenerator0.getClass();
        Assertions.assertNotNull(wildcardClass10);
    }

    @Test
    public void test112() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate(0, (short) 10);
        bruteForcePrimeGenerator0.validate((short) 100, (byte) 100);
        bruteForcePrimeGenerator0.validate((byte) 10, (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((-1), (byte) 1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test113() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(0, (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange(0, (byte) -1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max -1 must be greater than or equal to min 0");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList9);
    }

    @Test
    public void test114() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(0, (byte) 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange('a', 100);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList15 = bruteForcePrimeGenerator0.primesInRange(100, 0);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 0 must be greater than or equal to min 100");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(intList12);
    }

    @Test
    public void test115() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange((short) 10, '#');
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(1, '4');
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate('a', (short) 1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 1 must be greater than or equal to min 97");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList6);
        Assertions.assertNotNull(intList9);
    }

    @Test
    public void test116() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange((short) 10, '#');
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(100, (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((short) 100, (short) 0);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 0 must be greater than or equal to min 100");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList6);
        Assertions.assertNotNull(intList9);
    }

    @Test
    public void test117() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((byte) 100, (byte) 100);
        bruteForcePrimeGenerator0.validate((short) 0, (short) 1);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((short) 0, 100);
        bruteForcePrimeGenerator0.validate('#', (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((byte) 100, 'a');
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 97 must be greater than or equal to min 100");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList9);
    }

    @Test
    public void test118() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange((short) 10, '#');
        bruteForcePrimeGenerator0.validate((short) 1, 1);
        Class<?> wildcardClass10 = bruteForcePrimeGenerator0.getClass();
        Assertions.assertNotNull(intList6);
        Assertions.assertNotNull(wildcardClass10);
    }

    @Test
    public void test119() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        Class<?> wildcardClass4 = bruteForcePrimeGenerator0.getClass();
        Assertions.assertNotNull(wildcardClass4);
    }

    @Test
    public void test120() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((byte) 100, (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((byte) 100, 1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 1 must be greater than or equal to min 100");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test121() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate(0, (short) 10);
        bruteForcePrimeGenerator0.validate((short) 100, (byte) 100);
        bruteForcePrimeGenerator0.validate((byte) 10, (short) 100);
        bruteForcePrimeGenerator0.validate((short) 100, (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList15 = bruteForcePrimeGenerator0.primesInRange(' ', 0);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 0 must be greater than or equal to min 32");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test122() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate(0, (short) 10);
        Class<?> wildcardClass4 = bruteForcePrimeGenerator0.getClass();
        Assertions.assertNotNull(wildcardClass4);
    }

    @Test
    public void test123() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((byte) 1, (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((byte) -1, (byte) -1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList9);
    }

    @Test
    public void test124() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((byte) 1, (short) 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange(0, '4');
        bruteForcePrimeGenerator0.validate((byte) 0, (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate('#', (short) 10);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 10 must be greater than or equal to min 35");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(intList12);
    }

    @Test
    public void test125() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((byte) 1, (short) 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange(1, 100);
        Class<?> wildcardClass13 = intList12.getClass();
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(intList12);
        Assertions.assertNotNull(wildcardClass13);
    }

    @Test
    public void test126() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        bruteForcePrimeGenerator0.validate((byte) 10, 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((byte) 1, 1);
        Class<?> wildcardClass13 = bruteForcePrimeGenerator0.getClass();
        Assertions.assertNotNull(intList12);
        Assertions.assertNotNull(wildcardClass13);
    }

    @Test
    public void test127() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        List<Integer> intList3 = bruteForcePrimeGenerator0.primesInRange(1, 100);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange((short) -1, '4');
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList3);
    }

    @Test
    public void test128() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate(0, (short) 10);
        bruteForcePrimeGenerator0.validate((short) 100, (byte) 100);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((short) 0, (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((byte) -1, 'a');
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList9);
    }

    @Test
    public void test129() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(0, (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((short) -1, 0);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList9);
    }

    @Test
    public void test130() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((byte) 100, (byte) 100);
        bruteForcePrimeGenerator0.validate((short) 0, (short) 1);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((short) 0, 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((short) 1, (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList15 = bruteForcePrimeGenerator0.primesInRange(1, (-1));
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max -1 must be greater than or equal to min 1");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(intList12);
    }

    @Test
    public void test131() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        bruteForcePrimeGenerator0.validate((byte) 10, 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((byte) 0, (byte) 1);
        bruteForcePrimeGenerator0.validate((short) 0, 'a');
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList18 = bruteForcePrimeGenerator0.primesInRange('a', (byte) 0);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 0 must be greater than or equal to min 97");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList12);
    }

    @Test
    public void test132() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate(0, (short) 10);
        bruteForcePrimeGenerator0.validate((short) 100, (byte) 100);
        bruteForcePrimeGenerator0.validate((byte) 10, (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange('4', (short) 10);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 10 must be greater than or equal to min 52");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test133() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        List<Integer> intList3 = bruteForcePrimeGenerator0.primesInRange((byte) 10, 'a');
        List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange('4', (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((short) 10, (byte) 1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 1 must be greater than or equal to min 10");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList3);
        Assertions.assertNotNull(intList6);
    }

    @Test
    public void test134() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate(0, (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate(0, (-1));
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max -1 must be greater than or equal to min 0");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test135() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((short) 10, 100);
        Class<?> wildcardClass10 = intList9.getClass();
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(wildcardClass10);
    }

    @Test
    public void test136() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((byte) 100, (byte) 100);
        bruteForcePrimeGenerator0.validate((short) 0, (short) 1);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((short) 0, 100);
        bruteForcePrimeGenerator0.validate('#', (short) 100);
        Class<?> wildcardClass13 = bruteForcePrimeGenerator0.getClass();
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(wildcardClass13);
    }

    @Test
    public void test137() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate(0, (short) 10);
        bruteForcePrimeGenerator0.validate((short) 100, (byte) 100);
        bruteForcePrimeGenerator0.validate((byte) 10, (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((short) 100, (short) -1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max -1 must be greater than or equal to min 100");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test138() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        List<Integer> intList3 = bruteForcePrimeGenerator0.primesInRange(1, 100);
        bruteForcePrimeGenerator0.validate('4', (short) 100);
        Class<?> wildcardClass7 = bruteForcePrimeGenerator0.getClass();
        Assertions.assertNotNull(intList3);
        Assertions.assertNotNull(wildcardClass7);
    }

    @Test
    public void test139() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        bruteForcePrimeGenerator0.validate((byte) 10, 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList15 = bruteForcePrimeGenerator0.primesInRange(100, 0);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 0 must be greater than or equal to min 100");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList12);
    }

    @Test
    public void test140() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        bruteForcePrimeGenerator0.validate(10, ' ');
        Class<?> wildcardClass10 = bruteForcePrimeGenerator0.getClass();
        Assertions.assertNotNull(wildcardClass10);
    }

    @Test
    public void test141() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(0, (byte) 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange(' ', ' ');
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate(1, (short) 0);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 0 must be greater than or equal to min 1");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(intList12);
    }

    @Test
    public void test142() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange((short) 10, '#');
        bruteForcePrimeGenerator0.validate((short) 1, 1);
        bruteForcePrimeGenerator0.validate((byte) 0, (byte) 10);
        Class<?> wildcardClass13 = bruteForcePrimeGenerator0.getClass();
        Assertions.assertNotNull(intList6);
        Assertions.assertNotNull(wildcardClass13);
    }

    @Test
    public void test143() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(0, (byte) 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange('a', 100);
        Class<?> wildcardClass13 = intList12.getClass();
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(intList12);
        Assertions.assertNotNull(wildcardClass13);
    }

    @Test
    public void test144() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(0, (byte) 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange('a', 100);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((short) 100, 0);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 0 must be greater than or equal to min 100");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(intList12);
    }

    @Test
    public void test145() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '4');
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate('a', 0);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 0 must be greater than or equal to min 97");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test146() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(0, (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((byte) -1, 10);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList9);
    }

    @Test
    public void test147() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        bruteForcePrimeGenerator0.validate((byte) 10, (short) 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((short) 0, (short) 100);
        Class<?> wildcardClass13 = bruteForcePrimeGenerator0.getClass();
        Assertions.assertNotNull(intList12);
        Assertions.assertNotNull(wildcardClass13);
    }

    @Test
    public void test148() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        bruteForcePrimeGenerator0.validate((byte) 10, 100);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange(' ', (byte) 1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 1 must be greater than or equal to min 32");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test149() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((byte) 100, 0);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 0 must be greater than or equal to min 100");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test150() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((byte) 1, (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((short) 1, 0);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 0 must be greater than or equal to min 1");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList9);
    }

    @Test
    public void test151() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((byte) 1, (short) 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange(1, 100);
        Class<?> wildcardClass13 = bruteForcePrimeGenerator0.getClass();
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(intList12);
        Assertions.assertNotNull(wildcardClass13);
    }

    @Test
    public void test152() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((byte) 1, (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((byte) -1, (byte) 0);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList9);
    }

    @Test
    public void test153() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        List<Integer> intList3 = bruteForcePrimeGenerator0.primesInRange(0, '4');
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange('#', 1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 1 must be greater than or equal to min 35");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList3);
    }

    @Test
    public void test154() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(0, (short) 100);
        bruteForcePrimeGenerator0.validate(1, 'a');
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((byte) -1, 1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList9);
    }

    @Test
    public void test155() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((byte) 100, (byte) 100);
        bruteForcePrimeGenerator0.validate((short) 0, (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((byte) 100, (short) -1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max -1 must be greater than or equal to min 100");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test156() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate(0, (short) 10);
        bruteForcePrimeGenerator0.validate((short) 100, (byte) 100);
        bruteForcePrimeGenerator0.validate((byte) 10, (short) 100);
        bruteForcePrimeGenerator0.validate((short) 100, (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((short) -1, (byte) 0);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test157() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        bruteForcePrimeGenerator0.validate((byte) 10, 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((byte) 0, (byte) 1);
        Class<?> wildcardClass13 = intList12.getClass();
        Assertions.assertNotNull(intList12);
        Assertions.assertNotNull(wildcardClass13);
    }

    @Test
    public void test158() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(0, (byte) 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange(' ', ' ');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((short) 1, 0);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 0 must be greater than or equal to min 1");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(intList12);
    }

    @Test
    public void test159() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList3 = bruteForcePrimeGenerator0.primesInRange((-1), (byte) 0);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test160() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((byte) 100, (byte) 100);
        bruteForcePrimeGenerator0.validate((short) 0, (short) 1);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((short) 0, 100);
        bruteForcePrimeGenerator0.validate('#', (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList15 = bruteForcePrimeGenerator0.primesInRange('4', (byte) 1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 1 must be greater than or equal to min 52");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList9);
    }

    @Test
    public void test161() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange((short) 10, '#');
        bruteForcePrimeGenerator0.validate(0, '#');
        bruteForcePrimeGenerator0.validate(0, 100);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((short) 100, (byte) -1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max -1 must be greater than or equal to min 100");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList6);
    }

    @Test
    public void test162() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        bruteForcePrimeGenerator0.validate((byte) 10, 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((byte) 0, (byte) 1);
        bruteForcePrimeGenerator0.validate((short) 0, 'a');
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList18 = bruteForcePrimeGenerator0.primesInRange((short) 0, (short) -1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max -1 must be greater than or equal to min 0");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList12);
    }

    @Test
    public void test163() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange((short) 10, '#');
        bruteForcePrimeGenerator0.validate(0, '#');
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange(' ', (byte) 0);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 0 must be greater than or equal to min 32");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList6);
    }

    @Test
    public void test164() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((byte) 100, (byte) 100);
        bruteForcePrimeGenerator0.validate((short) 0, (short) 1);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((short) 0, 100);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((short) 1, (short) 0);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 0 must be greater than or equal to min 1");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList9);
    }

    @Test
    public void test165() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(0, (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange('4', ' ');
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 32 must be greater than or equal to min 52");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList9);
    }

    @Test
    public void test166() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        bruteForcePrimeGenerator0.validate((byte) 10, (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((short) 100, 0);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 0 must be greater than or equal to min 100");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test167() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        bruteForcePrimeGenerator0.validate((byte) 10, 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((byte) 0, (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList15 = bruteForcePrimeGenerator0.primesInRange((byte) -1, (short) 1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList12);
    }

    @Test
    public void test168() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(0, (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((byte) 100, (byte) 0);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 0 must be greater than or equal to min 100");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList9);
    }

    @Test
    public void test169() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate(0, (short) 10);
        List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange(0, ' ');
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(10, (short) 1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 1 must be greater than or equal to min 10");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList6);
    }

    @Test
    public void test170() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate(0, (short) 10);
        List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange(0, ' ');
        Class<?> wildcardClass7 = intList6.getClass();
        Assertions.assertNotNull(intList6);
        Assertions.assertNotNull(wildcardClass7);
    }

    @Test
    public void test171() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(0, (byte) 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange('a', 100);
        Class<?> wildcardClass13 = bruteForcePrimeGenerator0.getClass();
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(intList12);
        Assertions.assertNotNull(wildcardClass13);
    }

    @Test
    public void test172() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(0, (short) 100);
        bruteForcePrimeGenerator0.validate(1, 'a');
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList15 = bruteForcePrimeGenerator0.primesInRange((short) 100, '4');
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 52 must be greater than or equal to min 100");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList9);
    }

    @Test
    public void test173() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate(0, (short) 10);
        bruteForcePrimeGenerator0.validate((short) 100, (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(10, 0);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 0 must be greater than or equal to min 10");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test174() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        bruteForcePrimeGenerator0.validate(10, (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((short) 100, (byte) -1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max -1 must be greater than or equal to min 100");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test175() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        List<Integer> intList3 = bruteForcePrimeGenerator0.primesInRange((byte) 10, 'a');
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange((-1), (-1));
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList3);
    }

    @Test
    public void test176() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((short) 1, (short) -1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max -1 must be greater than or equal to min 1");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test177() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(0, (short) 100);
        bruteForcePrimeGenerator0.validate(1, 'a');
        bruteForcePrimeGenerator0.validate('a', (byte) 100);
        Class<?> wildcardClass16 = bruteForcePrimeGenerator0.getClass();
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(wildcardClass16);
    }

    @Test
    public void test178() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((byte) 1, (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate(10, (byte) 0);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 0 must be greater than or equal to min 10");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList9);
    }

    @Test
    public void test179() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((byte) 100, (byte) 100);
        List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange((short) 1, (byte) 10);
        bruteForcePrimeGenerator0.validate('4', 'a');
        Class<?> wildcardClass10 = bruteForcePrimeGenerator0.getClass();
        Assertions.assertNotNull(intList6);
        Assertions.assertNotNull(wildcardClass10);
    }

    @Test
    public void test180() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange((short) 10, '#');
        bruteForcePrimeGenerator0.validate(0, '#');
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((-1), (byte) 10);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList6);
    }

    @Test
    public void test181() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((byte) 100, (byte) 100);
        bruteForcePrimeGenerator0.validate((short) 0, (short) 1);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((short) 0, 100);
        bruteForcePrimeGenerator0.validate(' ', (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList15 = bruteForcePrimeGenerator0.primesInRange('4', (short) 10);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 10 must be greater than or equal to min 52");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList9);
    }

    @Test
    public void test182() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        bruteForcePrimeGenerator0.validate(10, ' ');
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((byte) 100, (short) -1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max -1 must be greater than or equal to min 100");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test183() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate(0, (short) 10);
        bruteForcePrimeGenerator0.validate((short) 100, (byte) 100);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((short) 0, (byte) 0);
        Class<?> wildcardClass10 = bruteForcePrimeGenerator0.getClass();
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(wildcardClass10);
    }

    @Test
    public void test184() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(0, (byte) 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((byte) 1, (short) 10);
        Class<?> wildcardClass13 = bruteForcePrimeGenerator0.getClass();
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(intList12);
        Assertions.assertNotNull(wildcardClass13);
    }

    @Test
    public void test185() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((byte) 100, (byte) 100);
        bruteForcePrimeGenerator0.validate((short) 0, (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((short) -1, (byte) -1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test186() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(0, (short) 100);
        bruteForcePrimeGenerator0.validate(1, 'a');
        bruteForcePrimeGenerator0.validate('a', (byte) 100);
        bruteForcePrimeGenerator0.validate((byte) 1, ' ');
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList21 = bruteForcePrimeGenerator0.primesInRange((-1), (-1));
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList9);
    }

    @Test
    public void test187() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(0, (byte) 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange('a', 100);
        bruteForcePrimeGenerator0.validate((short) 100, 100);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((short) 10, (-1));
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max -1 must be greater than or equal to min 10");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(intList12);
    }

    @Test
    public void test188() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        bruteForcePrimeGenerator0.validate((byte) 10, 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((byte) 0, (byte) 1);
        bruteForcePrimeGenerator0.validate((short) 0, 'a');
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList18 = bruteForcePrimeGenerator0.primesInRange('a', '4');
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 52 must be greater than or equal to min 97");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList12);
    }

    @Test
    public void test189() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((byte) 100, (byte) 100);
        List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange((short) 1, (byte) 10);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((short) 1, 'a');
        Class<?> wildcardClass10 = bruteForcePrimeGenerator0.getClass();
        Assertions.assertNotNull(intList6);
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(wildcardClass10);
    }

    @Test
    public void test190() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        List<Integer> intList3 = bruteForcePrimeGenerator0.primesInRange(1, 100);
        bruteForcePrimeGenerator0.validate('4', (short) 100);
        bruteForcePrimeGenerator0.validate('#', '4');
        Class<?> wildcardClass10 = bruteForcePrimeGenerator0.getClass();
        Assertions.assertNotNull(intList3);
        Assertions.assertNotNull(wildcardClass10);
    }

    @Test
    public void test191() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange((short) 10, '#');
        bruteForcePrimeGenerator0.validate((short) 1, 1);
        bruteForcePrimeGenerator0.validate((byte) 0, (byte) 10);
        List<Integer> intList15 = bruteForcePrimeGenerator0.primesInRange((byte) 0, (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList18 = bruteForcePrimeGenerator0.primesInRange((byte) 10, (short) 0);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 0 must be greater than or equal to min 10");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList6);
        Assertions.assertNotNull(intList15);
    }

    @Test
    public void test192() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '4');
        bruteForcePrimeGenerator0.validate(10, (byte) 10);
        Class<?> wildcardClass7 = bruteForcePrimeGenerator0.getClass();
        Assertions.assertNotNull(wildcardClass7);
    }

    @Test
    public void test193() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange((short) 10, '#');
        bruteForcePrimeGenerator0.validate(0, '#');
        bruteForcePrimeGenerator0.validate(0, 100);
        Class<?> wildcardClass13 = bruteForcePrimeGenerator0.getClass();
        Assertions.assertNotNull(intList6);
        Assertions.assertNotNull(wildcardClass13);
    }

    @Test
    public void test194() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        bruteForcePrimeGenerator0.validate(10, ' ');
        bruteForcePrimeGenerator0.validate(10, (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList15 = bruteForcePrimeGenerator0.primesInRange((byte) -1, ' ');
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test195() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(0, (short) 100);
        bruteForcePrimeGenerator0.validate(1, 'a');
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList15 = bruteForcePrimeGenerator0.primesInRange((byte) 0, (-1));
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max -1 must be greater than or equal to min 0");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList9);
    }

    @Test
    public void test196() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(0, (short) 100);
        bruteForcePrimeGenerator0.validate(1, 'a');
        bruteForcePrimeGenerator0.validate('a', (byte) 100);
        bruteForcePrimeGenerator0.validate((byte) 1, ' ');
        Class<?> wildcardClass19 = bruteForcePrimeGenerator0.getClass();
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(wildcardClass19);
    }

    @Test
    public void test197() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((byte) 100, ' ');
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 32 must be greater than or equal to min 100");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test198() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        bruteForcePrimeGenerator0.validate((byte) 10, 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((byte) 0, (byte) 1);
        bruteForcePrimeGenerator0.validate((short) 0, 'a');
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList18 = bruteForcePrimeGenerator0.primesInRange((short) 1, (-1));
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max -1 must be greater than or equal to min 1");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList12);
    }

    @Test
    public void test199() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((byte) 1, (short) 100);
        Class<?> wildcardClass10 = bruteForcePrimeGenerator0.getClass();
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(wildcardClass10);
    }

    @Test
    public void test200() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        List<Integer> intList3 = bruteForcePrimeGenerator0.primesInRange(1, 100);
        bruteForcePrimeGenerator0.validate((byte) 0, 100);
        Assertions.assertNotNull(intList3);
    }

    @Test
    public void test201() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate(0, (short) 10);
        bruteForcePrimeGenerator0.validate((short) 100, (byte) 100);
        bruteForcePrimeGenerator0.validate((byte) 10, (short) 100);
        bruteForcePrimeGenerator0.validate((short) 100, (byte) 100);
        Class<?> wildcardClass13 = bruteForcePrimeGenerator0.getClass();
        Assertions.assertNotNull(wildcardClass13);
    }

    @Test
    public void test202() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (short) 0);
        bruteForcePrimeGenerator0.validate('a', (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((short) 100, (byte) 10);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 10 must be greater than or equal to min 100");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test203() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(0, (short) 100);
        bruteForcePrimeGenerator0.validate(1, 'a');
        bruteForcePrimeGenerator0.validate('a', (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((short) -1, (byte) 1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList9);
    }

    @Test
    public void test204() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (short) 0);
        bruteForcePrimeGenerator0.validate('a', (byte) 100);
        Class<?> wildcardClass10 = bruteForcePrimeGenerator0.getClass();
        Assertions.assertNotNull(wildcardClass10);
    }

    @Test
    public void test205() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        List<Integer> intList3 = bruteForcePrimeGenerator0.primesInRange((byte) 10, 'a');
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange((byte) 0, (short) -1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max -1 must be greater than or equal to min 0");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList3);
    }

    @Test
    public void test206() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        bruteForcePrimeGenerator0.validate((byte) 10, 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((byte) 0, (byte) 1);
        bruteForcePrimeGenerator0.validate((short) 0, 'a');
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate('a', (short) 1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 1 must be greater than or equal to min 97");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList12);
    }

    @Test
    public void test207() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        bruteForcePrimeGenerator0.validate(10, (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange('4', (short) 1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 1 must be greater than or equal to min 52");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test208() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((byte) 100, '4');
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 52 must be greater than or equal to min 100");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test209() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((byte) 100, (byte) 100);
        bruteForcePrimeGenerator0.validate((short) 0, (short) 1);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((short) 0, 100);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate(' ', (short) 0);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 0 must be greater than or equal to min 32");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList9);
    }

    @Test
    public void test210() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((byte) 10, '4');
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange(1, (byte) 0);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 0 must be greater than or equal to min 1");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test211() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        bruteForcePrimeGenerator0.validate((byte) 10, 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((byte) 0, (byte) 1);
        bruteForcePrimeGenerator0.validate(1, (byte) 100);
        List<Integer> intList18 = bruteForcePrimeGenerator0.primesInRange((short) 10, (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate(10, 0);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 0 must be greater than or equal to min 10");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList12);
        Assertions.assertNotNull(intList18);
    }

    @Test
    public void test212() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((byte) 100, (byte) 100);
        bruteForcePrimeGenerator0.validate((short) 0, (short) 1);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((short) 0, 100);
        bruteForcePrimeGenerator0.validate('#', (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate('a', (-1));
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max -1 must be greater than or equal to min 97");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList9);
    }

    @Test
    public void test213() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        List<Integer> intList3 = bruteForcePrimeGenerator0.primesInRange(1, 100);
        bruteForcePrimeGenerator0.validate('4', (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate('4', (-1));
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max -1 must be greater than or equal to min 52");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList3);
    }

    @Test
    public void test214() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        bruteForcePrimeGenerator0.validate(10, ' ');
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange(0, 0);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate(10, (byte) 1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 1 must be greater than or equal to min 10");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList12);
    }

    @Test
    public void test215() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((byte) 100, (byte) 100);
        bruteForcePrimeGenerator0.validate((short) 0, (short) 1);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((short) 0, 100);
        bruteForcePrimeGenerator0.validate('#', (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate(10, (byte) 0);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 0 must be greater than or equal to min 10");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList9);
    }

    @Test
    public void test216() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange((short) 10, '#');
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(100, (byte) 100);
        bruteForcePrimeGenerator0.validate((byte) 1, (short) 10);
        Class<?> wildcardClass13 = bruteForcePrimeGenerator0.getClass();
        Assertions.assertNotNull(intList6);
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(wildcardClass13);
    }

    @Test
    public void test217() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        bruteForcePrimeGenerator0.validate((byte) 10, 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((byte) 1, 1);
        List<Integer> intList15 = bruteForcePrimeGenerator0.primesInRange((short) 0, 100);
        Assertions.assertNotNull(intList12);
        Assertions.assertNotNull(intList15);
    }

    @Test
    public void test218() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate('a', (short) -1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max -1 must be greater than or equal to min 97");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test219() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((short) -1, (byte) 10);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test220() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((short) 10, 100);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((short) 10, (byte) 0);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 0 must be greater than or equal to min 10");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList9);
    }

    @Test
    public void test221() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate(0, (short) 10);
        bruteForcePrimeGenerator0.validate((short) 100, (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate(100, '4');
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 52 must be greater than or equal to min 100");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test222() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        List<Integer> intList3 = bruteForcePrimeGenerator0.primesInRange(1, 100);
        bruteForcePrimeGenerator0.validate('4', (short) 100);
        bruteForcePrimeGenerator0.validate('#', '4');
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate(0, (-1));
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max -1 must be greater than or equal to min 0");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList3);
    }

    @Test
    public void test223() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(0, (byte) 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange(' ', ' ');
        Class<?> wildcardClass13 = bruteForcePrimeGenerator0.getClass();
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(intList12);
        Assertions.assertNotNull(wildcardClass13);
    }

    @Test
    public void test224() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange((short) 10, '#');
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(100, (byte) 100);
        Class<?> wildcardClass10 = bruteForcePrimeGenerator0.getClass();
        Assertions.assertNotNull(intList6);
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(wildcardClass10);
    }

    @Test
    public void test225() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(0, (byte) 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange(' ', ' ');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList18 = bruteForcePrimeGenerator0.primesInRange(1, 0);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 0 must be greater than or equal to min 1");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(intList12);
    }

    @Test
    public void test226() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(0, (short) 100);
        bruteForcePrimeGenerator0.validate(1, 'a');
        bruteForcePrimeGenerator0.validate('a', (byte) 100);
        bruteForcePrimeGenerator0.validate((byte) 1, ' ');
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate(' ', 0);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 0 must be greater than or equal to min 32");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList9);
    }

    @Test
    public void test227() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        bruteForcePrimeGenerator0.validate((byte) 10, 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange(0, '4');
        bruteForcePrimeGenerator0.validate((short) 10, ' ');
        Assertions.assertNotNull(intList12);
    }

    @Test
    public void test228() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        bruteForcePrimeGenerator0.validate((byte) 10, 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((byte) 0, (byte) 1);
        bruteForcePrimeGenerator0.validate(1, (byte) 100);
        List<Integer> intList18 = bruteForcePrimeGenerator0.primesInRange((short) 10, (short) 100);
        Class<?> wildcardClass19 = intList18.getClass();
        Assertions.assertNotNull(intList12);
        Assertions.assertNotNull(intList18);
        Assertions.assertNotNull(wildcardClass19);
    }

    @Test
    public void test229() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        bruteForcePrimeGenerator0.validate(10, ' ');
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange(0, 0);
        Class<?> wildcardClass13 = intList12.getClass();
        Assertions.assertNotNull(intList12);
        Assertions.assertNotNull(wildcardClass13);
    }

    @Test
    public void test230() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (short) 10);
    }

    @Test
    public void test231() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        List<Integer> intList3 = bruteForcePrimeGenerator0.primesInRange((byte) 10, 'a');
        List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange('4', (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate('#', ' ');
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 32 must be greater than or equal to min 35");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList3);
        Assertions.assertNotNull(intList6);
    }

    @Test
    public void test232() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((byte) 1, (short) 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange(1, 100);
        List<Integer> intList15 = bruteForcePrimeGenerator0.primesInRange((byte) 1, (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList18 = bruteForcePrimeGenerator0.primesInRange((short) -1, '4');
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(intList12);
        Assertions.assertNotNull(intList15);
    }

    @Test
    public void test233() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(0, (short) 100);
        bruteForcePrimeGenerator0.validate(1, 'a');
        Class<?> wildcardClass13 = bruteForcePrimeGenerator0.getClass();
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(wildcardClass13);
    }

    @Test
    public void test234() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        bruteForcePrimeGenerator0.validate((byte) 10, 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange(0, '4');
        List<Integer> intList15 = bruteForcePrimeGenerator0.primesInRange((short) 1, 100);
        Class<?> wildcardClass16 = bruteForcePrimeGenerator0.getClass();
        Assertions.assertNotNull(intList12);
        Assertions.assertNotNull(intList15);
        Assertions.assertNotNull(wildcardClass16);
    }

    @Test
    public void test235() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        bruteForcePrimeGenerator0.validate(10, ' ');
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((byte) 1, 0);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 0 must be greater than or equal to min 1");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test236() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        List<Integer> intList3 = bruteForcePrimeGenerator0.primesInRange((byte) 10, 'a');
        bruteForcePrimeGenerator0.validate((short) 0, (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((byte) -1, (byte) 1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList3);
    }

    @Test
    public void test237() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(0, (byte) 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange(' ', ' ');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate(10, (byte) -1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max -1 must be greater than or equal to min 10");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(intList12);
    }

    @Test
    public void test238() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        List<Integer> intList3 = bruteForcePrimeGenerator0.primesInRange(1, 100);
        bruteForcePrimeGenerator0.validate('4', (short) 100);
        bruteForcePrimeGenerator0.validate((short) 1, 'a');
        Assertions.assertNotNull(intList3);
    }

    @Test
    public void test239() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((byte) 1, (short) 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange(0, (byte) 10);
        Class<?> wildcardClass13 = bruteForcePrimeGenerator0.getClass();
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(intList12);
        Assertions.assertNotNull(wildcardClass13);
    }

    @Test
    public void test240() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((byte) 100, (byte) 100);
        bruteForcePrimeGenerator0.validate((short) 0, (short) 1);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((short) 0, 100);
        bruteForcePrimeGenerator0.validate(' ', (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList15 = bruteForcePrimeGenerator0.primesInRange((byte) 10, (short) -1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max -1 must be greater than or equal to min 10");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList9);
    }

    @Test
    public void test241() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        bruteForcePrimeGenerator0.validate((byte) 10, 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange(0, '4');
        List<Integer> intList15 = bruteForcePrimeGenerator0.primesInRange((short) 1, 100);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList18 = bruteForcePrimeGenerator0.primesInRange((short) -1, 100);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList12);
        Assertions.assertNotNull(intList15);
    }

    @Test
    public void test242() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        List<Integer> intList3 = bruteForcePrimeGenerator0.primesInRange(0, '4');
        bruteForcePrimeGenerator0.validate(0, ' ');
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(0, (byte) 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange(0, (byte) 1);
        Class<?> wildcardClass13 = bruteForcePrimeGenerator0.getClass();
        Assertions.assertNotNull(intList3);
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(intList12);
        Assertions.assertNotNull(wildcardClass13);
    }

    @Test
    public void test243() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((byte) 1, (short) 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange(0, '4');
        bruteForcePrimeGenerator0.validate((byte) 0, (short) 1);
        List<Integer> intList18 = bruteForcePrimeGenerator0.primesInRange((short) 0, 'a');
        Class<?> wildcardClass19 = bruteForcePrimeGenerator0.getClass();
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(intList12);
        Assertions.assertNotNull(intList18);
        Assertions.assertNotNull(wildcardClass19);
    }

    @Test
    public void test244() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        bruteForcePrimeGenerator0.validate((byte) 10, (short) 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((short) 0, (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((short) -1, (byte) 0);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList12);
    }

    @Test
    public void test245() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        bruteForcePrimeGenerator0.validate(10, ' ');
        bruteForcePrimeGenerator0.validate(10, (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate(' ', 1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 1 must be greater than or equal to min 32");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test246() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        bruteForcePrimeGenerator0.validate((byte) 10, 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange(0, '4');
        List<Integer> intList15 = bruteForcePrimeGenerator0.primesInRange((short) 1, 100);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList18 = bruteForcePrimeGenerator0.primesInRange((short) -1, (-1));
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList12);
        Assertions.assertNotNull(intList15);
    }

    @Test
    public void test247() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (short) 0);
        bruteForcePrimeGenerator0.validate('a', (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((byte) 100, 'a');
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 97 must be greater than or equal to min 100");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test248() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((byte) 100, (byte) 100);
        bruteForcePrimeGenerator0.validate((short) 0, (short) 1);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((short) 0, 100);
        bruteForcePrimeGenerator0.validate(' ', (byte) 100);
        List<Integer> intList15 = bruteForcePrimeGenerator0.primesInRange(1, (byte) 1);
        Class<?> wildcardClass16 = bruteForcePrimeGenerator0.getClass();
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(intList15);
        Assertions.assertNotNull(wildcardClass16);
    }

    @Test
    public void test249() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(0, (short) 100);
        bruteForcePrimeGenerator0.validate((short) 100, (short) 100);
        Class<?> wildcardClass13 = bruteForcePrimeGenerator0.getClass();
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(wildcardClass13);
    }

    @Test
    public void test250() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((byte) 1, (short) 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange(0, '4');
        bruteForcePrimeGenerator0.validate((byte) 0, (short) 1);
        List<Integer> intList18 = bruteForcePrimeGenerator0.primesInRange((byte) 10, (short) 100);
        Class<?> wildcardClass19 = intList18.getClass();
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(intList12);
        Assertions.assertNotNull(intList18);
        Assertions.assertNotNull(wildcardClass19);
    }

    @Test
    public void test251() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        bruteForcePrimeGenerator0.validate((byte) 10, 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((byte) 0, (byte) 1);
        bruteForcePrimeGenerator0.validate(1, (byte) 100);
        List<Integer> intList18 = bruteForcePrimeGenerator0.primesInRange(1, (byte) 100);
        Assertions.assertNotNull(intList12);
        Assertions.assertNotNull(intList18);
    }

    @Test
    public void test252() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate(0, (short) 10);
        bruteForcePrimeGenerator0.validate((short) 100, (byte) 100);
        bruteForcePrimeGenerator0.validate((byte) 10, (short) 100);
        bruteForcePrimeGenerator0.validate((short) 100, (byte) 100);
        List<Integer> intList15 = bruteForcePrimeGenerator0.primesInRange(0, 100);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList18 = bruteForcePrimeGenerator0.primesInRange(' ', (-1));
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max -1 must be greater than or equal to min 32");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList15);
    }

    @Test
    public void test253() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '4');
        bruteForcePrimeGenerator0.validate(10, (byte) 10);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(0, 'a');
        Class<?> wildcardClass10 = bruteForcePrimeGenerator0.getClass();
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(wildcardClass10);
    }

    @Test
    public void test254() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(0, (byte) 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((byte) 1, (short) 10);
        Class<?> wildcardClass13 = intList12.getClass();
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(intList12);
        Assertions.assertNotNull(wildcardClass13);
    }

    @Test
    public void test255() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((byte) 100, (byte) 100);
        List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange((short) 1, (byte) 10);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((short) 1, 'a');
        Class<?> wildcardClass10 = intList9.getClass();
        Assertions.assertNotNull(intList6);
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(wildcardClass10);
    }

    @Test
    public void test256() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        bruteForcePrimeGenerator0.validate((byte) 10, 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((byte) 0, (byte) 1);
        bruteForcePrimeGenerator0.validate(1, (byte) 100);
        List<Integer> intList18 = bruteForcePrimeGenerator0.primesInRange((short) 10, (short) 100);
        List<Integer> intList21 = bruteForcePrimeGenerator0.primesInRange(' ', '#');
        Class<?> wildcardClass22 = intList21.getClass();
        Assertions.assertNotNull(intList12);
        Assertions.assertNotNull(intList18);
        Assertions.assertNotNull(intList21);
        Assertions.assertNotNull(wildcardClass22);
    }

    @Test
    public void test257() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((byte) 1, (short) 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange(0, '4');
        bruteForcePrimeGenerator0.validate((byte) 0, (short) 1);
        List<Integer> intList18 = bruteForcePrimeGenerator0.primesInRange((short) 0, 'a');
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList21 = bruteForcePrimeGenerator0.primesInRange((byte) 10, 1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 1 must be greater than or equal to min 10");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(intList12);
        Assertions.assertNotNull(intList18);
    }

    @Test
    public void test258() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((byte) 100, (byte) 100);
        bruteForcePrimeGenerator0.validate((short) 0, (short) 1);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((short) 0, 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((short) 1, (byte) 10);
        Class<?> wildcardClass13 = intList12.getClass();
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(intList12);
        Assertions.assertNotNull(wildcardClass13);
    }

    @Test
    public void test259() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(0, (byte) 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((byte) 1, (short) 10);
        bruteForcePrimeGenerator0.validate((byte) 0, (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((short) 100, 0);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 0 must be greater than or equal to min 100");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(intList12);
    }

    @Test
    public void test260() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(0, (short) 100);
        bruteForcePrimeGenerator0.validate(1, 'a');
        bruteForcePrimeGenerator0.validate('a', (byte) 100);
        bruteForcePrimeGenerator0.validate((byte) 1, ' ');
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList21 = bruteForcePrimeGenerator0.primesInRange((byte) -1, 'a');
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList9);
    }

    @Test
    public void test261() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((byte) 10, 100);
        Class<?> wildcardClass13 = intList12.getClass();
        Assertions.assertNotNull(intList12);
        Assertions.assertNotNull(wildcardClass13);
    }

    @Test
    public void test262() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        List<Integer> intList3 = bruteForcePrimeGenerator0.primesInRange(0, '4');
        bruteForcePrimeGenerator0.validate(0, ' ');
        bruteForcePrimeGenerator0.validate((short) 0, (short) 10);
        bruteForcePrimeGenerator0.validate(0, (byte) 0);
        Assertions.assertNotNull(intList3);
    }

    @Test
    public void test263() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange((short) 10, '#');
        bruteForcePrimeGenerator0.validate((short) 1, 1);
        bruteForcePrimeGenerator0.validate((byte) 10, '4');
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((short) -1, (byte) 1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList6);
    }

    @Test
    public void test264() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        List<Integer> intList3 = bruteForcePrimeGenerator0.primesInRange(0, '4');
        bruteForcePrimeGenerator0.validate(0, ' ');
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(0, (byte) 100);
        bruteForcePrimeGenerator0.validate((byte) 100, (byte) 100);
        Class<?> wildcardClass13 = bruteForcePrimeGenerator0.getClass();
        Assertions.assertNotNull(intList3);
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(wildcardClass13);
    }

    @Test
    public void test265() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange((short) 10, '#');
        bruteForcePrimeGenerator0.validate(0, '#');
        Class<?> wildcardClass10 = bruteForcePrimeGenerator0.getClass();
        Assertions.assertNotNull(intList6);
        Assertions.assertNotNull(wildcardClass10);
    }

    @Test
    public void test266() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((byte) 1, (short) 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange(0, (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((-1), 'a');
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(intList12);
    }

    @Test
    public void test267() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((byte) 100, (byte) 100);
        bruteForcePrimeGenerator0.validate((short) 0, (short) 1);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((short) 0, 100);
        bruteForcePrimeGenerator0.validate(1, (short) 10);
        Class<?> wildcardClass13 = bruteForcePrimeGenerator0.getClass();
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(wildcardClass13);
    }

    @Test
    public void test268() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((byte) 100, (byte) 100);
        List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange((short) 1, (byte) 10);
        bruteForcePrimeGenerator0.validate('4', 'a');
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((byte) 10, (byte) 0);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 0 must be greater than or equal to min 10");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList6);
    }

    @Test
    public void test269() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange((short) 10, '#');
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(100, (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((byte) 1, (byte) 0);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 0 must be greater than or equal to min 1");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList6);
        Assertions.assertNotNull(intList9);
    }

    @Test
    public void test270() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate(0, (short) 10);
        bruteForcePrimeGenerator0.validate((short) 100, (byte) 100);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((short) 0, (short) 100);
        bruteForcePrimeGenerator0.validate(100, (byte) 100);
        Assertions.assertNotNull(intList9);
    }

    @Test
    public void test271() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(0, (byte) 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange(' ', ' ');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        Class<?> wildcardClass16 = bruteForcePrimeGenerator0.getClass();
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(intList12);
        Assertions.assertNotNull(wildcardClass16);
    }

    @Test
    public void test272() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '4');
        bruteForcePrimeGenerator0.validate(0, (byte) 100);
    }

    @Test
    public void test273() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate(0, (short) 10);
        bruteForcePrimeGenerator0.validate((short) 100, (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((-1), (byte) 10);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test274() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        bruteForcePrimeGenerator0.validate((byte) 10, 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange(0, '4');
        List<Integer> intList15 = bruteForcePrimeGenerator0.primesInRange(0, 'a');
        Class<?> wildcardClass16 = bruteForcePrimeGenerator0.getClass();
        Assertions.assertNotNull(intList12);
        Assertions.assertNotNull(intList15);
        Assertions.assertNotNull(wildcardClass16);
    }

    @Test
    public void test275() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        bruteForcePrimeGenerator0.validate((byte) 10, 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange(0, '4');
        bruteForcePrimeGenerator0.validate(0, ' ');
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((byte) 10, (byte) 1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 1 must be greater than or equal to min 10");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList12);
    }

    @Test
    public void test276() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        List<Integer> intList3 = bruteForcePrimeGenerator0.primesInRange(0, '4');
        List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange(0, (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(' ', (byte) 10);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 10 must be greater than or equal to min 32");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList3);
        Assertions.assertNotNull(intList6);
    }

    @Test
    public void test277() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        bruteForcePrimeGenerator0.validate((byte) 10, 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((byte) 0, (byte) 1);
        bruteForcePrimeGenerator0.validate(1, (byte) 100);
        List<Integer> intList18 = bruteForcePrimeGenerator0.primesInRange((short) 10, (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((short) -1, ' ');
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList12);
        Assertions.assertNotNull(intList18);
    }

    @Test
    public void test278() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((-1), '#');
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test279() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        List<Integer> intList3 = bruteForcePrimeGenerator0.primesInRange(0, '4');
        bruteForcePrimeGenerator0.validate(0, ' ');
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(0, (byte) 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange(0, (byte) 1);
        Class<?> wildcardClass13 = intList12.getClass();
        Assertions.assertNotNull(intList3);
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(intList12);
        Assertions.assertNotNull(wildcardClass13);
    }

    @Test
    public void test280() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        bruteForcePrimeGenerator0.validate(10, ' ');
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange(0, 0);
        bruteForcePrimeGenerator0.validate((byte) 10, 100);
        Assertions.assertNotNull(intList12);
    }

    @Test
    public void test281() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((short) 10, 100);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange('#', ' ');
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 32 must be greater than or equal to min 35");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList9);
    }

    @Test
    public void test282() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange((short) 10, '#');
        bruteForcePrimeGenerator0.validate((short) 1, 1);
        bruteForcePrimeGenerator0.validate((byte) 0, (byte) 10);
        List<Integer> intList15 = bruteForcePrimeGenerator0.primesInRange((byte) 0, (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate(0, (-1));
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max -1 must be greater than or equal to min 0");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList6);
        Assertions.assertNotNull(intList15);
    }

    @Test
    public void test283() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        List<Integer> intList3 = bruteForcePrimeGenerator0.primesInRange(0, '4');
        bruteForcePrimeGenerator0.validate(0, ' ');
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((byte) 10, ' ');
        Assertions.assertNotNull(intList3);
        Assertions.assertNotNull(intList9);
    }

    @Test
    public void test284() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        bruteForcePrimeGenerator0.validate((byte) 10, (short) 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((short) 0, (short) 100);
        bruteForcePrimeGenerator0.validate((byte) 0, 10);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList18 = bruteForcePrimeGenerator0.primesInRange((short) 0, (-1));
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max -1 must be greater than or equal to min 0");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList12);
    }

    @Test
    public void test285() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange((short) 10, '#');
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(100, (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate(' ', 0);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 0 must be greater than or equal to min 32");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList6);
        Assertions.assertNotNull(intList9);
    }

    @Test
    public void test286() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        bruteForcePrimeGenerator0.validate((byte) 10, 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange(0, '4');
        bruteForcePrimeGenerator0.validate(0, ' ');
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList18 = bruteForcePrimeGenerator0.primesInRange((short) -1, (short) -1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList12);
    }

    @Test
    public void test287() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        bruteForcePrimeGenerator0.validate((byte) 10, 100);
        bruteForcePrimeGenerator0.validate(0, 'a');
        bruteForcePrimeGenerator0.validate((short) 1, 10);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList18 = bruteForcePrimeGenerator0.primesInRange((short) 100, '4');
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 52 must be greater than or equal to min 100");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test288() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((byte) 100, (byte) 100);
        bruteForcePrimeGenerator0.validate((short) 0, (short) 1);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((short) 0, 100);
        bruteForcePrimeGenerator0.validate(' ', (byte) 100);
        List<Integer> intList15 = bruteForcePrimeGenerator0.primesInRange(1, (byte) 1);
        List<Integer> intList18 = bruteForcePrimeGenerator0.primesInRange(' ', 'a');
        List<Integer> intList21 = bruteForcePrimeGenerator0.primesInRange((byte) 1, (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((byte) -1, ' ');
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(intList15);
        Assertions.assertNotNull(intList18);
        Assertions.assertNotNull(intList21);
    }

    @Test
    public void test289() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((byte) 10, '4');
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange(10, (byte) 1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 1 must be greater than or equal to min 10");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test290() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        bruteForcePrimeGenerator0.validate((byte) 10, 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((byte) 0, (byte) 1);
        bruteForcePrimeGenerator0.validate((short) 0, 'a');
        List<Integer> intList18 = bruteForcePrimeGenerator0.primesInRange((short) 1, '#');
        List<Integer> intList21 = bruteForcePrimeGenerator0.primesInRange((short) 0, 10);
        bruteForcePrimeGenerator0.validate((short) 1, '4');
        Assertions.assertNotNull(intList12);
        Assertions.assertNotNull(intList18);
        Assertions.assertNotNull(intList21);
    }

    @Test
    public void test291() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        Class<?> wildcardClass10 = bruteForcePrimeGenerator0.getClass();
        Assertions.assertNotNull(wildcardClass10);
    }

    @Test
    public void test292() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((byte) 100, (byte) 100);
        List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange((short) 1, (byte) 10);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((byte) 10, '4');
        Class<?> wildcardClass10 = bruteForcePrimeGenerator0.getClass();
        Assertions.assertNotNull(intList6);
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(wildcardClass10);
    }

    @Test
    public void test293() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        List<Integer> intList3 = bruteForcePrimeGenerator0.primesInRange(0, '4');
        bruteForcePrimeGenerator0.validate(0, ' ');
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((byte) -1, (byte) 1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList3);
    }

    @Test
    public void test294() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((byte) 100, (byte) 100);
        bruteForcePrimeGenerator0.validate((short) 0, (short) 1);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((short) 0, 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((short) 1, (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((short) 100, 1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 1 must be greater than or equal to min 100");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(intList12);
    }

    @Test
    public void test295() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        bruteForcePrimeGenerator0.validate(10, ' ');
        bruteForcePrimeGenerator0.validate(10, (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList15 = bruteForcePrimeGenerator0.primesInRange((short) 1, (-1));
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max -1 must be greater than or equal to min 1");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test296() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange(' ', (short) 10);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 10 must be greater than or equal to min 32");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test297() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        List<Integer> intList3 = bruteForcePrimeGenerator0.primesInRange(0, '4');
        bruteForcePrimeGenerator0.validate(0, ' ');
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(0, (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((byte) 100, 1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 1 must be greater than or equal to min 100");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList3);
        Assertions.assertNotNull(intList9);
    }

    @Test
    public void test298() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        bruteForcePrimeGenerator0.validate((byte) 10, 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((byte) 0, (byte) 1);
        bruteForcePrimeGenerator0.validate(1, (byte) 100);
        List<Integer> intList18 = bruteForcePrimeGenerator0.primesInRange((short) 10, (short) 100);
        List<Integer> intList21 = bruteForcePrimeGenerator0.primesInRange(' ', '#');
        List<Integer> intList24 = bruteForcePrimeGenerator0.primesInRange(0, (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate('a', ' ');
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 32 must be greater than or equal to min 97");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList12);
        Assertions.assertNotNull(intList18);
        Assertions.assertNotNull(intList21);
        Assertions.assertNotNull(intList24);
    }

    @Test
    public void test299() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        bruteForcePrimeGenerator0.validate((byte) 10, 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((byte) 0, (byte) 1);
        bruteForcePrimeGenerator0.validate(1, (byte) 100);
        List<Integer> intList18 = bruteForcePrimeGenerator0.primesInRange((short) 10, (short) 100);
        List<Integer> intList21 = bruteForcePrimeGenerator0.primesInRange(' ', '#');
        List<Integer> intList24 = bruteForcePrimeGenerator0.primesInRange(0, (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((byte) 100, 0);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 0 must be greater than or equal to min 100");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList12);
        Assertions.assertNotNull(intList18);
        Assertions.assertNotNull(intList21);
        Assertions.assertNotNull(intList24);
    }

    @Test
    public void test300() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((byte) 100, (byte) 100);
        List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange((short) 1, (byte) 10);
        bruteForcePrimeGenerator0.validate((byte) 10, 100);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((byte) -1, (byte) 0);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList6);
    }

    @Test
    public void test301() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        bruteForcePrimeGenerator0.validate(0, 'a');
    }

    @Test
    public void test302() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        bruteForcePrimeGenerator0.validate(10, ' ');
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((-1), (byte) -1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test303() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        List<Integer> intList3 = bruteForcePrimeGenerator0.primesInRange(0, '4');
        List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange(0, (byte) 100);
        Class<?> wildcardClass7 = bruteForcePrimeGenerator0.getClass();
        Assertions.assertNotNull(intList3);
        Assertions.assertNotNull(intList6);
        Assertions.assertNotNull(wildcardClass7);
    }

    @Test
    public void test304() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (short) 0);
        Class<?> wildcardClass7 = bruteForcePrimeGenerator0.getClass();
        Assertions.assertNotNull(wildcardClass7);
    }

    @Test
    public void test305() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        bruteForcePrimeGenerator0.validate((byte) 10, 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((byte) 0, (byte) 1);
        bruteForcePrimeGenerator0.validate((short) 0, 'a');
        List<Integer> intList18 = bruteForcePrimeGenerator0.primesInRange((short) 1, '#');
        List<Integer> intList21 = bruteForcePrimeGenerator0.primesInRange((short) 0, 10);
        Class<?> wildcardClass22 = intList21.getClass();
        Assertions.assertNotNull(intList12);
        Assertions.assertNotNull(intList18);
        Assertions.assertNotNull(intList21);
        Assertions.assertNotNull(wildcardClass22);
    }

    @Test
    public void test306() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        bruteForcePrimeGenerator0.validate((byte) 10, (short) 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((short) 0, (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((short) -1, (short) 100);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList12);
    }

    @Test
    public void test307() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        bruteForcePrimeGenerator0.validate((byte) 10, (short) 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((short) 0, (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList15 = bruteForcePrimeGenerator0.primesInRange((-1), (-1));
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList12);
    }

    @Test
    public void test308() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((byte) 100, (byte) 100);
        List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange((short) 1, (byte) 10);
        bruteForcePrimeGenerator0.validate('4', 'a');
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate(' ', (byte) 0);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 0 must be greater than or equal to min 32");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList6);
    }

    @Test
    public void test309() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((byte) 1, (short) 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange(0, '4');
        bruteForcePrimeGenerator0.validate((byte) 0, (short) 1);
        List<Integer> intList18 = bruteForcePrimeGenerator0.primesInRange((byte) 10, (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((byte) 1, 0);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 0 must be greater than or equal to min 1");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(intList12);
        Assertions.assertNotNull(intList18);
    }

    @Test
    public void test310() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((byte) 1, (short) 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange(1, 100);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((short) 100, '4');
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 52 must be greater than or equal to min 100");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(intList12);
    }

    @Test
    public void test311() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        bruteForcePrimeGenerator0.validate((byte) 10, 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((byte) 0, (byte) 1);
        bruteForcePrimeGenerator0.validate(1, (byte) 100);
        List<Integer> intList18 = bruteForcePrimeGenerator0.primesInRange((short) 10, (short) 100);
        List<Integer> intList21 = bruteForcePrimeGenerator0.primesInRange(' ', '#');
        List<Integer> intList24 = bruteForcePrimeGenerator0.primesInRange(0, (byte) 10);
        Class<?> wildcardClass25 = intList24.getClass();
        Assertions.assertNotNull(intList12);
        Assertions.assertNotNull(intList18);
        Assertions.assertNotNull(intList21);
        Assertions.assertNotNull(intList24);
        Assertions.assertNotNull(wildcardClass25);
    }

    @Test
    public void test312() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        bruteForcePrimeGenerator0.validate((byte) 10, (short) 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((short) 0, (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((byte) 1, (short) 0);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 0 must be greater than or equal to min 1");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList12);
    }

    @Test
    public void test313() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((byte) 1, (short) 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange(0, (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate('4', (short) 10);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 10 must be greater than or equal to min 52");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(intList12);
    }

    @Test
    public void test314() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        bruteForcePrimeGenerator0.validate((byte) 10, 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange(0, '4');
        List<Integer> intList15 = bruteForcePrimeGenerator0.primesInRange((short) 1, 100);
        Class<?> wildcardClass16 = intList15.getClass();
        Assertions.assertNotNull(intList12);
        Assertions.assertNotNull(intList15);
        Assertions.assertNotNull(wildcardClass16);
    }

    @Test
    public void test315() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        bruteForcePrimeGenerator0.validate(10, (byte) 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((short) 0, (short) 10);
        Class<?> wildcardClass13 = intList12.getClass();
        Assertions.assertNotNull(intList12);
        Assertions.assertNotNull(wildcardClass13);
    }

    @Test
    public void test316() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        List<Integer> intList3 = bruteForcePrimeGenerator0.primesInRange(0, '4');
        bruteForcePrimeGenerator0.validate(0, ' ');
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(0, (byte) 100);
        bruteForcePrimeGenerator0.validate((byte) 100, (byte) 100);
        List<Integer> intList15 = bruteForcePrimeGenerator0.primesInRange(0, 0);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((short) 10, (byte) -1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max -1 must be greater than or equal to min 10");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList3);
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(intList15);
    }

    @Test
    public void test317() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate(0, (short) 10);
        bruteForcePrimeGenerator0.validate((short) 100, (byte) 100);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((short) 0, (byte) 0);
        Class<?> wildcardClass10 = intList9.getClass();
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(wildcardClass10);
    }

    @Test
    public void test318() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate(0, (short) 10);
        bruteForcePrimeGenerator0.validate((short) 100, (byte) 100);
        bruteForcePrimeGenerator0.validate((byte) 10, (short) 100);
        bruteForcePrimeGenerator0.validate((short) 100, (byte) 100);
        List<Integer> intList15 = bruteForcePrimeGenerator0.primesInRange(0, 100);
        List<Integer> intList18 = bruteForcePrimeGenerator0.primesInRange((short) 1, 1);
        List<Integer> intList21 = bruteForcePrimeGenerator0.primesInRange('#', 'a');
        Assertions.assertNotNull(intList15);
        Assertions.assertNotNull(intList18);
        Assertions.assertNotNull(intList21);
    }

    @Test
    public void test319() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        bruteForcePrimeGenerator0.validate((byte) 10, (short) 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((short) 0, (short) 100);
        bruteForcePrimeGenerator0.validate(0, '#');
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate(' ', (byte) -1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max -1 must be greater than or equal to min 32");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList12);
    }

    @Test
    public void test320() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate(0, (short) 10);
        List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange(0, ' ');
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((-1), (byte) 100);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList6);
    }

    @Test
    public void test321() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        bruteForcePrimeGenerator0.validate((byte) 10, 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((byte) 0, (byte) 1);
        bruteForcePrimeGenerator0.validate(1, (byte) 100);
        List<Integer> intList18 = bruteForcePrimeGenerator0.primesInRange(0, (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList21 = bruteForcePrimeGenerator0.primesInRange('4', (byte) 10);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 10 must be greater than or equal to min 52");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList12);
        Assertions.assertNotNull(intList18);
    }

    @Test
    public void test322() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(0, (short) 100);
        bruteForcePrimeGenerator0.validate(1, 'a');
        bruteForcePrimeGenerator0.validate('a', (byte) 100);
        bruteForcePrimeGenerator0.validate((byte) 1, ' ');
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((byte) -1, (byte) 10);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList9);
    }

    @Test
    public void test323() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange((short) 10, '#');
        bruteForcePrimeGenerator0.validate(0, '#');
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((byte) 0, (byte) 0);
        Assertions.assertNotNull(intList6);
        Assertions.assertNotNull(intList12);
    }

    @Test
    public void test324() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange((short) 10, '#');
        bruteForcePrimeGenerator0.validate((short) 1, 1);
        bruteForcePrimeGenerator0.validate((byte) 0, (byte) 10);
        List<Integer> intList15 = bruteForcePrimeGenerator0.primesInRange((byte) 0, (byte) 10);
        List<Integer> intList18 = bruteForcePrimeGenerator0.primesInRange(10, 10);
        List<Integer> intList21 = bruteForcePrimeGenerator0.primesInRange((short) 0, (byte) 10);
        Assertions.assertNotNull(intList6);
        Assertions.assertNotNull(intList15);
        Assertions.assertNotNull(intList18);
        Assertions.assertNotNull(intList21);
    }

    @Test
    public void test325() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        List<Integer> intList3 = bruteForcePrimeGenerator0.primesInRange((byte) 10, 'a');
        List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange('4', (byte) 100);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(' ', ' ');
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((short) 10, (short) 1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 1 must be greater than or equal to min 10");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList3);
        Assertions.assertNotNull(intList6);
        Assertions.assertNotNull(intList9);
    }

    @Test
    public void test326() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange((short) 10, '#');
        bruteForcePrimeGenerator0.validate((short) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((short) -1, (short) 10);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList6);
    }

    @Test
    public void test327() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        bruteForcePrimeGenerator0.validate((byte) 10, (short) 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((short) 0, (short) 100);
        bruteForcePrimeGenerator0.validate((byte) 0, 10);
        List<Integer> intList18 = bruteForcePrimeGenerator0.primesInRange((short) 100, 100);
        List<Integer> intList21 = bruteForcePrimeGenerator0.primesInRange((short) 10, '4');
        Class<?> wildcardClass22 = intList21.getClass();
        Assertions.assertNotNull(intList12);
        Assertions.assertNotNull(intList18);
        Assertions.assertNotNull(intList21);
        Assertions.assertNotNull(wildcardClass22);
    }

    @Test
    public void test328() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        bruteForcePrimeGenerator0.validate((byte) 10, 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((byte) 0, (byte) 1);
        bruteForcePrimeGenerator0.validate((short) 0, 'a');
        List<Integer> intList18 = bruteForcePrimeGenerator0.primesInRange((short) 1, '#');
        List<Integer> intList21 = bruteForcePrimeGenerator0.primesInRange((short) 0, 10);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate(10, 0);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 0 must be greater than or equal to min 10");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList12);
        Assertions.assertNotNull(intList18);
        Assertions.assertNotNull(intList21);
    }

    @Test
    public void test329() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(0, (short) 100);
        bruteForcePrimeGenerator0.validate(1, 'a');
        List<Integer> intList15 = bruteForcePrimeGenerator0.primesInRange(0, (byte) 0);
        List<Integer> intList18 = bruteForcePrimeGenerator0.primesInRange(10, (short) 10);
        List<Integer> intList21 = bruteForcePrimeGenerator0.primesInRange(10, (short) 10);
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(intList15);
        Assertions.assertNotNull(intList18);
        Assertions.assertNotNull(intList21);
    }

    @Test
    public void test330() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate(0, (short) 10);
        bruteForcePrimeGenerator0.validate((short) 100, (byte) 100);
        bruteForcePrimeGenerator0.validate((byte) 10, (short) 100);
        bruteForcePrimeGenerator0.validate((short) 100, (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList15 = bruteForcePrimeGenerator0.primesInRange((short) 0, (byte) -1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max -1 must be greater than or equal to min 0");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test331() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(0, (short) 100);
        bruteForcePrimeGenerator0.validate(1, 'a');
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((-1), (byte) 1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList9);
    }

    @Test
    public void test332() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        bruteForcePrimeGenerator0.validate((byte) 10, 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((byte) 0, (byte) 1);
        bruteForcePrimeGenerator0.validate((short) 0, 'a');
        List<Integer> intList18 = bruteForcePrimeGenerator0.primesInRange((short) 1, '#');
        List<Integer> intList21 = bruteForcePrimeGenerator0.primesInRange((short) 0, 10);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate('a', '4');
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 52 must be greater than or equal to min 97");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList12);
        Assertions.assertNotNull(intList18);
        Assertions.assertNotNull(intList21);
    }

    @Test
    public void test333() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        List<Integer> intList3 = bruteForcePrimeGenerator0.primesInRange(0, '4');
        List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange(0, (byte) 100);
        Class<?> wildcardClass7 = intList6.getClass();
        Assertions.assertNotNull(intList3);
        Assertions.assertNotNull(intList6);
        Assertions.assertNotNull(wildcardClass7);
    }

    @Test
    public void test334() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        bruteForcePrimeGenerator0.validate((byte) 10, (short) 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((short) 0, (short) 100);
        bruteForcePrimeGenerator0.validate((byte) 0, 10);
        List<Integer> intList18 = bruteForcePrimeGenerator0.primesInRange((short) 100, 100);
        bruteForcePrimeGenerator0.validate((byte) 100, (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate(' ', 10);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 10 must be greater than or equal to min 32");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList12);
        Assertions.assertNotNull(intList18);
    }

    @Test
    public void test335() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange((short) 10, '#');
        bruteForcePrimeGenerator0.validate((short) 1, 1);
        bruteForcePrimeGenerator0.validate((byte) 0, (byte) 10);
        List<Integer> intList15 = bruteForcePrimeGenerator0.primesInRange((byte) 0, (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList18 = bruteForcePrimeGenerator0.primesInRange((short) 10, (short) 1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 1 must be greater than or equal to min 10");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList6);
        Assertions.assertNotNull(intList15);
    }

    @Test
    public void test336() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(0, (byte) 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((byte) 1, (short) 10);
        List<Integer> intList15 = bruteForcePrimeGenerator0.primesInRange(0, 'a');
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(intList12);
        Assertions.assertNotNull(intList15);
    }

    @Test
    public void test337() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        List<Integer> intList3 = bruteForcePrimeGenerator0.primesInRange((byte) 10, 'a');
        List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange('4', (byte) 100);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(' ', ' ');
        Class<?> wildcardClass10 = intList9.getClass();
        Assertions.assertNotNull(intList3);
        Assertions.assertNotNull(intList6);
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(wildcardClass10);
    }

    @Test
    public void test338() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(0, (byte) 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange(' ', ' ');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList18 = bruteForcePrimeGenerator0.primesInRange((-1), (short) -1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(intList12);
    }

    @Test
    public void test339() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (short) 0);
        bruteForcePrimeGenerator0.validate('a', (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate(10, (byte) 1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 1 must be greater than or equal to min 10");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test340() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((byte) 1, (short) 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange(0, '4');
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList15 = bruteForcePrimeGenerator0.primesInRange((short) -1, 'a');
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(intList12);
    }

    @Test
    public void test341() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate(0, (short) 10);
        List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange(0, ' ');
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((byte) 1, ' ');
        Assertions.assertNotNull(intList6);
        Assertions.assertNotNull(intList9);
    }

    @Test
    public void test342() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        bruteForcePrimeGenerator0.validate(10, ' ');
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange(0, 0);
        bruteForcePrimeGenerator0.validate('4', (short) 100);
        Assertions.assertNotNull(intList12);
    }

    @Test
    public void test343() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((byte) 100, (byte) 100);
        bruteForcePrimeGenerator0.validate((short) 0, (short) 1);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((short) 0, 100);
        bruteForcePrimeGenerator0.validate(1, (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList15 = bruteForcePrimeGenerator0.primesInRange(' ', 10);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 10 must be greater than or equal to min 32");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList9);
    }

    @Test
    public void test344() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange((short) 10, '#');
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(100, (byte) 100);
        bruteForcePrimeGenerator0.validate('4', (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList15 = bruteForcePrimeGenerator0.primesInRange(0, (short) -1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max -1 must be greater than or equal to min 0");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList6);
        Assertions.assertNotNull(intList9);
    }

    @Test
    public void test345() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        List<Integer> intList3 = bruteForcePrimeGenerator0.primesInRange(0, '4');
        bruteForcePrimeGenerator0.validate((byte) 100, (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((short) 100, (byte) -1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max -1 must be greater than or equal to min 100");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList3);
    }

    @Test
    public void test346() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        bruteForcePrimeGenerator0.validate((byte) 10, 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((byte) 0, (byte) 1);
        bruteForcePrimeGenerator0.validate(1, (byte) 100);
        List<Integer> intList18 = bruteForcePrimeGenerator0.primesInRange(0, (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList21 = bruteForcePrimeGenerator0.primesInRange(100, 0);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 0 must be greater than or equal to min 100");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList12);
        Assertions.assertNotNull(intList18);
    }

    @Test
    public void test347() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((byte) 1, (short) 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange(1, 100);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList15 = bruteForcePrimeGenerator0.primesInRange((short) -1, (-1));
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(intList12);
    }

    @Test
    public void test348() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        List<Integer> intList3 = bruteForcePrimeGenerator0.primesInRange((byte) 10, 'a');
        bruteForcePrimeGenerator0.validate((short) 0, (short) 0);
        Class<?> wildcardClass7 = bruteForcePrimeGenerator0.getClass();
        Assertions.assertNotNull(intList3);
        Assertions.assertNotNull(wildcardClass7);
    }

    @Test
    public void test349() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        List<Integer> intList3 = bruteForcePrimeGenerator0.primesInRange(0, '4');
        Class<?> wildcardClass4 = bruteForcePrimeGenerator0.getClass();
        Assertions.assertNotNull(intList3);
        Assertions.assertNotNull(wildcardClass4);
    }

    @Test
    public void test350() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((byte) 100, (byte) 100);
        bruteForcePrimeGenerator0.validate((short) 0, (short) 1);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((short) 0, 100);
        bruteForcePrimeGenerator0.validate(' ', (byte) 100);
        bruteForcePrimeGenerator0.validate(0, (byte) 1);
        List<Integer> intList18 = bruteForcePrimeGenerator0.primesInRange((byte) 10, (byte) 100);
        Class<?> wildcardClass19 = bruteForcePrimeGenerator0.getClass();
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(intList18);
        Assertions.assertNotNull(wildcardClass19);
    }

    @Test
    public void test351() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange(10, (byte) 1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 1 must be greater than or equal to min 10");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test352() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange((short) 10, '#');
        bruteForcePrimeGenerator0.validate((short) 1, 1);
        bruteForcePrimeGenerator0.validate((byte) 10, '4');
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((short) 100, 1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 1 must be greater than or equal to min 100");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList6);
    }

    @Test
    public void test353() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange((short) 10, '#');
        bruteForcePrimeGenerator0.validate((short) 1, 1);
        bruteForcePrimeGenerator0.validate((byte) 0, (byte) 10);
        bruteForcePrimeGenerator0.validate(1, (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList18 = bruteForcePrimeGenerator0.primesInRange((byte) 100, (short) 10);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 10 must be greater than or equal to min 100");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList6);
    }

    @Test
    public void test354() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate(0, (short) 10);
        bruteForcePrimeGenerator0.validate((short) 100, (byte) 100);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((short) 0, (byte) 0);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((short) 1, ' ');
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((short) 1, (-1));
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max -1 must be greater than or equal to min 1");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(intList12);
    }

    @Test
    public void test355() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((-1), '#');
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test356() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((byte) 1, (short) 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange(1, 100);
        bruteForcePrimeGenerator0.validate((short) 100, 100);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate(100, (byte) 0);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 0 must be greater than or equal to min 100");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(intList12);
    }

    @Test
    public void test357() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        bruteForcePrimeGenerator0.validate((byte) 10, 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((byte) 0, (byte) 1);
        bruteForcePrimeGenerator0.validate(1, (byte) 100);
        List<Integer> intList18 = bruteForcePrimeGenerator0.primesInRange((short) 10, (short) 100);
        bruteForcePrimeGenerator0.validate((byte) 10, (byte) 10);
        Assertions.assertNotNull(intList12);
        Assertions.assertNotNull(intList18);
    }

    @Test
    public void test358() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        List<Integer> intList3 = bruteForcePrimeGenerator0.primesInRange(0, '4');
        bruteForcePrimeGenerator0.validate(0, ' ');
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(0, (byte) 100);
        bruteForcePrimeGenerator0.validate((byte) 100, (byte) 100);
        List<Integer> intList15 = bruteForcePrimeGenerator0.primesInRange(0, 0);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList18 = bruteForcePrimeGenerator0.primesInRange((short) -1, (byte) -1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList3);
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(intList15);
    }

    @Test
    public void test359() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((byte) 1, (short) 100);
        bruteForcePrimeGenerator0.validate(100, (short) 100);
        bruteForcePrimeGenerator0.validate((byte) 1, (byte) 100);
        Assertions.assertNotNull(intList9);
    }

    @Test
    public void test360() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        bruteForcePrimeGenerator0.validate((byte) 10, 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange(0, '4');
        bruteForcePrimeGenerator0.validate(0, ' ');
        Class<?> wildcardClass16 = bruteForcePrimeGenerator0.getClass();
        Assertions.assertNotNull(intList12);
        Assertions.assertNotNull(wildcardClass16);
    }

    @Test
    public void test361() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        bruteForcePrimeGenerator0.validate((byte) 10, 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((byte) 0, (byte) 1);
        bruteForcePrimeGenerator0.validate(1, (byte) 100);
        List<Integer> intList18 = bruteForcePrimeGenerator0.primesInRange(0, (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((short) -1, (short) 1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList12);
        Assertions.assertNotNull(intList18);
    }

    @Test
    public void test362() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        bruteForcePrimeGenerator0.validate(10, ' ');
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange(0, (-1));
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max -1 must be greater than or equal to min 0");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test363() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        List<Integer> intList3 = bruteForcePrimeGenerator0.primesInRange(0, '4');
        bruteForcePrimeGenerator0.validate(0, ' ');
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(0, (byte) 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange(1, 'a');
        bruteForcePrimeGenerator0.validate((short) 0, (short) 10);
        Assertions.assertNotNull(intList3);
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(intList12);
    }

    @Test
    public void test364() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange((byte) 0, 100);
        Assertions.assertNotNull(intList6);
    }

    @Test
    public void test365() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        bruteForcePrimeGenerator0.validate((byte) 10, 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange(0, '4');
        bruteForcePrimeGenerator0.validate(0, (byte) 1);
        Assertions.assertNotNull(intList12);
    }

    @Test
    public void test366() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((byte) 10, '4');
        Class<?> wildcardClass4 = bruteForcePrimeGenerator0.getClass();
        Assertions.assertNotNull(wildcardClass4);
    }

    @Test
    public void test367() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(0, (short) 100);
        bruteForcePrimeGenerator0.validate(1, 'a');
        bruteForcePrimeGenerator0.validate('a', (byte) 100);
        bruteForcePrimeGenerator0.validate((byte) 1, ' ');
        bruteForcePrimeGenerator0.validate('#', '4');
        Class<?> wildcardClass22 = bruteForcePrimeGenerator0.getClass();
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(wildcardClass22);
    }

    @Test
    public void test368() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((byte) 1, (short) 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange(0, '4');
        bruteForcePrimeGenerator0.validate((byte) 0, (short) 1);
        List<Integer> intList18 = bruteForcePrimeGenerator0.primesInRange((short) 0, 'a');
        Class<?> wildcardClass19 = intList18.getClass();
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(intList12);
        Assertions.assertNotNull(intList18);
        Assertions.assertNotNull(wildcardClass19);
    }

    @Test
    public void test369() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        bruteForcePrimeGenerator0.validate((byte) 10, (short) 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((short) 0, (short) 100);
        bruteForcePrimeGenerator0.validate((byte) 0, 10);
        Class<?> wildcardClass16 = bruteForcePrimeGenerator0.getClass();
        Assertions.assertNotNull(intList12);
        Assertions.assertNotNull(wildcardClass16);
    }

    @Test
    public void test370() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((byte) 100, (byte) 100);
        bruteForcePrimeGenerator0.validate((short) 0, (short) 1);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((short) 0, 100);
        bruteForcePrimeGenerator0.validate('#', (short) 100);
        List<Integer> intList15 = bruteForcePrimeGenerator0.primesInRange((byte) 1, ' ');
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(intList15);
    }

    @Test
    public void test371() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((byte) 100, (byte) 100);
        bruteForcePrimeGenerator0.validate((short) 0, (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((byte) 0, (byte) -1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max -1 must be greater than or equal to min 0");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test372() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate('a', 'a');
    }

    @Test
    public void test373() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange((short) 10, '#');
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(1, '4');
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((short) 1, 10);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((-1), (byte) 10);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList6);
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(intList12);
    }

    @Test
    public void test374() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((byte) 10, 100);
        Class<?> wildcardClass13 = bruteForcePrimeGenerator0.getClass();
        Assertions.assertNotNull(intList12);
        Assertions.assertNotNull(wildcardClass13);
    }

    @Test
    public void test375() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        List<Integer> intList3 = bruteForcePrimeGenerator0.primesInRange(0, '4');
        bruteForcePrimeGenerator0.validate((byte) 100, (byte) 100);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((byte) 1, (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange(10, (-1));
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max -1 must be greater than or equal to min 10");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList3);
        Assertions.assertNotNull(intList9);
    }

    @Test
    public void test376() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((byte) 100, (byte) 100);
        bruteForcePrimeGenerator0.validate((short) 0, (short) 1);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((short) 0, 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((short) 1, (byte) 10);
        bruteForcePrimeGenerator0.validate((byte) 10, (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList18 = bruteForcePrimeGenerator0.primesInRange((byte) 0, (byte) -1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max -1 must be greater than or equal to min 0");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(intList12);
    }

    @Test
    public void test377() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(0, (short) 100);
        bruteForcePrimeGenerator0.validate(1, 'a');
        bruteForcePrimeGenerator0.validate('a', (byte) 100);
        List<Integer> intList18 = bruteForcePrimeGenerator0.primesInRange((short) 10, (short) 10);
        bruteForcePrimeGenerator0.validate((byte) 1, (byte) 10);
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(intList18);
    }

    @Test
    public void test378() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        bruteForcePrimeGenerator0.validate((byte) 10, 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange(0, '4');
        List<Integer> intList15 = bruteForcePrimeGenerator0.primesInRange((short) 1, 100);
        bruteForcePrimeGenerator0.validate((byte) 0, ' ');
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList21 = bruteForcePrimeGenerator0.primesInRange((-1), (-1));
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList12);
        Assertions.assertNotNull(intList15);
    }

    @Test
    public void test379() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(0, (byte) 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((byte) 1, (short) 10);
        bruteForcePrimeGenerator0.validate((short) 0, (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate(1, (short) 0);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 0 must be greater than or equal to min 1");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(intList12);
    }

    @Test
    public void test380() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        bruteForcePrimeGenerator0.validate((byte) 10, (short) 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((short) 0, (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList15 = bruteForcePrimeGenerator0.primesInRange((short) -1, (byte) 0);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList12);
    }

    @Test
    public void test381() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        bruteForcePrimeGenerator0.validate((byte) 10, 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((byte) 0, (byte) 1);
        bruteForcePrimeGenerator0.validate(1, (byte) 100);
        List<Integer> intList18 = bruteForcePrimeGenerator0.primesInRange((short) 10, (short) 100);
        List<Integer> intList21 = bruteForcePrimeGenerator0.primesInRange(' ', '#');
        Class<?> wildcardClass22 = bruteForcePrimeGenerator0.getClass();
        Assertions.assertNotNull(intList12);
        Assertions.assertNotNull(intList18);
        Assertions.assertNotNull(intList21);
        Assertions.assertNotNull(wildcardClass22);
    }

    @Test
    public void test382() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((byte) 100, (byte) 100);
        List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange((short) 100, (short) 100);
        Class<?> wildcardClass7 = intList6.getClass();
        Assertions.assertNotNull(intList6);
        Assertions.assertNotNull(wildcardClass7);
    }

    @Test
    public void test383() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(0, (short) 100);
        bruteForcePrimeGenerator0.validate(1, 'a');
        List<Integer> intList15 = bruteForcePrimeGenerator0.primesInRange(0, (byte) 0);
        Class<?> wildcardClass16 = bruteForcePrimeGenerator0.getClass();
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(intList15);
        Assertions.assertNotNull(wildcardClass16);
    }

    @Test
    public void test384() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange((short) 10, '#');
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(1, '4');
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((short) 100, (byte) 10);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 10 must be greater than or equal to min 100");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList6);
        Assertions.assertNotNull(intList9);
    }

    @Test
    public void test385() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate(0, (short) 10);
        bruteForcePrimeGenerator0.validate((short) 100, (byte) 100);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((short) 0, (byte) 0);
        bruteForcePrimeGenerator0.validate((short) 10, (byte) 100);
        Class<?> wildcardClass13 = bruteForcePrimeGenerator0.getClass();
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(wildcardClass13);
    }

    @Test
    public void test386() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(0, (short) 100);
        bruteForcePrimeGenerator0.validate(1, 'a');
        bruteForcePrimeGenerator0.validate('a', (byte) 100);
        List<Integer> intList18 = bruteForcePrimeGenerator0.primesInRange((short) 10, (short) 10);
        Class<?> wildcardClass19 = bruteForcePrimeGenerator0.getClass();
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(intList18);
        Assertions.assertNotNull(wildcardClass19);
    }

    @Test
    public void test387() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        List<Integer> intList3 = bruteForcePrimeGenerator0.primesInRange(0, '4');
        List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange(0, (byte) 100);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange('#', 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((byte) 0, 0);
        List<Integer> intList15 = bruteForcePrimeGenerator0.primesInRange((short) 1, 100);
        Assertions.assertNotNull(intList3);
        Assertions.assertNotNull(intList6);
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(intList12);
        Assertions.assertNotNull(intList15);
    }

    @Test
    public void test388() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((byte) 100, (byte) 100);
        bruteForcePrimeGenerator0.validate((short) 0, (short) 1);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((short) 0, 100);
        bruteForcePrimeGenerator0.validate(' ', (byte) 100);
        bruteForcePrimeGenerator0.validate(0, (byte) 1);
        bruteForcePrimeGenerator0.validate(1, (byte) 10);
        Assertions.assertNotNull(intList9);
    }

    @Test
    public void test389() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((byte) 10, 100);
        bruteForcePrimeGenerator0.validate(0, (short) 10);
        bruteForcePrimeGenerator0.validate(1, (byte) 10);
        Assertions.assertNotNull(intList12);
    }

    @Test
    public void test390() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (short) 0);
        bruteForcePrimeGenerator0.validate('a', (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange(' ', 0);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 0 must be greater than or equal to min 32");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test391() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        bruteForcePrimeGenerator0.validate((byte) 10, 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((byte) 0, (byte) 1);
        bruteForcePrimeGenerator0.validate((short) 0, 'a');
        List<Integer> intList18 = bruteForcePrimeGenerator0.primesInRange(10, 10);
        Assertions.assertNotNull(intList12);
        Assertions.assertNotNull(intList18);
    }

    @Test
    public void test392() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        bruteForcePrimeGenerator0.validate((byte) 10, 100);
        bruteForcePrimeGenerator0.validate(0, 'a');
        List<Integer> intList15 = bruteForcePrimeGenerator0.primesInRange((short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((byte) -1, '4');
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList15);
    }

    @Test
    public void test393() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        List<Integer> intList3 = bruteForcePrimeGenerator0.primesInRange(0, '4');
        List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange(0, (byte) 100);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange('#', 100);
        Class<?> wildcardClass10 = bruteForcePrimeGenerator0.getClass();
        Assertions.assertNotNull(intList3);
        Assertions.assertNotNull(intList6);
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(wildcardClass10);
    }

    @Test
    public void test394() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(0, (byte) 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange(' ', ' ');
        List<Integer> intList15 = bruteForcePrimeGenerator0.primesInRange(0, 100);
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(intList12);
        Assertions.assertNotNull(intList15);
    }

    @Test
    public void test395() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        bruteForcePrimeGenerator0.validate((byte) 10, (short) 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((short) 0, (short) 100);
        bruteForcePrimeGenerator0.validate((byte) 0, 10);
        List<Integer> intList18 = bruteForcePrimeGenerator0.primesInRange((short) 100, 100);
        List<Integer> intList21 = bruteForcePrimeGenerator0.primesInRange((byte) 10, '4');
        Assertions.assertNotNull(intList12);
        Assertions.assertNotNull(intList18);
        Assertions.assertNotNull(intList21);
    }

    @Test
    public void test396() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(0, (short) 100);
        bruteForcePrimeGenerator0.validate(1, 'a');
        List<Integer> intList15 = bruteForcePrimeGenerator0.primesInRange(0, (byte) 0);
        List<Integer> intList18 = bruteForcePrimeGenerator0.primesInRange((short) 1, (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((byte) -1, 1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(intList15);
        Assertions.assertNotNull(intList18);
    }

    @Test
    public void test397() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        List<Integer> intList3 = bruteForcePrimeGenerator0.primesInRange(1, 100);
        bruteForcePrimeGenerator0.validate('4', (short) 100);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((byte) 10, '4');
        Assertions.assertNotNull(intList3);
        Assertions.assertNotNull(intList9);
    }

    @Test
    public void test398() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        bruteForcePrimeGenerator0.validate((byte) 10, 100);
        bruteForcePrimeGenerator0.validate(0, 'a');
        bruteForcePrimeGenerator0.validate((short) 1, 10);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate('#', (short) 1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 1 must be greater than or equal to min 35");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test399() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((byte) 1, (short) 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange(0, '4');
        bruteForcePrimeGenerator0.validate((byte) 0, (short) 1);
        bruteForcePrimeGenerator0.validate((short) 1, (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList21 = bruteForcePrimeGenerator0.primesInRange((byte) -1, (short) 0);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(intList12);
    }

    @Test
    public void test400() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        List<Integer> intList3 = bruteForcePrimeGenerator0.primesInRange(0, '4');
        bruteForcePrimeGenerator0.validate(0, ' ');
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(0, (byte) 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange(0, (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList15 = bruteForcePrimeGenerator0.primesInRange((byte) 100, (-1));
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max -1 must be greater than or equal to min 100");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList3);
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(intList12);
    }

    @Test
    public void test401() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        bruteForcePrimeGenerator0.validate((byte) 10, 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((byte) 0, (byte) 1);
        bruteForcePrimeGenerator0.validate((short) 0, 'a');
        List<Integer> intList18 = bruteForcePrimeGenerator0.primesInRange(' ', (byte) 100);
        Assertions.assertNotNull(intList12);
        Assertions.assertNotNull(intList18);
    }

    @Test
    public void test402() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        List<Integer> intList3 = bruteForcePrimeGenerator0.primesInRange(0, '4');
        bruteForcePrimeGenerator0.validate((byte) 100, (byte) 100);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((short) 1, (byte) 100);
        Assertions.assertNotNull(intList3);
        Assertions.assertNotNull(intList9);
    }

    @Test
    public void test403() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(0, (byte) 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange('a', 100);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((short) 10, (byte) 1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 1 must be greater than or equal to min 10");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(intList12);
    }

    @Test
    public void test404() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((byte) 1, (short) 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange(0, '4');
        List<Integer> intList15 = bruteForcePrimeGenerator0.primesInRange((short) 0, 1);
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(intList12);
        Assertions.assertNotNull(intList15);
    }

    @Test
    public void test405() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((byte) 100, (byte) 100);
        bruteForcePrimeGenerator0.validate((short) 0, (short) 1);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((short) 0, 100);
        bruteForcePrimeGenerator0.validate(' ', (byte) 100);
        List<Integer> intList15 = bruteForcePrimeGenerator0.primesInRange(1, (byte) 1);
        List<Integer> intList18 = bruteForcePrimeGenerator0.primesInRange(' ', 'a');
        List<Integer> intList21 = bruteForcePrimeGenerator0.primesInRange((byte) 1, (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList24 = bruteForcePrimeGenerator0.primesInRange((byte) -1, (short) 0);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(intList15);
        Assertions.assertNotNull(intList18);
        Assertions.assertNotNull(intList21);
    }

    @Test
    public void test406() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        bruteForcePrimeGenerator0.validate((byte) 10, 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((byte) 0, (byte) 1);
        bruteForcePrimeGenerator0.validate((short) 0, 'a');
        List<Integer> intList18 = bruteForcePrimeGenerator0.primesInRange((short) 1, '#');
        List<Integer> intList21 = bruteForcePrimeGenerator0.primesInRange((short) 0, 10);
        List<Integer> intList24 = bruteForcePrimeGenerator0.primesInRange('a', (short) 100);
        Class<?> wildcardClass25 = bruteForcePrimeGenerator0.getClass();
        Assertions.assertNotNull(intList12);
        Assertions.assertNotNull(intList18);
        Assertions.assertNotNull(intList21);
        Assertions.assertNotNull(intList24);
        Assertions.assertNotNull(wildcardClass25);
    }

    @Test
    public void test407() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(0, (short) 100);
        bruteForcePrimeGenerator0.validate(1, 'a');
        List<Integer> intList15 = bruteForcePrimeGenerator0.primesInRange(0, (byte) 0);
        List<Integer> intList18 = bruteForcePrimeGenerator0.primesInRange(10, (short) 10);
        bruteForcePrimeGenerator0.validate(' ', ' ');
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(intList15);
        Assertions.assertNotNull(intList18);
    }

    @Test
    public void test408() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate(0, (short) 10);
        bruteForcePrimeGenerator0.validate((short) 100, (byte) 100);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((short) 0, (short) 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((short) 0, (byte) 1);
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(intList12);
    }

    @Test
    public void test409() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((byte) 100, (byte) 100);
        bruteForcePrimeGenerator0.validate((short) 0, (short) 1);
        bruteForcePrimeGenerator0.validate(1, (short) 1);
    }

    @Test
    public void test410() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(0, (byte) 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange(' ', ' ');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        bruteForcePrimeGenerator0.validate(100, (short) 100);
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(intList12);
    }

    @Test
    public void test411() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(0, (byte) 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((byte) 1, (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList15 = bruteForcePrimeGenerator0.primesInRange('4', 1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 1 must be greater than or equal to min 52");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(intList12);
    }

    @Test
    public void test412() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        bruteForcePrimeGenerator0.validate((byte) 10, 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((byte) 0, (byte) 1);
        bruteForcePrimeGenerator0.validate(1, (byte) 100);
        List<Integer> intList18 = bruteForcePrimeGenerator0.primesInRange((short) 10, (short) 100);
        List<Integer> intList21 = bruteForcePrimeGenerator0.primesInRange(' ', '#');
        List<Integer> intList24 = bruteForcePrimeGenerator0.primesInRange(0, (byte) 10);
        List<Integer> intList27 = bruteForcePrimeGenerator0.primesInRange((byte) 0, (byte) 10);
        List<Integer> intList30 = bruteForcePrimeGenerator0.primesInRange(0, (byte) 10);
        Assertions.assertNotNull(intList12);
        Assertions.assertNotNull(intList18);
        Assertions.assertNotNull(intList21);
        Assertions.assertNotNull(intList24);
        Assertions.assertNotNull(intList27);
        Assertions.assertNotNull(intList30);
    }

    @Test
    public void test413() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        bruteForcePrimeGenerator0.validate((byte) 10, (short) 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((short) 0, (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((-1), (byte) 10);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList12);
    }

    @Test
    public void test414() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange((short) 10, '#');
        bruteForcePrimeGenerator0.validate((short) 1, 1);
        bruteForcePrimeGenerator0.validate((short) 1, (short) 10);
        Assertions.assertNotNull(intList6);
    }

    @Test
    public void test415() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(0, (byte) 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((byte) 1, (short) 10);
        bruteForcePrimeGenerator0.validate((short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate('4', (short) 1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 1 must be greater than or equal to min 52");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList9);
        Assertions.assertNotNull(intList12);
    }

    @Test
    public void test416() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate(0, (byte) 10);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange(0, (short) 100);
        bruteForcePrimeGenerator0.validate(1, 'a');
        bruteForcePrimeGenerator0.validate('a', (byte) 100);
        bruteForcePrimeGenerator0.validate((byte) 1, ' ');
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((short) 0, (short) -1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max -1 must be greater than or equal to min 0");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList9);
    }

    @Test
    public void test417() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        bruteForcePrimeGenerator0.validate((byte) 10, 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((byte) 0, (byte) 1);
        bruteForcePrimeGenerator0.validate((short) 0, 'a');
        List<Integer> intList18 = bruteForcePrimeGenerator0.primesInRange((short) 1, '#');
        List<Integer> intList21 = bruteForcePrimeGenerator0.primesInRange((short) 0, 10);
        bruteForcePrimeGenerator0.validate((short) 0, (short) 1);
        Class<?> wildcardClass25 = bruteForcePrimeGenerator0.getClass();
        Assertions.assertNotNull(intList12);
        Assertions.assertNotNull(intList18);
        Assertions.assertNotNull(intList21);
        Assertions.assertNotNull(wildcardClass25);
    }

    @Test
    public void test418() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate(0, (short) 10);
        bruteForcePrimeGenerator0.validate((short) 100, (byte) 100);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((short) 0, (byte) 0);
        bruteForcePrimeGenerator0.validate((short) 10, (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate((-1), (short) 1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList9);
    }

    @Test
    public void test419() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        bruteForcePrimeGenerator0.validate((byte) 0, 'a');
        bruteForcePrimeGenerator0.validate((byte) 10, 100);
        List<Integer> intList12 = bruteForcePrimeGenerator0.primesInRange((byte) 0, (byte) 1);
        bruteForcePrimeGenerator0.validate((short) 0, 'a');
        List<Integer> intList18 = bruteForcePrimeGenerator0.primesInRange((short) 1, '#');
        List<Integer> intList21 = bruteForcePrimeGenerator0.primesInRange((short) 0, 10);
        bruteForcePrimeGenerator0.validate((short) 0, (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList27 = bruteForcePrimeGenerator0.primesInRange('a', (short) 1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 1 must be greater than or equal to min 97");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList12);
        Assertions.assertNotNull(intList18);
        Assertions.assertNotNull(intList21);
    }

    @Test
    public void test420() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate((short) 0, '#');
        List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange((short) 10, '#');
        bruteForcePrimeGenerator0.validate((short) 1, 1);
        bruteForcePrimeGenerator0.validate((byte) 0, (byte) 10);
        bruteForcePrimeGenerator0.validate(1, (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            List<Integer> intList18 = bruteForcePrimeGenerator0.primesInRange((-1), (byte) 0);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Min -1 must be greater than or equal to zero");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList6);
    }

    @Test
    public void test421() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate(0, (short) 10);
        bruteForcePrimeGenerator0.validate((short) 100, (byte) 100);
        List<Integer> intList9 = bruteForcePrimeGenerator0.primesInRange((short) 0, (byte) 0);
        bruteForcePrimeGenerator0.validate((short) 10, (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            bruteForcePrimeGenerator0.validate(' ', (byte) 1);
            Assertions.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max 1 must be greater than or equal to min 32");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        Assertions.assertNotNull(intList9);
    }

    @Test
    public void test422() throws Throwable {
        BruteForcePrimeGenerator bruteForcePrimeGenerator0 = new BruteForcePrimeGenerator();
        bruteForcePrimeGenerator0.validate(0, (short) 10);
        List<Integer> intList6 = bruteForcePrimeGenerator0.primesInRange(0, ' ');
        bruteForcePrimeGenerator0.validate(10, (byte) 100);
        Assertions.assertNotNull(intList6);
    }
}

