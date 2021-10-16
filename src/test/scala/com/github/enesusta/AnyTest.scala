package com.github.enesusta

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class AnyTest extends AnyWordSpec with Matchers {

  "Any" must {
    "get" in {

      5 shouldEqual 5
    }
  }
}
