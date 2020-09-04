package com.daoliveira.chapter06

class Rational(n: Int, d: Int) extends Ordered[Rational] {

  require(d != 0)

  private val g = gcd(n.abs, d.abs)

  val numer = n / g

  val denom = d / g

  def this(n: Int) = this(n, 1)

  def + (that: Rational): Rational =
    new Rational(
      numer * that.denom + denom * that.numer,
      denom * that.denom
    )

  def + (i: Int): Rational =
    new Rational(numer + i * denom, denom)

  def - (that: Rational): Rational =
    new Rational(
      numer * that.denom - denom * that.numer,
      denom * that.denom
    )

  def - (i: Int): Rational =
    new Rational(numer - i * denom, denom)

  def * (that: Rational): Rational =
    new Rational(numer * that.numer, denom * that.denom)

  def * (i: Int): Rational =
    new Rational(numer * i, denom)

  def / (that: Rational): Rational =
    new Rational(numer * that.denom, denom * that.numer)

  def / (i: Int): Rational =
    new Rational(numer, denom * i)

  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)

  override def toString =
    if (denom == 1) d.toString else s"$numer/$denom"


  override def equals(that: Any): Boolean = that match {
    case that: Rational => (this - that).numer == 0
    case _ => false
  }

  override def compare(that: Rational): Int =
    (this - that).numer
}

object Rational {
  def Rational(n: Int, d: Int) = new Rational(n, d)
  def Rational(n: Int) = new Rational(n)
}
