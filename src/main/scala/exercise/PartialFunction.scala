package exercise

object PartialFunction {
	def sum = (a:Int, b:Int, c:Int) => a + b + c


  val doubleEvens: PartialFunction[Int,Int] = 
    new PartialFunction[Int, Int] {
      def isDefinedAt(x:Int) = x % 2 == 0

      def apply(v1:Int) = v1 * 2
    }
  val tripleOdds: PartialFunction[Int, Int] = new PartialFunction[Int, Int] {
    def isDefinedAt(x:Int) = x % 2 != 0

    def apply(v1:Int) = v1 * 3
  }  

  val doubleEvensCase: PartialFunction[Int,Int] = {
    case x if (x%2) == 0 => x * 2
  }

  val tripleOddsCase: PartialFunction[Int,Int] = {
    case x if (x%2) != 0 => x*3
  }

  val addFive = (x:Int) => x + 5

  val printEven: PartialFunction[Int,String] = {
    case x if (x%2) == 0 => "EVEN"
  }

  val printOdd: PartialFunction[Int,String] = {
    case x if (x%2) != 0 => "ODD"
  }

}

