scalacOptions ++= Seq("-deprecation", "-unchecked")

resolvers += Resolver.typesafeIvyRepo("releases")

libraryDependencies += "org.scala-sbt" % "scripted-plugin" % sbtVersion.value
