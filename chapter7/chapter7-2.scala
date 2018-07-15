

// 최대공약수
def gcdLoop(x: Long, y: Long): Long = {
  var a = x
  var b = y
  while(a != 0) {
    val temp = a
    a = b % a
    b = temp
  }
  b
}

// 최대공약수 계산 재귀
def gcd(x: Long, y: Long): Long = {
  if(y==0) x else gcd(x, y)
}


def do_while_function(): Unit = {
  var line = ""
  do {
    line = readLine()
    println("Read : " + line)
  } while(line != "")
}

def do_while_function_unlimited_loop(): Unit = {
  var line = ""
  // (line = readLine()) 의 결과는 ()
  // ()와 != 는 항상 같지 않다.
  // 그래서 무한루프에 빠진다.
  while((line = readLine()) != ""){
    println("Read : " + line)
  }
}
