package edu.knoldus

import org.scalatest.FunSuite

class QueueTest extends FunSuite {

  test("Check for DoubleQueue") {
    assert(new DoubleQueue().enqueue(4,List(1,2,3)) === List(1,2,3,8))
  }

  test("Check for SquareQueue") {
    assert(new SquareQueue().enqueue(4,List(1,2,3)) === List(1,2,3,16))
  }
}
