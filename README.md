# Prime Number Service

## Limitations
    Skipping HTTPS
    User only has simple credentials
    Path variables used for registration & login
    Skipping Validation on input email format
    Skipping User ID's
    User Registration is simple
    Skip enforcing unique emails
    Possible to have null-pointer in authentication filter, but accounted for

## Assumptions
    Task specifications - next prime number
    
## Run the app
    git clone https://github.com/oblack/primes.git
    cd primes
    docker-compose up