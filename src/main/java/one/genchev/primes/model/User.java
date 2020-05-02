package one.genchev.primes.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
//@Document
@AllArgsConstructor
@Deprecated
public class User {

    private String email;
    private String name;
    private String password;
}
