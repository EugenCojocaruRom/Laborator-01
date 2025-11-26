# PAOO – Lab 1: Introduction to Java & IntelliJ IDEA

This repository contains my work for *PAOO Lab 1*, where I was introduced to the basics of Java, the JVM, and using IntelliJ IDEA to create and run simple console applications.

---

## What I learned

In this lab I:

- Understood what *Java* is and how it runs using the *Java Virtual Machine (JVM)* and *bytecode*.
- Compared *C/C++ vs Java*:
  - Java generates bytecode instead of native machine code.
  - No multiple inheritance in classes (interfaces are used instead).
  - No classic pointers, only *references*.
  - No separate header files – the interface and implementation are defined in the same class.
  - All executable code lives inside *classes*, with the entry point:
    java
    public static void main(String[] args)
    
  - Memory is managed by the *garbage collector* and errors are handled using *exceptions*.
- Learned what an *IDE* is and how to use *IntelliJ IDEA*:
  - Create a new Java project.
  - Add new modules and classes.
  - Build and run a simple console application (“Hello World”).
- Worked with *standard input/output*:
  - Output: System.out.print() and System.out.println()
  - Basic string concatenation with +
  - Input using BufferedReader / InputStreamReader (and the idea of Scanner).

---

## Contents

Depending on how you organize the code, this lab may include:

- src/HelloWorld.java  
  Simple program that prints a greeting to the console.

- src/GuessNumber.java  
  Program that generates a random integer and lets the user try to guess it.

- src/QuadraticEquation.java  
  Program that solves a quadratic equation of the form ax^2 + bx + c = 0.

- src/SumToN.java  
  Program that computes the sum 1 + 2 + ... + n.

- (Optional / To be implemented)  
  - TriangleAreaHeron.java – compute the area of a triangle using *Heron’s formula*.  
  - TriangleType.java – check if three numbers can form a triangle and determine its type.  
  - PointQuadrant.java – determine the position of a point (x, y) in the coordinate plane.  
  - ConnectionDuration.java – compute the duration of an Internet connection from start/end times.

You can rename or reorganize these classes as needed.

---

## How to run the programs

### Using IntelliJ IDEA

1. Open IntelliJ IDEA.
2. Create / open the project containing the src folder.
3. Make sure each Java file is inside the src folder and inside the correct package (if you use packages).
4. Right-click on the file that contains public static void main(String[] args) and choose  
   *Run 'ClassName.main()'*.

### Using the command line (javac/java)

If you want to compile and run from the terminal:

1. Navigate to the src directory:
   ```bash
   cd src
```
