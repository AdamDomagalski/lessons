name := "szkolenie"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  "org.pegdown" % "pegdown" % "1.2.1"
)     

play.Project.playScalaSettings
