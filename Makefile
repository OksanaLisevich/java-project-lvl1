setup:
	gradle wrapper --gradle-version 7.3.3

clean:
	./gradlew clean

build:
	./gradlew clean build

install:
	./gradlew clean install

run:
	./gradlew run

run-dist:
	./build/install/app/bin/app

check-updates:
	./gradlew dependencyUpdates