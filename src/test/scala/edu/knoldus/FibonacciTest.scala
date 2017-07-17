package edu.knoldus

import org.scalatest.FunSuite

class FibonacciTest extends FunSuite {

  test("Check for Fibonacci") {
    assert(new Fibonacci().fibonacci(5) === List(0,1,1,2,3,5))
  }

}
