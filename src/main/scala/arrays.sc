var myArr = Array(10, 20, 30, 50, 600)
println(myArr.length)
myArr.getClass
println(myArr.last)
myArr(0)
myArr(4)
myArr.drop (1)
myArr.take  (1)
myArr (3) = 9000
// I am overwriting old array with new array
myArr = myArr :+555
myArr

//myArr = myArr ("Valdis","Peteris", "Liga")
myArr = Array (3,32,52,2,6,1,-6662,0,55)
myArr

myArr:++ Array(5,7,10)
myArr

myArr.min
myArr.max
myArr.reverse
val newArr = myArr :+652552
newArr.slice(2,6)
val insertedArr = newArr.slice(0,6) :++ newArr.slice(6,9)
insertedArr
insertedArr.contains(3)
insertedArr.indexOf(52)
insertedArr.dropRight(2)
insertedArr.take(2)
insertedArr.sum
insertedArr.product
insertedArr(7)
val noZero = insertedArr.slice(0,7) :++ insertedArr.slice (11,5000)
noZero
noZero.product
noZero.sum
noZero.foreach(println)

val mySeq = Seq(1,2,5,5,6,6,77)
mySeq
mySeq.length
mySeq.min
mySeq.max
mySeq.getClass

//generally you import of the beginning of the file
import scala.collection.mutable

val myMutableSeq = mutable.ArrayBuffer(1,3,6,7,8,8,10)
myMutableSeq

myMutableSeq.product
myMutableSeq +=5000
myMutableSeq ++= Array(3,3,3,10)
myMutableSeq

//after all this daa shaping and munging and mutating lets copy to inmutable

val immutableSeq = myMutableSeq.toArray //so we cast to immutable array
immutableSeq.getClass
immutableSeq

var myVar = 1552
myVar +=1
myVar

val myRoundNum = math.round(20.66)
myRoundNum
