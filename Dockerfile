# Usar uma imagem base do JDK 17
FROM openjdk:17-jdk-slim

# Diretório de trabalho dentro do container
WORKDIR /app

# Copiar o arquivo JAR gerado para dentro do container
COPY target/app-for-pets.jar /app/app-for-pets.jar

# Expor a porta em que o Spring Boot roda (8080 por padrão)
EXPOSE 8080

# Comando para rodar a aplicação
ENTRYPOINT ["java", "-jar", "/app/app-for-pets.jar"]
