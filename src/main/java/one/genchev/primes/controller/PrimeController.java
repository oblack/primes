package one.genchev.primes.controller;

import lombok.RequiredArgsConstructor;
import one.genchev.primes.util.PrimeChecker;
import org.springframework.data.mongodb.core.aggregation.ArrayOperators;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/primes")
@RequiredArgsConstructor
public class PrimeController {

    private final PrimeChecker primeChecker;

    @GetMapping("/{input}")
    public Integer checkPrime(@PathVariable Integer input) {

        //TODO: Check input
        // - Should not be text, negative, or complex number, only positive integers
        // - Cannot be larger than 2147483647 (size of input type)
        // - Should be larger than 1

        if (primeChecker.isPrime(input)) {
            return input;
        }
        else {
            return 1;
        }
    }

    @GetMapping("/next/{input}")
    public Integer getNextPrime(@PathVariable Integer input) {
        return 34;
    }
}
