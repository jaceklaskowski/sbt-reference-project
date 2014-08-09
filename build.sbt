name := "sbt-reference-project"

scalaVersion := "2.11.2"

crossScalaVersions := Seq("2.10.4", "2.11.2")

scalacOptions ++= Seq(
  "-target:jvm-1.7",
  "-encoding", "UTF-8",
  "-deprecation",
  "-feature",
  "-unchecked",
  "-Xlint",
  "-Ywarn-adapted-args",
  "-Ywarn-value-discard",
  "-Ywarn-inaccessible",
  "-Ywarn-dead-code"
)

scalacOptions := {
  CrossVersion.partialVersion(scalaVersion.value) match {
    case Some((2, 10)) =>
      scalacOptions.value
    case Some((2, n)) if n >= 11 =>
      scalacOptions.value :+ "-Ywarn-unused-import"
  }
}

licenses += ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0.html"))

resolvers ++= Seq(
  Resolver.mavenLocal,
  Resolver.sbtPluginRepo("snapshots"),
  Resolver.sonatypeRepo("snapshots"),
  Resolver.typesafeRepo("snapshots"),
  Resolver.typesafeRepo("releases"),
  Resolver.typesafeIvyRepo("releases")
)

lazy val a = japilaProject("core")

lazy val b = japilaProject("main")

shellPrompt <<= ShellPrompt.buildShellPrompt
