import java.util.UUID

@main def hello(): Unit =
  val foo = sys.env("FOO")
  println(s"foo is $foo")
