package edu.knoldus

class AddElements {

  def add(list1: List[Int], list2: List[Int]): List[Int] = {
    val size = 0

    def sum(list1: List[Int], list2: List[Int], list: List[Int], size: Int): List[Int] = {
      if (size >= list1.length) {
        list
      }

      else {
        sum(list1, list2,(list1(size) + list2(size)) :: list, size + 1)
      }

    }
    val list = List[Int]()
    sum(list1, list2, list,size).reverse

  }
}

