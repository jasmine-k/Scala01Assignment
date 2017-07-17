package edu.knoldus

import org.scalatest.FunSuite

class StringDoubletTest extends FunSuite {

  test("Check for find doubles method") {
    assert(new StringDoublet().findDoubles("abbbbcccddaad") == "bbbbccddaa")
  }

}
