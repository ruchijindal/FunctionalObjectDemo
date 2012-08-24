class Rational(n: Int, d: Int) {
  require(d != 0)
  val numer: Int = n
  val denom: Int = d
  override def toString = numer + "/" + denom
  def add(that: Rational): Rational =
    new Rational(
      this.numer * that.denom + that.numer * this.denom,
      this.denom * that.denom)
}

//class Rational(n: Int, d: Int) {
//  require(d != 0)
//  val numer: Int = n
//  val denom: Int = d
//  override def toString = numer + "/" + denom
//}
//
//class Add {
//  def add(r1:Rational, r2:Rational): Rational =
//    {
//      new Rational(r1.numer * r2.denom + r2.numer * r1.denom ,r1.denom * r2.denom)
//    }
//}

object Main extends App {
  val oneHalf = new Rational(1, 2)
  println("oneHalf: " + oneHalf)
  val twoThirds = new Rational(2, 3)
  println("twoThirds: " + twoThirds)
  println("Result:  " + (oneHalf add twoThirds))
  
  println("Result:  " + (oneHalf.add(twoThirds)))
  //println("Result : "+ (new Add).add(oneHalf,twoThirds))

}