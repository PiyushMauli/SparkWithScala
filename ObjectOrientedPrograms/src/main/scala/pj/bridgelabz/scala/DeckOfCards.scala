package pj.bridgelabz.scala

import scala.collection.mutable.ListBuffer
import scala.util.Random

object DeckOfCards {
  var player1:ListBuffer[List[String]]=ListBuffer()
  var player2:ListBuffer[List[String]]=ListBuffer()
  var player3:ListBuffer[List[String]]=ListBuffer()
  var player4:ListBuffer[List[String]]=ListBuffer()
  def main(args: Array[String]): Unit = {
    val suit=ListBuffer("Clubs", "Diamonds", "Hearts", "Spades")
    val rank=ListBuffer("2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace")

    var index =0
    var player=1
    while(index < 9) {
      val suitRandom: Int = new Random().nextInt(4)
      val rankRandom: Int = new Random().nextInt(13)

      println(List(suit(suitRandom), rank(rankRandom)))

      var newSuitRandom = List(suit(suitRandom), rank(rankRandom))

      player match {
        case 1=>{
          if(!player1.contains(newSuitRandom)){
            player1 += newSuitRandom
            index += 1
          }
        }
        case 2=>{
          if(!player2.contains(newSuitRandom) && !player1.contains(newSuitRandom)){
            player2 += newSuitRandom
            index += 1
          }
        }
        case 3=>{
          if(!player3.contains(newSuitRandom) && !player2.contains(newSuitRandom) && !player1.contains(newSuitRandom)){
            player3 += newSuitRandom
            index += 1
          }
        }
        case 4=>{
          if(!player4.contains(newSuitRandom) && !player3.contains(newSuitRandom) && !player2.contains(newSuitRandom) && !player1.contains(newSuitRandom)){
            player4 += newSuitRandom
            index += 1
          }
        }
      }

      if(index ==9){
        player=player+1
        index=0
        if(player ==5){
          index=10
        }
      }

    }
    println(player1)
    println(player2)
    println(player3)
    println(player4)
  }
}
