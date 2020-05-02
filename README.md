# Prime Number Service

## Limitations
    Skipping HTTPS
    User Authentication is simple
    Skip enforcing unique emails
    Possible to have null-pointer in authentication filter, but accounted for

## Assumptions
    Task specifications - next prime number
    
## Run the app
    git clone https://github.com/oblack/primes.git
    cd primes
    docker-compose up
    
## Security
    Http Security
        default username: user
        default password: pass
    REST security
        Bearer token: auth_token_123
    
## Swagger UI
    swagger-ui documentation available at .../doc/swagger-ui.html
    needs http security credentials
   