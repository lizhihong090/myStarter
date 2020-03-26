#FROM springio/demo:latest
#VOLUME /tmp
#ADD swaggerDemo-0.0.1-SNAPSHOT.jar.jar app.jar
#RUN sh -c 'touch /app.jar'
#ENV JAVA_OPTS=""
#ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]
FROM java:8
VOLUME /tmp
ADD demo-0.0.1-SNAPSHOT.jar app.jar
RUN bash -c 'touch /swapping.jar'

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
