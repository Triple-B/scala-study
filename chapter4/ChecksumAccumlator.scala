
import scala.collection.mutable

class ChecksumAccumlator {
  private var sum = 0
  // procedure
  def add(b : Byte) : Unit = sum+=b
  def checkSum() : Int = ~(sum & 0xFF) + 1
}

object ChecksumAccumlator {
  private val cache = mutable.Map.empty[String, Int]
  def calculate(s:String) : Int = {
    if(cache.contains(s))
      cache(s)
    else {
      val acc = new ChecksumAccumlator
      for (c <- s)        // 모든 문자를 이터레이션 한다.
        acc.add(c.toByte)
      val cs = acc.checkSum()
      cache += (s -> cs)
      cs
    }
  }
}
