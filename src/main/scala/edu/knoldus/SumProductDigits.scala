
package edu.knoldus

class SumProductDigits {

  def sumOfDigits(n: Int): Int = {
    if(n == 0){
      0
    }
    else {
      n % 10 + sumOfDigits(n/10)
    }
  }

  def product(n: Int): Int = {
    if(n == 0){
      1
    }
    else {
      n * product(n-1)
    }
  }

  def sumOfProduct(n: Int): Int = {
    val num = product(n)
    sumOfDigits(num)
  }

}
