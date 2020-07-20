FROM maven:3.6.3-openjdk-11

WORKDIR /usr/src/app

COPY . /usr/src/app
RUN mvn package -Dmaven.test.skip=true

CMD [ "sh", "-c", "mvn  spring-boot:run" ]
