package example

import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object Main {
  @JSImport("@find/**/partial.css")
  @js.native
  private def importStyle(): Unit = js.native
  importStyle()

  @main
  def helloWorld(): Unit =
    dom.document.querySelector("#app").innerHTML = s"""
    <div>
      <h1>Hello <p class="emph">World!</p></h1>
    </div>
  """
}
