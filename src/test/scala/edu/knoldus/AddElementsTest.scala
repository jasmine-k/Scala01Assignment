package edu.knoldus

import org.scalatest.FunSuite

class AddElementsTest extends FunSuite {

  test("Check for adding elements of two lists") {
    val list1 = List(1,2,30,4,5)
    val list2 = List(1,2,3,4,5)
    val list3 = List(2,4,33,8,10)
    assert(new AddElements().add(list1,list2) === list3)

  }

}
