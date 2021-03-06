name := "OracleStackObjectDetail-Back"

version := "1.0"

scalaVersion := "2.12.1"

val akkaVersion = "10.0.5"

resolvers ++= Seq("Spray Repository" at "http://dev.rtmsoft.me/nexus/content/groups/public/")

libraryDependencies ++= Seq(
  "com.wingtech" % "ojdbc" % "7",
  "com.typesafe.akka" %% "akka-http" % akkaVersion,
  "com.typesafe.akka" %% "akka-http-spray-json" % akkaVersion,
  "com.typesafe.akka" %% "akka-http-testkit" % akkaVersion,
  "org.scalactic" %% "scalactic" % "3.0.1",
  "org.scalatest" %% "scalatest" % "3.0.1" % "test"
)

mainClass in assembly := Some("org.shinhwagk.Bootstrap")
assemblyOutputPath in assembly := baseDirectory.value / "OracleStackQuery.jar"