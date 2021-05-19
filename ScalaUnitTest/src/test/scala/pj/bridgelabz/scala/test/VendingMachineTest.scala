package pj.bridgelabz.scala.test

import org.scalatest.flatspec.AnyFlatSpec
import pj.bridgelabz.scala.CheckNotes

class VendingMachineTest extends AnyFlatSpec{
  it should "match" in {
    assert(9==new CheckNotes(972).calculateNumberOfNotes())
  }
  it should "match2" in {
    assert(19==new CheckNotes(12543).calculateNumberOfNotes())
  }
}