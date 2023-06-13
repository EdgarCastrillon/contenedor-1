FROM openjdk:19
COPY "./build/libs/integracion-0.0.1-SNAPSHOT.jar" "container-1.jar"
EXPOSE 8080
ENTRYPOINT ["java","-jar","container-1.jar"]
