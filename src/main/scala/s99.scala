class s99 {

  //P01
  //写経
  //最後の項目に当たったらhが返るような実装
  def last[A](list: List[A]): A = list match {
    //    先頭のみ
    case h :: Nil => h
    //    _::tailで先頭とそれ以外に分離する。
    //     これを繰り返して先頭を１個ずつ減らしていくと、先頭１個だけの状態に行き着く
    case _ :: tail => last(tail)
    case _ => throw new NoSuchElementException
  }
  //P01
  //写経をいじって順番を入れ替えるとうごかない。
  //  def last[A](list:List[A]): A = list match {
  //    case _ :: tail => last(tail)
  //    case h :: Nil => h
  //    case _ => throw new NoSuchElementException
  //  }

  //reduceで実装してみる
  def count(xs: List[Int]): Int = {
    if (xs.isEmpty) 0 else
      xs.reduce((curry, _) => curry + 1)
  }
}