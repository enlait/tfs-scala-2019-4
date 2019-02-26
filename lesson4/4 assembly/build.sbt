scalaVersion := "2.12.6"
organization := "ru.example"
name := "example"
version := "0.1.0"

libraryDependencies ++= Seq(
  "com.typesafe" % "config" % "1.3.3",
  "org.backuity.clist" %% "clist-core" % "3.4.0",
  "org.backuity.clist" %% "clist-macros" % "3.4.0" % "provided"
)