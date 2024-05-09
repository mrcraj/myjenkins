FROM eclipse-temurin:17
COPY target/mydocker.jar mydocker.jar
CMD ["java","-jar","mydocker.jar"]