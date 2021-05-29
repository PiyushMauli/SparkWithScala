package pj.bridgelabz.mysql

import org.mongodb.scala.{Document, MongoClient, MongoCollection, MongoDatabase, Observer}

object NoSqlConnectivity {
  def main(args: Array[String]): Unit = {
    val mongoClient: MongoClient = MongoClient("mongodb://127.0.0.1:27017/?gssapiServiceName=mongodb")
    val database: MongoDatabase = mongoClient.getDatabase("DemoDB")

    val collection: MongoCollection[Document] =database.getCollection("demodata");

    val observable = collection.find()

    observable.subscribe ( new Observer[Document] {
      override def onNext(result: Document): Unit = println(result.toJson())
      override def onError(e: Throwable): Unit = println("Failed" + e.getMessage)
      override def onComplete(): Unit = println("Completed")
    })

//    println(s"observable = ${observable}")


//
//    observable.subscribe ( new Observer[Document] {
//      override def onNext(result: Document): Unit = println(result.toJson())
//      override def onError(e: Throwable): Unit = println("Failed" + e.getMessage)
//      override def onComplete(): Unit = println("Completed")
//    })
  }
}
