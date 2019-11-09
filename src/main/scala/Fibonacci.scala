object Main extends App{
  def Fibonacci (number: Int): Int = number match {
    case 0 => 0
    case 1 => 1
    case _ => Fibonacci(number - 1) + Fibonacci(number - 2)
  }
println(Fibonacci(scala.io.StdIn.readInt()))
}