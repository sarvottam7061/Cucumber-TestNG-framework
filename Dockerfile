FROM  markhobson/maven-chrome

WORKDIR /usr/app


COPY ./ ./
WORKDIR /usr/app/
ENTRYPOINT ['mvn','clean','install']

#docker build -t framework/cucumber .
#docker run -it -v %cd%/target/cucumber-reports/:/usr/app/target/cucumber-reports/ framework/cucumber
#docker run -it --entrypoint /bin/sh framework/cucumber