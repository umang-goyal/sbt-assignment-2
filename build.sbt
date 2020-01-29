name := "project-hello-sbt-q2"

version := "1.0"

scalaVersion := "2.12.6"

import sbt._
import Keys._
object MyBuild extends Build{
lazy val root = project.in(file(".")).aggregates(welcome-impl,util)
lazy val welcome-impl = project.settings(libraryDependencies+="org.scalatest" %% "scalatest" % "3.1.0" % "test")
lazy val welcome-impl = project.dependsOn(util)
lazy val util = project
}
