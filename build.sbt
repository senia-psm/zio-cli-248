scalaVersion := "3.3.0"

name := "test"

libraryDependencies ++= Seq(
  "dev.zio" %% "zio" % "2.0.15",
  "dev.zio" %% "zio-cli" % "0.6.0+21-7145a4c6-SNAPSHOT",
)

enablePlugins(JavaAppPackaging)

resolvers +=
  "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

resolvers +=
  "Sonatype OSS Snapshots 01" at "https://s01.oss.sonatype.org/content/repositories/snapshots"
