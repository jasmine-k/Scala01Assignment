package edu.knoldus

import org.scalatest.FunSuite

class AreaShapesTest extends FunSuite {

  test("Check for Area of rectangle shapes") {
    assert(new AreaShapes().areaCalc("rectangle",2,4,new AreaShapes().rectangle) === "Area is 8")
  }

  test("Check for Area of rhombus shapes") {
    assert(new AreaShapes().areaCalc("rhombus",2,4,new AreaShapes().rhombus) === "Area is 4")
  }

  test("Check for Area of parallelogram shapes") {
    assert(new AreaShapes().areaCalc("parallelogram",2,4,new AreaShapes().parallelogram) === "Area is 8")
  }

}
