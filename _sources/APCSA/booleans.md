
# Unit 3: Boolean Expressions and Conditional Statements

In unit 1 we covered primitive types. In this chapter, we will build on the idea of boolean types to explore **Boolean expressions** and **conditional statements**, which are essential for controlling the flow of a program. Conditional logic allows you to make decisions based on specific criteria, enabling your programs to execute different code depending on the circumstances. 
Additionally, since you should be conmftrable with classes after unit 2 we will introduce the **Scanner** class to handle user input in your programs.Note that the **Scanner** class is not part of the curriculu, but we will use it a lot in this course as it enables reading in puts from the terminal.

## Boolean Expressions

A **Boolean expression** is any expression that evaluates to either `true` or `false`. Java provides several operators to compare values and return Boolean results.

### Relational Operators
Relational operators are used to compare numeric values:

- `<` (less than)
- `>` (greater than)
- `<=` (less than or equal to)
- `>=` (greater than or equal to)
- `==` (equal to)
- `!=` (not equal to)

For example:
```java
int x = 5;
int y = 10;
boolean result = x < y;  // result is true
```

### Logical Operators
Logical operators are used to combine Boolean expressions:

- `&&` (logical AND): true if both conditions are true
- `||` (logical OR): true if at least one condition is true
- `!` (logical NOT): inverts the truth value of an expression

For example:
```java
boolean a = true;
boolean b = false;
boolean c = a && b;  // c is false
boolean d = a || b;  // d is true
boolean e = !a;      // e is false
```

## Conditional Statements

Conditional statements control the flow of execution based on Boolean expressions. The most common conditional statement is the `if` statement.

### `if` Statements
An `if` statement checks a condition and executes a block of code only if the condition is `true`.

```java
int number = 7;
if (number > 5) {
    System.out.println("The number is greater than 5.");
}
```

### `else` and `else if` Statements
You can extend the `if` statement using `else` and `else if` to handle multiple conditions.

```java
int number = 7;
if (number > 10) {
    System.out.println("The number is greater than 10.");
} else if (number > 5) {
    System.out.println("The number is greater than 5 but less than or equal to 10.");
} else {
    System.out.println("The number is 5 or less.");
}
```

### Common Pitfall

- **Use of `==` vs. `=`**: `==` is used to compare values, while `=` is used to assign values. Using `=` in a conditional expression is a common mistake:
```java
if (x = 5) {  // Incorrect, will cause a compilation error
}
```

## Compound Boolean Expressions

Often, you will need to evaluate more than one condition. For example, you might want to check if a number is within a specific range:

```java
int number = 8;
if (number >= 5 && number <= 10) {
    System.out.println("The number is between 5 and 10.");
}
```

## De Morgan’s Law

De Morgan’s Law allows us to simplify complex Boolean expressions involving negation. It states that:

- `!(A && B)` is equivalent to `!A || !B`
- `!(A || B)` is equivalent to `!A && !B`

This is useful for writing clearer, more concise code.

## Comparing Objects

When comparing objects, we use methods such as `.equals()` rather than the `==` operator. The `==` operator compares references (whether two objects point to the same memory location), while `.equals()` compares the actual content of the objects.

For example:
```java
String str1 = new String("hello");
String str2 = new String("hello");

if (str1 == str2) {
    System.out.println("The references are the same.");
} else if (str1.equals(str2)) {
    System.out.println("The content is the same.");
}
```

## The `switch` Statement

An alternative to using multiple `if-else` statements is the `switch` statement, which is more concise when dealing with a variable that can take several discrete values. Here's an example:

```java
int day = 3;
switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    default:
        System.out.println("Invalid day");
}
```

## The `Scanner` Class

The **Scanner** class allows us to take user input during the execution of a program. It is a part of the `java.util` package, so it must be imported before use.

### Importing the Scanner Class
To use the Scanner class, we need to import it at the beginning of our program. This is done using the following line:

```java
import java.util.Scanner;
```

### Creating a Scanner Object
After importing the class, you create a new Scanner object to read user input. The Scanner is usually associated with `System.in` to read input from the keyboard.

```java
Scanner scanner = new Scanner(System.in);
```

### Using Scanner Methods
The Scanner class provides various methods for reading different types of input:

- `nextInt()` - Reads an integer
- `nextDouble()` - Reads a double
- `nextLine()` - Reads a string (whole line)
- `next()` - Reads a string (word)
- `nextBoolean()` - Reads a boolean value

Example:
```java
Scanner scanner = new Scanner(System.in);

// Reading an integer
System.out.print("Enter an integer: ");
int number = scanner.nextInt();
System.out.println("You entered: " + number);

// Reading a string
System.out.print("Enter your name: ");
String name = scanner.next();
System.out.println("Hello, " + name + "!");
```

### Closing the Scanner
It is good practice to close the Scanner when you're done using it to free up resources.

```java
scanner.close();
```

### Common Pitfalls
One common issue when using the Scanner class is mixing `nextLine()` with other input methods. For example, if you call `nextInt()` and then `nextLine()`, the `nextLine()` might pick up the newline character left behind by the previous method. To avoid this, you can call `scanner.nextLine()` right after `nextInt()` to consume the leftover newline character.

```java
int age = scanner.nextInt();
scanner.nextLine();  // consume the leftover newline
String name = scanner.nextLine();
```

## Solved Exercises

1. **Simple Conditionals**  
   Write a program that reads an integer from the user and prints whether it is positive, negative, or zero.

   ```java
   Scanner scanner = new Scanner(System.in);
   System.out.print("Enter a number: ");
   int number = scanner.nextInt();

   if (number > 0) {
       System.out.println("Positive");
   } else if (number < 0) {
       System.out.println("Negative");
   } else {
       System.out.println("Zero");
   }
   ```

2. **Compound Expressions**  
   Modify the previous program to print a special message if the number is both positive and greater than 100.

   ```java
   if (number > 0 && number > 100) {
       System.out.println("Positive and greater than 100");
   }
   ```

3. **De Morgan’s Law**  
   Rewrite the following Boolean expression using De Morgan’s Law:  
   `!(x > 5 && y < 10)`  
   
   After applying De Morgan’s Law:  
   `x <= 5 || y >= 10`

## Homework Excercises


1. **Boolean Expressions**:  
   Using the Math class, assign a random number between 1 and 10 to an `int` variable. Print the number, then check if the number is even or odd (print `true` for even, `false` for odd). Use the `%` operator and the `==` operator in your code.
   
2. **Conditional Expressions

**:  
   Repeat the previous task but use an `if-else` statement to print whether the number is even or odd.

3. **Nested Conditionals**:  
   Add a nested `if` statement to the code in question 2. Check if the number is divisible by 3 as well. Print whether it is divisible by 3.

4. **Random Number with Multiple Conditions**:  
   Generate a random number between -10 and 10. If the number is positive, check if it is even, odd, and divisible by 3. If the number is zero, print that it is zero. If negative, print that it's negative and display its absolute value.

5. **Compound Boolean Expressions**:  
   Generate a random number between 1 and 10. Use compound Boolean expressions to check if it is divisible by 2 and 3, just 2, just 3, or neither. Print the results.

6. **User Input - Odd or Even**:  
   Write a program that asks the user to enter an integer. Check if the entered integer is even or odd and print the results.

7. **Temperature Converter**:  
   Create a program that takes in a temperature and whether it’s in Celsius or Fahrenheit. Convert and output the temperature in the other unit. For example, if the input is `100 F`, output should be `38 C`.

8. **Sports Team Players**:  
   Write a program that tells the user how many players are on the field during a game for different sports like Basketball, Hockey, Soccer, Baseball, and Football. For example, if the user enters "basketball," the output should be "5 players per team."

## Runestone Excercises

 
- [CSAwesome Unit 3 Summary](https://runestone.academy/ns/books/published//csawesome/Unit3-If-Statements/topic-3-8-summary.html)
- [Practice Mixed Code 1](https://runestone.academy/ns/books/published//csawesome/Unit3-If-Statements/topic-3-9-practice-mixed-code.html)
- [Practice Mixed Code 2](https://runestone.academy/ns/books/published//csawesome/Unit3-If-Statements/topic-3-9-practice-mixed-code-toggle.html)
- [Practice Coding Problems](https://runestone.academy/ns/books/published//csawesome/Unit3-If-Statements/topic-3-10-practice-coding.html)
- [Exercises](https://runestone.academy/ns/books/published//csawesome/Unit3-If-Statements/Exercises.html)
