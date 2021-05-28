package pj.bridgelabz.spark

import org.apache.spark.sql.{SQLContext, SparkSession}

object WordCount {
  def main(args: Array[String]): Unit = {

    val sparkSession=SparkSession.builder()
      .appName("Create a Dataframe from List")
      .master("local")
      .getOrCreate()

    val sparkContext=sparkSession.sparkContext

    val accessKeyId = System.getenv("AWS_ACCESS_KEY_ID")
    val secretAccessKey = System.getenv("AWS_SECRET_ACCESS_KEY")

    sparkContext.hadoopConfiguration.set("fs.s3a.impl","org.apache.hadoop.fs.s3a.S3AFileSystem")
    sparkContext.hadoopConfiguration.set("fs.s3n.awsAccessKeyId", accessKeyId)
    sparkContext.hadoopConfiguration.set("fs.s3n.awsSecretAccessKey", secretAccessKey)

//    val df = sparkSession.read
//      .format("com.databricks.spark.csv")
//      .option("header", "true")
//      .load("s3a://pj-bridgelabz-spark-s3/RILO.csv")

//    df.show(100)

    val file = sparkContext.textFile("s3a://pj-bridgelabz-spark-s3/RILO.csv")

    val counts = file
      .flatMap(line => line
        .toLowerCase()
        .replace(".", " ")
        .replace(",", " ")
        .split(" "))
      .map(word => (word, 1L))
      .reduceByKey(_ + _)

    val sorted_counts = counts.collect().sortBy(wc => -wc._2)
    sorted_counts.take(100).foreach(println)
  }
}
