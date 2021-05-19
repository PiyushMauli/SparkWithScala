package pj.bridgelabz.scala

//@Author: Author Name
//
//@Date: 2021-02-11 18:00:30
//
//@Last Modified by: Author Name
//
//@Last Modified time: 2021-02-11 18:00:30
//
//@Title : Program Aim

object BankingCashCounter{
  var arr=new Array[List[String]](5)
  var counterCash=5000
  var size=0
  var front = 0 //remove element
  var rear = 0 //add element
  def main(args: Array[String]): Unit = {
    BankingCashCounter.enQueue(List("500","w"))
    BankingCashCounter.enQueue(List("1500","d"))
    BankingCashCounter.enQueue(List("500","w"))
    BankingCashCounter.enQueue(List("500","w"))
    println("----------after added---------")
    BankingCashCounter.show()
    BankingCashCounter.deQueue()
    BankingCashCounter.deQueue()
    println("----------after removed---------")
    BankingCashCounter.show()

    BankingCashCounter.show()
  }
  def enQueue(data:List[String])={
    if(rear < 5){
      arr(rear)=data
      rear=rear+1
    }else{
      println("sorry we cant add your data")
    }
  }

  def deQueue(): Unit ={
    if(front != rear){
      if(arr(front)(1)=="w"){
        counterCash=counterCash-arr(front)(0).toInt
      }else if(arr(front)(1)=="d"){
        counterCash=counterCash+arr(front)(0).toInt
      }
      rear=rear-1
      println(counterCash)

      for(i<-0 until (arr.length-1)){
        arr(i)=arr(i+1)
      }
    }else{
      println("sorry we cant remove data, arr is already empty")
    }
  }
  def show()={
    while(front !=rear){
      front=front+1
    }
    front=0
  }
}

