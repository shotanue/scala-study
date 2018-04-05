//import org.specs2._
import org.specs2.mutable.Specification

class s99Spec extends Specification {
  "s99" should {
    "tmp" in {
      val s99 = new s99()
      val tmp = List(1, 2, 3)
      println(s99.last(tmp))
      s99.last(tmp) must_== 3
    }
  }
}