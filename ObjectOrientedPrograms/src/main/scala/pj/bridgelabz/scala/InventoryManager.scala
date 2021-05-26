package pj.bridgelabz.scala

import com.fasterxml.jackson.databind.node.ObjectNode
import com.fasterxml.jackson.databind.{JsonNode, ObjectMapper}
import com.fasterxml.jackson.module.scala.DefaultScalaModule

import java.io.{ByteArrayOutputStream, File}
import java.nio.file.Paths

case class Inventory(var name:String,var price:Int)

//case class ImpItem(var item:Array[Inventory])

case class ReadData(var item:String,var list:List[Inventory])

object InventoryManager {
  def main(args: Array[String]): Unit = {
    val mapper:ObjectMapper=new ObjectMapper();
    mapper.registerModule(DefaultScalaModule)
    val root:JsonNode=mapper.readTree(new File("src/main/json/pj/bridgelabz/json/InventoryItems.json"))
    var itemList=List(Inventory("a",500),Inventory("b",200))
    val node1:JsonNode=mapper.valueToTree(itemList)
    root.asInstanceOf[ObjectNode].put("TuarDaal",node1)
    mapper.writerWithDefaultPrettyPrinter().writeValue(new File("src/main/json/pj/bridgelabz/json/InventoryItems.json"),root);


    println(mapper.readValue(Paths.get("src/main/json/pj/bridgelabz/json/InventoryItems.json").toFile(),classOf[Map[String, Seq[Inventory]]]))
  }
}
