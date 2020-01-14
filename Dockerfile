# Start with a base image containing Java runtime
FROM openjdk:8-jre-alpine

# Add a volume pointing to /tmp
VOLUME /tmp

# The application's jar file
ARG JAR_FILE=target/AzurePractice.jar

# Add the application's jar to the container
ADD ${JAR_FILE} AzurePractice.jar

# Run the jar file
ENTRYPOINT ["java","-jar","AzurePractice.jar"]
