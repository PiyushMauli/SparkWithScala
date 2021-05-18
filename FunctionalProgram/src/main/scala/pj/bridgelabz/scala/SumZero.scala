package pj.bridgelabz.scala

import scala.collection.mutable.ListBuffer

object SumZero {
  def main(args: Array[String]): Unit = {
    val numbers:List[Int]=List(-1,0,1,5,4,-6,-9,-10,10)
    var addZeroLst = new ListBuffer[List[Int]]()
    var flag=false

    for(i <- 0 to (numbers.length-1)){
      for(j <- 0 to (numbers.length-1)){
        for(k <- 0 to (numbers.length-1)){
          if(i!=j && j!=k && i!=k){
            if(numbers(i)+numbers(j)+numbers(k) == 0){
              if(addZeroLst.isEmpty){
                addZeroLst += List(numbers(i),numbers(j),numbers(k))
              }else{
                for(lst <- addZeroLst){if(!lst.contains(numbers(i)) && !lst.contains(numbers(j)) && !lst.contains(numbers(k))){flag=true
                  }else{
                    flag=false
                  }
                }
                if(flag == true){
                  addZeroLst += List(numbers(i),numbers(j),numbers(k))
                }
              }
            }
          }
        }
      }
    }
    for(data<- addZeroLst){
      println(data)
    }
  }
}
