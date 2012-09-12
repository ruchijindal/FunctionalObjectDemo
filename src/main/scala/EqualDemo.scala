

class Rational(n: Int, d: Int) {

  require(d != 0)

  private val g = gcd(n.abs, d.abs)

  val numer = (if (d < 0) -n else n) / g
  val denom = d.abs / g

  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)

  override def equals(other: Any): Boolean =
    other match {
      case that: Rational =>
        (that canEqual this) &&
          numer == that.numer &&
          denom == that.denom
      case _ => false
    }

  def canEqual(other: Any): Boolean =
    other.isInstanceOf[Rational]

  override def hashCode: Int =
    41 * (
      41 + numer) + denom

  override def toString =
    if (denom == 1) numer.toString else numer + "/" + denom
}

object EqualDemo extends App {

  var r1 = new Rational(1, 2)
  var r2 = new Rational(-1, 2)

  println("Equality Test: " + r1.equals(r2));
  println("Equality Test: " + (r1 equals r2));
  

}