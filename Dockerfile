FROM openjdk:11
LABEL maintainer="javaguides.net"
ADD target/mohit-docker.jar devopsautomation.jar
ENTRYPOINT ["java","-jar","devopsautomation.jar"]
