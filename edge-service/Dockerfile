FROM node:10.14.1 as static-site-builder
WORKDIR /

ADD ./static-site /static-site

WORKDIR /static-site

RUN npm run build

FROM nginx:1.14
MAINTAINER Alex Simons "alexsimons9999@gmail.com"

RUN apt-get update
RUN apt-get install openssl

ADD /edge-service/certGen.sh .
RUN chmod +x certGen.sh
RUN ./certGen.sh

RUN mkdir -p /etc/nginx/ssl
RUN mv fullchain.pem /etc/nginx/ssl/fullchain.pem
RUN mv privkey.pem /etc/nginx/ssl/privkey.pem

COPY --from=static-site-builder /static-site/build /static-site
COPY /edge-service/nginx.conf /etc/nginx/nginx.conf
