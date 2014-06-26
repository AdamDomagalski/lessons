package pt8

object pt1 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(58); 
  println("Scalania 26.06.2014")
	
	import Stream._;$skip(91); 
	
	// tworzenie pustego strumienia
	val stream =1 #:: 2 #::Stream.empty;System.out.println("""stream  : scala.collection.immutable.Stream[Int] = """ + $show(stream ));$skip(13); val res$0 = 
	
	stream(0);System.out.println("""res0: Int = """ + $show(res$0));$skip(11); val res$1 = 
	stream(1);System.out.println("""res1: Int = """ + $show(res$1));$skip(116); 
	//stream(2) // to rzuci blad
	
	// strumien zawsze zwracajacy ta sama wartosc
	val stream2 = Stream.continually(4);System.out.println("""stream2  : scala.collection.immutable.Stream[Int] = """ + $show(stream2 ));$skip(14); val res$2 = 
	
	stream2(0);System.out.println("""res2: Int = """ + $show(res$2));$skip(13); val res$3 = 
	stream2(10);System.out.println("""res3: Int = """ + $show(res$3));$skip(13); val res$4 = 
	stream2(20);System.out.println("""res4: Int = """ + $show(res$4));$skip(48); 
	
	
	
	val polaczonyStrumien  = 1#::2#::stream2;System.out.println("""polaczonyStrumien  : scala.collection.immutable.Stream[Int] = """ + $show(polaczonyStrumien ));$skip(27); val res$5 = 
	
	
	 polaczonyStrumien(0);System.out.println("""res5: Int = """ + $show(res$5));$skip(23); val res$6 = 
	 polaczonyStrumien(1);System.out.println("""res6: Int = """ + $show(res$6));$skip(24); val res$7 = 
	 polaczonyStrumien(30);System.out.println("""res7: Int = """ + $show(res$7));$skip(63); 
	
	
	val strumienParzystych = polaczonyStrumien.filter(_%2==0);System.out.println("""strumienParzystych  : scala.collection.immutable.Stream[Int] = """ + $show(strumienParzystych ));$skip(25); val res$8 = 
	
	strumienParzystych(0);System.out.println("""res8: Int = """ + $show(res$8));$skip(23); val res$9 = 
	strumienParzystych(1);System.out.println("""res9: Int = """ + $show(res$9));$skip(23); val res$10 = 
	strumienParzystych(2);System.out.println("""res10: Int = """ + $show(res$10))}
	
}
