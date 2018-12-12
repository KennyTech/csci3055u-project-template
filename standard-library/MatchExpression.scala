object MatchExpression extends App {
  var something = "It's a";

  var result =
    something match {
      case "It's a" => something + " Car";
      case "It's not a" => something + " Dog";
    }
  println(result);
}

// This shows one way to implement matching expressions (through cases)
// Another possibility is to use wildcard _ delimiter
// This will result in "It's a Car"
