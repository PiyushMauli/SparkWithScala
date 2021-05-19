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

class TempratureCheck(var degreeCelsius:Int=50,var degreeFahrenhit:Int=50){
  def temperaturConversionCelsius()={
    try{
      (degreeCelsius * 9/5) + 32
    }catch {
      case e:ArithmeticException=> println(s"e = ${e}")
    }
  }
  def temperaturConversionFahrenhit()={
    try{
      (degreeFahrenhit - 32) * 5/9
    }catch{
      case e:ArithmeticException=> println(s"e = ${e}")
    }
  }
}
object TemperaturConversion {
  def main(args: Array[String]): Unit = {
    var celsius=StdIn.readLine("Enter value to convert degreeCelsius to degreeFahrenhit").toInt
    var fahrenhit=StdIn.readLine("Enter value to convert degreeFahrenhit to degreeCelsius").toInt

    var tempratureCheck=new TempratureCheck(celsius,fahrenhit)
    println(tempratureCheck.temperaturConversionCelsius())
    println(tempratureCheck.temperaturConversionFahrenhit())
  }
}
