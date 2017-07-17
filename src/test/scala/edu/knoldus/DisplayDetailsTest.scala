package edu.knoldus

import org.scalatest.FunSuite

class ValueClass extends FunSuite {

  test("Check for details of person") {
    assert(new DisplayDetails().displayDetails(new FirstName("Jasmine"), new LastName("Kaur"),new Age(22)) === "Jasmine Kaur is of 22 years")
  }
}
