name := "project1"
organization := "ca.mcit.bigdata"

version := "1.0-SNAPSHOT"

scalaVersion := "2.12.6"

libraryDependencies ++= Seq(
  "com.github.scopt" %% "scopt" % "3.5.0",
  "com.typesafe" % "config" % "1.3.1"
)

assemblyJarName in assembly := "something.jar"