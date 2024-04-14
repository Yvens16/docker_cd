# Simple example because that is not what is important right now, it's a deploy tuto
FROM eclipse-temurin:17 AS build
# In the root directory
COPY . .
RUN ./mvnw clean install -DskipTests

FROM build as prod
CMD ["java", "-jar", "/target/cd_app.jar", "--spring.profiles.active=prod"]