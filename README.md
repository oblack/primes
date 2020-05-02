# Prime Number Service
    This is an example implementation of a REST Api in Spring Boot, which provides two endpoints.
    One checks if a number is prime, one provides the next prime number after the one provided.  

## Assumptions
    1. Task specifications - I have modified the requirement 
        "Input: N, output: P where P >= N and P is prime" 
        to "Input: N, output: P where P > N and P is prime"
    2. Authentication is done via a bearer token, submitted in the Authorization request header
        - The token authorization is just a model, it uses a pre-shared token
    3. Response is provided as a simple object with 3 properties
    4. Docker image is maven-based
    5. The resources are prime numbers, and their id is the number itself.
        
## Extras
    1. Unit tests
    2. Docker-compose
    3. Token authentication
    
## Run the service
    git clone https://github.com/oblack/primes.git
    cd primes
    docker-compose up
    
## Access the running service
    Http Security
        default username: user
        default password: pass
    REST security
        Bearer token: auth_token_123
    
## Swagger UI
    swagger-ui documentation available at .../doc/swagger-ui.html