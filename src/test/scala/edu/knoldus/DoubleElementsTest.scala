package edu.knoldus

import org.scalatest.FunSuite

class DoubleElementsTest extends FunSuite {

  test("Check for double elements of list") {
    assert(new DoubleElements().doubleEle(List(1,-2,3,4)) === List(2,-4,6,8))
  }

}
