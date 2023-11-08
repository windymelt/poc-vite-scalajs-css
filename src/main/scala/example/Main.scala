package example

import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

// This type definition can be generated using `tcm src` and `stc --includeProject=true`.
// But generated @JSImport contains relative path that cannot be resolved by Vite.
// We have to use globResolverPlugin to resolve the path.
// We have to use JSImport.Namespace to correctly import generated css object.
@js.native
@JSImport("@find/**/partial.module.css", JSImport.Namespace)
object Classes extends js.Object {
  val emph: String = js.native
}

object Main {
  println(Classes.emph)

  @main
  def helloWorld(): Unit =
    dom.document.querySelector("#app").innerHTML = s"""
    <div>
      <h1>CSS Module in Scala.js</h1>
      <p>This rendered page contains CSS module. CSS module define class <code>emph</code> that is used in this page.</p>
      <p>Module CSS converts class name to hash value. So, the class name <code>emph</code> is converted to <code>${Classes.emph}</code>.</p>
      <p>Thus we can <span class="${Classes.emph}">emphasize</span> some text.</p>
    </div>
  """
}
