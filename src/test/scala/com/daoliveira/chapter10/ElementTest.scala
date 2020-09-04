package com.daoliveira.chapter10

import org.scalatest.funsuite.AnyFunSuite
import ElementX.elem;

class ElementTest extends AnyFunSuite {
  test("above should add strings to array") {
    val el1 = elem(Array("aaaa", "bbbb"))
    val el2 = elem(Array("cccc", "dddd"))
    val el3 = el1 above el2
    assert(el3.contents.length == 4)
    assert(el3.contents(0) == "aaaa")
    assert(el3.contents(1) == "bbbb")
    assert(el3.contents(2) == "cccc")
    assert(el3.contents(3) == "dddd")
  }

  test("beside should concatenate strings") {
    val el1 = elem(Array("aaaa", "bbbb"))
    val el2 = elem(Array("cccc", "dddd"))
    val el3 = el1 beside el2
    assert(el3.contents.length == 2)
    assert(el3.contents(0) == "aaaacccc")
    assert(el3.contents(1) == "bbbbdddd")
  }
}
