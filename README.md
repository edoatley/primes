Primes
======

Current repo state:

[![Coverage](.github/badges/jacoco.svg)](https://github.com/edoatley/primes/actions/workflows/build.yml)

## What to do

- [x] Complete tests for BruteForce
- [x] Simple REACTIVE interface
- [x] Randoop to see what tests are generated
- [ ] Other test generators
- [ ] Better prime generator
- [ ] Java Micro Bench Marking 

## Randoop

Bit disappointed with Randoop after changing the logic from this

```java
    private boolean prime(int potentialPrime) {
        if(potentialPrime < 2) return false;
        if(potentialPrime == 2) return true;
        for (int i = 2; i < Math.sqrt(potentialPrime) + 1; i++) {
            if(potentialPrime%i == 0) {
                return false;
            }
        }
        return true;
    }
```

to this (note the if allows for a remainder of 2 now!):

```java
    private boolean prime(int potentialPrime) {
        if(potentialPrime < 2) return false;
        if(potentialPrime == 2) return true;
        for (int i = 2; i < Math.sqrt(potentialPrime) + 1; i++) {
            if(potentialPrime%i == 0 || potentialPrime%i == 2) {
                return false;
            }
        }
        return true;
    }
```

**NOT ONE** test failed that Randoop generated

In contrast the real tests had the tests generating primes 1-10 failing by not counting 5 as prime (as 5%3 == 2)


#Reports

Added a few reports

- Mutation testing
- CVE scan
- JMH report from test written to check performance of BruteForcePrimeGenerator