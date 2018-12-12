// Here we implement Newton's Method, which approximates roots for the given function

object NewtonsMethod {

  def main(args: Array[String]) {
    initNewton
  }

  def initNewton {
    val fx = (x: Double) => 6*x + 3.0 // function
    val dx = (x: Double) => 6.0 // derivative
    val initGuess = 0.0
    val tol = 0.00004 // tolerance
    val answer = newtonsMethod(fx, dx, initGuess, tol) // call newtonsMethod with these parameters
    println(answer) // print it
  }

  def newtonsMethod(fx: Double => Double,
                    dx: Double => Double,
                    x: Double,
                    tol: Double): Double = {
    var x1 = x
    var x2 = fxdx(fx, dx, x1)
    while (math.abs(x2 - x1) > tol) {
      x1 = x2
      x2 = fxdx(fx, dx, x1)
    }
    x2
  }

  def fxdx(fx: Double => Double,
                          fxPrime: Double => Double,
                          x: Double): Double = {
    x - fx(x) / fxPrime(x) // x2 = x1 - fx(x1)/dx(x1)

  }
}
