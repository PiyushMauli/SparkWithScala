package pj.bridgelabz.scala

import scala.io.StdIn

//@Author: Author Name
//
//@Date: 2021-02-11 18:00:30
//
//@Last Modified by: Author Name
//
//@Last Modified time: 2021-02-11 18:00:30
//
//@Title : Program Aim

object HelloUser {
  def input(userName:String):Unit={
    try{
      if(userName.length > 3){
        println(f"Hello $userName%s, How are you?")
      }else{
        println("input name length should be greater than 3")
      }
    }catch{
      case e:Exception=>throw e
    }
  }
  def main(args: Array[String]): Unit = {
    val userName=StdIn.readLine("Please Enter Your Name :")
    HelloUser.input(userName)
  }
}