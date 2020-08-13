import java.nio.file.Paths

import scala.reflect.io.File

for (i <- 1 to 5) {
  println(s"i is $i")
}

for (i <- 1 until 5) {
  println(s"i is $i")
}

for (i <- 1 until 5 by 2) {
  println(s"i is $i")
}

for (i <- 2 to 10 by 2) println(s"i is $i")

for (i <- Array (10,20,30)){
  println(s" i value is $i")
}

println(Paths.get(".").toAbsolutePath)

Array (10,20,30).foreach(println)
Array (10,20,30).foreach(item => println(s"Answer is $item"))

for (item <- Array (10,20,30)) println(s"Answer is $item")

println("*")
println(" ")