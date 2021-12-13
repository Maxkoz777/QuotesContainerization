FROM adoptopenjdk/openjdk11:jdk-11.0.5_10-alpine
COPY . .
EXPOSE 8081
RUN chmod +x mvnw
ENTRYPOINT ["./mvnw", "spring-boot:run"]