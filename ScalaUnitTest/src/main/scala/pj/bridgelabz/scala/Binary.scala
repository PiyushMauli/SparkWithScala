package pj.bridgelabz.scala

import scala.io.StdIn

class Convert(var userNum:Int){
  def convertBinaryToDecimal()={
    var num=new BinaryCheck(userNum).generateBinaryNumber().toString.trim()
    var numSplit = num.split(" ")

    var zeroRequired=4-numSplit(0).length
    if(zeroRequired>0){
      for(i<- 0 until zeroRequired){
        numSplit(0)="0"+numSplit(0)
      }
    }

    var newNumber=numSplit(1)+numSplit(0)
    var sum:Double=0
    for(i<- 0 until newNumber.length){
      if(newNumber.reverse(i).asDigit == 1){
        sum=sum+Math.pow(2,i)
      }
    }
    sum

  }
}

object Binary {
  def main(args: Array[String]): Unit = {
    val userNum=StdIn.readLine("Enter a number : ").toInt

    var convert=new Convert(userNum)
    println(convert.convertBinaryToDecimal())
  }
}
