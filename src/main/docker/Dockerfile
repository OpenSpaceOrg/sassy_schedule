FROM openjdk:8-jre-alpine
LABEL maintainr="Jason Peper https://github.com/jasontrublu"
LABEL src="https://github.com/OpenSpaceOrg/sassy_schedule"

RUN adduser -D -u 1010 sassy
USER 1010

COPY maven/sassy-schedule.jar /
COPY entrypoint.sh /
ENTRYPOINT ["/entrypoint.sh"]

EXPOSE 9000 5005
