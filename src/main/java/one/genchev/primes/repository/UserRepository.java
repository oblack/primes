package one.genchev.primes.repository;

import one.genchev.primes.model.User;

@Deprecated
public interface UserRepository /*extends MongoRepository<User, String>*/ {

    User findByEmail(String email);
}
