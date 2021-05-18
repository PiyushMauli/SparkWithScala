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

object HarmonicNumber {
  def calHarmonic(num:Int)={
    try{
      var sum:Double=0.0
      for(i <- 1 to num){
        sum+=(1f/i)
        println(sum)
      }
      println(sum)
    }catch{
      case e:Exception=> println(s"e = ${e}")
    }
  }
  def main(args: Array[String]): Unit = {
    val number=StdIn.readLine("Enter a number greater than 0 : ").toInt
    if(number>0){
      calHarmonic(number)
    }
  }
}
