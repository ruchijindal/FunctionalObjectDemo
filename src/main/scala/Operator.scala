

class Rational(n: Int, d: Int) {
  require(d != 0)
  private val g = gcd(n.abs, d.abs)

  val numer = n / g
  val denom = d / g

  def this(n: Int) = this(n, 1)

  def +(that: Rational): Rational =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom)

  def *(that: Rational): Rational =
    new Rational(numer * that.numer, denom * that.denom)

  override def toString = numer + "/" + denom

  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)
}

object Operator extends App {
  
  implicit def intToRational(x: Int) = new Rational(x)

  val oneHalf = new Rational(1, 2)
  println("oneHalf: " + oneHalf)

  val twoThirds = new Rational(2, 3)
  println("twoThirds: " + twoThirds)

  println("result is :-" + (oneHalf + oneHalf * twoThirds))

  println("result is :-" + (oneHalf.+(oneHalf.*(twoThirds))))

  println("implicit :- " + 2 * twoThirds)
}