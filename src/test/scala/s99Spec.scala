//import org.specs2._
import org.specs2.mutable.Specification
import s99._

class s99Spec extends Specification {
  val s99 = new s99()

  "s99" should {
    "tmp" in {
      val tmp = List(1, 2, 3)
      println(s99.last(tmp))
      s99.last(tmp) must_== 3
    }
  }

  "P2 (*) Find the last but one element of a list." should {
    "" in {
      s99.penultimate(List(1, 1, 2, 3, 5, 8)) must_== 5
      s99.penultimate(List(1, 1, 2, 3, 5, 8, 10)) must_== 8
    }
    "P03 (*) Find the Kth element of a list." should {
      "" in {
        s99.nth(2, List(1, 1, 2, 3, 5, 8)) must_== 2
      }
    }
  }


  "Listのカウント" >> {
    "空は0を返す" >> {
      s99.count(List()) must_== 0
    }
    "要素の数の値を返す" >> {
      val oneItem = List(1)
      val twoItems = List(1, 1)
      val threeItems = List(1, 1, 1)
      s99.count(oneItem) must_== 1
      s99.count(twoItems) must_== 2
      s99.count(threeItems) must_== 3
    }
    "最後の値が戻り値ではない" >> {
      val fourItems = List(1, 2, 3, 9999)
      s99.count(fourItems) must_== 4
    }
  }

  "P4" should {
    "count List" in {
      P4.length(List(1, 1, 1, 1)) must_== 4
      P4.foldLength(List(1, 2, 3, 4, 1, 2, 3, 4)) must_== 8
    }
  }

  "P5" should {
    "count List" in {
      P5.reverse(List(1, 2, 3, 4)) must_== List(4, 3, 2, 1)
    }

    "P6:List(1,2,3,2,1)" should {
      "be palindrome" in {
        P6.isPalindrome(List(1,2,3,2,1)) must_== true
      }
    }
  }


}