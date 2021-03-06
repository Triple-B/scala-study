import scala.io.Source

object LongLines {
  def processFile(filename: String, width: Int) = {

    // 함수내 함수정의 : 지역함수
//    def processLine(filename: String, width: Int, line: String) = {
    def processLine(line: String) = {
      if(line.length > width)
        println(filename + " : " + line.trim)
    }
    val source = Source.fromFile(filename)
    for(line <- source.getLines())
//      processLine(filename, width, line)
      processLine(line)
  }
}

object FindLongLines {
  def main(args: Array[String]) = {
    val width = args(0).toInt
    for(arg <- args.drop(1))
      LongLines.processFile(arg, width)
  }
}


