package one.genchev.primes.repository;

import one.genchev.primes.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

@Deprecated
public interface UserRepository extends MongoRepository<User, String> {

    User findByEmail(String email);
}
