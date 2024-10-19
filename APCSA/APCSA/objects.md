# Unit 2 - Objects

This unit will introduce the concepts of classes and objects, and how they are used in Java. The unit will also cover the String class and the Math class, two essential parts of the Java standard library. 

## Classes and Objects

We dive more deeply into writing classes in chapter 5, the next section will give you a quick idea of what a class is so you have an easier time with the latter parts of this chapter.

### What are Classes and Objects?

In object-oriented programming, a class is a blueprint for creating objects. An object is an instance of a class. In simpler terms, classes are user defined data types. Objects are variables of the new types.

A class defines the properties (data) and behaviours (methods) that its objects will have. For example, a `Dog` class might have properties like `name`, `breed`, and `age`, and methods like `bark()`, `eat()`, and `sleep()`.

Here's how you might define a simple `Dog` class in Java:

```java
public class Dog {
    // Properties (data)
    private String name;
    private String breed;
    private int age;

    // Constructor
    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    // Methods (behaviours)
    public void bark() {
        System.out.println("Woof!");
    }

    public void eat(String food) {
        System.out.println(name + " is eating " + food);
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}
```

In this example:

*   `name`, `breed`, and `age` are private properties of the `Dog` class. They represent the data that a `Dog` object can hold.
*   The `Dog(String name, String breed, int age)` function is a constructor. It is used to create new `Dog` objects and initialize their properties.
*   `bark()`, `eat(String food)`, and `sleep()` are public methods of the `Dog` class. They define the behaviours that a `Dog` object can perform.

### Creating and Using Objects

Once you have a class defined, you can create objects (instances) of that class. Each object will have its own copy of the class's properties and can call the class's methods.

```java
public class Main {
    public static void main(String[] args) {
        // Create a new Dog object named "buddy"
        Dog buddy = new Dog("Buddy", "Golden Retriever", 3);

        // Call methods on the "buddy" object
        buddy.bark(); // Output: Woof!
        buddy.eat("bones"); // Output: Buddy is eating bones
        buddy.sleep(); // Output: Buddy is sleeping.

        // Create another Dog object named "lucy"
        Dog lucy = new Dog("Lucy", "Poodle", 5);

        // Call a method on the "lucy" object
        lucy.bark(); // Output: Woof!
    }
}
```

In this example:

1.  `Dog buddy = new Dog("Buddy", "Golden Retriever", 3);` creates a new `Dog` object named `buddy` and initializes its properties with the given values.
2.  `buddy.bark()`, `buddy.eat("bones")`, and `buddy.sleep()` call the respective methods on the `buddy` object.
3.  `Dog lucy = new Dog("Lucy", "Poodle", 5);` creates another `Dog` object named `lucy` with different property values.
4.  `lucy.bark()` calls the `bark()` method on the `lucy` object.

### Key Notes on Classes and Objects

*   **Overloading Constructors:** You can have multiple constructors in a class with different parameters. This is called constructor overloading and allows for flexibility in creating objects.
*   **Procedural Abstraction:** When using a method, you don't need to worry about the internal details of how it works. This is called procedural abstraction and simplifies code usage.
*   **Tracing Methods:** Understanding how methods work and the order in which they are executed is crucial for debugging and understanding program flow.

## String Class

### Introduction

The String class in Java represents a sequence (string) of characters (data of type char). It provides various methods for manipulating and working with strings.

### Creating Strings

There are two common ways to create strings in Java:

1.  Using the `new` keyword:

    ```java
    String s1 = new String("Hello");
    ```

2.  Using string literals:

    ```java
    String s2 = "World!"; 
    ```

### String Methods

The String class provides a rich set of methods for working with strings. Here are some key methods:

*   `charAt(int index)`: Returns the character at the specified index.

    ```java
    char c = s1.charAt(0); // c will be 'H'
    ```

*   `substring(int beginIndex, int endIndex)`: Returns a new string that is a substring of the original string, starting at `beginIndex` and ending at `endIndex - 1`.

    ```java
    String sub = s1.substring(1, 4); // sub will be "ell"
    ```

*   `length()`: Returns the length of the string.

    ```java
    int len = s1.length(); // len will be 5
    ```

*   `indexOf(String str)`: Returns the index of the first occurrence of the specified substring within the string. Returns -1 if the substring is not found.

    ```java
    int index = s1.indexOf("lo"); // index will be 3
    ```

*   `equals(Object anObject)`: Compares the string to the specified object for equality. Returns `true` if the strings are equal, `false` otherwise.

    ```java
    boolean isEqual = s1.equals("Hello"); // isEqual will be true
    ```

*   `contains(CharSequence s)`: Checks if the string contains the specified sequence of characters. Returns `true` if the sequence is found, `false` otherwise.

    ```java
    boolean contains = s1.contains("el"); // contains will be true
    ```

### Example:

```java
String lyrics = "The wheels on the bus go round and round";
String word = "bus";

char secondLetter = word.charAt(1); // secondLetter will be 'u'

int wordIndex = lyrics.indexOf(word); // wordIndex will be 15
int wordLength = word.length(); // wordLength will be 3

String extractedWord = lyrics.substring(wordIndex, wordIndex + wordLength); // extractedWord will be "bus"

boolean areEqual = extractedWord.equals(word); // areEqual will be true
boolean doesContain = lyrics.contains(extractedWord); // doesContain will be true
```

### Additional Notes:

*   **Immutability:** Strings in Java are immutable, meaning their values cannot be changed after creation. Methods like `substring()` and `toUpperCase()` create new string objects instead of modifying the original string.
*   **String Concatenation:** You can concatenate strings using the `+` operator.

    ```java
    String combined = s1 + " " + s2; // combined will be "Hello World!"
    ```



### Resources:

*   For a complete list of String class methods, refer to the Java documentation: [https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html)

## Math Class

### Introduction

The `Math` class in Java provides various mathematical functions and constants. It's a static class, meaning you don't need to create an object of the `Math` class to use its methods. You can directly call its methods using the class name, like `Math.method()`.

### Key Methods:

*   `Math.random()`: Returns a random double value between 0.0 (inclusive) and 1.0 (exclusive).

    ```java
    double randomValue = Math.random(); // randomValue will be between 0.0 and 0.999...
    ```

*   Generating Random Integers: You can generate random integers within a specific range using `Math.random()`.

    ```java
    int randomInt = (int)(Math.random() * 10); // Random integer between 0 and 9
    ```

*   `Math.max(double a, double b)`: Returns the greater of the two given values.

    ```java
    int max = Math.max(10, 20); // max will be 20
    ```

*   `Math.min(double a, double b)`: Returns the smaller of the two given values.

    ```java
    int min = Math.min(10, 20); // min will be 10
    ```

*   `Math.abs(double a)`: Returns the absolute value of the given value.

    ```java
    int absValue = Math.abs(-10); // absValue will be 10
    ```

*   `Math.pow(double a, double b)`: Returns the value of `a` raised to the power of `b`.

    ```java
    double power = Math.pow(2, 3); // power will be 8.0
    ```

*   `Math.sqrt(double a)`: Returns the square root of the given value.

    ```java
    double sqrtValue = Math.sqrt(25); // sqrtValue will be 5.0
    ```

### Example:

```java
double randomDouble = Math.random();
System.out.println("Random double: " + randomDouble);

int randomInt = (int)(Math.random() * 10) + 1; // Random integer between 1 and 10
System.out.println("Random integer: " + randomInt);

int maxValue = Math.max(5, 15);
System.out.println("Max value: " + maxValue);
```

### Additional Notes:

*   **Constants:** The `Math` class also provides mathematical constants like `Math.PI` (π) and `Math.E` (Euler's number).

### Resources:

*   For a complete list of `Math` class methods and constants, refer to the Java documentation: [https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Math.html](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Math.html)

## Exercises:

**Classes and Objects:**

1.  Create a class of your choice (e.g., `Book`, `VideoGameCharacter`) with at least five methods.Test your code by creating objects of the class and calling its methods.
2.  Add a default constructor to the class you created in the previous exercise.
3.  Add a method to your class that takes mathematical arguments and returns a calculated value. 

**Strings:**

1.  Create two strings: one containing song lyrics and another containing a word that appears in the lyrics.
2.  Print the second letter of the word using both `charAt()` and `substring()` methods.
3.  Use `indexOf()` to find the first occurrence of the word in the lyrics and store the index in an `int` variable.
4.  Use `length()` to find the length of the word and store it in an `int` variable.
5.  Create a new string variable and extract the word from the lyrics using the `substring()` method, the index, and the length you found in the previous steps.
6.  Use the `equals()` method to check if the extracted word is the same as the original word. Verify your answer using a print statement.
7.  Use the `contains()` method to check if the lyrics contain the extracted word. Verify your answer using a print statement.

**Math:**

1.  Print the maximum and minimum values of the `int` data type.
2.  Generate and display two random numbers.
3.  Simulate a dice roll and display the result using a print statement.

Remember to test your code thoroughly and refer to the resources provided for more information and examples.