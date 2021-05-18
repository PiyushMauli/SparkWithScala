package pj.bridgelabz.scala

import scala.io.StdIn

//@Author: Author Name
//
//@Date: 2021-02-11 18:00:30
//
//@Last Modified by: Author Name
//
//@Last Modified time: 2021-02-11 18:00:30
//
//@Title : Program Aim

object PowerOf {
  def powerOfTable(num:Int)={
    try{
      var number=num
      for(i <- 0 to number){
        println("2^"+i+"="+math.pow(2,i))
      }
    }catch{
      case e:Exception=> println(s"e = ${e}")
    }
  }
  def main(args: Array[String]): Unit = {
    val number=StdIn.readLine("Enter a number between 0 to 30 : ").toInt
    if(number>0 && number<31){
      PowerOf.powerOfTable(number)
    }
  }
}
