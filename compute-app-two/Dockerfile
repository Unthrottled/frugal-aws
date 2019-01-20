FROM node:10.14.1

WORKDIR /app

ADD package.json .
RUN npm install

ADD . .

RUN ln -s /usr/bin/nodejs /usr/bin/node

ENTRYPOINT ["node", "./bin/www"]