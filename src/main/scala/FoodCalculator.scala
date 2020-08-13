object FoodCalculator extends App {

  var price = 0.37
  var quantity = 20
var cost = price * quantity

  println(s"We got ${args.length} arguments")
  //if (!args.isEmpty)
  if (args.length >= 3) {
    price = args(0).toFloat
    quantity = args(1).toInt

  }
  println(s"The first argument is ${args(0)}")
println(s"The second argument is ${args(1)}")
println(s"The third argument is ${args(2)}")

  println(s"It will cost $cost to buy ${args(1)} kg of ${args(2)}")

}
