organization := "pl.japila.sbt"

name := "sbt-reference-project"

version := "1.0.0-SNAPSHOT"

scalaVersion := "2.11.1"

scalacOptions ++= Seq("-deprecation", "-unchecked")

publishMavenStyle := false

publishTo := {
  if (isSnapshot.value) Some(Classpaths.sbtPluginSnapshots)
  else Some(Classpaths.sbtPluginReleases)
}
