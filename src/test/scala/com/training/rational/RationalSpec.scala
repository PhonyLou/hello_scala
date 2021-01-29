package com.training.rational

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class RationalSpec extends AnyWordSpec with Matchers {

  "Rational Spec" should {

    "Constructing a Rational" in {
      val rational = new Rational(2, 1)
      println(rational)
    }

    "not allowed 0 denominator" in {
      the[IllegalArgumentException] thrownBy {
        new Rational(5, 0)
      }
    }
  }

}
