package com.kylo

class Phrase(words: String) {
  def wordCount() = {
    words.toLowerCase.split("[ ,;!&@$%^:.]+").groupBy(identity).mapValues(_.size)
  }
}
