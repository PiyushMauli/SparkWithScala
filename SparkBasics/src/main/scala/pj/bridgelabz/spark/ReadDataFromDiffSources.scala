package pj.bridgelabz.spark

import org.apache.spark.sql.types.{IntegerType, StringType, StructField, StructType}
import org.apache.spark.sql.{Row, SparkSession}

object ReadDataFromDiffSources {
  def main(args: Array[String]): Unit = {
    val spark=SparkSession.builder()
      .appName("Create a Dataframe from List")
      .master("local")
      .getOrCreate()

//    ReadDataFromDiffSources.listToDF(spark)
//    ReadDataFromDiffSources.readCSV(spark)
//    ReadDataFromDiffSources.readJSON(spark)
//    ReadDataFromDiffSources.readParquet(spark)
    ReadDataFromDiffSources.readAvro(spark)
  }

  def readCSV(spark:SparkSession): Unit ={
    val flightTimeCsvDF=spark.read
      .format("csv")
      .option("header","true")
      .option("path","src/main/files/pj/bridgelabz/files/flight-time.csv")
      .load()

    flightTimeCsvDF.show(5)
  }

  def readJSON(spark:SparkSession)={
    val flightTimeJsonDF=spark.read
      .format("json")
      .option("path","src/main/files/pj/bridgelabz/files/flight-time.json")
      .load()

    flightTimeJsonDF.show(5)
  }

  def readParquet(spark:SparkSession)={
    val flightTimeParquetDF=spark.read
      .format("parquet")
      .option("path","src/main/files/pj/bridgelabz/files/flight-time.parquet")
      .load()

    flightTimeParquetDF.show(5)
  }

  def readAvro(spark:SparkSession)={
    val userDataAvroDF=spark.read
      .format("avro")
      .option("path","data/userdata1.avro")
      .load()

    userDataAvroDF.show(5)

    userDataAvroDF.write
      .format("avro")
      .save("output/AVRO")
  }

  def listToDF(spark:SparkSession)={
    val data=List(Row("Piyush Jiwane", "jiwane@gmail.com", 10000),
      Row("Gaurav Jiwane", "gaurav@gmail.com", 20000))

    val schema = StructType(List(
      StructField("Name", StringType, true),
      StructField("Email", StringType, true),
      StructField("Salary", IntegerType, true)
    ))

    /* Convert list to RDD */
    val rdd = spark.sparkContext.parallelize(data)

    /* Create data frame */
    val df = spark.createDataFrame(rdd, schema)
    df.show()
  }
}
