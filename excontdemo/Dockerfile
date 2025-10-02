#Obtain the jdk dependencies
FROM openjdk:21-slim

#Create the work directory
WORKDIR /app

#Copy the fat jar
COPY target/ExContdemo-0.0.1-SNAPSHOT.jar app.jar

#Expose the port number
EXPOSE 8081

#Run your application
ENTRYPOINT ["java","-jar","app.jar"]
