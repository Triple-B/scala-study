// 특별한 형태의 함수 호출
// 반복 파라미터  repetered parameter
// 이름 붙인 인자 named agrument
// 디폴트 인자   default parameter


// 반복 파라미터  repetered parameter
def echo(args: String*) = for(arg <- args) println(arg)
echo()
echo("one")
echo("one", "hello")
echo("one", "hello","world")

var someNumbers = List("one", "hello","world","one", "hello","world")
// echo(someNumbers)       // not working
echo(someNumbers:_*)

// 이름 붙인 인자 named agrument
def speed(distance: Float, time: Float) = println(distance / time)
speed(100, 10)
speed(distance = 100, time = 10)
speed(time = 10, distance = 100)
speed(10, 100)

// 디폴트 인자   default parameter
def printTime1(out: java.io.PrintStream = Console.out) = out.println("time : " + System.currentTimeMillis())
printTime1()
def printTime2(out: java.io.PrintStream = Console.out, divisor: Int = 1) = out.println("time : " + System.currentTimeMillis() / divisor)
printTime2(divisor = 2)



















