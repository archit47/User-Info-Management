enablePlugins(ScalaJSPlugin)

name := "user-info-management-system"

version := "1.0"

scalaVersion := "2.11.8"


resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"
resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"

libraryDependencies ++= {
  val akkaV       = "2.4.7"
  Seq(
    "com.typesafe.akka" %% "akka-actor" % akkaV withSources() withJavadoc(),
    "com.typesafe.akka" %% "akka-stream" % akkaV withSources() withJavadoc(),
    "com.typesafe.akka" %% "akka-agent" % akkaV withSources() withJavadoc(),
    "com.typesafe.akka" %% "akka-http-experimental" % akkaV withSources() withJavadoc(),
    "com.typesafe.akka" %% "akka-http-core" % akkaV withSources() withJavadoc(),
    "com.typesafe.akka" %% "akka-http-core-experimental" % "1.0" withSources() withJavadoc(),
    "com.typesafe.akka" %% "akka-remote" % akkaV withSources() withJavadoc(),
    "com.typesafe.akka" %% "akka-http-spray-json-experimental" % akkaV withSources() withJavadoc(),
    "com.typesafe.akka" %% "akka-http-testkit" % akkaV withSources() withJavadoc()
  )
}
libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.0"
libraryDependencies += "be.doeraene" %%% "scalajs-jquery" % "0.9.0"

scalaJSUseRhino in Global := false

skip in packageJSDependencies := false
jsDependencies +=
  "org.webjars" % "jquery" % "2.1.4" / "2.1.4/jquery.js"