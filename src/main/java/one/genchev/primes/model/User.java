package one.genchev.primes.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Data
@Document
@AllArgsConstructor
public class User {

    @Indexed(unique = true)
    private String email;
    private String name;
    private String password;
    private String role;
}
