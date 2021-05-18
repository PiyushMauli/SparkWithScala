package pj.bridgelabz.scala

import scala.io.StdIn
import scala.util.control.Breaks.{break, breakable}

//@Author: Author Name
//
//@Date: 2021-02-11 18:00:30
//
//@Last Modified by: Author Name
//
//@Last Modified time: 2021-02-11 18:00:30
//
//@Title : Program Aim

object Factorization {
  def primeFactorization(num:Int)={
    var number=num
    var str:String=""
    var flag=true
    try{
      while(flag){
        breakable{
          for(i<- 2 to number/2){
            if(number%i==0){
              str+=i+"X"
              number=number/i
              break
            }
          }
          flag=false
        }
      }

      str+=number
      println(str)
    }catch{
      case e:Exception=> println(s"e = ${e}")
    }
  }
  def main(args: Array[String]): Unit = {
    var number=StdIn.readLine("Enter a number").toInt;
    var flag=0
    for (i <- 2 to number/2){
      if(number%i==0) {
        flag = 1
      }
    }
    if(flag==0){
      println("prime factorization is : "+number)
    }else{
      primeFactorization(number)
    }
  }
}
