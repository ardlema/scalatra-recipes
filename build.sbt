organization := "org.ardlema"

name := "scalatra-recipes"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.9.2"

seq(webSettings :_*)

classpathTypes ~= (_ + "orbit")

libraryDependencies ++= Seq(
  "com.escalatesoft.subcut" %% "subcut" % "2.0-SNAPSHOT",
  "org.scalatra" % "scalatra" % "2.1.1",
  "org.scalatra" % "scalatra-scalate" % "2.1.1",
  "org.scalatra" % "scalatra-specs2" % "2.1.1" % "test",
  "net.liftweb" %% "lift-json" % "2.5-M1",
  "ch.qos.logback" % "logback-classic" % "1.0.6" % "runtime",
  "org.eclipse.jetty" % "jetty-webapp" % "8.1.7.v20120910" % "container",
  "me.prettyprint" % "hector-core" % "1.0-5",
  "me.prettyprint" % "hector-test" % "1.0-5",
  "org.eclipse.jetty.orbit" % "javax.servlet" % "3.0.0.v201112011016" % "container;provided;test" artifacts (Artifact("javax.servlet", "jar", "jar"))
)

resolvers ++= Seq("Scala-Tools Maven2 Snapshots Repository" at "https://oss.sonatype.org/content/groups/public/",
                  "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/")
