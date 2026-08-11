# Kotlin Programming Concepts – MAD Practical 1

## 📌 Project Overview

This repository contains **Kotlin programs demonstrating basic and advanced programming concepts** as part of the **Mobile Application Development (MAD)** practical.

The practical focuses on understanding Kotlin syntax, variables, type conversion, input/output, control flow, functions, recursion, arrays, collections, classes, constructors, operator overloading, and matrix operations.

---

## 🎯 Objectives

The main objectives of this practical are:

- Understand the basics of **Kotlin programming**.
- Work with different **data types and variables**.
- Perform **type conversion**.
- Take and display **user input**.
- Use **control flow statements** such as `if` and `when`.
- Create and use **user-defined functions**.
- Implement **recursion**.
- Perform operations on **arrays and ArrayLists**.
- Understand **classes and constructors**.
- Implement **operator overloading**.
- Perform **matrix operations** using a custom class.

---

## 🛠️ Technologies Used

- **Language:** Kotlin
- **IDE:** Android Studio / IntelliJ IDEA
- **Platform:** JVM
- **Version Control:** Git & GitHub

---

# 📚 Practicals Implemented

## 1.1 Store & Display Values in Different Variables

Demonstrates variables of different Kotlin data types:

- `Int`
- `Double`
- `Float`
- `Long`
- `Short`
- `Byte`
- `Char`
- `Boolean`
- `String`

The program stores values in variables and displays them.

---

## 1.2 Type Conversion

Demonstrates conversion between different data types.

Examples:

- Integer → Double
- String → Integer
- String → Double

Kotlin functions such as:

```kotlin
toDouble()
toInt()
```

are used for type conversion.

---

## 1.3 Scan Student Information

This program accepts student information from the user and displays it.

Information includes:

- Student Name
- Enrolment Number
- Branch
- Semester
- Other required details

It demonstrates **user input and output in Kotlin**.

---

## 1.4 Check Odd or Even Numbers

The program determines whether a given number is **odd or even**.

It demonstrates the use of conditional expressions inside `println()`.

Example:

```kotlin
println(if (number % 2 == 0) "Even" else "Odd")
```

---

## 1.5 Display Month Name

A Kotlin `when` expression is used to display the month name based on the number entered by the user.

Example:

```text
Input: 5
Output: May
```

This demonstrates Kotlin's **when expression**.

---

## 1.6 User-Defined Function

A user-defined function is created to perform arithmetic operations on two numbers.

Operations include:

- Addition
- Subtraction
- Multiplication
- Division

Example:

```text
Addition       → a + b
Subtraction    → a - b
Multiplication → a * b
Division       → a / b
```

---

## 1.7 Factorial Calculation with Recursion

This program calculates the factorial of a number using **recursion**.

For example:

```text
5! = 5 × 4 × 3 × 2 × 1
   = 120
```

The function repeatedly calls itself until it reaches the base condition.

---

## 1.8 Working with Arrays

This practical demonstrates different Kotlin array operations.

### Array Operations

- `Arrays.deepToString()`
- `contentDeepToString()`
- `joinToString()`

### Loop Operations

Different looping techniques are used, including:

- `range`
- `downTo`
- `until`

### Array Sorting

The program demonstrates two methods of sorting an integer array:

1. Sorting **without using built-in functions**
2. Sorting **using built-in functions**

This helps understand both manual sorting logic and Kotlin's built-in array functions.

---

## 1.9 Find Maximum Number from ArrayList

This program finds the **maximum number from an ArrayList of integers**.

Example:

```text
ArrayList: [10, 45, 23, 89, 12]

Maximum: 89
```

It demonstrates the use of Kotlin's `ArrayList` and iteration.

---

## 1.10 Class and Constructor Creation

This practical demonstrates **classes, properties, constructors, and member functions** in Kotlin.

A `Car` class is created with properties such as:

- Type
- Model
- Price
- Owner
- Miles Driven

The class implements functions to:

- Get car information
- Get original car price
- Calculate current car price
- Display car information

This practical demonstrates the basics of **Object-Oriented Programming (OOP)** in Kotlin.

---

## 1.11 Operator Overloading and Matrix Operations

This practical demonstrates **operator overloading** using a custom `Matrix` class.

The following matrix operations are implemented:

- Matrix Addition
- Matrix Subtraction
- Matrix Multiplication

The `Matrix` class also overloads the `toString()` function to provide customized matrix output.

Example:

```kotlin
operator fun plus(other: Matrix): Matrix
operator fun minus(other: Matrix): Matrix
operator fun times(other: Matrix): Matrix
```

This demonstrates how Kotlin allows operators such as `+`, `-`, and `*` to work with user-defined classes.

---

# 📝 Exercise

## Swap Two Variables

The exercise demonstrates swapping the values of two variables in two different ways.

### 1. Using a Third Variable

```text
temp = a
a = b
b = temp
```

### 2. Without Using a Third Variable

The values are swapped using arithmetic operations without creating an additional variable.

---

# 📂 Project Structure

```text
Pr_1_MAD/
│
├── src/
│   └── ...
│
├── README.md
│
└── ...
```

The repository contains the Kotlin source code for all the practical programs and exercises.

---

# 💡 Concepts Covered

| No. | Concept |
|-----|---------|
| 1 | Variables & Data Types |
| 2 | Type Conversion |
| 3 | User Input |
| 4 | Conditional Statements |
| 5 | `when` Expression |
| 6 | User-Defined Functions |
| 7 | Recursion |
| 8 | Arrays |
| 9 | ArrayList |
| 10 | Loops |
| 11 | Sorting |
| 12 | Classes |
| 13 | Constructors |
| 14 | Object-Oriented Programming |
| 15 | Operator Overloading |
| 16 | Matrix Operations |

---

# ▶️ How to Run

1. Clone this repository.

```bash
git clone https://github.com/jiyapatel02/Pr_1_MAD.git
```

2. Open the project in **Android Studio** or **IntelliJ IDEA**.

3. Open the required Kotlin file.

4. Run the program using the **Run ▶ button**.

5. Enter the required input in the console.

---

# 👩‍💻 Author

**Jiya Patel**

B.Tech Information Technology  
Mobile Application Development (MAD)

---

## 🔗 GitHub Repository

**Pr_1_MAD**

https://github.com/jiyapatel02/Pr_1_MAD

---

## ⭐ Conclusion

This practical provides a foundation in **Kotlin programming and Object-Oriented Programming concepts**. By implementing these programs, basic Kotlin syntax, data handling, functions, recursion, arrays, collections, classes, constructors, operator overloading, and matrix operations are explored.
