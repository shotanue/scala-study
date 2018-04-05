name := "scala-study"

version := "0.1"

scalaVersion := "2.12.5"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % "test"
libraryDependencies ++= Seq("org.specs2" %% "specs2-core" % "4.0.2" % "test")

scalacOptions in Test ++= Seq("-Yrangepos")