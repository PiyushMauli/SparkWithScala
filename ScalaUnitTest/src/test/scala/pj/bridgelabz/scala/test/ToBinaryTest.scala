package pj.bridgelabz.scala.test

import org.scalatest.flatspec.AnyFlatSpec
import pj.bridgelabz.scala.BinaryCheck

class ToBinaryTest extends AnyFlatSpec{
  it should "match" in {
    assert("110 1010"==new BinaryCheck(106).generateBinaryNumber())
  }
  it should "match2" in {
    assert("10 1100"==new BinaryCheck(44).generateBinaryNumber())
  }
}
