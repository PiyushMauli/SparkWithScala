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

object Distance {
  def main(args: Array[String]): Unit = {
    try{
      var x= Math.pow(args(0).toInt,args(0).toInt)
      var y= Math.pow(args(1).toInt,args(1).toInt)
      println(x+" "+y)
      println(Math.sqrt(x+y))
    }catch{
      case e:Exception=>println(e)
    }
  }
}
