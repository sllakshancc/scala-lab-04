@main def main() = {
  print("Enter a number: ")
  val input = scala.io.StdIn.readInt()

  val result = input match {
    case n if n < 0 => "Negative" // When input is less than 0
    case n if n == 0 => "Zero" // When input is equal to 0
    case n if n % 2 == 0 => "Even" // When input is even
    case n => "Odd" // When input is odd
  }

  println(result)
}