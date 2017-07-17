package edu.knoldus

class PascalTriangle {

  def pascal(c: Int, r: Int): Int = {
    if(c>r)
    {
      print("Column should be less than row" + "\n")
      -1
    }
    else if(c==0 || c==r){
      1
    }
    else{
      pascal(c-1,r-1) + pascal(c,r-1)
    }
  }

}
