// 부분 적용한 함수


var someNumbers = List(-11, -10, -5, 0, 5, 10)
//someNumbers.foreach(x => println(x))
someNumbers.foreach(println _)
someNumbers.foreach(println)

def sum(x: Int, y: Int, z: Int) = x + y + z
println(sum(1,2,3))

var result_1 = sum _
println(result_1(1,2,3))
println(result_1.apply(1,2,3))


var result_2 = sum(1, _:Int, 3)
println(result_2(2))
println(result_2(5))