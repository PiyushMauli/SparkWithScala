package pj.bridgelabz.scala.test

import org.scalatest.flatspec.AnyFlatSpec
import pj.bridgelabz.scala.PaymentCheck

class MonthlyPaymentTest extends AnyFlatSpec{
  it should "match" in {
    assert(461.44926337516637==new PaymentCheck(10000,2,10).monthlyPayment())
  }
}
