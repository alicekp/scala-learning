import org.scalatest.{FlatSpec, Matchers}

import scala.collection.mutable.ArrayBuffer

/**
  * @author alfie
  */
class FlattenArraysSpec extends FlatSpec with Matchers {
  // this method is passed an array of arrays (* means zero or more in parameter list)
  // you must combine the contents of the multiple arrays into a single array!

  def Flatten(arrayOfArrays: Array[Int]*): Array[Int] = {
    var array = ArrayBuffer[Int]()

    // remember you can use ArrayBuilder to create a new array
    for (e <- arrayOfArrays) {
      for ( f <- e) {
        array += f
        println(f)
      }
    }

    return array.toArray
  }

  "Arrays with single entries" should "be combined correctly" in {
    Flatten(Array(1), Array(2), Array(3)) shouldEqual Array(1, 2, 3)
  }

  "Arrays with more than one entry" should "be combined correctly" in {
    Flatten(Array(1, 2, 3), Array(2, 3), Array(3, 4)) shouldEqual Array(1, 2, 3, 2, 3, 3, 4)
  }

  "Arrays with no entries" should "be ignored" in {
    Flatten(Array(1, 2, 3), Array(), Array(4, 5)) shouldEqual Array(1, 2, 3, 4, 5)
  }

}
