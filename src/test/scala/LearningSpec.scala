import org.specs2.mutable.Specification

/** This is the "Unit" style for specifications */
class LearningSpec extends Specification {
  "色々覚えたことなど。".txt
  val learning = new Learning
  "関数呼び出し" >> {
    "new XXXを（）で囲むとその場でメソッドが呼べる" >> {
      (new Learning).plainOldSum(1,2) must_== 3
    }
    "カリー" >> {
      learning.curriedSum(1)(3) must_== 4
    }
  }
}