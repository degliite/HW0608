val mySeq2 = Seq("valdis", "liga", "Maija", "Tomars")
println("Printing only long names")
val longCapitalNames = mySeq2.filter(txt => txt.length >5).map(txt => txt.toUpperCase)
longCapitalNames.foreach((println))