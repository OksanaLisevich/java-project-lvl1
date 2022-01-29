setup:
	gradle wrapper --gradle-version 7.3.3

clean:
	./gradlew clean

install:
	./gradlew clean install

run:
	./gradlew run

run-dist:
	./build/install/app/bin/app

check-updates:
	./gradlew dependencyUpdates

lint:
	./gradlew checkstyleMain

build: lint
	./gradlew clean build

.PHONY: build