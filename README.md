# Slinky antd-native example
Demo of [React Native](https://facebook.github.io/react-native/) components developed by [antd](https://rn.mobile.ant.design/) and coded in [Scala](https://scala-lang.org/) through [Scala.js](https://www.scala-js.org), [Slinky](https://slinky.dev), [ScalablyTyped](https://github.com/oyvindberg/ScalablyTyped) and [Expo](https://expo.io).

## Try the demo app
Go to the [app Expo page](https://expo.io/@mcallisto/slinky-antd-native-example).

## Requirements
Make sure you have [sbt](https://www.scala-sbt.org) and [yarn](https://yarnpkg.com) installed.

### Install the Expo CLI
```sh
$ yarn global add expo-cli
```

## How to
### Run in development

First compile your Scala code to JavaScript by running:
```sh
$ sbt fastOptJS
```

Then, launch the app with Expo:
```sh
$ expo start
```


## Contribute

Help is needed, with the aim of mapping 100% of the antd-native components.

## Acknowledgements
`slinky-antd-native-example` is based on Slinky's [Expo Scala Template](https://github.com/shadaj/expo-template-scala).

This demo uses the Scala.js typings developed by Øyvind Raddum Berg, see more demos at [SlinkyDemos](https://github.com/ScalablyTyped/SlinkyDemos).
