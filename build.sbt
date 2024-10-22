val sparkVersion = "3.5.3"

lazy val root = (project in file("."))
  .settings(
    name := "spark-metrics",
    organization := "com.banzaicloud",
    scalaVersion := "2.12.20",
    version := "3.5.3-1.0.0",
    libraryDependencies ++= Seq(
      "io.prometheus" % "simpleclient" % "0.16.0",
      "io.prometheus" % "simpleclient_dropwizard" % "0.16.0",
      "io.prometheus" % "simpleclient_pushgateway" % "0.16.0",
      "io.dropwizard.metrics" % "metrics-core" % "4.2.28",
      "org.apache.spark" %% "spark-core" % sparkVersion % "provided",
      "org.slf4j" % "slf4j-api" % "1.7.36",
      "com.google.guava" % "guava" % "14.0.1",
      "com.novocode" % "junit-interface" % "0.11" % Test
    )
  )


publishMavenStyle := true


publishTo := {
  if (isSnapshot.value)
    Some(Resolver.file("file",  new File( "maven-repo/snapshots" )) )
  else
    Some(Resolver.file("file",  new File( "maven-repo/releases" )) )
}