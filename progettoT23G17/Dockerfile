# Usa l'immagine di base di OpenJDK con Java 17
FROM openjdk:17-jdk

# Crea una directory per l'applicazione
WORKDIR /app

# Copia il file JAR dell'applicazione nella directory dell'applicazione
COPY target/login_app-0.0.1-SNAPSHOT.jar app.jar

# Esposizione della porta
EXPOSE 8081

# Comando di avvio dell'applicazione
CMD ["java", "-jar", "app.jar"]
