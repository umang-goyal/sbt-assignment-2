name := "project-hello-sbt-q2"

version := "1.0"

scalaVersion := "2.12.6"

import sbt._
import Keys._
object MyBuild extends Build{
lazy val root = project.in(file(".")).aggregates(welcomeimpl,util)
lazy val welcomeimpl = project.settings(libraryDependencies+="org.scalatest" %% "scalatest" % "3.1.0" % "test")
lazy val welcomeimpl = project.dependsOn(util)
lazy val util = project
}
