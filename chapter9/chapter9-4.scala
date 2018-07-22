// 새로운 제어 구조 작성

import java.io.PrintWriter
import java.io.File

def twice(op: Double => Double, x: Double) = op(op(x))
def func1(x: Double) = {
  println(x)
  x + 1
}

println(twice(_ + 1, 5))
println(twice(func1, 5))

/**
  * loan pattern
  */
def withPrintWriter(file: File, op: PrintWriter => Unit) = {
  val writer = new PrintWriter(file)
  try {
    op(writer)
  } finally {
    writer.close()
  }
}

withPrintWriter(new File("date.txt"), writer => writer.println(new java.util.Date))

