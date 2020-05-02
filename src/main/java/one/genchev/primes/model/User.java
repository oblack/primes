package one.genchev.primes.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Data
@Document
@AllArgsConstructor
@Deprecated
public class User {

    private String email;
    private String name;
    private String password;
}
