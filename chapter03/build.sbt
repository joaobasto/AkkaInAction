ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.9"

val AkkaVersion = "2.6.20"
val LogbackVersion = "1.2.3"
val ScalaVersion = "2.13.9"
val AkkaManagementVersion = "1.1.4"
val AkkaProjectionVersion = "1.2.2"
val ScalikeJdbcVersion = "3.5.0"
val AkkaHttpVersion = "10.2.9"
val AkkaGRPC = "2.0.0"
val ScalaTest = "3.1.4"
val JacksonVersion = "2.11.4"
val AkkaStreamAlpakka = "4.0.0"
val AkkaStreamKafka = "3.0.1"

lazy val root = (project in file("."))
  .settings(
    scalaVersion := ScalaVersion,
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-actor-typed" % AkkaVersion,
      "com.typesafe.akka" %% "akka-actor" % AkkaVersion,
      "ch.qos.logback" % "logback-classic" % LogbackVersion,
      "com.typesafe.akka" %% "akka-actor-testkit-typed" % AkkaVersion % Test,
      "org.scalatest" %% "scalatest" % ScalaTest % Test,
    )
  )