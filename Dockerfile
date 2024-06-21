#FROM alpine:latest as build
#
#RUN apk update
#RUN apk add openjdk17
#
#COPY . .
#RUN chmod +x ./gradlew
#RUN ./gradlew bootJar --no-daemon
#
#FROM openjdk:17-alpine
#EXPOSE 9000
#COPY --from=build ./build/libs/buen-sabor-back-0.0.1-SNAPSHOT.jar ./app.jar
#
#ENTRYPOINT ["java", "-jar","app.jar"]



# Utiliza la imagen base de OpenJDK 17 en Alpine Linux para la etapa de ejecución
FROM openjdk:17-alpine

# Expone el puerto 9000 para la aplicación Spring Boot
EXPOSE 9000

# Copia el archivo JAR generado en el host al contenedor
COPY ./build/libs/buen-sabor-back-0.0.1-SNAPSHOT.jar ./app.jar

# Define el punto de entrada para el contenedor, especificando el comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]
