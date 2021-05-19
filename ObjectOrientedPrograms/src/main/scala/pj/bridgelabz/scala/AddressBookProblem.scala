package pj.bridgelabz.scala

import scala.collection.mutable.ListBuffer
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

case class Person(id:Int,firstName:String,lastName:String,address:String,city:String,state:String,zip:String,phoneNumber:String)

class CURDOperations{
  var id=0
  var personList=ListBuffer[Person]()
  def addPerson()={
    id += 1
    val firstName=StdIn.readLine("Enter First Name : ")
    val lastName=StdIn.readLine("Enter Last Name : ")
    val address=StdIn.readLine("Enter Address : ")
    val city=StdIn.readLine("Enter City : ")
    val state=StdIn.readLine("Enter State : ")
    val zip=StdIn.readLine("Enter Pin Code : ")
    val phoneNumber=StdIn.readLine("Enter Phone Number : ")
    personList += Person(id,firstName,lastName,address,city,state,zip,phoneNumber)
  }
  def deletePerson(id:Int)={
    personList.foreach((element)=>{
      if(element.id == id){
        personList -= element
        println("Person with id="+id+" deleted successfully !!!")
      }else{
        println("sorry there is no Person with id = "+id)
      }
    })
  }
  def updatePerson(id:Int)={
    personList.foreach((element)=>{
      if(element.id == id){
        val firstName=StdIn.readLine("Enter First Name : ")
        val lastName=StdIn.readLine("Enter Last Name : ")
        val address=StdIn.readLine("Enter Address : ")
        val city=StdIn.readLine("Enter City : ")
        val state=StdIn.readLine("Enter State : ")
        val zip=StdIn.readLine("Enter Pin Code : ")
        val phoneNumber=StdIn.readLine("Enter Phone Number : ")
        personList(id-1)= Person(id,firstName,lastName,address,city,state,zip,phoneNumber)
      }else{
        println("sorry there is no Person with id = "+id)
      }
    })
  }
  def loadPersonData()={
    println("---List of Person's---")
    if(personList.length > 0) personList.foreach((element)=>println(element.id+"-"+element.firstName+"-"+element.lastName+"-"+element.phoneNumber)) else println("-----0 Person have been added in your list-----")
  }
}

object AddressBookProblem {
  def main(args: Array[String]): Unit = {
    val curdOperations=new CURDOperations()
    while(true){
      println("------------------------------------------------------------------------------")
      println("Please Enter : ")
      println("1. Add Person\n 2. Delete Person\n 3. Update Person\n 4. Load Person List")
      println("------------------------------------------------------------------------------")
      val option=StdIn.readLine("Choose your option : ").toInt
      option match {
        case 1 => curdOperations.addPerson()
        case 2 => {
          val id=StdIn.readLine("Enter id of a Person : ").toInt
          curdOperations.deletePerson(id)
        }
        case 3 => {
          val id=StdIn.readLine("Enter id of a Person to update the info : ").toInt
          curdOperations.updatePerson(id)
        }
        case 4 => curdOperations.loadPersonData()
        case _ => println("please choose a proper options")
      }
    }
  }
}
