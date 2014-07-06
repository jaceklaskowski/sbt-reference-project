publishMavenStyle := false

publishTo := {
  import Classpaths._
  val resolver = if (isSnapshot.value) sbtPluginSnapshots else sbtPluginReleases
  Some(resolver)
}
