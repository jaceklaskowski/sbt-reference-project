organization := "pl.japila.sbt"

name := "sbt-reference-project"

scalaVersion := "2.11.1"

crossScalaVersions := Seq("2.10.4", "2.11.1")

scalacOptions ++= Seq("-deprecation", "-unchecked")

licenses += ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0.html"))

resolvers ++= Seq(
  Resolver.mavenLocal,
  Resolver.sbtPluginRepo("snapshots"),
  Resolver.sonatypeRepo("snapshots"),
  Resolver.typesafeRepo("snapshots"),
  Resolver.typesafeIvyRepo("releases")
)
