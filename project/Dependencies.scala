import sbt._

object Dependencies {
  lazy val dependencies: Seq[ModuleID] =
    Seq(
      scalaReflect, scalatest, scalacheck, scalacheckShapeless, testcontainers,
      airframe, logging, pureConfig,
      simulacrum, refined, monocle, shapeless,
      cats, mouse,
      fs2,
      scalaUri, betterFiles,
      play, playJsonDerivedCodes,
      circe,
      scalaDateTime
    ).flatten

  lazy val scalaReflect: Seq[ModuleID] = Seq(
    "org.scala-lang" % "scala-reflect" % BuildProperties("scala.version")
  )
  
  lazy val scalatest: Seq[ModuleID] = Seq(
    "org.scalatest" %% "scalatest" % "3.0.7" % "test, it"
  )

  lazy val scalacheck: Seq[ModuleID] = Seq(
    "org.scalacheck" %% "scalacheck" % "1.14.0" % "test, it"  
  )

  lazy val scalacheckShapeless: Seq[ModuleID] = Seq(
    "com.github.alexarchambault" %% "scalacheck-shapeless_1.14" % "1.2.2"
  )
  
  lazy val testcontainers: Seq[ModuleID] = Seq(
    "org.testcontainers" % "testcontainers" % "1.11.2" % "test, it"
  )
  
  lazy val airframe: Seq[ModuleID] = Seq(
    "org.wvlet.airframe" %% "airframe-log" % "19.5.0"
  )

  lazy val logging: Seq[ModuleID] = Seq(
    "com.typesafe.scala-logging" %% "scala-logging" % "3.9.2",
    "org.slf4j" % "log4j-over-slf4j" % "1.7.26",
    "ch.qos.logback" % "logback-classic" % "1.2.3"
  )
  
  lazy val pureConfig: Seq[ModuleID] = {
    val version = "0.11.0"

    Seq(
      "com.github.pureconfig" %% "pureconfig",
      "com.github.pureconfig" %% "pureconfig-http4s"
    ).map(_ % version)
  }

  lazy val simulacrum: Seq[ModuleID] = Seq(
    "com.github.mpilquist" %% "simulacrum" % "0.16.0"
  )
  
  lazy val refined: Seq[ModuleID] = {
    val version = "0.9.5"

    Seq(
      "eu.timepit" %% "refined",
      "eu.timepit" %% "refined-pureconfig",
      "eu.timepit" %% "refined-cats"
    ).map(_ % version)
  }

  lazy val monocle: Seq[ModuleID] = {
    val version = "1.5.0"

    Seq(
      "com.github.julien-truffaut" %% "monocle-law"
    ).map(_ % version % "test, it") ++ Seq(
      "com.github.julien-truffaut" %% "monocle-core",
      "com.github.julien-truffaut" %% "monocle-macro",
      "com.github.julien-truffaut" %% "monocle-generic"
    ).map(_ % version)
  }

  lazy val shapeless: Seq[ModuleID] = Seq(
    "com.chuusai" %% "shapeless" % "2.3.3"
  )

  lazy val cats: Seq[ModuleID] = {
    val version = "1.6.0"

    Seq(
      "org.typelevel" %% "cats-laws",
      "org.typelevel" %% "cats-testkit"
    ).map(_ % version % "test, it") ++ Seq(
      "org.typelevel" %% "cats-core"
    ).map(_ % version) ++ Seq(
      "org.typelevel" %% "cats-effect" % "1.3.0"
    )
  }
  
  lazy val mouse: Seq[ModuleID] = Seq(
    "org.typelevel" %% "mouse" % "0.21"
  )

  lazy val fs2: Seq[ModuleID] = {
    val version = "1.0.4"
    
    Seq(
      "co.fs2" %% "fs2-core" % version,
      "co.fs2" %% "fs2-io" % version,
      "co.fs2" %% "fs2-reactive-streams" % version
    )
  }

  lazy val scalaUri: Seq[ModuleID] = Seq(
    "io.lemonlabs" %% "scala-uri" % "1.4.5"
  )
  
  lazy val betterFiles: Seq[ModuleID] = Seq(
    "com.github.pathikrit" %% "better-files" % "3.7.1"
  )
  
  lazy val play: Seq[ModuleID] = {
    val version = "2.7.3"
    
    Seq(
      "com.typesafe.play" %% "play-json"
    ).map(_ % version)
  }

  lazy val playJsonDerivedCodes: Seq[ModuleID] = Seq("org.julienrf" %% "play-json-derived-codecs" % "4.0.1")

  lazy val circe: Seq[ModuleID] = {
    val version = "0.11.1"

    Seq(
      "io.circe" %% "circe-testing",
      "io.circe" %% "circe-literal"
    ).map(_ % version % "test, it") ++ Seq(
      "io.circe" %% "circe-core",
      "io.circe" %% "circe-generic",
      "io.circe" %% "circe-generic-extras",
      "io.circe" %% "circe-shapes",
      "io.circe" %% "circe-parser",
      "io.circe" %% "circe-refined"
    ).map(_ % version)
  }
  
  lazy val scalaDateTime: Seq[ModuleID] = Seq("com.github.nscala-time" %% "nscala-time" % "2.22.0")
}