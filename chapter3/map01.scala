
// trait
import scala.collection.mutable

val treasureMap = mutable.Map[Int, String]()
treasureMap += (1->"Go to island.")
treasureMap += (2->"Find bing X on ground.")
treasureMap += (3->"Dig.")
println(treasureMap(2))