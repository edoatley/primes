## Stage 1 : Gradle build produces the application executable jar
FROM gradle:7.5.1-jdk17 as builder

COPY . /home/gradle/src/
WORKDIR /home/gradle/src
RUN gradle build
RUN ls -lh /home/gradle/src/build/libs/primes-0.0.1-SNAPSHOT.jar

## Stage 2 : Final image with JRE and application executable jar
FROM mcr.microsoft.com/openjdk/jdk:17-distroless

# Copy JAR into container image
COPY --from=builder /home/gradle/src/build/libs/primes-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080

# Run application using executable jar application
CMD ["-Xmx256m", "-jar", "/app.jar"]