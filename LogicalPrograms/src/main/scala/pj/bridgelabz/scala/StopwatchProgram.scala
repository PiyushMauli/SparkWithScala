package pj.bridgelabz.scala

import java.util.Date
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

object StopwatchProgram {
  def main(args: Array[String]): Unit = {
    val start=new Date().getTime
    val num=StdIn.readLine("Enter 1 to stop the timer").toInt
    if(num==1){
      val end=new Date().getTime
      println((end-start)/1000f+" sec")
    }
  }
}
