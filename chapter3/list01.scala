val oneTwo = List(1,2)
val threeFour = List(3,4)
val oneTwoThreeFour = oneTwo ::: threeFour

println(oneTwo + " and " + threeFour + " were not mutated.")
println("Thus, " + oneTwoThreeFour + " is a new list.")


val emptyList01 = List()
println(emptyList01)

val emptyList02 = Nil
println(emptyList02)

val makeList01 = List("element-1","element-2","element-3", "element-4")
println(makeList01)

val makeList02 = "element-1"::"element-2"::"element-3"::Nil
println(makeList02)

val makeList03 = List("element-1","element-2"):::List("element-3", "element-4")
println(makeList03)
println(makeList03(3))

val makeList04 = List("Will", "fill", "until")
println(makeList04.count(s=>s.length == 4))
println(makeList04.drop(2))
println(makeList04.dropRight(2))
println(makeList04.exists(s=>s=="until"))
println(makeList04.filter(s=>s.length()==4))
println(makeList04.filterNot(s=>s.length()==4))
println(makeList04.forall(s=>s.endsWith("l")))
makeList04.foreach(s=>println(s))
println(makeList04.head)
println(makeList04.init)    // 마지막원소를 제외한 나머지
println(makeList04.tail)
println(makeList04.isEmpty)
println(makeList04.length)
println(makeList04.map(s=>s+"y"))
println(makeList04.mkString(","))
println(makeList04.reverse)
















