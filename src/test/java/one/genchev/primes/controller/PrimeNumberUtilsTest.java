package one.genchev.primes.controller;

import one.genchev.primes.util.PrimeNumberUtils;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class PrimeNumberUtilsTest {

    @Test
    void testWhetherInputNumbersArePrime() {
        final PrimeNumberUtils primeNumberUtils = new PrimeNumberUtils();

        Assertions.assertThat(primeNumberUtils.isPrime(13)).isTrue();
        Assertions.assertThat(primeNumberUtils.isPrime(5)).isTrue();
        Assertions.assertThat(primeNumberUtils.isPrime(47)).isTrue();
        Assertions.assertThat(primeNumberUtils.isPrime(67)).isTrue();
        Assertions.assertThat(primeNumberUtils.isPrime(83)).isTrue();
        Assertions.assertThat(primeNumberUtils.isPrime(97)).isTrue();

        Assertions.assertThat(primeNumberUtils.isPrime(4)).isFalse();
        Assertions.assertThat(primeNumberUtils.isPrime(15)).isFalse();
        Assertions.assertThat(primeNumberUtils.isPrime(27)).isFalse();
        Assertions.assertThat(primeNumberUtils.isPrime(99)).isFalse();
        Assertions.assertThat(primeNumberUtils.isPrime(33)).isFalse();
        Assertions.assertThat(primeNumberUtils.isPrime(90)).isFalse();
        Assertions.assertThat(primeNumberUtils.isPrime(77)).isFalse();
    }

    @Test
    void testThatMethodReturnsNextPrimeNumber() {
        final PrimeNumberUtils primeNumberUtils = new PrimeNumberUtils();

        Assertions.assertThat(primeNumberUtils.findNextPrime(2)).isEqualTo(3);
        Assertions.assertThat(primeNumberUtils.findNextPrime(73)).isEqualTo(79);
        Assertions.assertThat(primeNumberUtils.findNextPrime(89)).isEqualTo(97);
        Assertions.assertThat(primeNumberUtils.findNextPrime(90)).isEqualTo(97);
        Assertions.assertThat(primeNumberUtils.findNextPrime(54)).isEqualTo(59);

        Assertions.assertThat(primeNumberUtils.findNextPrime(2)).isNotEqualTo(5);
        Assertions.assertThat(primeNumberUtils.findNextPrime(73)).isNotEqualTo(83);
        Assertions.assertThat(primeNumberUtils.findNextPrime(89)).isNotEqualTo(95);
        Assertions.assertThat(primeNumberUtils.findNextPrime(90)).isNotEqualTo(100);
        Assertions.assertThat(primeNumberUtils.findNextPrime(54)).isNotEqualTo(61);
    }

}