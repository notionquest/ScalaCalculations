package com.calc

object CalculateUtils {

  /*Step 2 - Define the function to calculate the cube
  
  		Int over flow - returns maximum int value 2147483647
  */
  def cube(inputNumber: Int): Int = {
    return Math.pow(inputNumber, 3).intValue();
  }

  /*Step 5 - Function to calculate the factorial
  
  		Int over flow - returns 0
  */
  def factorialCalc(inputNumber: Int): Int = {
    if (inputNumber <= 1)
      1
    else
      inputNumber * factorialCalc(inputNumber - 1)
  }

}