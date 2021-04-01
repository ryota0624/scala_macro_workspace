name := "scala_macro_workspace"

version := "0.1"

scalaVersion := "2.13.5"

import sbt.Keys.{libraryDependencies, scalacOptions}

name := "scala_validation"

version := "0.1"

lazy val application = (project in file("application"))
  .dependsOn(macroProject)
  .settings(
    scalaVersion := "2.13.5",
    scalacOptions ++= Seq(
      "-Ymacro-annotations",
    ),
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.2.2" % Test,
      "org.scalatestplus" %% "scalacheck-1-14" % "3.2.2.0" % Test
    )
  )

lazy val macroProject = (project in file("macro"))
  .settings(
    scalaVersion := "2.13.5",
    libraryDependencies += "org.scalameta" %% "scalameta" % "4.4.10",
    scalacOptions ++= Seq(
      "-Ymacro-annotations",
    )
  )
