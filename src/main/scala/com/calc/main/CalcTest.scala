package com.calc.main

import com.calc.CalculateUtils
import scala.io.Source.fromInputStream
import java.io.IOException

object CalcTest {
  def main(args: Array[String]) {

    //Step 1 - Defining the array of integers
    val myInts: List[Int] = List(1, 2, 3, 4)
    val powerOfThree = 3

    //Step 3 - Calculate the cube for the integers present in list
    println(" Step 3 output : Cube using map function >>>> " + myInts.map { x => CalculateUtils.cube(x) })

    //Step 4 - Calculate the cube for the integers present in list using inline map call using closure notation
    println(" Step 4 output : Cube using closure function >>>> " + myInts.map { x => Math.pow(x, powerOfThree).toInt })

    val factList = myInts.map { x => CalculateUtils.factorialCalc(x) }

    //Step 5 - Calculate the factorial for the integers present in the list
    println(" Step 5 output : Sum of factorials >>>> " + factList.sum)

    try {
      val wordCountMap = scala.io.Source.fromInputStream(getClass.getResourceAsStream("/src/test/resources/SourceTextFile.txt"))
        .getLines
        .flatMap(_.split("\\W+"))
        .foldLeft(Map.empty[String, Int]) {
          (count, word) => count + (word -> (count.getOrElse(word, 0) + 1))
        }

      //Step 6 - Calculate the word count in the text file
      println(" Step 6 output : Word count >>>> " + wordCountMap)
    } catch {
      case ioe: IOException => {
        println("Could not read the input source file")
      }

    }
    
    println("***** End of program *****")
    
  }
}