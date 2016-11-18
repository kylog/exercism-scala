package com.kylo

object HelloWorld {
  def hello(name: String = "World"): String = {
   s"Hello, $name!"
  }
}
