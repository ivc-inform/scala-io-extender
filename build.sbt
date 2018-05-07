name := "scala-io-extender"

version := "1.5.0.1"

organization := "com.simplesys"

val scalaTest = "org.scalatest" %% "scalatest" % "3.0.4"
val common = "com.simplesys" %% "common" % "1.5.0.1"
val logBackWrapper = "com.simplesys" %% "logback-wrapper" % "1.5.0.1"
val javaxTransaction = "javax.transaction" % "jta" % "1.1"
val scalaArm = "com.jsuereth" %% "scala-arm" %  "2.0"
val scalaParserCombinators = "org.scala-lang.modules" %% "scala-parser-combinators" % "1.0.5"

libraryDependencies ++= Seq(
    logBackWrapper,
    javaxTransaction,
    scalaArm,
    scalaParserCombinators,
    scalaTest % Test
)

scalaVersion := "2.12.5"
