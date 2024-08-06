# Unit 1 - Hello World and Primitive Data Types

The assumption is that you have your development environment set up by now.

## Hello World

Your first task is to create a file `Main.java` in VScode and run the following code:

```
public class Main{
    public static void main(String[] args) {
    System.out.println("Hello World");
    }
}
```

Play around with the code and explore the outputs. Some things to try:

- Write multiple print statements
- Compare the difference between the commands `System.out.print` and `System.out.println`
- Try printing numbers and/or characters
- Try ommiting the quotations
- Try single quotes `'` instead of double quotes `"` 


## Errors

If you tried running the following code block, you probably saw an error message in your development environment.  

```
public class Main{
    public static void main(String[] args) {
    System.out.println('Hello World');
    }
}
```

Errors are nothing to be afraid of in coding and are common occurences. There are three types of errors you will encounter:

- Syntax
- Runtime
- Logic

### Syntax Errors

- Bad grammar in Java
  - Misspelled words
  - Incorrect case
  - Missing semicolons
- Java does not understand.

**E.g.:**
1. `Svstem.out.pruntln("");`
2. `system.out.println("");`
3. `public static main(String[] arqs) {`

✅ **Error message**  
❌ **Program does not run**

### Runtime Errors

- Program syntax is correct, but program asks computer to do something impossible or not allowed.
- Program runs but ends with an error.

**E.g.:**
```java
int n = reader.nextInt();
int x = 100 / n;
// Error when n == 0
```

✅ **Error message after stopping**   
❌ **Program stops**

### Logical Errors (bugs)

- Program does not do what was intended.
- Can be hard to find.

**E.g.:**
```java
public static boolean isEven(int n) {
    return n % 2 == 1;
}
```

❌ No Error message   
✅ Program runs

### Avoiding Errors

- IDE (don’t count on it!)
- Comments (good for spotting logic errors)
- Psuedocode (can ensure your logic is correct and help avoid runtime errors)
- Readable code (can prevent syntax errors)
- Practice (even experience programmers still get errors)

## Comments

- Single line comments:

  ```java
  // this is a single-line comment
    ```
- Multi-line (or C-style) comments:
    ```java
    /* this is a 
   multi-line comment */
    ```

## Variables and Data Types

- A variable is a named memory location that holds a data value.
- Variables have a data type (e.g., `int`, `double`, `boolean`).
- To declare a variable, specify the type, a name, and end with a semicolon (`;`).
- Example: `int number;`
- You can change the value of a variable throughout the program.
- Declaring a variable as `final` makes its value unchangeable.


### Data Types
  - **Primitive** (This chapter)
    - **Boolean**
      - boolean
    - **Numeric**
      - **Character**
        - char
      - **Numerical**
        - **Integer**
          - byte
          - short
          - int
          - long
        - **Floating-point**
          - float
          - double
  - **Non-Primitive** (Future Chapters)
    - String
    - Array
    - etc.


## Expressions and Assignment Statements

When assigning values to variables in Java, we use the `=` sign. The right side of the `=` is the value or expression, and the left side is the variable that will store the value.

### Example:

```java
int num = 200;
```

- **Data type**: `int` (integer)
- **Literal**: `200`

A literal is a fixed value directly represented in the code without any computation.

### Notes:

- Literals can be assigned to any primitive type variable.
- Literals can be in different formats: base 10, base 16 (hexadecimal), base 8 (octal), and string.



## Arithmetic Operators

Java supports various arithmetic operations that can be performed on numerical values.

### The arithmetic operators consist of:

- `+` (Addition)
- `-` (Subtraction)
- `*` (Multiplication)
- `/` (Division)
- `%` (Remainder, also known as modulo)

You can use these operators when assigning values to variables.

### Example:

```java
int sum = 5 + 3;
int difference = 10 - 4;
int product = 2 * 3;
int quotient = 10 / 2;
int remainder = 10 % 3;
```



## Compound Assignment Operators

Java provides compound assignment operators that combine an arithmetic operation with assignment.

### Common compound operators:

- `+=`, `-=`, `*=`, `/=`, `%=`

### Increment and Decrement Operators:

- `++` (Increment): Adds 1 to the stored value.
- `--` (Decrement): Subtracts 1 from the stored value.

These operators can be used on variables to modify their values directly.

### Example:

```java
int num = 5;
num += 3; // num is now 8
num++;    // num is now 9
num -= 2; // num is now 7
```



## Casting and Ranges of Variables

Type casting is when you assign a value of one primitive data type to another type.

### Widening Casting (Automatic):

- Converting a smaller type to a larger size type automatically.
- **Order**: `byte` -> `short` -> `char` -> `int` -> `long` -> `float` -> `double`

### Example:

```java
int myInt = 9;
double myDouble = myInt; // Automatic casting: int to double
```

### Narrowing Casting (Manual):

- Converting a larger type to a smaller size type.
- **Order**: `double` -> `float` -> `long` -> `int` -> `char` -> `short` -> `byte`

### Example:

```java
double myDouble = 9.78;
int myInt = (int) myDouble; // Manual casting: double to int
```



## Escape Sequences

Escape sequences are combinations of the backslash (`\`) and another character, which send special instructions to the compiler.

### Common escape sequences:

- `\n` – New line
- `\"` – Quotation mark
- `\t` – Tab
- `\\` – Backslash

### Example:

```java
System.out.println("Hello\nWorld"); // Prints "Hello" on one line and "World" on the next
```




---

# Exercises


All questions should be done in the same program file. Please try and complete the lab without help from online resources!

For more questions and a unit summary please visitn [CSAwesome](https://runestone.academy/ns/books/published/csawesome/Unit1-Getting-Started/toctree.html)

1. **Multiline Comment**  
   Using a multiline comment (`/*` to start the comment and `*/` to end the comment), write the name of the file, your name, and the date on separate lines.  
   On ALL of the questions in this homework, use single-line comments (`//`) to state which question you are answering.

2. **Hello World Program**  
   Create a "Hello World" program as done in the beginning of this chapter.  
   Print a new line with the words "My name is ", then using a new print statement, print your name on the same line (total of 3 print statements).

   The output should look like this:

   ```
   Hello World
   My name is 
   Your Name
   ```

3. **Variable Declaration**  
   Declare four variables, using logical naming for all variables:
   - One of type `String`, assign your name to this variable.
   - One of type `int`, assign your age to this variable.
   - One of type `double`, assign to this variable a number between 5 and 6.
   - One of type `boolean`, its value should be `true` if this homework is hard and `false` if this homework is easy. (Assign the value based on what you think of the homework now, we will change this value throughout this homework).

4. **Arithmetic Operations**  
   Using the variable of type `double` from the previous question, use arithmetic operations and assignment operators to change the value of the variable to the number `42.2`.  
   Try using the variables you already made to do these operations. For example:

   ```java
   int a = 56;
   double b = 5.5;
   b += a;
   b -= 20;
   b = b + 0.7; // if you print b it will be equal to 42.2
   ```

5. **Repeat Arithmetic Operations**  
   Repeat question 4 two more times with your original numbers. Get creative! (Can you do it in only 1 line of code? Can you do it with the help of the `%` operator? Can you use all operators and assignment operators?)

6. **Casting and Rounding**  
   Use casting methods to assign the value of your variable of type `double` to a variable of type `int`. Do this twice:
   - The first time, round the value to `42`.
   - The second time, round it to `43`.

   For example:

   ```java
   double a = 27.2;
   int b, c;
   b = (int) (a); // b will equal 27
   c = (int) (a + 1); // c will equal 28
   ```

7. **Casting with Arithmetic**  
   Use casting methods and arithmetic operators to create a new variable of type `double` for your age using the variable of type `int` for your age. (What happens when we give the two variables the same name?)

   For example:

   ```java
   int iddoAge = 23;
   double iddosAge = (double) (iddoAge) + 0.75; // I am born in October so I am ¾ way to my 24th
   // iddosAge should now be 23.75
   ```

8. **Boolean Update**  
   Was this homework difficult? Change the value of the `boolean` variable we initialized earlier to reflect your feelings.

9. **BONUS (will be part of Unit 2 Homework Lab)**  
   In your program, output the following with the help of escape sequences:

   ```
   Pikachu welcomes you to the world of Pokemon!
   (\__/)
   (o^.^)
   z(_(“)(“)
   ```

   (Question taken from TEALS program)

