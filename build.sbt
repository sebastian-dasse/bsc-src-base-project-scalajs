/* Turn this project into a Scala.js project by importing these settings */
enablePlugins(ScalaJSPlugin)

name := "Scala.js Base Project"

version := "1.0"

scalaVersion := "2.11.7"

scalacOptions ++= Seq("-encoding", "UTF-8", "-unchecked", "-deprecation", "-feature")

libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "0.8.0",
  "be.doeraene" %%% "scalajs-jquery" % "0.8.0",
  "com.lihaoyi" %%% "scalatags" % "0.5.2",
  "com.lihaoyi" %%% "utest" % "0.3.0" % "test"
)

/* Collect all JavaScript dependencies in one file */
skip in packageJSDependencies := false

/* Make the DOM available for the runtime, that is for Rhino or Node.js. */
jsDependencies += RuntimeDOM

testFrameworks += new TestFramework("utest.runner.Framework")

/* So the main() is auto-detected and needs not to be included in the html */
persistLauncher in Compile := true

/* No main() for tests */
persistLauncher in Test := false

EclipseKeys.withSource := true
