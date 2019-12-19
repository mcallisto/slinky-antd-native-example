package hello.world

import slinky.core._
import slinky.core.annotations.react
import slinky.core.facade.Hooks._
import slinky.native._

import scala.scalajs.js
import scala.scalajs.js.|
import scala.scalajs.js.Dynamic.literal

import typings.antdDashNative.AntdNativeFacade.{Button, _}
import typings.react.ScalableSlinky._
import typings.atAntDashDesignIconsDashReactDashNative.libFillMod.IconFillProps
import typings.atAntDashDesignIconsDashReactDashNative.libOutlineMod.IconOutlineProps
import typings.atAntDashDesignReactDashNative.PartialLocale
import typings.atAntDashDesignReactDashNative.libModalPropsTypeMod.Action
import typings.atBang88ReactDashNativeDashDrawerDashLayout.atBang88ReactDashNativeDashDrawerDashLayoutMod.{DrawerLayout, default}

@react object App {

  type Props = Unit

  val component = FunctionalComponent[Props] { _ =>
    val (isModalVisible, updateIsModalVisible) = useState(false)

    var ref: default | Null = new default {}

    val menus = (1 to 20).map(i => ListItem(ListItemProps())("Menu " + i).withKey(i.toString))

    Provider(ProviderProps(locale = PartialLocale(locale = "enUS")))(
      Drawer(DrawerProps(
        drawerRef = (ref = _),
        sidebar = ScrollView(List(ListProps())(menus)).toST)
      )(
        ScrollView(
          automaticallyAdjustContentInsets = false,
          showsHorizontalScrollIndicator = false,
          showsVerticalScrollIndicator = false
        )(
          List(ListProps(renderHeader = Text()("List header").toST))(
            ListItem(ListItemProps(
              extra = Icon(IconProps(name = "menu")).toST,
              onPress = _ => ref.asInstanceOf[DrawerLayout].openDrawer()))("Open drawer"),
            ListItem(ListItemProps(
              arrow = antdStrings.horizontal,
              onPress = _ => updateIsModalVisible(true)))("Open modal"),
            ListItem(ListItemProps(
              arrow = antdStrings.horizontal,
              onPress = _ => antdToast.success("Successful!")))("Launch success toast")
          ),
          View(
            style = literal(
              backgroundColor = "white",
              flex = 1,
              flexDirection = "column",
              justifyContent = "center",
              alignItems = "center"
            )
          )(
            InputItem(InputItemProps(placeholder = "input text")),
            InputItem(InputItemProps(
              `type` = antdStrings.password,
              placeholder = "password",
              error = true,
              onErrorClick = _ => antdToast.fail("Always wrong!"),
              last = true
            )),
            WingBlank(WingBlankProps(size = antdStrings.lg))(
              Button(ButtonProps(
                onPress = _ => antdToast.fail("Failure!"),
                `type` = antdStrings.primary
              ))("Launch fail toast")
            ),
            WhiteSpace(WhiteSpaceProps(size = antdStrings.xl)),
            Text(
              style = literal(fontSize = 30, color = "red")
            )("Hello, Slinky Native!"),
            IconFill(IconFillProps(name = "flag", size = 20))(),
            IconOutline(IconOutlineProps(name = "gift"))(),
            Icon(IconProps(name = "experiment", size = antdStrings.lg, color = "#A82"))()
          )
        )
      ),
      Modal(ModalProps(
        visible = isModalVisible,
        transparent = true,
        maskClosable = true,
        closable = false,
        title = "Basic modal",
        onClose = () => updateIsModalVisible(false),
        footer = js.Array(
          Action("Cancel", () => updateIsModalVisible(false), ""),
          Action("OK", () => updateIsModalVisible(false), ""))
      ))(Text()("Some contents..."))
    )
  }
}
