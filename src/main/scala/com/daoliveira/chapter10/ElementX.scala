package com.daoliveira.chapter10

import ElementX.elem

class ElementX(val contents: Array[String]) {

  def height: Int = contents.length

  def width: Int = if (height == 0) 0 else contents(0).length

  def this(s: String) = this(Array(s))

  def this(ch: Char, width: Int, height: Int) =
    this(Array.fill(height)(ch.toString * width))

  def above(that: ElementX): ElementX = {
    val this1 = this widen that.width
    val that1 = that widen this.width
    elem(this1.contents ++ that1.contents)
  }

  def beside(that: ElementX): ElementX = {
    val this1 = this heighten that.height
    val that1 = that heighten this.height
    elem(for ((line1, line2) <- this1.contents zip that1.contents) yield line1 + line2)
  }

  def widen(w: Int): ElementX =
    if (w <= width) this
    else {
      val left = elem(' ', (w - width) / 2, height)
      val right = elem(' ', w - width - left.width, height)
      left beside this beside right
    }

  def heighten(h: Int): ElementX =
    if (h <= height) this
    else {
      val top = elem(' ', width, (h - height) / 2)
      val bot = elem(' ', width, h - height - top.height)
      top above this above bot
    }

  override def toString: String = contents mkString "\n"
}

object ElementX {
  // Factory Methods
  def elem(contents: Array[String]): ElementX =
    new ElementX(contents)

  def elem(chr: Char, width: Int, height: Int): ElementX =
    new ElementX(chr, width, height)

  def elem(line: String): ElementX =
    new ElementX(line)
}
