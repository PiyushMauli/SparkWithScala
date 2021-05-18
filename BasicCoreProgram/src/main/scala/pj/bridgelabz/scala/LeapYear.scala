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

object LeapYear {
  def checkLeapYear(num:Int)={
    try{
      if(num % 100 ==0){
        if(num % 4 ==0 && num %400==0){
          println("Leap Year")
        }else{
          println("Not a leap year")
        }
      }else if(num % 4==0){
        println("leap year")
      }
    }catch{
      case e:Exception=> println(s"e = ${e}")
      case ex:ArithmeticException=> println(s"ex = ${ex}")
    }
  }
  def main(args: Array[String]): Unit = {
    val number=StdIn.readLine("Enter a year : ")
    if(number.length > 3){
      checkLeapYear(number.toInt)
    }
  }
}
