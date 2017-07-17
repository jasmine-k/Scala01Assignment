package edu.knoldus

class Fibonacci {

  def fibonacci(numElements: Int): List[Int] = {
    val list = List(0, 1)
    val first = 0
    val second = 1
    def fibo(list: List[Int], numElements: Int, first: Int, second: Int): List[Int] = {
      if (numElements < 0){
        list
      }
      else {
        val sum = List(first + second)
        fibo(list ::: sum, numElements - 1, second, first + second)
      }
    }
    fibo(list, numElements - 2, first, second)
  }

}
