import Dependencies._

ThisBuild / scalaVersion     := "3.1.0"
ThisBuild / version          := "0.1.0"
ThisBuild / organization     := "com.ktedon"
ThisBuild / organizationName := "ktedonx"

scalaJSUseMainModuleInitializer := true

lazy val root = (project in file("."))
  .enablePlugins(ScalaJSPlugin)
  .settings(
    name := "jetvista",
    libraryDependencies += scalaTest % Test
  )

// https://mvnrepository.com/artifact/org.typelevel/cats-core
libraryDependencies += "org.typelevel" %%% "cats-core" % "2.7.0"
// https://mvnrepository.com/artifact/org.typelevel/cats-collections-core
libraryDependencies += "org.typelevel" %%% "cats-collections-core" % "0.9.3"





// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
