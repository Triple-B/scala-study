
// 변수 스코프
def example_01() = {
  val a = 1;
  {
    val a = 2     // shadow
    println(a)

  }
  println(a)
}

println(example_01())


def example_02() = {
  val a = 1;
  {
    val a = 2; // shadow
    {
      println(a)
    }
  }
  println(a)
}

println(example_02())