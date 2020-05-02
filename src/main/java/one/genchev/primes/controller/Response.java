package one.genchev.primes.controller;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Response {
    private String body;
    private String status;
    private List<String> errors;
}
