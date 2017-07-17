package edu.knoldus

import org.scalatest.FunSuite

class AddingValuesTest extends FunSuite {

  test("Check number 1") {
    assert(new AddingValues().cubes(2,3) === 35)
  }

  test("Check number 2") {
    assert(new AddingValues().square(2,3) === 13)
  }

  test("Check number 3") {
    assert(new AddingValues().ints(2,3) === 5)
  }
}
