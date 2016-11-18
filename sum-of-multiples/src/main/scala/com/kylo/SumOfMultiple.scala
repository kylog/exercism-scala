package com.kylo

object SumOfMultiples {
  def sumOfMultiples(values: List[Int], max: Int): Int = {
    (1 to (max - 1)).fold(0)(_ + isMultiple(values, _))
  }

  def isMultiple(values: List[Int], num: Int): Int = {
    if (values.find( num % _ == 0) == None) 0 else num
  }
}
