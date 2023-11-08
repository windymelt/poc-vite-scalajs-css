import org.scalajs.linker.interface.ModuleSplitStyle

lazy val root = project
  .in(file("."))
  .enablePlugins(ScalaJSPlugin)
  .settings(
    name := "poc-vite-scalajs-css",
    scalaVersion := "3.2.2",
    scalacOptions ++= Seq("-encoding", "utf-8", "-deprecation", "-feature"),

    scalaJSUseMainModuleInitializer := true,
    scalaJSLinkerConfig ~= {
      _.withModuleKind(ModuleKind.ESModule)
        .withModuleSplitStyle(ModuleSplitStyle.SmallModulesFor(List("example")))
    },

    libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "2.4.0",
    libraryDependencies ++= Seq(
      // build via `stc --includeProject=true`
      // XXX: This not working. Vite cannot find css file addressed in this module
      "org.scalablytyped" %%% "poc-vite-scalajs-css" % "0.1.0-SNAPSHOT-7b86ac",
    ),
  )
