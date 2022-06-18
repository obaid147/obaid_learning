import scala.annotation.tailrec

def greet(n: Int): Unit = {
  var i = 0
  while(i < n) {
    i += 1
    println("Hi")
  }
}
greet(5)


// recursion
@tailrec
def times(n: Int, limit: Int): Unit = {
  if(n < 5){
    println("Hi")
    times(n + 1, limit)
  }
}
times(n = 0, limit = 5)