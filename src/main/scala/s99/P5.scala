package s99

object P5 {
  def reverse[A](ls: List[A]): List[A] = {
    //1,2,3,4 => op(op(op(op(empty, 1),2),3),4)みたいな感じかな
    //受け取った要素を引き継いだ要素の先頭に加えると逆順になるよねという
    ls.foldLeft(List[A]()) { (r, h) => h :: r }
  }

  // Tail recursive.
  def reverseTailRecursive[A](ls: List[A]): List[A] = {
    def reverseR(result: List[A], curList: List[A]): List[A] = curList match {
      case Nil       => result
      case h :: tail => reverseR(h :: result, tail)
    }
    reverseR(Nil, ls)
  }
}
