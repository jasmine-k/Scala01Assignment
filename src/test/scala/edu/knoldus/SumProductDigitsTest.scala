
package edu.knoldus

import org.scalatest.FunSuite

class SumProductDigitsTest extends FunSuite {

  test("Check for sum of digit of product method"){
    assert(new SumProductDigits().sumOfProduct(5) == 3)
  }

}
