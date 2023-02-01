import Dependencies._

ThisBuild / crossScalaVersions := Seq("3.2.1", "2.13.10")
ThisBuild / scalaVersion       := (ThisBuild / crossScalaVersions).value.head
ThisBuild / version            := "0.1.0-SNAPSHOT"
ThisBuild / organization       := "fr.davit"

lazy val root = (project in file("."))
  .settings(
    name := "scala3-playground",
    libraryDependencies += munit % Test
  )