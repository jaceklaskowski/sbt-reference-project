scalacOptions ++= Seq("-deprecation", "-unchecked")

resolvers += Resolver.typesafeRepo("releases")

libraryDependencies += "org.scala-sbt" % "scripted-plugin" % sbtVersion.value
