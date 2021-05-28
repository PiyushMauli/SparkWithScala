package pj.bridgelabz.spark

import org.apache.spark.sql.SparkSession

object SparkSessionJar {
  def main(args: Array[String]): Unit = {
    val sparkSession=SparkSession.builder()
      .appName("Create a Spark Session")
      .master("local[3]")
      .getOrCreate()
  }
}
