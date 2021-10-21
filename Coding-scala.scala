// Databricks notebook source
//Candle Box  scal  coding solution


// COMMAND ----------

import scala.io.Source
import java.io.PrintWriter

object CandleBox {
  def main(args: Array[String]): Unit = {
    val inputPath = args(0)
    val outputPath = args(1)
    val lines = Source.fromFile(inputPath).getLines.toArray
    val ageDiff = lines(0).toInt
    val ritaCandles = lines(1).toInt
    val theoCandles = lines(2).toInt
    var counter1 = 0
    var counter2 = 0
    var index = 4
    var continueLoop = true
    while (continueLoop) {
      counter1 += index
      if (index - ageDiff <= 20) counter2 += index - ageDiff
      if (counter1 + counter2 == ritaCandles + theoCandles) {
        val candlesToRemove = ritaCandles - counter1
        print(candlesToRemove)
        new PrintWriter(outputPath) { write(candlesToRemove.toString); close() }
        continueLoop = false
      }
      index += 1
    }

  }
}

// COMMAND ----------

# Input
2
26
8

// COMMAND ----------

#output
4

// COMMAND ----------

// val df2 = ("CandleBox")
// val df.createOrReplaceTemView("df2")

// COMMAND ----------

println(CandleBox)
