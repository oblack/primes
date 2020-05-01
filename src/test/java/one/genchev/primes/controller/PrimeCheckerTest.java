package one.genchev.primes.controller;

import lombok.RequiredArgsConstructor;
import one.genchev.primes.util.PrimeChecker;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class PrimeCheckerTest {

    @Test
    void testWhetherInputNumbersArePrime() {
        final PrimeChecker primeChecker = new PrimeChecker();

        Assertions.assertThat(primeChecker.isPrime(13)).isTrue();
        Assertions.assertThat(primeChecker.isPrime(5)).isTrue();
        Assertions.assertThat(primeChecker.isPrime(47)).isTrue();
        Assertions.assertThat(primeChecker.isPrime(67)).isTrue();
        Assertions.assertThat(primeChecker.isPrime(83)).isTrue();
        Assertions.assertThat(primeChecker.isPrime(97)).isTrue();

        Assertions.assertThat(primeChecker.isPrime(4)).isFalse();
        Assertions.assertThat(primeChecker.isPrime(15)).isFalse();
        Assertions.assertThat(primeChecker.isPrime(27)).isFalse();
        Assertions.assertThat(primeChecker.isPrime(99)).isFalse();
        Assertions.assertThat(primeChecker.isPrime(33)).isFalse();
        Assertions.assertThat(primeChecker.isPrime(90)).isFalse();
        Assertions.assertThat(primeChecker.isPrime(77)).isFalse();
    }

    @Test
    void testThatMethodReturnsNextPrimeNumber() {
        final PrimeChecker primeChecker = new PrimeChecker();

        Assertions.assertThat(primeChecker.findNextPrime(2)).isEqualTo(3);
        Assertions.assertThat(primeChecker.findNextPrime(73)).isEqualTo(79);
        Assertions.assertThat(primeChecker.findNextPrime(89)).isEqualTo(97);
        Assertions.assertThat(primeChecker.findNextPrime(90)).isEqualTo(97);
        Assertions.assertThat(primeChecker.findNextPrime(54)).isEqualTo(59);

        Assertions.assertThat(primeChecker.findNextPrime(2)).isNotEqualTo(5);
        Assertions.assertThat(primeChecker.findNextPrime(73)).isNotEqualTo(83);
        Assertions.assertThat(primeChecker.findNextPrime(89)).isNotEqualTo(95);
        Assertions.assertThat(primeChecker.findNextPrime(90)).isNotEqualTo(100);
        Assertions.assertThat(primeChecker.findNextPrime(54)).isNotEqualTo(61);
    }

}