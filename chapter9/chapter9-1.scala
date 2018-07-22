import java.io.File

import javax.management.Query
// 코드 중복 줄이기

object FileMatcher {

  private def filesHere = (new File(".")).listFiles()

  // parameter : input String, out Boolean
  private def filesMatching(matcher: String => Boolean) =
    for(file <- filesHere; if matcher(file.getName)) yield  file

  def filesEnding(query: String) =
    filesMatching(_.endsWith(query))

  def filesContaining(query: String) =
    filesMatching(_.contains(query))

  def fileRegex(query: String) =
    filesMatching(_.matches(query))


}