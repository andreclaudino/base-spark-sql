package com.aula.spark.base

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.SaveMode

class SparkApp(appName:String, master:String="local[*]") extends App {

  val spark:SparkSession = SparkSession
    .builder()
    .master(master)
    .appName(appName)
    .getOrCreate()

  import spark.implicits._
}
