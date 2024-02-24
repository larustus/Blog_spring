FROM openjdk:11-jre-slim
WORKDIR /app
COPY build/libs/blog3-0.0.1-SNAPSHOT.jar /app
EXPOSE 8099
ENV SPRING_DATASOURCE_URL=jdbc:postgresql://localhost:5432/travelApp
ENV SPRING_DATASOURCE_USERNAME=awos
ENV SPRING_DATASOURCE_PASSWORD=1234
CMD ["java", "-jar", "blog3-0.0.1-SNAPSHOT.jar"]