# Spring Boot and Jersey

Sample application with Spring Boot and Jersey.

Follow these steps to compile and run:

- Open a command line window or terminal.
- Navigate to the root directory of the project, where the `pom.xml` resides.
- Compile the project: `mvn clean compile`.
- Package the application: `mvn package`.
- Look in the `target` directory. You should see a file with the following or a similar name: `spring-jersey-1.0-SNAPSHOT.jar`.
- Change into the `target` directory.
- Execute the JAR: `java -jar spring-jersey-1.0-SNAPSHOT.jar`.
- The application should available at `http://localhost:8080/api/greetings`.
