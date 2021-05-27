package pj.bridgelabz.spark

import org.apache.spark.sql.types.{IntegerType, StringType, StructField, StructType}
import org.apache.spark.sql.{Row, SparkSession}

object DataframeList extends App {
//  def main(args: Array[String]): Unit = {
    val appName = "Scala Example - List to Spark Data Frame"
    val master = "local[3]"

    /*Create Spark session with Hive supported.*/
    val spark = SparkSession.builder.appName(appName).master(master).getOrCreate()

    /* List */
    val data = List(Row("Category A", 100, "This is category A"),
      Row("Category B", 120, "This is category B"),
      Row("Category C", 150, "This is category C"))

    val schema = StructType(List(
      StructField("Category", StringType, true),
      StructField("Count", IntegerType, true),
      StructField("Description", StringType, true)
    ))

    /* Convert list to RDD */
    val rdd = spark.sparkContext.parallelize(data)

    /* Create data frame */
    val df = spark.createDataFrame(rdd, schema)
    df.show()

//  }
}
