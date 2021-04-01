package macros

import scala.annotation.StaticAnnotation
import scala.language.experimental.macros
import scala.reflect.macros.whitebox


class Hello extends StaticAnnotation {
  def macroTransform(annottees: Any*): Any = macro HelloMacro.impl
}

object HelloMacro {
  def impl(c: whitebox.Context)(annottees: c.Tree*): c.Tree = {
    annottees.head
  }
}

