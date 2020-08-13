object FoodCalculator extends App {

  var price = 0.37
  var quantity = 20

  //for rounding
val cost = BigDecimal (price * quantity) setScale(2, BigDecimal.RoundingMode.HALF_UP)

  println(s"We got ${args.length} arguments")
  //if (!args.isEmpty)
  if (args.length >= 3) {
    price = args(0).toFloat
    quantity = args(1).toInt
  }

  val food =
    if (args.length >= 3)
      args (2)
    else
      "potatoes"

  if (args.length >= 3) {
    println(s"The first argument is ${args(0)}")
    println(s"The second argument is ${args(1)}")
    println(s"The third argument is ${args(2)}")
  }

  println(s"It will cost $cost to buy ${args(1)} kg of ${args(2)}")

}
