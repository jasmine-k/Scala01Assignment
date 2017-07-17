package edu.knoldus

import org.scalatest.FunSuite

class BankingTest extends FunSuite {

  test("Check for credit method"){
    assert(Banking(1, "Jasmine",0.0).credit(1000.0) == Banking(1,"Jasmine",1000.0))
  }

  test("Check for debit method"){
    assert(Banking(1, "Jas", 5000.0).debit(1000.0) == Banking(1,"Jas",4000.0))
  }
}
