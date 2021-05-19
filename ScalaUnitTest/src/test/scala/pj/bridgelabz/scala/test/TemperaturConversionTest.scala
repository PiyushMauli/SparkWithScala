package pj.bridgelabz.scala.test

import org.scalatest.flatspec.AnyFlatSpec
import pj.bridgelabz.scala.TempratureCheck

class TemperaturConversion extends AnyFlatSpec{
  it should "match" in {
    assert(122==new TempratureCheck(degreeCelsius = 50).temperaturConversionCelsius())
  }
  it should "match2" in {
    assert(10==new TempratureCheck(degreeFahrenhit = 50).temperaturConversionFahrenhit())
  }
}
