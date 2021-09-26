# Crude attempt needs improving
FROM openjdk:11
RUN addgroup spring && useradd spring -M -g spring
USER spring:spring
ARG JAR_FILE=./build/libs/primes-*-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]