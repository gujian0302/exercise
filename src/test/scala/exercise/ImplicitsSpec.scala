package exercise

import org.scalatest._

class ImplicitsSpec extends FlatSpec with Matchers{

  "implicits" should "be " in {
    implicit object StringMonoid extends Monoid[String]{
      def add(x:String,y:String) = x concat y 
      def unit:String = ""
    }

    implicit object IntMonoid extends Monoid[Int]{
      def add(x:Int, y:Int) = x + y
      def unit:Int = 0
    }

    def sum[A](xs:List[A])(implicit m:Monoid[A]):A = {
      if(xs.isEmpty) m.unit
      else m.add(xs.head,sum(xs.tail))
    }

    sum(List(1,2,3)) should be (6)
    sum(List("a", "b", "c")) should be ("abc")

    class KonaIntWrapper(val original:Int) {
      def isOdd = original % 2 != 0
    }

    implicit def thisMethodNameIsIrrelevant(value:Int) = new KonaIntWrapper(value)

    19.isOdd should be (true)
    20.isOdd should be (false)

    def howMuchCanIMake_?(hours:Int)(implicit dollarsPerHour:BigDecimal)= hours*dollarsPerHour

    implicit val hourlyRate = BigDecimal(34)

    howMuchCanIMake_?(10) should be (340)


  }
}