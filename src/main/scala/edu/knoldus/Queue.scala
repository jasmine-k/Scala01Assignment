package edu.knoldus

trait Queue{
  def enqueue(ele:Int,l1:List[Int]):List[Int]
  def dequeue(l1:List[Int]):List[Int]=l1.tail
}

class DoubleQueue() extends Queue{
  def enqueue(ele:Int,l1:List[Int]):List[Int]={
    val x= ele*2
    val l2 = x::l1.reverse
    l2.reverse
  }
}

class SquareQueue() extends Queue{
  def enqueue(ele:Int,l1:List[Int]):List[Int]={
    val x1= ele*ele
    val l2 = x1::l1.reverse
    l2.reverse
  }

}
