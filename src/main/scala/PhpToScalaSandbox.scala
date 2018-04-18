object PhpToScalaSandbox extends App {
  /*
  * PHPでできる下記のコードをscalaの世界で書いてみたい
  * <?php

  $f_name = ['ほげかわ', 'ふがやま'];
  $name = ['ほげ太郎', 'ふがこ'];
  $sex = ['男性', '女性'];

  $aggregate = function($f_name,$name,$sex){return compact('f_name', 'name', 'sex');};

  $res = array_map($aggregate,$f_name, $name,$sex);
  var_dump($res);

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

  val f_name = Array("ほげかわ", "ふがやま")
  val name = Array("ほげ太郎", "ふがこ")
  val sex = Array("男性", "女性")

  //zipをつくとタプルができるらしいので、三つ繋げるとこうなる
  //((ほげかわ,ほげ太郎),男性)
  //((ふがやま,ふがこ),女性)

  // mapにパターンマッチを入れられるようなので、
  // こんな感じのことをすると、それっぽいのができる見たい。
  // ただし、３種類全て同じ数じゃないと、溢れた分は消えてしまう様子。
  val grouped = f_name zip name zip sex map {
    case ((a, b), c) => (a, b, c)
  }

  grouped.foreach(println)


}
