package pj.bridgelabz.scala

//@Author: Author Name
//
//@Date: 2021-02-11 18:00:30
//
//@Last Modified by: Author Name
//
//@Last Modified time: 2021-02-11 18:00:30
//
//@Title : Program Aim

object Quadratic {
  def main(args: Array[String]): Unit = {
    var a=args(0).toInt
    var b=args(1).toInt
    var c=args(2).toInt

    try{
      var delta=Math.pow(b,2)-(4*a*c)

      println((-b+(Math.sqrt(delta)))/(2*a))
      println((-b-(Math.sqrt(delta)))/(2*a))
    }catch{
      case e:ArithmeticException => println(s"e = ${e}")
    }
  }
}
