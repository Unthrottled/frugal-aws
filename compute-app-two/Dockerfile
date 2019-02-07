FROM node:10.12.0

WORKDIR /compute-app

ADD package.json .

RUN npm install

ADD . .

ENTRYPOINT ["node", "./bin/www"]