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

## About the tools

> _Describe the compiler or interpreter needed_.

## About the standard library

> _Give some examples of the functions and data structures
> offered by the standard library_.

## About open source library

> _Describe at least one contribution by the open source
community written in the language._

# Analysis of the language

> _Organize your report according to the project description
document_.


