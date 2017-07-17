package edu.knoldus

import org.scalatest.FunSuite

class PersonTest extends FunSuite {

  test("Check for person") {
    val person1 = new Person("jas",22)
    val person2 = new Person("jasmine",21)
    assert(person1.<(person2)=== true)

  }

  test("Check for another person") {
    val person1 = new Person("jasmine",21)
    val person2 = new Person("jasmine",21)
    assert(person1.<=(person2)=== true)

  }
}
