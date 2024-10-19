# Unit 8: 2D Arrays

In the previous unit, we learned about **ArrayLists**, which allow us to manage collections of data that can dynamically grow or shrink. In this unit, we will explore **2D arrays**, which are essentially arrays of arrays. **2D arrays** are often used to represent grids, tables, or matrices, and are useful when working with multi-dimensional data structures.

## What is a 2D Array?

A **2D array** in Java is an array that contains other arrays as its elements. It is commonly used to store data in a **matrix format**, where data is organized in rows and columns. Each element of the array can be accessed using two indices: one for the row and one for the column.

### Example: Real-World Applications of 2D Arrays
- **Storing a user database**: A row might store the username, while the second column stores the corresponding password.
- **Game boards**: Representing a chessboard or a grid-based game like Tic-Tac-Toe.

### Row Major and Column Major Arrays

There are two common ways to store data in a 2D array:
- **Row-major order**: Data is stored row by row (Java uses row-major order).
- **Column-major order**: Data is stored column by column (not used in Java but important in other languages like Fortran).

## Declaring and Creating 2D Arrays

### Declaring a 2D Array
To declare a 2D array, specify the type of elements that will be stored, followed by two sets of square brackets `[][]`:

```java
int[][] matrix;
```

At this point, the array is declared, but it has not been created yet. Arrays in Java are objects, so the variable only holds a reference to the array object.

### Creating a 2D Array
To create a 2D array, use the `new` keyword, followed by the data type and the size of both dimensions (rows and columns):

```java
matrix = new int[3][3];  // 3x3 matrix
```

This creates a 3x3 2D array of integers. The first number represents the number of rows, and the second number represents the number of columns.

### Declaring and Creating a 2D Array Together

You can combine the declaration and creation of a 2D array into one line:

```java
int[][] matrix = new int[3][3];
```

### Default Values in 2D Arrays

When a 2D array is created:
- **Numeric types** (like `int` or `double`) are initialized to `0`.
- **Boolean types** are initialized to `false`.
- **Object references** (like `String`) are initialized to `null`.

## Setting Values in a 2D Array

You can assign values to specific elements in a 2D array by specifying the row and column indices:

```java
matrix[0][0] = 1;  // Assigns 1 to the first row, first column
matrix[1][2] = 9;  // Assigns 9 to the second row, third column
```

## Setting Multiple Values at Once

You can also initialize a 2D array with predefined values when it is created:

```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
```

In this example, the 2D array is initialized with specific values for each element.

## Accessing Values in a 2D Array

To retrieve a value from a 2D array, specify the row and column indices:

```java
int value = matrix[2][1];  // Retrieves the element in the third row, second column
```

## Traversing 2D Arrays

### Array Lengths in 2D Arrays

A 2D array has both a **row length** and a **column length**. You can access the length of the outer array (the number of rows) and the length of the inner arrays (the number of columns) using the `length` property:

```java
int rows = matrix.length;         // Number of rows
int cols = matrix[0].length;      // Number of columns in the first row
```

### Using Nested Loops to Traverse a 2D Array

To traverse a 2D array and access each element, you can use a **nested `for` loop**. The outer loop iterates over the rows, and the inner loop iterates over the columns:

```java
for (int row = 0; row < matrix.length; row++) {
    for (int col = 0; col < matrix[row].length; col++) {
        System.out.print(matrix[row][col] + " ");
    }
    System.out.println();  // New line after each row
}
```

This will print out each element of the 2D array in a grid format.

## Homework Exercises

1. **Create a 2D Integer Array**
   - Create a 3x3 integer array and store the numbers 1 to 9 in it.
   - Print the array using nested loops.

2. **Boolean 2D Array**
   - Create a 1x2 2D boolean array and store `true` and `false` in it.
   - Print the array using nested loops.

3. **String 2D Array for Grades**
   - Create a 2D String array to store your grades for different subjects.
   - Find the average of all your grades and print it.

4. **Array Length and Traversal**
   - Create a 5x5 2D array where each element is the sum of its row and column indices.
   - Print the array and its dimensions.



## Runestone Exercises

To practice further and explore the concepts from this unit, complete the exercises in Runestone’s Unit 8:

- [Runestone Unit 8 Exercises](https://runestone.academy/ns/books/published//csawesome/Unit8-2DArray/toctree.html)

