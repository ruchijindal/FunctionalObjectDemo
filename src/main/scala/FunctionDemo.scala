

object FunctionDemo extends App {

  def method1() = {
    println("method1")
  }

  def method2(str: String) = {
    println("method2: " + str)
  }

  def method3(str: String): Int = {
    println("method3: " + str)
    str.length;
  }

  //pass function as a variable
  def method4(f: (String) => Int) = {
    println("method4: " + f("I am method4 String"))

  }
  
  val pythTriple :  ( Int, Int, Int ) => Boolean   =   (  a :Int,  b :Int,  c :Int  )  =>  {
    val aSquare = a * a
    val bSquare = b * b
    val cSquare = c * c

    aSquare + bSquare == cSquare
}

  // define function inside a function
  def method5() = {
    println("method5")
    method6
    def method6 = {
      println("method6")
    }
  }

  //assign function to a variable
  var action: (String) => Int = method3

  //anonymous function // function as a object // function literal
  val increment = (x: Int) => x + 1

  //currying
  def add(x:Int, y:Int) = x + y
  
  //after currying:	
  def add(x: Int) = (y: Int) => x + y
  
  
  method1()
  method2("I am method2 String")
  method3("I am method3 String")
  method4(method3)
  val isPythTriple  =  pythTriple.apply( 3, 4, 5 )
  println("isPythTriple_3_4_5 "+isPythTriple)
  method5()
  println("action: " + action.apply("Hello"))
  println("increment : " + increment(200))
  println("currying : " + add(1)(2));

}
