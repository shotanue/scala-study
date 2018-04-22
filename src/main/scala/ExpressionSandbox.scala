object ExpressionSandbox extends App {
  //Unitをつけると戻り値なし
  //  def foo(): String = Unit{　これはコンパイルエラーになる
  def foo(): String = {
    //barは返らない errorがうざいのでコメントアウトしておく
    //    "bar"
    //fooが返る
    "foo"
  }

  //Unit ==　戻り値なし
  def hoge(): Unit = {
    println("hoge")
  }

  //どれも実行される（IDE的には丸括弧なしにハイライトが付いているので何かまずそう）
  println(foo) //foo
  println(foo()) //foo
  hoge() //hoge
  hoge //hoge


  //ただの変数定義
  val hoga = 1

  //{}式を入れてみると？、定義時に1度実行されるみたい
  //ただし再度実行はできない？？
  //Unitをつけないと
  //Type annotation required for Unit definition とIDEに言われる
  val func: Unit = {
    println("print from func")
  }

  //匿名関数はこんな感じ
  //関数リテラルというのか？
  val plus = (i: Int, ii: Int) => {
    i + ii
  }

  val res = plus(1, 3)
  println(res)

  //即時関数は関数の定義部分を（）で囲わないといけない
  ((s: String) => {
    println(s)
  }) ("hoge!!!")

  /* PHP7はこんな感じでいけたような
  * function($s){echo $s;}('hoge');
  * */

  println(((i: Int) => {
    i * i
  }) (3)) //9

  "hoge".toSeq.foreach((c) => {
    print(s"${c}")
  }) //縦書きでhoge

  println()
  println("----items---------")
  val the_list = List("sazae", "dora", "chibimaru", "urutora")
  the_list.reduce((i, ii) => {
    print(s"${i},${ii}");
    ""
  })
  println()

  //sazaeだけとる
  the_list.filter((s) => {
    s.r.findAllIn("sazae").matchData.nonEmpty
  }).foreach((s) => {
    println(s)
  })


  val ages = 1 to 6
  ages.foreach((i: Int) => {
    if (0 < i && i < 6) println("幼児です") else println("幼児ではありません")
  })


  //こういうMapが3つあったとして
  //  val f_name = Map(1 -> "ほげ山", 2 -> "ふが川")
  //  val name = Map(1 -> "ほげ太郎", 2 -> "ふが子")
  //  val sex = Map(1 -> "男性", 2 -> "女性")

  /*
  * 下のこれをやりたいが。。。
<?php

$f_name = ['ほげかわ', 'ふがやま'];
$name = ['ほげ太郎', 'ふがこ'];
$sex = ['男性', '女性'];

$aggregate = function($f_name,$name,$sex){return compact('f_name', 'name', 'sex');};

$res = array_map($aggregate,$f_name, $name,$sex);
var_dump($res);

/*
array(2) {
  [0]=>
  array(3) {
    ["f_name"]=>
    string(12) "ほげかわ"
    ["name"]=>
    string(12) "ほげ太郎"
    ["sex"]=>
    string(6) "男性"
  }
  [1]=>
  array(3) {
    ["f_name"]=>
    string(12) "ふがやま"
    ["name"]=>
    string(9) "ふがこ"
    ["sex"]=>
    string(6) "女性"
  }
}
*/


  * */
  //PHPのarray_mapは可変長引数なのでそれっぽいことをやろうとしたがうまくいかない。
  //  List(f_name, name, sex).map((f: Map[Int, String], name: Map[Int, String], sex: Map[Int, String]) => {""})

  //多次元配列
  //初期化して２x３個用意
  val c = Array.ofDim[String](2, 3)

  println(c.deep) //Array(Array(null, null, null), Array(null, null, null))


  c(0)(0) = "hoge"
  c(1)(1) = "fuga"
  println(c.deep) //Array(Array(hoge, null, null), Array(null, fuga, null))
  //キー（インデックス）は文字列にできないのだろうか


  val tmp = (new s99).nth(2, List(1,2,3,4))
  println(tmp)

}
