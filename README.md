# Slinky antd-native example
Demo of [React Native](https://facebook.github.io/react-native/) components developed by [antd](https://rn.mobile.ant.design/) and coded in [Scala](https://scala-lang.org/) through [Scala.js](https://www.scala-js.org), [Slinky](https://slinky.dev), [ScalablyTyped](https://github.com/oyvindberg/ScalablyTyped) and [Expo](https://expo.io).

## How to
### Build the app
Make sure you have [sbt](https://www.scala-sbt.org/) and [npm](https://www.npmjs.com/) installed.

First compile your Scala code to JavaScript by running:
```sh
$ sbt fastOptJS
```

Then, launch the app with Expo:
```sh
$ npm start
```

### See the app already published with Expo
Go to the [app Expo page](https://expo.io/@mcallisto/slinky-antd-native-example).

## Contribute

Help is needed, with the aim of mapping 100% of the antd-native components.

## Acknowledgements
`slinky-antd-native-example` is based on Slinky's [Expo Scala Template](https://github.com/shadaj/expo-template-scala).

This demo uses the Scala.js typings and the thin facades developed by Øyvind Raddum Berg:
*   [react-slinky](https://github.com/oyvindberg/ScalablyTyped/tree/master/facades/react-slinky)
*   [antd-native-slinky](https://github.com/oyvindberg/ScalablyTyped/tree/master/facades/antd-native-slinky)
