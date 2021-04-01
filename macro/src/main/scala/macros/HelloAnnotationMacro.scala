package macros

import scala.annotation.StaticAnnotation
import scala.language.experimental.macros
import scala.reflect.macros.whitebox

class HelloAnnotationMacro extends StaticAnnotation {
  def macroTransform(annottees: Any*): Any = macro HelloAnnotationMacro.impl
}

object HelloAnnotationMacro {
  def impl(c: whitebox.Context)(annottees: c.Tree*): c.Tree = {
    println("hello")
    annottees.head
  }
}
