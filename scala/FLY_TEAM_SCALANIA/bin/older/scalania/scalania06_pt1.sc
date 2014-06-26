object scalania06_pt1 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  1 to 100                                        //> res0: scala.collection.immutable.Range.Inclusive = Range(1, 2, 3, 4, 5, 6, 7,
                                                  //|  8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27
                                                  //| , 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46,
                                                  //|  47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 
                                                  //| 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 8
                                                  //| 5, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100)
  
  val random=scala.util.Random                    //> random  : util.Random.type = scala.util.Random$@6e3c330a
  random.nextInt(100)                             //> res1: Int = 92
  val randomRecords = 1 to 17                     //> randomRecords  : scala.collection.immutable.Range.Inclusive = Range(1, 2, 3,
                                                  //|  4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17)
  val aaa = randomRecords.map(new Record(_,random.nextInt(100)))
                                                  //> aaa  : scala.collection.immutable.IndexedSeq[Record] = Vector(Record(1,56), 
                                                  //| Record(2,39), Record(3,78), Record(4,40), Record(5,31), Record(6,58), Record
                                                  //| (7,6), Record(8,70), Record(9,77), Record(10,77), Record(11,68), Record(12,2
                                                  //| 9), Record(13,19), Record(14,49), Record(15,1), Record(16,90), Record(17,44)
                                                  //| )
  def najwiekszy (lista:List[Record],start:Record=Record(0,0)):Record=lista match{
  case (record @ Record(id,_))::Nil => if (id > start.id) record else start
  case (record @ Record(id,_))::(record2 @ Record(id2,_))::tail => if (id > id2) najwiekszy(tail, record) else najwiekszy(tail, record2)
  case _ => throw new RuntimeException ("nie ma")
  }                                               //> najwiekszy: (lista: List[Record], start: Record)Record
  
  najwiekszy(aaa.toList)                          //> res2: Record = Record(17,44)
  
  
  
  
   



//-------------
def compararara(rekord1: Record, rekord2: Record): Record = {
		println(rekord1.id+","+rekord2.id);
    if (rekord1.id > rekord2.id) rekord1 else rekord2
  }                                               //> compararara: (rekord1: Record, rekord2: Record)Record

  def najwiekszy2(comparator: (Record, Record) => Record, lista: List[Record], start: Record = Record(0, 0)): Record = lista match {
    case (record @ Record(id, _)) :: Nil => comparator(record,start)
    case (record @ Record(id, _))::(record2 @ Record(id2, _))::tail => najwiekszy2(comparator,tail,comparator(comparator(record,record2),start))
    case _ => throw new RuntimeException("nie ma")
  }                                               //> najwiekszy2: (comparator: (Record, Record) => Record, lista: List[Record], 
                                                  //| start: Record)Record

	najwiekszy2(compararara, aaa.toList)      //> 1,2
                                                  //| 2,0
                                                  //| 3,4
                                                  //| 4,2
                                                  //| 5,6
                                                  //| 6,4
                                                  //| 7,8
                                                  //| 8,6
                                                  //| 9,10
                                                  //| 10,8
                                                  //| 11,12
                                                  //| 12,10
                                                  //| 13,14
                                                  //| 14,12
                                                  //| 15,16
                                                  //| 16,14
                                                  //| 17,16
                                                  //| res3: Record = Record(17,44)

  }

case class Record(id:Int, value:Long)