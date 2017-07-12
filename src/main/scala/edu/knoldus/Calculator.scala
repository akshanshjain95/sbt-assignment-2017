package edu.knoldus

/**
  * Created by knoldus on 12/7/17.
  */
class Calculator {

  def add(num1:Int, num2:Int): Int = num1 + num2

  def subtract(num1:Int, num2:Int): Int = num1 - num2

  def multiply(num1:Int, num2:Int): Int = num1 * num2

  def divide(numer:Int, denom:Int): Double = {
    require(denom!=0)
    (numer/denom).toDouble
  }

  def power(num:Int, pow:Int): Double = {
    def resultOfPower(acc:Double, num:Int, pow:Int):Double = {
      if(pow == 0) {
        acc
      }
      else
      {
        resultOfPower(acc*num, num, pow - 1)
      }
    }
    if(pow>=0) resultOfPower(1,num,pow) else 1 / resultOfPower(1, num, pow * -1)
  }

  def modulus(num1:Int, num2:Int): Int = {
    require(num2 != 0)
    num1 % num2
  }

  def absolute(num:Int): Int = {
    if(num>=0) num else num * -1
  }

  def maxOfTwo(num1:Int, num2:Int): Int = {
    if (num1 >= num2) num1 else num2
  }

    def minOfTwo(num1:Int, num2:Int): Int = {
      if(num1>=num2) num2 else num1
    }

}
