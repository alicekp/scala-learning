import org.scalatest.{FlatSpec, Matchers}

/**
  * @author alfie
  */
class LongWordsSpec extends FlatSpec with Matchers {
  def FilterShortWords(words: Array[String]): Array[String] = {
    // this method should only return words shorter than 5 characters
    return words
  }

  "Arrays with only short words" should "be returned without change" in {
    FilterShortWords(Array("this", "is", "okay")) shouldEqual Array("this", "is", "okay")
  }

  "Arrays with only long words" should "return empty array" in {
    FilterShortWords(Array("these", "words", "too_long")) shouldEqual Array()
  }

  "Arrays with a mixture of words" should "be filtered" in {
    FilterShortWords(Array("in", "this", "array", "some", "are", "invalid")) shouldEqual Array("in", "this", "some", "are")
  }
}
