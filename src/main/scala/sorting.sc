import scala.util.Random

val myData = Seq(1,2,3,4,7,7,1,6,10)
//val myRandoms = Range (1,20).map(n => (Math.random()*20).toInt)
val myRandoms = Range (1,20).map(n => Random.between(1, 20+1))
myRandoms
myRandoms.sorted.reverse
myRandoms.sorted

val myTexts = Seq("Valdis", "Aivars","Liga", "Maija", "Voldemars")
myTexts.sorted
myTexts.sortWith(_.length > _.length)
myTexts.sortWith(_.length < _.length)
// the above is shorthand for the below function. _ represents value and we don't care the name of them
myTexts.sortWith ((arg1, arg2) => arg1.length < arg2.length)

myTexts.sortBy(_.length)
myTexts.sortBy(item => item.length)
//kārto pēc 2.burta
myTexts.sortBy(item => item(1))
myTexts.sortWith ((a, b) => a(1) < b(2))
myTexts.sortWith ((a, b) => a(1) < b(2) &&  a(2) < b(2))
myTexts.sortBy(t=> (t(1),t(2)))

val fruits = Array("cherry","apple", "banana")
fruits.sorted
val sortedFruits = fruits.sorted.reverse
scala.util.Sorting.quickSort(fruits)
scala.util.Sorting.stableSort(myTexts)
