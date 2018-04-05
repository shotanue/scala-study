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

//  println(Map(0 =>(Map( "name"->"fugataro"), Map("sex"->"male")))
  val grouped  = List(Array(Map( "name"->"fugataro"), Map("sex"->"male")))

//  val op = (x:String ,y:String )=> println(x,y)
//  grouped map {case (x, y )=> op(x,y)}

  /*
  list($first_g, $second_g) = $res;
  var_dump($first_g,$second_g);


  array(3) {
    ["f_name"]=>
    string(12) "ほげかわ"
    ["name"]=>
    string(12) "ほげ太郎"
    ["sex"]=>
    string(6) "男性"
  }
  array(3) {
    ["f_name"]=>
    string(12) "ふがやま"
    ["name"]=>
    string(9) "ふがこ"
    ["sex"]=>
    string(6) "女性"
  }

  * */


}
