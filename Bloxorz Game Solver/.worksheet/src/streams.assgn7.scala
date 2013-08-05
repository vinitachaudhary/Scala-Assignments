package streams

import common._

object assgn7 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(123); 
  
  val l = Vector(('S', List(4,6,2)), ('o', List(0)), ('y', List(1,2)));System.out.println("""l  : scala.collection.immutable.Vector[(Char, List[Int])] = """ + $show(l ));$skip(41); val res$0 = 
  
  l.sortWith(_._2.length<_._2.length);System.out.println("""res0: scala.collection.immutable.Vector[(Char, List[Int])] = """ + $show(res$0))}
  
  //levelvec.indexWhere(t => t.exists(z => z=='S'))
   
	/*object InfiniteLevel extends Solver with InfiniteTerrain {
    val startPos = Pos(1,3)
    val goal = Pos(5,8)
  }*/
  
  
  
  
}
