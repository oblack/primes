package one.genchev.primes.util;

import org.springframework.stereotype.Component;

/**
 * Methods for determining prime numbers
 */
@Component
public class PrimeChecker {

    /**
     * Check if input number is prime
     * @param input
     * @return
     */
    public boolean isPrime(Integer input) {
        if(input % 2 == 0)
            return false;

        int divisor = 3;
        while(divisor * divisor <= input) {
            if(input % divisor == 0) {
                return false;
            }
            divisor += 2;
        }
        return true;
    }

    /**
     * Return the closes prime number, bigger than the input number
     * @param input
     * @return
     */
    public Integer findNextPrime(Integer input) {
        Integer result = input+1;
        while(result % 2 == 0 || !isPrime(result)) {
            result++;
        }
        return result;
    }
}
