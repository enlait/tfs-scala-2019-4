sbt docker:publishLocal

docker run -p 8080:8080 --rm --name=greeter myregistry.ru/webgreet

docker stop greeter