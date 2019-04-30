package samples

import org.scalatest.{FlatSpec, Matchers}

class SampleTestSpec extends FlatSpec with Matchers {

  it should "demonstrate sample test" in {
    1 + 2 should equal(3)
  }
  it should "An empty list should be empty" in {
    List() should be('empty)
    Nil should be('empty)
  }

  it should "A non-empty list should not be empty" in {
    List(1, 2, 3) should not be 'empty
    List("fee", "fie", "foe", "fum") should not be 'empty
  }

  it should "A list's length should equal the number of elements it contains" in {
    List() should have length 0
    List(1, 2) should have length 2
    List("fee", "fie", "foe", "fum") should have length 4
  }
}
