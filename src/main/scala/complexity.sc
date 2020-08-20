import scala.Int.int2long
import scala.util.Random

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

val myNumbers = Seq.range(10,25).filter (n => n%2 == 0)
val myCubes = myNumbers.map(n => n*n*n)
myCubes.foreach(println)
myCubes.foreach(item => println(s"My number is $item"))
 for (((item, i), original) <- myCubes.zipWithIndex. zip(myNumbers))
println(s" no. ${i+1}: original Number ${original} cubed => $item")

val myCollection = myCubes.zip(myNumbers)
 myCollection(0).getClass
 myCollection.foreach(println)
myCollection(1)._2
for (myTuple <- myCollection) {
  println(myTuple._1, myTuple._2)
  val (myNum, myCube) = myTuple
}

myCollection.foreach(myTuple => println(myTuple._1,myTuple._2))

val myBigTuple = ("Valdis",45, "Scala", 3, 3.14)
myBigTuple
myBigTuple.getClass

val mySquares = Seq.range(1,10).map(n => n*n).map(n => s"my square $n")
mySquares.foreach(println)

Math.random()
Math.random()
val myRandoms = Seq.range(1,101).filter(_ => Math.random() < 0.20)
myRandoms.length

Random.between (20,30)

val randomSixth = Seq.range(1,101).filter(_ => Random.between(1,7)==6)
val everySixth = Seq.range(1,101).filter(n => n%6 ==0 )

randomSixth.length
everySixth.length


