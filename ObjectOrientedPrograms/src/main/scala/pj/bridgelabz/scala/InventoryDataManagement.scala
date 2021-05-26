package pj.bridgelabz.scala

import com.fasterxml.jackson.databind.{JsonNode, ObjectMapper}

import java.io.File
import scala.io.StdIn


object InventoryDataManagement {
  def main(args: Array[String]): Unit = {
    val mapper : ObjectMapper = new ObjectMapper()
    val root : JsonNode = mapper.readTree(new File("src/main/json/pj/bridgelabz/json/InventoryItems.json"))

    println("Enter your choice : \n1 for Rice  2 for Pulses  3 for Wheats")
    var choice : Int = StdIn.readInt()

    var inventory : JsonNode = null

    choice match {
      case 1=>{
        println("For RICE : \n")
        inventory = root.path("Rice")
      }
      case 2=>{
        println("For PULSES : \n")
        inventory = root.path("Pulses")
      }
      case 3=>{
        println("For WHEATS : \n")
        inventory = root.path("Wheats")
      }
      case _ =>{
        println("Invalid choice")
      }
    }

    var newValue=inventory.iterator()

    while(newValue.hasNext){
      var newNextValue=newValue.next()
      var str : String = newNextValue.get("name").asText()
      var wt : Int = StdIn.readLine("how much kg do you want ?? : ").toInt
      var price : Int = newNextValue.get("price").asInt()

      println("name = " + str + "  weight = " + wt + "  price = " + price + "  value for inventory = " + (wt*price))
    }
  }
}
