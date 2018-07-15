import java.net.URL
import java.net.MalformedURLException
import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException


// throw exception
def example_01(n: Int) =
  if (n % 2 == 0)
    n / 2
  else
    throw new RuntimeException("n must be even")    // Nothing Type
println(example_01(2))
//println(example_01(1))


def example_02() =
  // catch exception
  try {
    val file = new FileReader("input.txt")
  } catch {
    case ex: FileNotFoundException => println("FileNotFoundException")
    case ex: IOException => println("IOException")
  }
example_02()

def example_03() =
// catch exception
  try {
    val file = new FileReader("input.txt")
  } catch {
    case ex: FileNotFoundException => throw ex
    case ex: IOException => throw ex
  }
//example_03()


def example_04() = {
  // catch exception
  val file = new FileReader("input.txt")
  try {
    // file use
  } finally {
    println("final")
    file.close()
  }
}
// example_04()


// 값 만들기
def example_05(path: String) =
  try {
    new URL(path)
  } catch {
    case ex: MalformedURLException => new URL("http://scala-lang.org")
  }
example_05("scala-lang.org")


def example_06():Int = try return 1 finally return 2
println("example_06 : " + example_06())

def example_07():Int = try 1 finally 2
println("example_07 : " + example_07())