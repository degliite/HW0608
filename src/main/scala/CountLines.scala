import scala.io.Source

// will count lines from first files given  as argument
object CountLines extends App{
 //read arg
  //read text file
  //loop through each line and count length
// keep a running total of all characters
  println("Running CountLines")
  if (args.length > 0) {
    for (arg <- args) {
    println(s"Working now on file $arg")
    println("*"*40)
    for (line <- Source.fromFile(args(0)).getLines())
        println(s"${line.length.toString}::: $line")
    }

  } else {
    println("You will need to enter file as command argument")
  }
  //print the length of the longest line
  //BONUS
}
