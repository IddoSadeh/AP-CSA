# Unit 4: Iteration and Loops

In the previous units, we focused on **Boolean expressions** and **conditional statements**, which allow programs to make decisions based on certain conditions. In this unit, we will introduce the concept of **iteration**, which allows you to repeat sections of code. This is particularly useful when you want to automate repetitive tasks. We will explore **loops**, which are control structures that repeatedly execute a block of code as long as a specified condition is true.

## While Loops

A **while loop** repeatedly executes a block of code as long as a specified Boolean expression evaluates to `true`. The syntax is:

```java
while (condition) {
    // code to be repeated
}
```

### Example:
```java
int count = 0;
while (count < 5) {
    System.out.println("Count is: " + count);
    count++;
}
```
In this example, the `while` loop continues to execute until `count` becomes 5.

### Common Pitfalls
- **Infinite loops**: Make sure the condition inside the `while` loop will eventually become `false`. Otherwise, you will create an infinite loop where the program never stops.
  
Example of an infinite loop:
```java
int x = 0;
while (x < 5) {
    System.out.println("Infinite loop!");
    // forgot to increment x
}
```

## For Loops

A **for loop** is commonly used when the number of iterations is known beforehand. The syntax is:

```java
for (initialization; condition; update) {
    // code to be repeated
}
```

### Example:
```java
for (int i = 0; i < 5; i++) {
    System.out.println("Iteration: " + i);
}
```

The `for` loop consists of three parts:
1. **Initialization**: This is executed once, at the start of the loop.
2. **Condition**: This is evaluated before each iteration. The loop continues if the condition is `true`.
3. **Update**: This is executed after each iteration.

### Infinite Loop in a `for` Loop
Just like with `while` loops, make sure the condition will eventually become `false`.

```java
for (int i = 0; i < 5;) {
    System.out.println("Infinite loop");
    // forgot to update i
}
```

## Do-While Loops

A **do-while loop** is similar to a `while` loop, but it guarantees that the loop will execute at least once, even if the condition is false from the start. The syntax is:

```java
do {
    // code to be repeated
} while (condition);
```

### Example:
```java
int count = 0;
do {
    System.out.println("Count is: " + count);
    count++;
} while (count < 5);
```

In this case, the block of code inside the `do` will be executed before the condition is checked.

### Common Pitfall
- Make sure that the condition can eventually become `false`, or you will create an infinite loop.

## Nested Loops

Loops can be nested, meaning you can place one loop inside another. Nested loops are useful when working with multi-dimensional data structures like arrays.

### Example:
```java
for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= 3; j++) {
        System.out.println("i: " + i + ", j: " + j);
    }
}
```

This example has an outer loop and an inner loop. For every iteration of the outer loop, the inner loop runs through all its iterations.

## Break and Continue Statements

Sometimes you need more control over how a loop executes. You can use `break` to exit the loop early or `continue` to skip the rest of the loop body for the current iteration.

### `break` Example:
```java
for (int i = 0; i < 10; i++) {
    if (i == 5) {
        break;  // exits the loop when i is 5
    }
    System.out.println("i: " + i);
}
```

### `continue` Example:
```java
for (int i = 0; i < 10; i++) {
    if (i % 2 == 0) {
        continue;  // skips the rest of the loop body for even numbers
    }
    System.out.println("Odd number: " + i);
}
```

## Exercises

1. **Basic While Loop**  
   Write a program that prints the numbers from 1 to 10 using a `while` loop.

   ```java
   int count = 1;
   while (count <= 10) {
       System.out.println(count);
       count++;
   }
   ```

2. **Basic For Loop**  
   Modify the previous program to use a `for` loop instead of a `while` loop.

   ```java
   for (int count = 1; count <= 10; count++) {
       System.out.println(count);
   }
   ```

3. **Countdown with a Do-While Loop**  
   Write a program that counts down from 5 to 1 using a `do-while` loop.

   ```java
   int count = 5;
   do {
       System.out.println(count);
       count--;
   } while (count >= 1);
   ```

4. **Nested Loops - Multiplication Table**  
   Write a program that prints a multiplication table for numbers from 1 to 5 using nested loops.

   ```java
   for (int i = 1; i <= 5; i++) {
       for (int j = 1; j <= 5; j++) {
           System.out.print(i * j + "\t");
       }
       System.out.println();
   }
   ```

## Homework Excercises


### While Loops

1. Use a while loop to print out 5 random numbers between 1 and 10.

2. Generate a random number between 100 and 200. Use a while loop to find the sum of all the digits in the number. For example, for 123, the sum of digits is `1 + 2 + 3 = 6`.

3. Create a dice rolle guessing game. Generate a random number between 1 and 6. Ask the user to guess the result of the coin flip. If the user is correct, let them know. If the user made the wrong guess, allow them another guess.

4. Make a number guessing game.

### For Loops

5. Use a for loop to print out the numbers 7 through 19.

6. Repeat question 5, but initialize the variable outside of the for loop and put the change statement in the body of the loop (similar to a while loop).

7. Use a for loop to print all numbers from 1 to 5 in descending order (output should look like this: `54321`).

### Strings and Loops

8. Create a string variable with the phrase: `"y0u can find m0re l00p practice in the b00k"`. Use a loop to replace all zeros with `o's`.

9. Create a string variable with your name. Print the reverse spelling of your name using a loop.

### Nested Loops

10. Use a nested loop to print a 10x10 square of `*` signs.

11. Use a nested loop to print a right-angled triangle of `*` signs.

12. Use a nested loop to print an isosceles triangle.

### Tracing Loops

13. Complete the tracing exercises at:  
[Loop Analysis](https://runestone.academy/ns/books/published//csawesome/Unit4-Iteration/topic-4-5-loop-analysis.html)

### Switch Statements

14. Create a program that prompts the user to enter a number between 1 and 7. For each number, print out its corresponding day of the week (Sunday = 1, Monday = 2, etc.).

### Extra Questions

15. Have the user input 10 numbers. Use a loop to read the numbers and, at the end, output the largest number .

16. The Social Insurance Number (SIN) is a 9-digit number used for various purposes in Canada. Create a program that prompts the user to enter their SIN and check whether it is valid (i.e., the entry has only digits, correct length, etc.).

17. Compute Pi using the Leibniz formula. The more iterations you use in your loop, the more accurate the result.

## Runeston Excercises

- [Runestone Unit 4](https://runestone.academy/ns/books/published//csawesome/Unit4-Iteration/toctree.html)