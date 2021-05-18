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

object TwoDArray {
  def checkArray(m:Int,n:Int): Unit ={
    var arr=Array.ofDim[Int](m,n)
    try{
      for(i<-0 until m;j<-0 until n){
        arr(i)(j)=StdIn.readLine("Enter a number : ").toInt
      }
      println()
      for(i<-0 until m){
        for(j<- 0 until n){
          print(arr(i)(j)+" ")
        }
        println()
      }
    }catch{
      case e:Exception=>println(e)
    }
  }
  def main(args: Array[String]): Unit = {
    println("Enter M and N value for multidimentional array")
    val m=StdIn.readLine("M : ").toInt
    val n=StdIn.readLine("N : ").toInt
    TwoDArray.checkArray(m,n)
  }
}
