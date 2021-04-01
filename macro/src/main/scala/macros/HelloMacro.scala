package macros

import scala.language.experimental.macros
import scala.reflect.macros.whitebox

object HelloMacro {
  def withQuestion(message: String): String = macro withQuestionImpl

  def withQuestionImpl(c: whitebox.Context)(message: c.Expr[String]): c.Tree = {
    import c.universe._
    q"""${message} + "?" """
  }
}

