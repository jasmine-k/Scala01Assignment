package edu.knoldus

class StringDoublet {

  def findDoubles(str: String): String = {

    def findDoubles1(str: String, pos: Int, output: String): String = {
      if(pos >= str.length()-1){
        output
      }
      else if(str(pos)==str(pos + 1)){
        val ch = str(pos) + "" + str(pos)
        findDoubles1(str,pos + 2,output + ch)
      }
      else{
        findDoubles1(str, pos + 1, output)
      }
    }

    findDoubles1(str,0,"")
  }

}
