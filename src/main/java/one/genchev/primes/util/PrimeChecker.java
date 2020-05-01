package one.genchev.primes.util;

import org.springframework.stereotype.Component;

@Component
public class PrimeChecker {

    //TODO: Check if performance is optimal

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
//
//
//        while (divisor > 1) {
//            if ((input % divisor) == 0) {
//                return false;
//            }
//            divisor --;
//        }
//        return true;
    }

    public Integer findNextPrime(Integer input) {
        Integer result = input+1;
        while(!isPrime(result)) {
            result++;
        }
        return result;
    }
}
