publishMavenStyle := false

publishTo := {
  import Classpaths._
  val r = if (isSnapshot.value) sbtPluginSnapshots else sbtPluginReleases
  Some(r)
}
