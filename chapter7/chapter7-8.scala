


/**
  * sample code
  */
def printMultiTable() = {
  var i = 1
  while(i<= 10){
    var j = 1
    while(j<= 10){
      val prod = (i*j).toString
      var k = prod.length
      while(k < 4){
        print(" ")
        k += 1
      }
      print(prod)
      j += 1
    }
    println()
    i += 1
  }
}


/**
  * refactoring
  */

// 하나의 행을 시퀀스로 반환
def makeRowSeq(row: Int) =
  for(col <- 1 to 10) yield {
    val prod = (row * col).toString
    val padding = " " * (4 - prod.length)
//    println(padding + prod)
    padding + prod
  }

// 하나의 행을 문자열 반환
def makeRow(row: Int) = makeRowSeq(row).mkString

def multiTable() = {
  val tableSeq =      // 한 행에 해당하는 문자열의 시퀀스
    for (row <- 1 to 10) yield makeRow(row)
  tableSeq.mkString("\n")
}

println(multiTable())
