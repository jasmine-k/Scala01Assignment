package edu.knoldus

import org.scalatest.FunSuite

class SumDigitsTest extends FunSuite {

  test("Check for sum of elements of list method"){
    assert(new SumDigits().sum(List(1,2,3)) == 6)
  }
}
