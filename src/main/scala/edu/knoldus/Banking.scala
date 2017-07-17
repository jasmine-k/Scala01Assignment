package edu.knoldus

case class Banking(id: Int, name: String, balance: Double){

  require(id>0 && name != "")
  def credit(amount: Double): Banking = {
    new Banking(this.id, this.name, balance + amount)
  }

  def debit(amount: Double): Banking = {
    if (balance < amount) {
      println("Can't proceed, insufficient balance!")
      new Banking(this.id, this.name, balance)
    }
    else {
      new Banking(this.id, this.name, balance - amount)
    }
  }

}
