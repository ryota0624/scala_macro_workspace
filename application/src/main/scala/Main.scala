import macros.HelloAnnotationMacro
import macros.HelloMacro._

object Main extends App {
  @HelloAnnotationMacro
  class Sample

  val hello = withQuestion("hello")
  println(hello)
}
