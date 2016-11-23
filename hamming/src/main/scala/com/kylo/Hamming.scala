package com.kylo

object Hamming {
  def compute(left: String, right: String): Option[Int] = {
    if (left.size != right.size) return None
    Some((left.toList zip right.toList).count(t => t._1 != t._2))
  }
}
