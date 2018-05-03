package s99

//(*) Find the number of elements of a list.
//Example:
//scala> length(List(1, 1, 2, 3, 5, 8))
//res0: Int = 6
object P4 {
  //値を保持しつつ再帰でループを回すイメージ
  def length[A](ls: List[A]): Int = {
    def lengthR(result: Int, curList: List[A]): Int = curList match {
      case Nil => result
      case _ :: tail => lengthR(result + 1, tail)
    }

    lengthR(0, ls)
  }

  def foldLength[A](ls:List[A]) : Int = ls.foldLeft(0) {(c,_) => c+1}

}
