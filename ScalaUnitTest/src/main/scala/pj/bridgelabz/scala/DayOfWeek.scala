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

class CalenderCheck(var year:Int,var month:Int,var day:Int){
  def checkDay()={
    try{
      year = year-(14-month )/ 12
      var x = year + year /4 - year /100 + year /400
      month = month + 12 * ((14 - month ) / 12) - 2
      day  = ( day + x + 31*month / 12) % 7
    }catch{
      case e:Exception=>println(e)
    }
    var result = day match{
      case 0 => "Sunday"
      case 1 => "Monday"
      case 2 => "Tuesday"
      case 3 => "Wednesday"
      case 4 => "Thursday"
      case 5 => "Friday"
      case 6 => "Saturday"
    }
    result
  }
}

object dayOfWeek {
  def main(args: Array[String]): Unit = {
    var year=args(0).toInt
    var month=args(1).toInt
    var day=args(2).toInt

    println(day+"/"+month+"/"+year+":")

    var calenderCheck=new CalenderCheck(year,month,day)
    println(calenderCheck.checkDay())

  }
}
