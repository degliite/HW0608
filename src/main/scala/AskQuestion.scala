import scala.io.StdIn.readLine

object AskQuestion extends App {

  val b = 100
  println("Enter your number, please :)")
  val c = readLine().toInt
  val answer =
    if (b > c) "B is larger than Your Answer"
    else if (c > b) "Your Answer is larger to B"
     else "B is equal to Your Answer"

  println(answer)
}