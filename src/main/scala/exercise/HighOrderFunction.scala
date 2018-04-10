
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

  def summation(x:Int, y:Int => Int) = y(x)

  def addWithoutSyntaxSugar(x:Int): Function1[Int,Int] = {
    new Function1[Int,Int](){
      def apply(y:Int):Int = x + y
    }
  }

  def addWithSyntaxSugar(x:Int) = (y:Int) => x+y

  def makeUpper(xs:List[String]) = xs map {
    _.toUpperCase 
  }

  def makeWhatEverYouLike(xs:List[String], sideEffect: String => String) = xs map sideEffect
  

}