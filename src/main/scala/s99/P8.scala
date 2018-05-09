package s99

/*
(**) Eliminate consecutive duplicates of list elements.
If a list contains repeated elements they should be replaced with a single copy of the element. The order of the elements should not be changed.
Example:

scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)*/
//写経
object P8 {
  def compress[A](ls: List[A]): List[A] = {
    ls.foldRight(List[A]()){(h,r)=>
      //初期値は空のリスト
      //保持しているListの先頭（最後に加えた要素）とlsから渡ってきた要素が違えば、h と rを結合して返す
      if (r.isEmpty || r.head != h ) h :: r
      else r
    }
  }
}
/*

compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
('e,List())
('e,List('e))
('e,List('e))
('e,List('e))
('d,List('e))
('a,List('d, 'e))
('a,List('a, 'd, 'e))
('c,List('a, 'd, 'e))
('c,List('c, 'a, 'd, 'e))
('b,List('c, 'a, 'd, 'e))
('a,List('b, 'c, 'a, 'd, 'e))
('a,List('a, 'b, 'c, 'a, 'd, 'e))
('a,List('a, 'b, 'c, 'a, 'd, 'e))
('a,List('a, 'b, 'c, 'a, 'd, 'e))
res3: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)*/
