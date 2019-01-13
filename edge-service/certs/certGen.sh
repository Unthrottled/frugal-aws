#!/bin/sh
openssl genrsa -passout pass:password1 -des3 -out privkey.pem 1024

openssl req -subj '/CN=localhost.io/O=BEST COMPANY LTD./C=US' -passin pass:password1 -new -key privkey.pem -out server.csr

cp privkey.pem privkey.pem.org

openssl rsa -passin pass:password1 -in privkey.pem.org -out privkey.pem

openssl x509 -req -days 365 -in server.csr -signkey privkey.pem -out fullchain.pem
