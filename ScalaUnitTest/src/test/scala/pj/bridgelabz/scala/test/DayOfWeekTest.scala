package pj.bridgelabz.scala.test

import org.scalatest.flatspec.AnyFlatSpec
import pj.bridgelabz.scala.CalenderCheck

case class DayOfWeekTest() extends AnyFlatSpec{
  it should "match" in {
    assert("Wednesday"==new CalenderCheck(2021,5,5).checkDay())
  }

  it should "match2" in {
    assert("Friday"==new CalenderCheck(2006,5,5).checkDay())
  }
}
