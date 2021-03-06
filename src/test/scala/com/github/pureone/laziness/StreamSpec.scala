package com.github.pureone.laziness

import org.scalatest.FreeSpec

class StreamSpec extends FreeSpec {
  "toList" - {
    "Stream to List." in {
      assert(List(1, 2, 3) == Stream(1, 2, 3).toList)
    }
  }

  "takeWhile" - {
    "Even Number Stream." in {
      assert(List(2, 4) == Stream(2, 4, 5, 6).takeWhile(_ % 2 == 0).toList)
    }
  }
}
