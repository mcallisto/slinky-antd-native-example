enablePlugins(ScalaJSPlugin)

name := "app"

scalaVersion := "2.12.8"

resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")

libraryDependencies ++= Seq(
  "me.shadaj" %%% "slinky-native" % "0.6.3",
  "me.shadaj" %%% "slinky-hot" % "0.6.3",
  ScalablyTyped.A.`ant-design__react-native`,
  ScalablyTyped.A.`ant-design__icons-react-native`,
  ScalablyTyped.B.`bang88__react-native-drawer-layout`,
  ScalablyTyped.A.`antd-native-slinky-facade`,
  ScalablyTyped.E.`expo-font`
)

scalacOptions += "-P:scalajs:sjsDefinedByDefault"

addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.1" cross CrossVersion.full)

scalaJSModuleKind := ModuleKind.CommonJSModule
