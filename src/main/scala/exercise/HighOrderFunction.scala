
object HighOrderFunction{
  def lambda = {
    x: Int => x + 1
  }

  def lambda2 = (x:Int) => x + 2
  val lambda3 = (x:Int) => x + 3

  val lambda4 = new Function1[Int,Int] {
    def apply(v1:Int) = v1 - 1
  }

  def lambda5(x: Int) = x + 1

  var incrementer = 1

  def closure = (x:Int) => x + incrementer


}