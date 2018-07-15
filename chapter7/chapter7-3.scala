
val fileHere = (new java.io.File(".")).listFiles
for (file <- fileHere)
  println(file)

// 1~5
for (i <- 1 to 5)
  println(i)

// 최대값 제거
for (i <- 1 until 4)
  println(i)

for (file <- fileHere
     if file.isFile
     if file.getName.endsWith(".scala"))
  println(file)



// 중첩이터레이션
def fileLines(file: java.io.File) =
  scala.io.Source.fromFile(file).getLines().toList

def grep1(pattern : String) =
  for (
    file <- fileHere
    if file.getName.endsWith(".scala");
    line <- fileLines(file) //
    if line.trim.matches(pattern)
  ) println(file)

grep1(".*gcd.*")

// for 중에 변수 바인딩하기
def grep2(pattern : String) =
  for {
    file <- fileHere
    if file.getName.endsWith(".scala")
    line <- fileLines(file)
    trimmed = line.trim             // variable binding
    if trimmed.matches(pattern)
  } println(file + " : " + trimmed)
grep2(".*gcd.*")

// 새로운 컬렉션 만들어내기
// yield return array
def sacalaFiles =
  for {
    file <- fileHere
    if file.getName.endsWith(".scala")
  } yield file
println(sacalaFiles)
for(i <- sacalaFiles)
  println(i)

val forLineLengths =
  for {
    file <- fileHere
    if file.getName.endsWith(".scala")
    line <- fileLines(file)
    trimmed = line.trim             // variable binding
    if trimmed.matches(".*for.*")
  } yield trimmed.length

for(i <- forLineLengths)
  println(i)