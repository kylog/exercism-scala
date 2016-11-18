package com.kylo

class Bob {
  def hey(words: String) = {
    if (words.toUpperCase == words && words.matches(".*[a-zA-Z].*"))
      "Whoa, chill out!"
    else if (words.takeRight(1) == "?")
      "Sure."
    else if (words.trim == "")
      "Fine. Be that way!"
    else
      "Whatever."
  }
}
