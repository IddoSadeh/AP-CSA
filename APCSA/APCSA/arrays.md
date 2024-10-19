# Unit 6: Arrays

In the previous unit, we learned how to create and use **classes** to model real-world entities in Java. Now, in Unit 6, we will focus on **arrays**, which allow us to store multiple values of the same type in a single variable. Arrays are a powerful way to manage and manipulate collections of data, and they are frequently used in many types of applications.

## What is an Array?

An **array** is a data structure that holds a collection of data items (elements) of the same type. Each element in the array can be accessed using an **index**. Arrays in Java are **zero-indexed**, meaning the first element is at index 0, the second at index 1, and so on.

### Declaring and Creating an Array

To declare an array, you specify the data type followed by square brackets `[]`:

```java
int[] numbers;  // declares an array of integers
```

To create an array, use the `new` keyword, specifying the type and size of the array:

```java
numbers = new int[5];  // creates an array that can hold 5 integers
```

You can also declare and create an array in one step:

```java
int[] numbers = new int[5];
```

### Initializing an Array

Arrays can be initialized with values at the time of creation:

```java
int[] numbers = {1, 2, 3, 4, 5};  // array of 5 integers
```

### Array Elements

When an array is created using `new`, all its elements are initialized with a default value based on the type:
- Elements of type `int` are initialized to `0`
- Elements of type `double` are initialized to `0.0`
- Elements of type `boolean` are initialized to `false`
- Elements of a reference type (such as objects) are initialized to `null`

### Accessing Array Elements

You can access or modify array elements using their index:

```java
System.out.println(numbers[0]);  // prints the first element, 1
numbers[1] = 10;                 // changes the second element to 10
```

### Array Length

You can find the number of elements in an array using the `length` property:

```java
System.out.println(numbers.length);  // prints the number of elements in the array
```

## Arrays of Objects

Arrays can store primitive data types (like `int` or `double`) or object reference data types (like `String` or custom objects). When creating an array of objects, remember that the array elements are initialized to `null` until you assign values.

```java
String[] names = new String[3];  // Array of strings, initially all elements are null
names[0] = "Alice";
```

## Traversing Arrays

Often, you need to **traverse** an array (i.e., go through each element). There are multiple ways to do this in Java.

### Using a `for` Loop

```java
for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}
```

### Using a **for-each** Loop

Java provides a **for-each loop** that simplifies the process when you don't need access to the index:

```java
for (int num : numbers) {
    System.out.println(num);
}
```

This loop automatically goes through each element of the array from the first to the last.

## Common Array Operations

### Finding the Maximum or Minimum Value

Here’s an example of how to find the maximum value in an array:

```java
int[] numbers = {3, 5, 7, 2, 8};
int max = numbers[0];

for (int i = 1; i < numbers.length; i++) {
    if (numbers[i] > max) {
        max = numbers[i];
    }
}

System.out.println("Max value: " + max);
```

### Computing the Sum or Average

You can compute the sum or average of array elements:

```java
int sum = 0;

for (int num : numbers) {
    sum += num;
}

double average = (double) sum / numbers.length;
System.out.println("Average: " + average);
```

### Searching for an Element

To search for an element, you can loop through the array and check if the element exists:

```java
int searchValue = 7;
boolean found = false;

for (int num : numbers) {
    if (num == searchValue) {
        found = true;
        break;
    }
}

if (found) {
    System.out.println(searchValue + " found in the array.");
} else {
    System.out.println(searchValue + " not found.");
}
```

## Arrays and Methods

You can also pass arrays to methods. Here’s an example of a method that computes the sum of an array:

```java
public static int sumArray(int[] array) {
    int sum = 0;
    for (int num : array) {
        sum += num;
    }
    return sum;
}

public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5};
    System.out.println("Sum: " + sumArray(numbers));
}
```

## Homework Exercises

Write a Array Helper class with the following methods:

1. **Find Minimum**: Write a method to find the minimum value in an array.
2. **Sum/Average**: Write a method to compute the sum and average of array elements.
3. **Search**: Write a method to search for a specific element in an array.
4. **Check Properties**: Write methods to check if at least one or all elements meet a certain condition.
5. **Access Consecutive Pairs**: Write a method to access and print all consecutive pairs of elements in an array.
6. **Check for Duplicates**: Write a method to determine if the array contains duplicate elements.
7. **Count Specific Criteria**: Write a method to count how many elements meet a specific criterion (e.g., greater than a certain value).
8. **Shift/Rotate**: Write a method to shift or rotate elements of the array left or right.
9. **Reverse**: Write a method to reverse the elements of the array.

## Runestone Exercises

To practice further and explore the concepts from this unit, complete the exercises in Runestone’s Unit 6:

- [Runestone Unit 6 Exercises](https://runestone.academy/ns/books/published//csawesome/Unit6-Arrays/toctree.html)

