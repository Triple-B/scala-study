// 클로저
// free variable
// bound variable

var more : Int = 1
var addMore = (x: Int) => x > more
println(addMore(10))

var someNumbers = List(-11, -10, -5, 0, 5, 10)
var sum = 0
someNumbers.foreach(sum += _)

def makeIncreaser(more: Int) = (x: Int) => x + more
var inc1 = makeIncreaser(1)
var inc999 = makeIncreaser(999)
println(inc1(10))
println(inc999(10))