# Promo Carousel REST API with Spring Boot, Mysql, JPA and Hibernate 

## Steps to Setup

**1. Clone the application**

```bash
https://github.com/diansastro/promo-carousel-api.git
```

**2. Create Mysql database**
```bash
create database promo
```

**3. Change mysql username and password as per your installation**

+ open `src/main/resources/application.properties`

+ change `spring.datasource.username` and `spring.datasource.password` as per your mysql installation

**4. Build and run the app using maven**

```bash
mvn package
java -jar target/promo-carousel-api-0.0.1-SNAPSHOT.jar

```

**5. Import sql data**

Download here <https://bit.ly/2QT2PUS>

Alternatively, you can run the app without packaging it using -

```bash
mvn spring-boot:run
```

The app will start running at <http://localhost:8080>.

## Explore Rest APIs

The app defines following APIs.

    GET /api/v1/user/{id}