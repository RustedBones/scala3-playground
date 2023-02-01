import Dependencies._

ThisBuild / scalaVersion     := "3.2.1"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "fr.davit"

lazy val root = (project in file("."))
  .settings(
    name := "scala3-playground",
    libraryDependencies += munit % Test
  )