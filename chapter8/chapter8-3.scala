
var increase   = (x:Int) => x + 1
println(increase(10))

var f01 = (x: Int)=>{
  println("We")
  println("are")
  println("here")
  x+1
}
println(f01(19))

var someNumbers = List(-11, -10, -5, 0, 5, 10)
someNumbers.foreach((x: Int)=>println(x))

val filter_result = someNumbers.filter((x: Int)=>x>0)
println(filter_result)