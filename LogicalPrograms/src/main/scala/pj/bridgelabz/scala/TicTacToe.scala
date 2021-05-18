package pj.bridgelabz.scala

import scala.io.StdIn
import scala.util.Random
import scala.util.control.Breaks.{break, breakable}

object TicTacToe {
  def main(args: Array[String]): Unit = {
    var ticTacToe=Array.ofDim[Int](3,3)
    var flag=true
    var userSpace=true
    var computerSpace=true
    while(flag){
      println("current statue : ")
      for(i<- 0 until 3){
        for(j <- 0 until 3){
          print(ticTacToe(i)(j)+" ")
        }
        println()
      }

      while(userSpace){
        println("Enter value in row and column format : ")
        var row=StdIn.readLine("Enter value for row index : ").toInt
        var column=StdIn.readLine("Enter value for column index : ").toInt

        if(ticTacToe(row)(column)==0){
          ticTacToe(row)(column)=1
          userSpace=false
        }else{
          userSpace=true
        }
      }
      userSpace=true

      while(computerSpace){
        var computerRow=new Random().nextInt(3).toInt
        var computerColumn=new Random().nextInt(3).toInt
        if(ticTacToe(computerRow)(computerColumn)==0){
          ticTacToe(computerRow)(computerColumn)=2
          computerSpace=false
        }else{
          computerSpace=true
        }
      }
      computerSpace=true;
      breakable{
        for(i<-0 until 3){
          breakable{
            for(j<- 0 until 3){
              if((ticTacToe(0)(0)==1 && ticTacToe(1)(0)==1 && ticTacToe(2)(0)==1)||(ticTacToe(0)(1)==1 && ticTacToe(1)(1)==1 && ticTacToe(2)(1)==1)||(ticTacToe(0)(2)==1 && ticTacToe(1)(2)==1 && ticTacToe(2)(2)==1)||(ticTacToe(0)(0)==1 && ticTacToe(0)(1)==1 && ticTacToe(0)(2)==1)||(ticTacToe(1)(0)==1 && ticTacToe(1)(1)==1 && ticTacToe(1)(2)==1)||(ticTacToe(2)(0)==1 && ticTacToe(2)(1)==1 && ticTacToe(2)(2)==1)||(ticTacToe(0)(0)==1 && ticTacToe(1)(1)==1 && ticTacToe(2)(2)==1)||(ticTacToe(0)(2)==1 && ticTacToe(1)(1)==1 && ticTacToe(2)(0)==1)){
                println("Congratulations !!! You won the game !!!")
                flag=false
                break
              }else if((ticTacToe(0)(0)==2 && ticTacToe(1)(0)==2 && ticTacToe(2)(0)==2)||(ticTacToe(0)(1)==2 && ticTacToe(1)(1)==2 && ticTacToe(2)(1)==2)||(ticTacToe(0)(2)==2 && ticTacToe(1)(2)==2 && ticTacToe(2)(2)==2)||(ticTacToe(0)(0)==2 && ticTacToe(0)(1)==2 && ticTacToe(0)(2)==2)||(ticTacToe(1)(0)==2 && ticTacToe(1)(1)==2 && ticTacToe(1)(2)==2)||(ticTacToe(2)(0)==2 && ticTacToe(2)(1)==2 && ticTacToe(2)(2)==2)||(ticTacToe(0)(0)==2 && ticTacToe(1)(1)==2 && ticTacToe(2)(2)==2)||(ticTacToe(0)(2)==2 && ticTacToe(1)(1)==2 && ticTacToe(2)(0)==2)){
                println("Ohhhh !!! You Loss the game !!!")
                flag=false
                break
              }
            }
          }
          if(flag==false){
            break
          }
        }
      }
    }
  }
}
