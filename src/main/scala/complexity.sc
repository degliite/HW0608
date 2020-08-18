val max = 10000
var sum = BigInt(0)

for (i <- 1 to max)
  for(j <- 1 to max)
    sum += (i+j)
println(sum)

val myList = List.range(1,5)
val myArr = Array.range(1,5)
val mySeq = Seq.range(1,15)
println(myList)
myArr.foreach(println)
myList.foreach(println)
mySeq.foreach(println)

val myOdd = Seq.range(1,11+1,2)
myOdd.foreach(println)

def myFilter(myNum:Int):Boolean = myNum %3 == 0

val myFilteredNumbers = mySeq.filter(n => n%2 == 1)
myFilteredNumbers.foreach(println)
val myNumber3 = mySeq.filter(myFilter)
myNumber3.foreach(println)

val myData = Seq.range(10,50,3)
myData.foreach(println)

val my5 = myData.filter(n => n%5 == 0)
my5.foreach(println)

val my500 = my5.map(n => n *100).filter(n => n > 2000)
my500.foreach(println)

val myGreetings = my500.map(n => s"Hello Mr./Mrs. $n")
myGreetings.foreach(println)
myGreetings.getClass


