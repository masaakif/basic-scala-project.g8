name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2-core" % "latest.integration" % "test",
  "org.specs2" %% "specs2-scalaz-core" % "latest.integration" % "test",
  "org.scalacheck" %% "scalacheck" % "latest.integration" % "test",
  "junit" % "junit" % "latest.integration" % "test",
  "org.hamcrest" % "hamcrest-all" % "latest.integration" % "test"
//  "org.pegdown" % "pegdown" % "latest.integration" % "test"
)

scalacOptions in Test ++= Seq("-Yrangepos")

// Read here for optional dependencies:
// https://etorreborre.github.io/specs2/guide/SPECS2-3.8.3/org.specs2.guide.Installation.html#other-dependencies

testOptions in Test += Tests.Argument("junitxml", "html", "console")

resolvers ++= Seq("snapshots", "releases").map(Resolver.sonatypeRepo)

initialCommands := "import $organization$.$name;format="lower,word"$._"
