package one.genchev.primes.controller;

import lombok.RequiredArgsConstructor;
import one.genchev.primes.util.PrimeChecker;
import org.springframework.data.mongodb.core.aggregation.ArrayOperators;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/primes")
@RequiredArgsConstructor
public class PrimeController {

    private final PrimeChecker primeChecker;

    @GetMapping("/{input}")
    public ResponseEntity<String> checkPrime(@PathVariable Integer input) {

        //TODO: Check input
        // - Should not be text, negative, or complex number, only positive integers
        // - Cannot be larger than 2147483647 (size of input type)
        // - Should be larger than 1

        //TODO: Input validation - use ControllerAdvice for global exception handling - returns a different response

        if(input <= 1)
            return new ResponseEntity<>("Input number must be between 1 and 2147483647", new HttpHeaders(), HttpStatus.BAD_REQUEST);

        if (primeChecker.isPrime(input))
            return new ResponseEntity<>(input.toString(), new HttpHeaders(), HttpStatus.OK);
        else
            return new ResponseEntity<>(input.toString() + " is not a prime number", new HttpHeaders(), HttpStatus.NOT_FOUND);
    }

    @GetMapping("/next/{input}")
    public ResponseEntity<String> getNextPrime(@PathVariable Integer input) {

        if(input <= 1)
            return new ResponseEntity<>("Input number must be between 1 and 2147483647", new HttpHeaders(), HttpStatus.BAD_REQUEST);

        Integer nextPrime = primeChecker.findNextPrime(input);
        return new ResponseEntity<>(nextPrime.toString(), new HttpHeaders(), HttpStatus.OK);
            
    }
}
