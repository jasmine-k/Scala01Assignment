package edu.knoldus

import org.scalatest.FunSuite

class PascalTriangleTest extends FunSuite {

  test("Check for pascal method"){
    assert(new PascalTriangle().pascal(3,4) == 4)
  }

  test("Check for pascal method again"){
    assert(new PascalTriangle().pascal(4,3) == -1)
  }


}
