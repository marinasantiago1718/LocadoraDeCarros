# 1️⃣ Build com Maven + JDK 21 (Debian-based)
FROM maven:3.9.4-eclipse-temurin-21 AS build

WORKDIR /app

# Copiar pom.xml e código fonte
COPY pom.xml .
COPY src ./src

# Build do JAR sem testes
RUN mvn clean package -DskipTests

# 2️⃣ Imagem final menor só com JDK 21
FROM eclipse-temurin:21-jdk-alpine

WORKDIR /app

# Copiar JAR do build
COPY --from=build /app/target/user-service-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

# Rodar aplicação
CMD ["java", "-jar", "app.jar"]
