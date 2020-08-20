val myNumbers =  Range(1,5)
myNumbers.foreach(println)
myNumbers.sum

//regular programming for sum would be as follows
var mySum = 0
for (n <- myNumbers)
  mySum += n
println(s"Sum is $mySum")
myNumbers.reduce((a,b) => a+b)
myNumbers.reduce((a,b) => a*b)

def adder(a:Int,b:Int): Int = {
val theSum = a+b
  println(s"got a:$a , b:$b => result $theSum")
  theSum
}
myNumbers.reduce(adder)

val myTexts = Seq("ABBA","friend", "hello")
myTexts.map(t => t.length).sum

val myFloats = myNumbers.map(n => n.toFloat)
myNumbers.reduce((acc, num) => acc / num)
myNumbers.reduce((acc, num) => num/ acc)