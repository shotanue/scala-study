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
  println(foo)  //foo
  println(foo()) //foo
  hoge() //hoge
  hoge //hoge


  //ただの変数定義
  val hoga = 1

  //{}式を入れてみると？、定義時に1度実行されるみたい
  //ただし再度実行はできない？？
  //Unitをつけないと
  //Type annotation required for Unit definition とIDEに言われる
  val func:Unit = {
    println("print from func")
  }

  //匿名関数はこんな感じ
  //関数リテラルというのか？
  val plus = (i:Int, ii:Int) => {i + ii}

  val res  = plus(1,3)
  println(res)

  //即時関数は関数の定義部分を（）で囲わないといけない
  ((s:String) => { println(s) })("hoge!!!")

  /* PHP7はこんな感じでいけたような
  * function($s){echo $s;}('hoge');
  * */

  println(((i:Int)=>{i * i})(3))   //9

  "hoge".toSeq.foreach((c)=>{print(s"${c}")}) //縦書きでhoge

  println()
  println("----items---------")
    val the_list = List("sazae","dora","chibimaru", "urutora")
  the_list.reduce((i, ii)=>{print(s"${i},${ii}");""})
  println()

  //sazaeだけとる
  the_list.filter((s)=>{s.r.findAllIn("sazae").matchData.nonEmpty}).foreach((s)=>{println(s)})

}
