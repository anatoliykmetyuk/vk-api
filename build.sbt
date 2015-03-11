sbtVersion   := "0.13.7"
scalaVersion := "2.11.5"

libraryDependencies ++= Seq(
  "commons-io" % "commons-io" % "2.4",
  "org.apache.httpcomponents" % "httpclient" % "4.4",
  "org.json4s" %% "json4s-native" % "3.2.11",
  "org.apache.spark" %% "spark-mllib" % "1.2.1"
)