name := "prog-in-scala"

version := "0.1"

scalaVersion := "2.13.3"

resolvers ++= Seq(
  "OSS Sonatype" at "https://oss.sonatype.org/content/groups/public/"
)

libraryDependencies += "org.scalactic" %% "scalactic" % "3.2.0"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.0" % "test"
