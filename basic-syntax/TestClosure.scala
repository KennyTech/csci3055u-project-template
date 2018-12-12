object TestClosure extends App {
  override def main(args: Array[String]) {
    println( "num(1) value = " +  num(1) )
    println( "num(2) value = " +  num(2) )
  }
  var factor = 2
  val num = (i:Int) => i * factor
}

// This code tests closure showing variables i, factor, num, where num depends on factor, outside the function
