class s99 {

  //P01
  //写経
  //最後の項目に当たったらhが返るような実装
  def last[A](list:List[A]): A = list match {
    //_::tailで先頭とそれ以外に分離する。
    // これを繰り返して先頭を１個ずつ減らしていくと、先頭１個だけの状態に行き着く
    case _ :: tail => last(tail)
    //先頭のみ
    case h :: Nil => h
    case _ => throw new NoSuchElementException
  }
}