FROM alpine
RUN apk add openjdk21  \
    && apk add maven \
    && wget https://github.com/allure-framework/allure2/releases/download/2.24.0/allure-2.24.0.tgz \
    && tar -zxvf allure-2.24.0.tgz \
    && mv allure-2.24.0 /opt/allure \
    && ln -s /opt/allure/bin/allure /usr/bin/allure
WORKDIR /FullProject
ADD . .