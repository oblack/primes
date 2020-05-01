package one.genchev.primes.util;

import org.springframework.stereotype.Component;

@Component
public class PrimeChecker {

    public boolean isPrime(Integer input) {

        long divisor = input -1;
        while (divisor > 1) {
            if ((input % divisor) == 0) {
                return false;
            }
            divisor --;
        }
        return true;
    }

    public Integer findNextPrime(Integer input) {

        Integer result = input+1;

        while(!isPrime(result)) {
            result++;
        }

        return result;
    }
}
