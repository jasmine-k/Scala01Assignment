package edu.knoldus

class AddingValues {

  def sum(f:((Int,Int) => Int),a: Int, b:Int): Int=
  {
    val res = f (a,b)
    res
  }

  def square(a:Int,b:Int):Int={
    a*a  + b*b
  }

  def cubes(a:Int,b:Int):Int={
    a*a*a + b*b*b
  }

  def ints(a:Int,b:Int):Int={
    a + b
  }

}

