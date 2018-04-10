import org.scalatest._

class HighOrderFunctionSpec extends FlatSpec with Matchers{
  "first-class functions" should "be equals" in {
    HighOrderFunction.lambda(3) should be (4)
    HighOrderFunction.lambda2(3) should be (5)
    HighOrderFunction.lambda3(3) should be (6)

    HighOrderFunction.lambda4(3) should be (2)
    HighOrderFunction.lambda5(3) should be (4)

    HighOrderFunction.closure(10) should be (11)
  }

}