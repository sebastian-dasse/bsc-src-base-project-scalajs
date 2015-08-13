package base.webapp

import scala.scalajs.js.JSApp
import org.scalajs.dom
import dom.document
import scala.scalajs.js.annotation.JSExport
import org.scalajs.jquery.jQuery

object BaseApp extends JSApp {
  def main(): Unit = {
//    println("Hello world!")

//    appendPar(document.body, "Hello world!")

//    jQuery("body").append("<p>Hello world!</p>")

    jQuery(setupUI _)
//    setupUI() // why not directly call the function?
  }
  
//  def appendPar(targetNode: dom.Node, text: String): Unit = {
//    val parNode = document.createElement("p")
//    val textNode = document.createTextNode(text)
//    parNode.appendChild(textNode)
//    targetNode.appendChild(parNode)
//  }

//  @JSExport
  def addClickedMessage(): Unit = {
//    appendPar(document.body, "You clicked the button!")
  jQuery("body").append("<p>You clicked the button!</>")
  }

  def setupUI(): Unit = {
//    jQuery("#click-me-button").click(addClickedMessage _)
    jQuery("""<button type="button">Click me!</button>""")
      .click(addClickedMessage _)
      .appendTo(jQuery("body"))
    jQuery("body").append("<p>Hello world!</p>")
  }
}