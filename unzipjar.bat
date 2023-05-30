@echo off

start unzip ./framework/eureka/target/*.jar -d ./framework/eureka/target/dependency/
start unzip ./framework/gateway/target/*.jar -d ./framework/gateway/target/dependency/
start unzip ./performance-test/backend/target/*.jar -d ./performance-test/backend/target/dependency/
start unzip ./project-management/backend/target/*.jar -d ./project-management/backend/target/dependency/
start unzip ./report-stat/backend/target/*.jar -d ./report-stat/backend/target/dependency/
start unzip ./system-setting/backend/target/*.jar -d ./system-setting/backend/target/dependency/
start unzip ./test-track/backend/target/*.jar -d ./test-track/backend/target/dependency/
start unzip ./workstation/backend/target/*.jar -d ./workstation/backend/target/dependency/
start unzip ./api-test/backend/target/*.jar -d ./api-test/backend/target/dependency/

