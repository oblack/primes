package one.genchev.primes.security;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;

@Component
public class CustomOncePerRequestFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        try {
            String token = request.getHeader("Authorization");
            User authenticatedUser = authenticate(token.substring(7));
            if (authenticatedUser != null) {
                UsernamePasswordAuthenticationToken springAuthToken = new UsernamePasswordAuthenticationToken(
                        authenticatedUser.getUsername(), null, AuthorityUtils.createAuthorityList("ROLE_USER"));
                springAuthToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                SecurityContextHolder.getContext().setAuthentication(springAuthToken);
            }
            else {
                SecurityContextHolder.getContext().setAuthentication(null);
            }
        } catch (Exception e) {
            logger.error("Cannot set user authentication: " + e.getMessage());
        }
        filterChain.doFilter(request, response);
    }

    /**
     * Authenticate based on the token
     * @return a user object or null
     */
    private User authenticate(String token) {
        if(token.equals("auth_token_123"))
            return new User("default_username", "default_password", Collections.emptyList());
        else
            return null;
    }
}
