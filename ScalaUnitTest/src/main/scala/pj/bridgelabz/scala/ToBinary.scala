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

class BinaryCheck(var num:Int){
  def generateBinaryNumber()={
    var str=""
    try{
      while(num > 0){
        str=str+(num%2)
        if(str.length%4 == 0){
          str=str+" "
        }
        num=num/2
      }
      str.trim.reverse
    }catch {
      case e:NumberFormatException=> println(e)
    }
  }
}

object ToBinary {
  def main(args: Array[String]): Unit = {
    val num=StdIn.readLine("Enter a value to generate binary number : ").toInt
    val binaryCheck=new BinaryCheck(num)
    println(binaryCheck.generateBinaryNumber())
  }
}
