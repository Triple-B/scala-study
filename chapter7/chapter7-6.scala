import scala.util.control.Breaks._
import java.io._



// java code
/**
  int i = 0;
  boolean foundIt = false;
  while (i < args.length){
    if(args[i].startsWith("-")){
      i = i + 1;
      continue;
    }

    if(args[i].endsWith(".scala")){
      foundIt = true;
      break;
    }
    i = i + 1;
  }

*/


def example_01() = {
  var i = 0
  var foundIt = false
  while(i < args.length && !foundIt){
    if(!args(i).startsWith("-")){
      if(args(i).endsWith(".scala"))
        foundIt = true
    }
    i = i + 1;
  }
}
println(example_01())

def searchForm(i:Int):Int = {
  if(i >= args.length) -1
  else if(args(i).startsWith("-")) searchForm(i + 1)
  else if(args(i).endsWith(".scala")) -1
  else searchForm(i + 1)
}

def example_03() = {
  searchForm(0)
}
println(example_03())


// breakable break
def example_04() = {
  val in = new BufferedReader(new InputStreamReader(System.in))
  breakable{
    while(true){
      println("? ")
      if(true) {
        println("break")
        break // breakable을 빠져나온다.
      }
      println("true")
//      if(in.readLine() == "") break   // breakable을 빠져나온다.
    }
  }
}
example_04()


// breakable break
def example_05() = {
  val in = new BufferedReader(new InputStreamReader(System.in))
  while(true){
    println("? ")
    if(true) {
      println("break")
      break // BreakControl
    }
    println("true")
  }
}
example_05() // return scala.util.control.BreakControl