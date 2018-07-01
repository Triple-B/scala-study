// val greetStrings = new Array[String](3)
val greetStrings : Array[String] = new Array[String](3)

greetStrings(0) = "Hello"
greetStrings(1) = ", "
greetStrings(2) = "world"

for(i <- 0 to 2)
  print(greetStrings(i))
println()

val numNames = Array("zero","one","two")
for(i <- 0.to(2)) {
  print(numNames(i))
  println()
}
