package s99

//P06 (*) Find out whether a list is a palindrome.
//Example:
//scala> isPalindrome(List(1, 2, 3, 2, 1))
//res0: Boolean = true
object P6 {

  //reverseして等価だったら回文なんじゃなかろうか

//  match の理解が足りず動かない
//  def isPalindrome[A](xs: List[A]): Boolean = xs match {
//    case xs.reverse => true
//    case _ => false
//  }
    def isPalindrome[A](xs: List[A]): Boolean = xs == xs.reverse
}
