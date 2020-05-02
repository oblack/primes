package one.genchev.primes.controller;

import lombok.RequiredArgsConstructor;
import one.genchev.primes.util.PrimeNumberUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Collections;

@RestController
@RequestMapping("/primes")
@RequiredArgsConstructor
public class PrimeController {

    private final PrimeNumberUtils primeNumberUtils;

    @GetMapping("/{input}")
    public ResponseEntity<Response> checkPrime(@PathVariable Integer input) {
        if(input <= 1)
            return new ResponseEntity<>(
                    new Response(
                            "Input number must be between 1 and 2147483647",
                            "400",
                            Arrays.asList("Input number must be between 1 and 2147483647")),
                    new HttpHeaders(), HttpStatus.BAD_REQUEST);

        if (primeNumberUtils.isPrime(input))
            return new ResponseEntity<>(
                    new Response(input.toString(), "200", Collections.emptyList()),
                    new HttpHeaders(), HttpStatus.OK);
        else
            return new ResponseEntity<>(
                    new Response("not a prime number", "404", Collections.emptyList()), new HttpHeaders(), HttpStatus.NOT_FOUND);
    }

    @GetMapping("/next/{input}")
    public ResponseEntity<Response> getNextPrime(@PathVariable Integer input) {
        if(input <= 1)
            return new ResponseEntity<>(
                    new Response(
                            "Input number must be between 1 and 2147483647",
                            "400",
                            Arrays.asList("Input number must be between 1 and 2147483647")),
                    new HttpHeaders(), HttpStatus.BAD_REQUEST);

        Integer nextPrime = primeNumberUtils.findNextPrime(input);
        return new ResponseEntity<>(
                new Response(nextPrime.toString(), "200", Collections.emptyList()),
                new HttpHeaders(), HttpStatus.OK);
            
    }
}
