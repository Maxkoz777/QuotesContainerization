FROM adoptopenjdk/openjdk11:jdk-11.0.5_10-alpine
ADD out/artifacts/QuotesContainerization_jar/QuotesContainerization.jar QuotesContainerization.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "QuotesContainerization.jar"]