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
//    val htmlText = "<!DOCTYPE html>" + ScalaTagsExample.helloScalaTags()
//    val htmlText = ScalaTagsExample.helloScalaTags()
//    val htmlText = ScalaTagsExample.helloScalaTagsWithStyle()
    val htmlText = ScalaTagsExample.helloScalaTagsWithFlowAndFunctions()
//    val htmlText = ScalaTagsExample.helloScalaTagsSanatized()
//    val htmlText = ScalaTagsExample.helloScalaTagsUnSanatized()
//    val htmlText = ScalaTagsExample.helloScalaTagsLayouts()
//    val htmlText = ScalaTagsExample.helloScalaTagsInheritance()
//    val htmlText = ScalaTagsExample.helloScalaTagsInheritance()

    println(htmlText)
    dom.document.body.innerHTML = htmlText.toString()

//    jQuery("#click-me-button").click(addClickedMessage _)
    jQuery("""<button type="button">Click me!</button>""")
      .click(addClickedMessage _)
      .appendTo(jQuery("body"))
    jQuery("body").append("<p>Hello world!</p>")
  }
}