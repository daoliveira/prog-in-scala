package com.daoliveira.chapter06

import org.scalatest.funsuite.AnyFunSuite
import com.daoliveira.chapter06.Rational.Rational

class RationalTest extends AnyFunSuite {

  test("test$less$eq") {
    assert(Rational(1, 2) <= Rational(1, 2))
    assert(Rational(10) <= Rational(10))
    assert(Rational(1, 3) <= Rational(1, 2))
    assert(Rational(9) <= Rational(10))
  }

  test("test$greater") {
    assert(false == Rational(4, 2) > Rational(2))
    assert(Rational(5, 6) > Rational(1, 5))
  }

  test("test$less") {
    assert(false == Rational(1, 2) < Rational(1, 2))
    assert(false == Rational(10) < Rational(10))
    assert(Rational(1, 3) < Rational(1, 2))
    assert(Rational(9) < Rational(10))
  }

  test("test$greater$eq") {
    assert(Rational(4, 2) >= Rational(0))
  }

  test("test$div") {
    assert(Rational(1, 6) / Rational(3, 2) equals Rational(1, 9))
    assert(Rational(1, 6) / Rational(3, 2) equals Rational(2, 18))
  }

  test("test$minus") {
    assert(Rational(23, 13) - Rational(5) equals Rational(-42, 13))
  }

  test("test$plus") {
    assert(Rational(12, 22) + Rational(7, 8) equals Rational(250, 176))
    assert(Rational(12, 22) + Rational(7, 8) equals Rational(125, 88))
  }

  test("test$times") {
    assert(Rational(77, 35) * Rational(2) equals Rational(154, 35))
    assert(Rational(4, 9) * Rational(9, 4) equals Rational(1))
    assert(Rational(7, 20) * Rational(2, 5) equals Rational(14, 100))
    assert(Rational(7, 20) * Rational(2, 5) equals Rational(7, 50))
  }

  test("testEquals") {
    assert(Rational(0, 2) equals Rational(0))
  }

}
