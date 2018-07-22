
// 클라이언트 코드 단순하게 만들기

def containNeg(nums: List[Int])={
  var exists = false
  for(num <- nums)
    if(num < 0)
      exists = true
  exists
}

println(containNeg(List(1,2,3,4)))
println(containNeg(List(1,2,-3,4)))


def containsNeg(nums: List[Int]) = nums.exists(_ < 0)

println(containsNeg(Nil))
println(containsNeg(List(0,-1,-2)))