#build app stage
FROM maven:3.9.3-eclipse-temurin-20-alpine as builder
WORKDIR /app
COPY ./cowsay .
RUN mvn package

#build image stage
FROM bellsoft/liberica-runtime-container:jre-17-slim-musl
WORKDIR /app
COPY --from=builder /app/target/cowsay.jar ./cowsay.jar
EXPOSE 8080
ENTRYPOINT ["/bin/sh","-c","java -jar cowsay.jar"]