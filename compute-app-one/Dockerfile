FROM gradle:alpine as packager
MAINTAINER Alex Simons "alexsimons9999@gmail.com"
USER root
WORKDIR /app
#Add rest of source code :)
ADD . .

RUN gradle clean bootJar

#Runnable image
FROM java:8u111-alpine

WORKDIR /app

COPY --from=packager /app/build/libs /app

ENTRYPOINT ["java", "-Xdebug","-Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=7896","-jar", "compute-app-one-1.0.0.jar"]


