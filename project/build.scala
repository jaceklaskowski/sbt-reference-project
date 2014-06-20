import sbt._
import Keys._

trait Dependencies {
  val jodaTime      = "joda-time"    % "joda-time"    % "2.3"
  val jodaConvert   = "org.joda"     % "joda-convert" % "1.6"
  val config        = "com.typesafe" % "config"       % "1.2.0"

  val scalalogging  = "com.typesafe.scala-logging" %% "scala-logging-slf4j" % "2.1.2"
  val logback       = "ch.qos.logback"             %  "logback-classic"     % "1.1.2"

  val scalatest     = "org.scalatest"          %% "scalatest"        % "2.1.3"
  val mockito       = "org.mockito"            %  "mockito-core"     % "1.9.5"
  val awaitility    = "com.jayway.awaitility"  %  "awaitility-scala" % "1.5.0"

  def akkaModuleId(name: String, isTest: Boolean = false) = {
    val m = "com.typesafe.akka" %% s"akka-$name" % "2.3.3"
    if (isTest) m % Test else m
  }
  val akkaActor    = akkaModuleId("actor")
  val akkaSlf4j    = akkaModuleId("slf4j")
  val akkaDataflow = akkaModuleId("dataflow")
  val akkaTestkit  = akkaModuleId("testkit", true)

  def sprayModuleId(name: String, isTest: Boolean = false) = {
    val m = "io.spray" %% s"spray-$name" % "1.3.1"
    if (isTest) m % Test else m
  }
  val sprayCan     = sprayModuleId("can")
  val sprayRouting = sprayModuleId("routing")
  val sprayTestkit = sprayModuleId("testkit", true)
}

object build extends Build with Dependencies {
}
