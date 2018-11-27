FROM java:8
EXPOSE 8302
ADD /target/school-service.jar school-service.jar
ENTRYPOINT ["java", "-jar", "school-service.jar"]