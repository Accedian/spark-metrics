resolvers += "Maven2 repository" at "https://repo1.maven.org/maven2/"

resolvers += "sonatype-releases" at "https://oss.sonatype.org/content/repositories/releases/"

addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.1.1")
/**
  * Required for ScalaTest
  * Note, placed resolver here and build.sbt to resolve plugin when building from inside an SDK container.
  */
resolvers += "Artima Maven Repository" at "http://repo.artima.com/releases"
addSbtPlugin("com.artima.supersafe" % "sbtplugin" % "1.1.3")
