scalaVersion := "2.12.6"
organization := "ru.example"
name := "example"
version := "0.1.0"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.5.21",
  "com.typesafe.akka" %% "akka-stream" % "2.5.21",
  "com.typesafe.akka" %% "akka-http" % "10.1.7"
)

enablePlugins(JavaAppPackaging, DockerPlugin)

dockerBaseImage := "openjdk:8-slim"
packageName in Docker := "myregistry.ru/webgreet"
dockerExposedPorts ++= Seq(8080)
dockerUpdateLatest := true