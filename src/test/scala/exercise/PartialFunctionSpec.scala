package exercise

import org.scalatest._

class PartialFunctionSpec extends FlatSpec with Matchers{

	"partial function" should "be 11" in {
		val sumC = PartialFunction.sum(1,2,_:Int)
		sumC(3) should be (6)

		def multiply(x:Int,y:Int) = x * y
		(multiply _).isInstanceOf[Function2[_,_,_]] should be (true)

		val multiplyCurried = (multiply _).curried
		multiply(3,4) should be (12)
		multiplyCurried(3)(4) should be (12)
		multiplyCurried(3).isInstanceOf[Function1[_,_]] should be (true)

		val multiplyCurried4 = multiplyCurried(4)
		multiplyCurried4(5) should be (20)

	}

}