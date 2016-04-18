package com.calc

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.scalatest.junit.JUnitSuite

class CalculateUtilsTest extends JUnitSuite {

  @Before
  def initialize() {
  }

  @Test
  def calculateCubeForInputThree() {
    assertEquals(27, CalculateUtils.cube(3));
  }

  @Test
  def calculateCubeForInputOne() {
    assertEquals(1, CalculateUtils.cube(1));
  }

  @Test
  def calculateCubeForInputZero() {
    assertEquals(0, CalculateUtils.cube(0));
  }

  //Maxi value for cube - Int type
  @Test
  def calculateCubeForMaximumInputValue() {
    assertEquals(2146689000, CalculateUtils.cube(1290));
  }
  
  //Above maxi value for cube - Int type
  @Test
  def calculateCubeAboveMaximumInputValue() {
    assertEquals(2147483647, CalculateUtils.cube(3000));
  }

  @Test
  def calculateFactorialForInputZero() {
    assertEquals(1, CalculateUtils.factorialCalc(0));
  }

  @Test
  def calculateFactorialForInputOne() {
    assertEquals(1, CalculateUtils.factorialCalc(1));
  }

  @Test
  def calculateFactorialForInputThree() {
    assertEquals(6, CalculateUtils.factorialCalc(3));
  }

  @Test
  def calculateFactorialForInputFour() {
    assertEquals(24, CalculateUtils.factorialCalc(4));
  }

  //Maximum value for factorial - Int type
  @Test
  def calculateFactorialForMaximumIntValue() {
    assertEquals(479001600, CalculateUtils.factorialCalc(12));
  }

  //Maximum value for factorial - Int type
  @Test
  def calculateFactorialAboveMaximumIntValue() {
    assertEquals(0, CalculateUtils.factorialCalc(100));
  }  
  
}