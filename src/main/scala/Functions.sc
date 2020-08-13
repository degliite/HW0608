import scala.io.StdIn.readLine

def print2() = {
  println("One Line")
  println("Second Line")
}
print2()
print2()

//Unit is basically an empty return
def add(a:Int, b:Int) = {
  val result = a+b
  println(result) //sideeffect
  result //dont have to write return!
}

add(5,10)
add(500,210)

def mult(a:Int, b:Int) = {
  //in Scala the last line is returned automatically
  a*b
}

mult(6,10)+10+100

def multAny(a: Double, b:Double): Int={
  (a*b).toInt
}
multAny(9.11,3.14)
multAny(10,2)

def addAndMultiply(a: Double, b:Double, c:Double)= {
  add(multAny(a,b),multAny(b,c))
}

val myResult = addAndMultiply(3,4,5)
println(myResult)

//Anti-pattern ! do not mutate outside variables
var myMutable = 10
//you cant tell if mutateOutside is correct or not
def mutateOutside()= {
  myMutable += 5
  println(myMutable)
}
mutateOutside()
mutateOutside()
mutateOutside()

//Instead you should be doing this
def add5(a: Int) = {
  a+5 //remember last line is returned automatically no need for return
}

myMutable
myMutable = add5(myMutable)
myMutable = add5(myMutable)
myMutable = add5(myMutable)
myMutable

//Platonic goal is to have a program with pure functions
//pure function is one without sideeffects(modifiying something)

println(add5(10))
add5(20) == 25

//make a functions which RETURNS! reversed and uppercase string (so input string and output string)
def getReversedUpper(text:String):String = {
  "ABRACADRABRA" //
  text.toUpperCase.reverse
  //println(s"Going to reverse: $text")
}

getReversedUpper("Valdis") == "SIDLAV"
getReversedUpper("Beer")

def getStringLenght(text:String):Unit = {
//more code goes here between curly braces
  ///myLocal is local to this function between these braces
  val myLocal = text.length
}

getStringLenght("Valdis")

def getResults(a:Int, txt:String): Int = {
  var result = 0
  result = a* txt.length
  result += 1000
  result // last line what gets returned
}

getResults(10, "Valdis")

def getMax(a:Int, b:Int) = {
  var result = 0
  if (a>b) {
    val myName = "Valdis"
   result = a * myName.length
  }else {
    b
  }
}
getMax(10,20)
getMax(5,3)
val a =4
if (a == 2*2) {
  println("A is 4")
} else {
  println( "A is not 4")
  }

//for functions which retunr booleans we prefix isSomething
def isEqualTo4 (a:Int): Boolean = {
  a == 2 * 2
}

isEqualTo4(4)
isEqualTo4(5)

5>2*2
4 >= 2*2
4 != 4
4 !=5
4 <= 2*2

val myName = "Valdis"
if (myName == "Valdis") {
  println("Wow that is my name too!")
}
println("This happens all the time")
def checkName(myName:String, friendName:String) = {
  var isSame = false
  if (myName == friendName) {
    //we can do more stuff when names match
    println(s"Wow our names match perfectly my dear $friendName!")
    isSame = true
  } else {
    //we can do more stuff here if we want when our names do not match
    println(s"Well my name $myName is a bit different from your name $friendName...")
    isSame = false
  }
  println("Let's be friends no matter what!")
  isSame //we could skip isSame and just do myName == friendName
}

checkName("Valdis", "Liga")
checkName("Valdis", "Valdis")

// ifs in scala returns always something

val myMax = 20

BigDecimal.RoundingMode.HALF_UP

val b = 100
println("enter your number")
val c = readLine().toInt
val answer = if (b>c) "B is larger than C" else if (c > b)"C is larger to B" else "B is equal to C"
println(answer)

// so if/else gives values