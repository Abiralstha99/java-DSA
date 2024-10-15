# Java Basics: Input, Output, Strings, and Random Numbers

This document provides a brief overview of commonly used Java functions, including input methods, formatted output, working with strings, and generating random numbers.

## 1. User Input with Scanner

The `Scanner` class is used to capture input from the user. Below are two commonly used methods:

### `next()`
- **Description**: Reads the next token (word) from the input, separated by whitespace.
- **Example**:
    ```java
    Scanner scanner = new Scanner(System.in);
    String name = scanner.next();  // Reads the next word
    ```

### `nextLine()`
- **Description**: Reads an entire line of input (including spaces) until a newline is encountered.
- **Example**:
    ```java
    Scanner scanner = new Scanner(System.in);
    String fullName = scanner.nextLine();  // Reads the entire line
    ```

---

## 2. Formatted Output with `printf`

Java’s `printf` method allows you to print formatted output using format specifiers.

### Basic Usage:
- **Syntax**: 
    ```java
    System.out.printf("Format String", arguments);
    ```

### Common Format Specifiers:
- **`%d`**: Decimal integer
- **`%f`**: Floating-point number
- **`%s`**: String
- **`%c`**: Character
- **`%n`**: Newline (platform-independent)
  
### Example:
```java
String name = "Alice";
int age = 25;
System.out.printf("Name: %s, Age: %d%n", name, age);
// Output: Name: Alice, Age: 25
Left Alignment in printf
To left-align values, use %- followed by the width:

java
Copy code
System.out.printf("Name: %-10s Age: %-3d%n", "Alice", 25);
// Output: Name: Alice      Age: 25 
3. Strings: Instance and Static Methods
Strings are Objects
Strings in Java are objects of the String class. You can call methods on these string objects, which include instance methods and static methods.

Instance Methods
Definition: A method that belongs to an instance of a class (an object).
How to call: Must be called on a specific object.
Example:
java
Copy code
String message = "Hello, World!";
int length = message.length();  // Instance method called on the `message` object
System.out.println(length);  // Outputs: 13
Static Methods
Definition: A method that belongs to the class itself, not to any specific object. You can call it without creating an object of the class.
How to call: Called directly on the class name.
Example:
java
Copy code
double squareRoot = Math.sqrt(16);  // Static method called on the Math class
System.out.println(squareRoot);  // Outputs: 4.0
4. Generating Random Numbers
Java’s Math.random() generates random floating-point numbers between 0.0 (inclusive) and 1.0 (exclusive). To generate random integers, use the following formulas.

Inclusive Random Number (min to max, inclusive):
java
Copy code
int randomNumber = (int) (Math.random() * (max - min + 1)) + min;
Example:
java
Copy code
int randomInt = (int) (Math.random() * (10 - 5 + 1)) + 5;  // Random number between 5 and 10
Exclusive Random Number (min to max, exclusive):
java
Copy code
int randomNumber = (int) (Math.random() * (max - min)) + min;
Example:
java
Copy code
int randomInt = (int) (Math.random() * (10 - 5)) + 5;  // Random number between 5 and 9
