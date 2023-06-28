FROM test.docker.yimucloud.com:5000/metersphere/alpine-openjdk17-jre

LABEL maintainer="MC <haominchao@eyimu.com>"

ARG MS_VERSION=2.10.1
ARG DEPENDENCY=backend/target/dependency

COPY ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY ${DEPENDENCY}/META-INF /app/META-INF
COPY ${DEPENDENCY}/BOOT-INF/classes /app

# html 文件
COPY backend/src/main/resources/public /app/public

# 静态文件
COPY backend/src/main/resources/static /app/static


RUN mv /app/lib/ms-jmeter-core-*.jar /app/lib/ms-jmeter-core.jar


ENV JAVA_CLASSPATH=/app:/app/lib/ms-jmeter-core.jar:/opt/jmeter/lib/ext/*:/app/lib/*
ENV JAVA_MAIN_CLASS=io.metersphere.PerformanceApplication
ENV MS_VERSION=${MS_VERSION}
ENV JAVA_OPTIONS="-Dfile.encoding=utf-8 -Djava.awt.headless=true --add-opens java.base/jdk.internal.loader=ALL-UNNAMED --add-opens java.base/java.util=ALL-UNNAMED --add-opens java.base/java.lang=ALL-UNNAMED"


CMD ["/deployments/run-java.sh"]
