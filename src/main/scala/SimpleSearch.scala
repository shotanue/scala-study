object SimpleSearch extends App {
  val text = "fugafugahogehogefuga"
  val pattern = "fuga"
  val matchIndexes = pattern.r.findAllIn(text).matchData.map(_.start).toList
  println(s"出現場所: ${matchIndexes}")
}