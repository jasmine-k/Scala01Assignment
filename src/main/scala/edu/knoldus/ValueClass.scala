package edu.knoldus

class FirstName(val fname:String) extends AnyVal {

  override def toString: String = this.fname
}

class LastName(val lname:String) extends AnyVal {

  override def toString: String = this.lname
}

class Age(val agevalue:Int) extends AnyVal {

  override def toString = s"$agevalue"
}

class DisplayDetails() {

  def displayDetails(fn: FirstName, ln: LastName, age: Age): String = {
    s"$fn $ln is of $age years"
  }

}