FROM nginx:1.14
MAINTAINER Alex Simons "alexsimons9999@gmail.com"

RUN apt-get update
RUN apt-get install openssl

ADD certGen.sh .
RUN chmod +x certGen.sh
RUN ./certGen.sh

RUN mkdir -p /etc/nginx/ssl
RUN mv fullchain.pem /etc/nginx/ssl/fullchain.pem
RUN mv privkey.pem /etc/nginx/ssl/privkey.pem

#COPY errors/ /usr/share/nginx/html/errors
#COPY nginx.conf /etc/nginx/nginx.conf
