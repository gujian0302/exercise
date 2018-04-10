import org.scalatest._

class HighOrderFunctionSpec extends FlatSpec with Matchers{
  "first-class functions" should "be equals" in {
    HighOrderFunction.lambda(3) should be (4)
    HighOrderFunction.lambda2(3) should be (5)
    HighOrderFunction.lambda3(3) should be (6)

    HighOrderFunction.lambda4(3) should be (2)
    HighOrderFunction.lambda5(3) should be (4)

    HighOrderFunction.closure(10) should be (11)

    println(HighOrderFunction.summation(10, HighOrderFunction.closure))
    HighOrderFunction.summation(10,HighOrderFunction.closure) should be (11)

    HighOrderFunction.addWithoutSyntaxSugar(10).isInstanceOf[Function1[Int,Int]] should be (true)
    HighOrderFunction.addWithoutSyntaxSugar(10)(2) should be (12)

    HighOrderFunction.addWithoutSyntaxSugar(12)(12) should be (24)

    HighOrderFunction.addWithSyntaxSugar(1)(2) should be (3)
    HighOrderFunction.addWithSyntaxSugar(1).isInstanceOf[Function1[Int,Int]] should be (true)

    HighOrderFunction.makeUpper(List("abc","efg")) should be (List("ABC", "EFG"))
    HighOrderFunction.makeWhatEverYouLike(List("abc", "EFG"), _.toLowerCase) should be (List("abc", "efg"))

    List("abc", "efg", "caonima") map (_.length) should be (List(3,3,7))

  }

}