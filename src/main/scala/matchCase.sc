val a = 14
if (a == 0) println("a is 0")
else if (a == 1) println("a is 1")
else if (a == 2) println("a is 2")
else if (a == 3) println("a is 3")
else println("what is this?")

val result = {
  a match {
    case 0 => "zero"
    case 1 => "one"
    case 2 => "two"
    case _ => "other"
  }
}
println(result)

val text = "Valdis"

println({
  text match {
    case "Anna" => 1000
    case "Liga" => 2000
    case "Valdis" => 90000
    case _ => -1
  }
})
val myNum = text match {
  case "Anna" => 1000
  case "Liga" => 2000
  case "Valdis" => 90000
  case _ => -1
}


    def anyMatch(x: Any): Any = x match {
      case 1 => "one"
      case 2 => "two"
      case 3 => 20
      case "Valdis" => 30
      case _ => "other"
    }


def only4(incoming: Any) : Any = incoming match {
      case 1 => "one"
      case 2 => 20
      case 3 => 20
      case "Valdis" => 30
      case _ => "Error"
    }


    println(only4(1))
println(only4())

def lazyPow(a:Int, b:Double =2) :Double = {
  Math.pow(a,b)
}
lazyPow(10)
lazyPow(10,3)
lazyPow(10,0.5)