package pj.bridgelabz.scala

object WindChill {
  def main(args: Array[String]): Unit = {
    var t=args(0).toDouble
    var v=args(1).toDouble

    if(t < 50){
      if(v>3 && v<120){
        println(35.74+(0.6215*t)+(((0.4275*t)-35.75)*(Math.pow(v,0.16))))
      }else{
        print("wind speed is not up to the mark")
      }
    }else{
      println("temprature is >50")
    }
  }
}
