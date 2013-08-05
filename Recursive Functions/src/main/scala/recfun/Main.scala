package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1	Generating Pascal Triangle
   */
  def pascal(c: Int, r: Int): Int = {
    if (c==0 || c==r || r==0) 1
    else pascal(c,r-1)+pascal(c-1,r-1)
  }

  /**
   * Exercise 2 Parantheses Balancing 
   */
  def balance(chars: List[Char]): Boolean = {
    val temp=chars.filter(x=> x=='(' || x==')')
    
    def bal(tempL:List[Char]):Boolean = {
    	if (tempL.isEmpty) true
    	else if (tempL.head==')') false
    	  else if (tempL.tail.isEmpty) false
    	  else bal(tempL.tail diff List(')'))
    }
    bal(temp)
  }

  /**
   * Exercise 3 Make change for an amount, given a list of coin denominations
   */
  
  def countChange(money: Int, coins: List[Int]): Int = {
     var count=0
     def sortedList=coins.sortWith(_>_)
     
     def counter(money:Int, scoins: List[Int]):Int = {
       if(money==0) {count=count+1;count}
       	else if (scoins.isEmpty) count
       			else if (money<scoins.head) {
       				if (scoins.tail.isEmpty) 0
       				else counter(money,scoins.tail)
       			}
       				else {
       					scoins.foreach(arg=>counter(money-arg,scoins.filter(x=> x<=arg)))
       					count
       				}
     }
     
     if (money==0) 0
     else {
     	val v=counter(money,sortedList)
     	count
     }
  	}     
}
