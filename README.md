# Scala

- Kenny Le
- kenny.le@uoit.net

## About the language

### History

Scala was written by Martin Odersky in 2004 after his experience with working with the Java team and being unsatisfied with the contraints of Java. 

Odersky wanted a language that was a midway from a language that is as pragmatic as Java, and a language that is a pure functional academic language. 

At the time he worked on FUNNEL, a functional programming language that yields general programming notation, based on join-calculus theory (concurrent processes, global lexical scoping, static type-checking, and so on).


### Interesting Features
- Scala is an "object functional" programming language.
- Scala combines functional programming with object orientated programming that is capable of operating with the Java infrastructure.
- Syntactic flexibility (ie. foo.toString = foo.toString(), semi-colons are unnecessary to end lines)
- Unified type system (ie. Unlike Java where there are strict distinction, any types, like *Int* and *Boolean* both inherit from the *Any* class)
- Type inference (ie. Compiler will deduce type when unspecified) (functional programming)
- No distinction from statements and expressions (functional programming)
- Anonymous functions (functional programming) 
- Higher-order functions (functional programming)
- Lazy evaluation (functional programming)
- Nested functions (functional programming)
- Pattern matching (functional programming)
- Tuples (functional programming)


## About the syntax

### Scala - No distinction from statements and expressions

*A comparison to Java:*

Java snippet to add 1 if positive, subtract if negative:
```java
int num = x >= 0 ? x + 1 : x - 1;
```
or
```java
int num = 1;
if (x >= 0)
    x++;
else
    x--; 
```

Scala snippet:
```scala
val num = if (x >= 0) x + 1 else x - 1
```

Note the type inference, Scala can just declare a val. 

Also note Java must use statements, Scala can use purely expressions.

However, certain types still need to be declared (ie. function parameters).

Scala snippet for recursive function to get factorial:
```scala
def getFactorial(x: Int): Int =
  if (x == 0)
    1
  else
    x*getFactorial(x - 1)
```

Note the function parameter having a declaration type (int).

Also note (if x == 0) 1, returns 1, this is an inferred return type thanks to Scala's syntactic flexibility. 


## About the tools

Scala uses the compiler *scalac*, much like Java to *javac*. It functions just like Java.

For example, to compile a file from command line: 
```
$ scalac HelloWorld.scala
```
> And then to run it:
```
$ scala HelloWorld
```

Scala uses the Scala REPL as an interpreter.

The Scala REPL can take expressions and interprets the result of evaluating the expressions.

To use this, we use type *scala* in a terminal or command console.

Then we can use *scala> expression* to evaluate an expression.

```scala
scala 
```

```scala
scala> 1+1 
```
> res0: Int = 2

```scala
scala> "what" + "ever" 
```
> res1: java.lang.String = whatever

As we can see, Scala can also use the java libraries, such as String, to concatenate 2 inferred strings.

```scala
scala> List(0, 1, 2, 3).map(x => x * 2)
```
> res2: List[Int] = List(0, 2, 4, 6)

This shows that you can use expressions in Scala anywhere, much like functional programming, for example, to map a list to even values.

## Compiler Options

Although you can use the command console or terminal to compile and run Scala as aforementioned, most modern Scala developers use a combination of: sbt and an IDE (integrated development environment). 

For example, in Java, many people use IntelliJ IDEA or Eclipse Oxygen. 

Scala sbt is an open-sourced build-tool like Java's Maven or Ant.

For IDE choicse, for both windows and linux, IntelliJ IDEA using Scala plug-in is a possibility, among many other IDE choices.

Benefits include ease of use and navigation, as well as syntax check or intelligent syntax completion. 

It is very easy to set up, as the environment downloads and installs the Scala SDK for you. 

The only requirement is to have the Java SDK.


## About the standard library

### List of notable functions 

- scala.collection.immutable - Scala has functional tendencies, which includes doing immutable objects and variables (may sometimes include Vector, List, HashMap)
- scala.collection.mutable - Mutable objects and variables (can include ArrayBuffer, StringBuilder, HashMap)
- scala.concurrent - This library includes primitives for concurrent programming (that is, multiple computations during an overlapping time period)
- scala.io - One of the difficulties of most functional programming languages is implementing Input/Output operations, however Scala has a library for this
- scala.math - Math functions
- scala.sys - Functions for operating system and processes
- scala.util.matching - Regular expressions (regex), and in Scala this can even be used to match arbitrary data types

#### Standard library scala matching function example:
```scala
var something = "It's a";

var myResult =
    something match {
       case "It's a" => something + " Car";
       case "It's not a" => something + " Dog";
    }
println(something);
```

> res3: java.lang.String = It's a Car

### Data Structures 

As mentioned, Scala is a language that incorporates the best of both worlds, functional and object-oriented programming.

This means Scala can do many powerful things with data structures.

For example, you want to populate a vector with even numbers from 1 to 50, but only if its squared product is greater than 100:

```Scala
val s = for (x <- 1 to 25 if x*x > 100) yield 2*x
```

> res4: Vector(22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50)

Now to implement in Java, it is much more tedious:

```Java
int[] t = new int[25];
int count = 0;
for (i = 0; i < t.length; i++) {
    if (x*x > 100) {    
        t[count] = 2 * i;
        count++;
}
```

Scala can also use basic data structures including: arrays (mutable), lists (immutable), sets, tuples.

Some advanced functional data structures include: maps, foreach, filter, zip, partition, find, flatMap, etc. 

For example, let's partition odd and even numbers in a list in Scala:
```Scala
val numbers = List(1, 2, 3, 4)
numbers.partition(_ % 2 == 0)
```
res5: (List[Int], List[Int]) = (List(2, 4),List(1, 3))

It's simple, powerful, and easy.

## About open source library

An interesting open source library that uses Scala is Scalacaster.

### Scalacaster

https://github.com/vkostyukov/scalacaster

An open-sourced Scala library that uses classic algorithms and data structures. 

This allows for Lists, Queues, Stacks, Sets, Heaps, Trees, Graphs, Sorting Algorithms, and Searching Algorithms.

What makes this library different?

It's fully written in pure functional programming.

For example, let us cover a snippet of the Merge Sort algorithm in functional programming using Scala:
```scala
  def halfify(as: List[A]): (List[A], List[A]) = {
    def loop(bs: List[A], fs: List[A], ss: List[A]): (List[A], List[A]) = bs match {
      case f :: s :: r => loop(r, f :: fs, s :: ss)
      case f :: Nil => (f :: fs, ss)
      case Nil => (fs, ss)
    }

    loop(as, Nil, Nil)
  }
```
What this does, is it takes the first two elements in the list, appends them to two separate lists, and recursively loop so that all odd nodes and all even nodes are split to two different lists. This is one of the initial steps of merge sort, which is a divide and conquer search algorithm, requiring a list to be split into two parts, left and right side. Runs in O(n) time.

As comparison, a simple Java implementation:
```java
int mid = n / 2;
    int[] l = new int[mid];
    int[] r = new int[n - mid];
 
    for (int i = 0; i < mid; i++) {
        l[i] = a[i];
    }
    for (int i = mid; i < n; i++) {
        r[i - mid] = a[i];
    }
```
The Java implementation takes a slightly different approach, but requires a count on n (the number of nodes), which requires O(n) time complexity to determine.
Although Java appears more sensible, the Scala implementation (albeit slightly different), is easier to reason out.
The Java implementation describes "how to get it" whereas a functional implementation using Scala describes "what you want".

# Analysis of the language

## 1. Functional vs Procedural 
> Scala supports both functional and procedural (object-oriented) programming, by combining functional programming with the base of what Java was built on, as it was written by one of the founding Java developers. 


## 2. Meta-Programming (macros)
> Scala can perform meta-programming such as macros, using *def macros* and macro bundles feature.

For example, you could write a macro for assert:
```scala
def assert(cond: Boolean, msg: Any) = macro Asserts.assertImpl
```

So that you can call assert:
```scala
assert(x < 100, "x too large, input lower value")
```

## 3. Symbol resolution:

> <-       for-comprehensions, separates pattern from generator

> =>       function types or literals

> ( )        delimit expressions and parameters

> [ ]        delimit type parameters

> { }        delimit blocks

> .          method call

> // /* */   comment

> :          type ascription or context bounds

> <: >:      upper and lower bounds

> " """      strings

> '          symbols and characters

> @          annotations, variable binding for pattern matching

> ,          parameter separator

> ;          statement separator

> _          wildcard or other meaning

Support for closure: Yes

```scala
object TestClosure extends App {
  override def main(args: Array[String]) {
    println( "num(1) value = " +  num(1) )
    println( "num(2) value = " +  num(2) )
  }
  var factor = 2
  val num = (i:Int) => i * factor
}
```
Shows an example that Scala supports closure such that i and num can be accessed.

True closures can also be shown using anonymous functions.

## 4. Scoping (Lexical vs. Dynamic)

> Scala can perform lexical scoping (if a variable is within a function, then it is defined only in that function).

> Scala can also perform dynamic scoping, where the name resolution depends on the program's state, such as with macros.



## 5. Funtional Programming Constructs
> Type inference - Compiler will deduce type when unspecified  

> No distinction from statements and expressions - for example: val num = if (x >= 0) x + 1 else x - 1  

> Anonymous functions - ie. list map { x => sqrt(x) } can be list map sqrt // (no longer bound to an identifier)    

> Lazy evaluation - any collection of data can be made non-strict  

> Nested functions - allows nesting and multiple nested functions  

> Pattern matching - in-depth implementations for pattern matching, ie. using cases (or alternatively, wildcards _)

```scala
var something = "It's a";

var myResult =
    something match {
       case "It's a" => something + " Car";
       case "It's not a" => something + " Dog";
    }
println(something);
``` 


## 6. Type System (Static vs Dynamic)
> Scala uses a static type system that includes: 

> Classes and abstract types as object members, Structural types, Path-dependent types, Compound types, Explicitly typed self references, Generic classes, Polymorphic methods, Upper and lower type bounds, and Variance

As a bonus, declaring the type is also optional in most cases in Scala (except in function parameters, etc), since Scala uses inferred typing.


## 7. Strengths and Weaknesses

### Strengths
> Scala is a very powerful and robust programming language that will allow a coder to get the program to do what they want. Some tasks are better handled using functional programming, while some tasks are better handled with object-oriented programming. Scala allows the developer to maximize speed and efficiency by implementing both functional and procedural methods.

> Scala has a flexible syntax

> Scala has type inference and a type system

### Weaknesses
> It is a complex language, learning it will take longer than most other languages.

> While it is nice to be able to code things in a few lines that would have taken dozens more otherwise, when building large systems it is easy to get lost in the code and you start to wonder "Wait what does this part of the code do again?"

> There is not as much documentation as other languages like Java.
