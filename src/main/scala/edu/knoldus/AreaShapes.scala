package edu.knoldus

class AreaShapes {

  def areaCalc(shape: String, first: Int, second: Int, f: ((Int, Int) => Int)): String = {

    shape.toLowerCase match {

      case "rectangle" => {
        val res = f(first, second)
        s"Area is $res"
      }
      case "rhombus" => {
        val res = f(first, second)
        s"Area is $res"
      }
      case "parallelogram" => {
        val res = f(first, second)
        s"Area is $res"
      }
      case _ => s"Undefined shape"
    }

  }

  def rectangle(first: Int, second: Int): Int = {
    first * second
  }

  def parallelogram(first: Int, second: Int): Int = {
    first * second
  }

  def rhombus(first: Int, second: Int): Int = {
    first * second / 2
  }
}
