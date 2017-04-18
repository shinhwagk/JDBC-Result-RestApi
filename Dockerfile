FROM centos:latest

ADD jdk-8u112-linux-x64.rpm .
RUN rpm -ivh jdk-8u112-linux-x64.rpm

ADD sbt-0.13.13.tgz .
ENV PATH /sbt-launcher-packaging-0.13.13/bin:$PATH

RUN mkdir query
WORKDIR query

ADD . .

EXPOSE 8081
CMD sbt test:compile && sbt test && sbt assembly && java -jar OracleStackObjectDetail-Back.jar