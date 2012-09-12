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


object Main extends App {
  val oneHalf = new Rational(1, 2)  
  println("oneHalf: " + oneHalf)
  
  val twoThirds = new Rational(2, 3)
  println("twoThirds: " + twoThirds)\
  
  println("Result:  " + (oneHalf add twoThirds))
  
  
 

}