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
