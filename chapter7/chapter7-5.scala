
// match
def example_01() = {
  val firstArg = if (args.length > 0) args(0) else ""
  println("example_01 : " + firstArg)
  firstArg match {
    case "salt" => println("pepper")      // hidden break
    case "chips" => println("salsa")
    case "eggs" => println("bacon")
    case _ => println("huh?")
  }
}
println(example_01())

// match
def example_02() = {
  val firstArg = if (!args.isEmpty) args(0) else ""
  println("example_01 : " + firstArg)

  val friend = firstArg match {
    case "salt" => "pepper"      // hidden break
    case "chips" => "salsa"
    case "eggs" => "bacon"
    case _ => "huh?"
  }
  friend
}
println(example_02())
