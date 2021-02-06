scalaVersion := "2.13.3"


name := "hello-world"
organization := "ch.epfl.scala"
version := "1.0"



libraryDependencies += "org.scala-lang.modules" %% "scala-parser-combinators" % "1.1.2"

//Added dependencies
libraryDependencies += "org.apache.hadoop" % "hadoop-mapreduce-client-core" % "3.2.1"
libraryDependencies += "org.apache.hadoop" % "hadoop-common" % "3.2.1"

// https://mvnrepository.com/artifact/org.apache.hadoop/hadoop-mapreduce-client-jobclient
libraryDependencies += "org.apache.hadoop" % "hadoop-mapreduce-client-jobclient" % "3.2.1" % "provided"
