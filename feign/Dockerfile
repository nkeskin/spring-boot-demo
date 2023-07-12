FROM maven:sapmachine AS build
COPY pom.xml /app/
COPY src /app/src
RUN mvn -f /app/pom.xml clean install

FROM openjdk:17
EXPOSE 8090
COPY --from=build /app/target/*.jar /app/app.jar
ENTRYPOINT ["java","-jar","/app/app.jar"]

