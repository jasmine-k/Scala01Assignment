package edu.knoldus

class Person(val name:String, val age:Int) extends Ordered[Person] {

  override def compare(that: Person) = {
    that.name match {
      case this.name => this.age - that.age
      case _ => this.name.length() - that.name.length()
    }
  }

}

