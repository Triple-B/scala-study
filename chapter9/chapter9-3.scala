
// 커링 currying


def plainOldSum(x: Int, y: Int) = x + y
println(plainOldSum(1,2))

def curriedSum(x: Int)(y: Int) = x + y
println(curriedSum(1)(2))

val onePlus = curriedSum(1)_
val twoPlus = curriedSum(2)_
println(onePlus(2))
println(twoPlus(2))


def first(x: Int) = (y: Int) => x + y
def fun1(x:Int) = {
  def fun2 = (y: Int) => x + y
  fun2
}

println(first(1)(3))
println(fun1(1)(3))


