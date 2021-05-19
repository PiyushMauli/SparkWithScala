package pj.bridgelabz.scala

import scala.collection.mutable.ListBuffer
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

class CheckNotes(var rupees:Int){
  def calculateNumberOfNotes()={
    val arrOfNotes=Array(1000,500,100,50,10,5,2,1)
    val rupeesList=ListBuffer[Int]();
    var numberOfNotes=0
    try{
      while(rupees>0){
        for(i <- arrOfNotes){
          numberOfNotes=numberOfNotes+(rupees/i)
          if((rupees/i) > 0){
            rupeesList.append(i)
          }
          rupees=rupees%i
        }
      }
      numberOfNotes
    }catch{
      case e:Exception=> println(s"e = ${e}")
    }
  }
}

object VendingMachine {
  def main(args: Array[String]): Unit = {
    val rupees=StdIn.readLine("Enter how much amount you want to withdraw : ").toInt

    val checkNotes=new CheckNotes(rupees)
    println("Number of notes : "+checkNotes.calculateNumberOfNotes())
  }
}

