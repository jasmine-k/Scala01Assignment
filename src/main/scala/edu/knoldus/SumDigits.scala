package edu.knoldus

class SumDigits {

  def sum(list: List[Int]): Int = {

    def sumRecursive(list: List[Int], sum: Int): Int = {
      if(list.isEmpty) {
        sum
      }
      else{
        sumRecursive(list.tail, list.head + sum)
      }
    }

    sumRecursive(list, 0)
  }


}
