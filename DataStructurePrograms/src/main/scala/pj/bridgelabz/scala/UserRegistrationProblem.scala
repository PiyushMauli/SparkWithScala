package pj.bridgelabz.scala

import scala.io.StdIn
import scala.util.matching.Regex

//@Author: Author Name
//
//@Date: 2021-02-11 18:00:30
//
//@Last Modified by: Author Name
//
//@Last Modified time: 2021-02-11 18:00:30
//
//@Title : Program Aim

class UserRegistration{
  def checkFirstName(): Unit ={
    val reg=new Regex("[A-Z]\\w*")
    val firstName=StdIn.readLine("Enter your first name : ")
    if(firstName.length>3){
      if(reg.findFirstIn(firstName) != None){
        println(reg.findFirstIn(firstName))
      }else{
        println("Enter first character in Capital letter")
      }
    }else{
      println("First name must be greater in length 3")
    }
  }
  def checkLastName(): Unit ={
    val reg=new Regex("[A-Z]\\w*")
    val lastName=StdIn.readLine("Enter your Last name : ")
    if(lastName.length>3){
      if(reg.findFirstIn(lastName) != None){
        println(reg.findFirstIn(lastName))
      }else{
        println("Enter Last character in Capital letter")
      }
    }else{
      println("Last name must be greater in length 3")
    }
  }
  def checkEmail(): Unit ={
    val reg=new Regex("[a-zA-z]\\w*@\\w*[.](com|in|edu|gov.in)")
    val emailId=StdIn.readLine("Enter your Email : ")
    if(reg.findFirstIn(emailId) != None){
      println(reg.findFirstIn(emailId))
    }else{
      println("Enter correct email id")
    }
  }
  def checkMobileNumber(): Unit ={
    val reg=new Regex("(91)[ ]\\d{10}")
    val mobileNumber=StdIn.readLine("Enter your Mobile Number : ")
    if(reg.findFirstIn(mobileNumber) != None){
      println(reg.findFirstIn(mobileNumber))
    }else{
      println("Enter correct Mobile Number")
    }
  }
  def checkPassword(): Unit ={
    val reg=new Regex("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$")
    val password=StdIn.readLine("Enter your Password : ")
    if(password.length>8){
      if(reg.findFirstIn(password) != None){
        println(reg.findFirstIn(password))
      }else{
        println("Enter correct Password")
      }
    }else{
      println("Please enter password greater than 8 in length")
    }
  }
}

object UserRegistrationProblem {
  def main(args: Array[String]): Unit = {
    val userRegistration=new UserRegistration
    userRegistration.checkFirstName()
    userRegistration.checkLastName()
    userRegistration.checkEmail()
    userRegistration.checkMobileNumber()
    userRegistration.checkPassword()
  }
}
