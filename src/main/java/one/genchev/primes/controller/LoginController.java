package one.genchev.primes.controller;

import lombok.RequiredArgsConstructor;
import one.genchev.primes.model.User;
import one.genchev.primes.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@RestController
@RequestMapping("/primes")
@RequiredArgsConstructor
@Deprecated
public class LoginController {

    private final UserRepository userRepository;

    @GetMapping("/login")
    public String login(@PathVariable String email, @PathVariable String password) {
        User persistedUser = userRepository.findByEmail(email);
        if(persistedUser.getPassword().equals(password)) {
            return "Logged in";
            //TODO: Do the actual authentication here
        }
        else {
            return "Not logged in";
        }
    }

    @PostMapping("/register")
    public String register(@PathVariable String name, @PathVariable String email, @PathVariable String password) {
        User user = new User(name, email, password);
        userRepository.save(user);
        return "Not registered";
    }
}
