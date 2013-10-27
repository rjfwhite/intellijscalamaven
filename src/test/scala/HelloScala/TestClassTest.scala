package HelloScala

import org.scalatest.WordSpec
import org.scalatest.mock.MockitoSugar


class TestClassTest extends WordSpec with MockitoSugar {
  "TestClass" must {
    "double number" in {
      val testClass = new TestClass()
      val result = testClass.double(10)
      assert(result === 20)
    }
  }
}
