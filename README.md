# Scala

- Kenny Le
- kenny.le@uoit.net

## About the language

> **History**
> - Scala was written by Martin Odersky in 2004 after his experience with working with the Java team and being unsatisfied with the contraints of Java. Odersky wanted a language that was a midway from a language that is as pragmatic as Java, and a language that is a pure functional academic language. At the time he worked on FUNNEL, a functional programming language that yields general programming notation, based on join-calculus theory (concurrent processes, global lexical scoping, static type-checking, and so on).
> 
> **Some interesting features**
> - Scala is an "object functional" programming language.
> - Scala combines functional programming with object orientated programming that is capable of operating with the Java infrastructure.
> - Syntactic flexibility (ie. foo.toString = foo.toString(), semi-colons are unnecessary to end lines)
> - Unified type system (ie. Unlike Java where there are strict distinction, any types, like *Int* and *Boolean* both inherit from the *Any* class)
> - Type inference (ie. Compiler will deduce type when unspecified) (functional programming)
> - No distinction from statements and expressions (functional programming)
> - Anonymous functions (functional programming) 
> - Higher-order functions (functional programming)
> - Lazy evaluation (functional programming)
> - Nested functions (functional programming)
> - Pattern matching (functional programming)
> - Tuples (functional programming)

## About the syntax

> **Scala - No distinction from statements and expressions**

*A comparison to Java:*

Java snippet to add 1 if positive, subtract if negative:
```java
int num = x >= 0 ? x + 1 : x - 1;

```

Scala snippet:
```scala
val num = if (x >= 0) x + 1 else x - 1
```

Note the type inference, Scala can just declare a val. Also note Java must use statements, Scala can use purely expressions.
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
Also note (if x == 0) 1, this is an inferred return type thanks to Scala's syntactic flexibility. 


## About the tools

> Scala uses the compiler *scalac*, much like Java to *javac*. It functions just like Java.
> For example, to compile a file from command line: 
```
$ scalac HelloWorld.scala
```
> And then to run it:
```
$ HelloWorld
```

> Scala uses the Scala REPL as an interpreter.
> The Scala REPL can take expressions and interprets the result of evaluating the expressions.
> To use this, we use type *scala* in a terminal or command console.
> Then we can use *scala> expression* to evaluate an expression.

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

> As we can see, Scala can also use the java libraries, such as String, to concatenate 2 inferred strings.

```scala
scala> List(0, 1, 2, 3).map(x => x * 2)
```
> res2: List[Int] = List(0, 2, 4, 6)

> This shows that you can use expressions in Scala anywhere, much like functional programming, for example, to map a list to even values.
> 

## About the standard library

**Functions**
>

**Data Structures**
>

## About open source library

> _Describe at least one contribution by the open source
community written in the language._

# Analysis of the language

> _Organize your report according to the project description
document_.


