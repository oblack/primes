package one.genchev.primes.controller;

import lombok.RequiredArgsConstructor;
import one.genchev.primes.util.PrimeChecker;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class PrimeCheckerTest {

    @Test
    void isPrime() {
        final PrimeChecker primeChecker = new PrimeChecker();
        Assertions.assertThat(primeChecker.isPrime(5L)).isTrue();
    }


}