import org.scalatest.{FlatSpec, Matchers}

/**
  * @author alfie
  */

class OddNumbersSpec extends FlatSpec with Matchers {
  def OddNumbers(limit: Int): Array[Int] = {
    // implement missing method
    Array()
  }

  "Odd numbers to 10" should "be correct" in {
    OddNumbers(10) shouldEqual Array(1, 3, 5, 7, 9)
  }

  "Odd numbers to 1" should "just return 1" in {
    OddNumbers(1) shouldEqual Array(1)
  }

  "Odd numbers to 0" should "should return an empty array" in {
    OddNumbers(0) shouldEqual Array()
  }
}
