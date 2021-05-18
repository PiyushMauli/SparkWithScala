package pj.bridgelabz.scala

import scala.io.StdIn
import scala.util.Random

//@Author: Author Name
//
//@Date: 2021-02-11 18:00:30
//
//@Last Modified by: Author Name
//
//@Last Modified time: 2021-02-11 18:00:30
//
//@Title : Program Aim

object FlipCoinPercentage {
  def findPercentage(num:Int)={
    var heads:Double=0.0
    var tails:Double=0.0
    var flipCoinNumbers=num
    try{
      while(flipCoinNumbers != 0){
        val randomValue=new Random().nextDouble()
        if(randomValue < 0.5) tails+=1 else heads+=1
        flipCoinNumbers-=1
      }
      println("Heads % = "+(heads/num)*100+" & Tails % ="+(tails/num)*100)
    }catch {
      case e:Exception=> println(s"e = ${e}")
    }
  }
  def main(args: Array[String]): Unit = {
    val  number= StdIn.readLine("How many times you want to flip the coin ??")
    if(number.toInt > 0){
      FlipCoinPercentage.findPercentage(number.toInt)
    }
  }
}
