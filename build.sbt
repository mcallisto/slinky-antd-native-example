enablePlugins(ScalaJSPlugin)

name := "app"

scalaVersion := "2.12.8"

resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")

libraryDependencies += "me.shadaj" %%% "slinky-native" % "0.6.3"
libraryDependencies += "me.shadaj" %%% "slinky-hot" % "0.6.3"
libraryDependencies += ScalablyTyped.A.`ant-design__react-native`
libraryDependencies += ScalablyTyped.A.`ant-design__icons-react-native`
libraryDependencies += ScalablyTyped.B.`bang88__react-native-drawer-layout`
libraryDependencies += ScalablyTyped.A.`antd-native-slinky-facade`

scalacOptions += "-P:scalajs:sjsDefinedByDefault"

addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.1" cross CrossVersion.full)

scalaJSModuleKind := ModuleKind.CommonJSModule
