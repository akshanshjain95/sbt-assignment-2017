package edu.knoldus

import org.scalatest.FunSuite

/**
  * Created by knoldus on 12/7/17.
  */
class calculatorTest extends FunSuite {

  val res = new Calculator()

  test("Summing two numbers")
  {
    assert(res.add(2,3) === 5)
  }

  test("Subtracting two numbers")
  {
    assert(res.subtract(3,2) === 1)
  }

  test("Multiplying two numbers")
  {
    assert(res.multiply(3,2) === 6)
  }

  test("Dividing two numbers")
  {
    assert(res.divide(20,10) === 2)
  }

  test("Dividing by 0")
  {
    intercept[IllegalArgumentException]
    {
      res.divide(2,0)
    }
  }

  test("power of numbers")
  {
    assert(res.power(2,3) === 8)
  }

  test("power of 0 to a number")
  {
    assert(res.power(2,0) === 1)
  }

  test("negative power to a number")
  {
    assert(res.power(2,-1) === 0.5)
  }

  test("Modulus  of two numbers")
  {
    assert(res.modulus(13,5) === 3)
  }

  test("Modulus with 0")
  {
    intercept[IllegalArgumentException] {
      res.modulus(13, 0)
    }
  }

  test("Absolute of a negative number")
  {
    assert(res.absolute(-1) === 1)
  }

  test("Absolute of a positive number")
  {
    assert(res.absolute(2) === 2)
  }

  test("Maximum of first number greater than second")
  {
    assert(res.maxOfTwo(20,10) === 20)
  }

  test("Maximum of second number greater than first")
  {
    assert(res.maxOfTwo(10,20) === 20)
  }

  test("Minimum of first number greater than second")
  {
    assert(res.minOfTwo(20,10) === 10)
  }

  test("Minimum of second number greater than first")
  {
    assert(res.minOfTwo(10,20) === 10)
  }

}
