object scalania06_pt2 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  val random = scala.util.Random                  //> random  : util.Random.type = scala.util.Random$@3366184d
  random.nextInt(100)                             //> res0: Int = 15
  val randomRecords = 1 to 17                     //> randomRecords  : scala.collection.immutable.Range.Inclusive = Range(1, 2, 3,
                                                  //|  4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17)
  val aaa = randomRecords.map(new Record(_, random.nextInt(100)))
                                                  //> aaa  : scala.collection.immutable.IndexedSeq[Record] = Vector(Record(1,65), 
                                                  //| Record(2,11), Record(3,47), Record(4,60), Record(5,24), Record(6,33), Record
                                                  //| (7,34), Record(8,65), Record(9,63), Record(10,69), Record(11,31), Record(12,
                                                  //| 58), Record(13,76), Record(14,52), Record(15,61), Record(16,16), Record(17,5
                                                  //| 5))

  def compararara(rekord1: Record, rekord2: Record): Record = {

    if (rekord1.id > rekord2.id) rekord1 else rekord2
  }                                               //> compararara: (rekord1: Record, rekord2: Record)Record

  def najwiekszy(comparator: (Record, Record) => Record, lista: List[Record], start: Record = Record(0, 0)): Record = lista match {
    case (record @ Record(id, _)) :: Nil => if (id > start.id) record else start
    // case (record @ Record(id,_))::(record2 @ Record(id2,_))::tail => najwiekszy(tail, comparator(record,record2))
    case _ => throw new RuntimeException("nie ma")
  }                                               //> najwiekszy: (comparator: (Record, Record) => Record, lista: List[Record], st
                                                  //| art: Record)Record
      
}
case class Record(id: Int, value: Long)