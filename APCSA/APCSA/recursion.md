
# Unit 10: Recursion

In previous units, we explored concepts like **inheritance**, **polymorphism**, and **2D arrays**, which are critical components of object-oriented programming and data structures. In this unit, we will focus on **recursion**, a fundamental programming technique where a method calls itself to solve a problem.

## What is Recursion?

**Recursion** occurs when a method calls itself as part of its execution. It is often used to solve problems that can be broken down into smaller, simpler versions of the same problem. A recursive method must have:
1. **Base case**: A condition that halts the recursion.
2. **Recursive call**: The point where the method calls itself with modified parameters.

### Example: Basic Structure of Recursion

Here is a simple example of a recursive method that counts down from a given number:

```java
public class RecursionExample {
    public static void countdown(int n) {
        if (n == 0) {  // Base case
            System.out.println("Done!");
        } else {
            System.out.println(n);
            countdown(n - 1);  // Recursive call
        }
    }

    public static void main(String[] args) {
        countdown(5);
    }
}
```

---

## Understanding Recursive Methods

### Components of a Recursive Method

A recursive method includes:
- **Base Case**: The condition that stops the recursion.
- **Recursive Call**: A call to the same method with modified parameters.

Each recursive call works with its own set of local variables, similar to how loops work with control variables to manage progress.

---

## Factorial: A Classic Example

One of the most common examples of recursion is calculating the **factorial** of a number. The factorial of a number `n` is the product of all positive integers up to `n`. The formula for factorial is:

\[
n! = n \times (n - 1)!
\]

Here is a recursive method to calculate the factorial of a number:

```java
public class Factorial {
    public static int factorial(int n) {
        if (n == 1) {  // Base case
            return 1;
        } else {
            return n * factorial(n - 1);  // Recursive call
        }
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));  // Output: 120
    }
}
```

---

## Fibonacci Sequence

The **Fibonacci sequence** is another classic problem often solved using recursion. The Fibonacci sequence is defined as:

\[
F(n) = F(n - 1) + F(n - 2)
\]

Where:
- \( F(0) = 0 \)
- \( F(1) = 1 \)

Here’s a recursive method to calculate the nth Fibonacci number:

```java
public class Fibonacci {
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);  // Recursive calls
        }
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(10));  // Output: 55
    }
}
```

---

## Merge Sort: A Recursive Sorting Algorithm

**Merge Sort** is an efficient, comparison-based, divide-and-conquer sorting algorithm. It uses recursion to divide the array into smaller subarrays until each subarray contains one element, and then merges the subarrays in sorted order.

### Steps of Merge Sort:
1. **Divide**: Recursively split the array into halves until you have subarrays of one element.
2. **Merge**: Combine the sorted subarrays to produce a single sorted array.

### Merge Sort Code Example

```java
public class MergeSort {
    public static void mergeSort(int[] array) {
        if (array.length > 1) {
            int mid = array.length / 2;

            // Split array into left and right halves
            int[] left = new int[mid];
            int[] right = new int[array.length - mid];

            System.arraycopy(array, 0, left, 0, mid);
            System.arraycopy(array, mid, right, 0, array.length - mid);

            // Recursively sort each half
            mergeSort(left);
            mergeSort(right);

            // Merge the sorted halves
            merge(array, left, right);
        }
    }

    private static void merge(int[] array, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        // Merge the left and right arrays
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }

        // Copy remaining elements from left array
        while (i < left.length) {
            array[k++] = left[i++];
        }

        // Copy remaining elements from right array
        while (j < right.length) {
            array[k++] = right[j++];
        }
    }

    public static void main(String[] args) {
        int[] array = {38, 27, 43, 3, 9, 82, 10};
        mergeSort(array);
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
```

#### Watch Merge Sort Video for More Clarity:
- [Merge Sort - Michael Sambol](https://www.youtube.com/watch?v=4VqmGXwpLqc)

### Time Complexity of Merge Sort:
- **Best, Worst, and Average Case**: O(n log n)
- **Space Complexity**: O(n), due to the temporary arrays used during merging.

---

## Binary Search (Recursive)

**Binary search** is an efficient algorithm to find an element in a **sorted** array by repeatedly dividing the search interval in half. It can be implemented recursively as follows:

```java
public class BinarySearch {
    public static int binarySearch(int[] array, int key, int low, int high) {
        if (low > high) {  // Base case
            return -1;  // Element not found
        }

        int mid = (low + high) / 2;

        if (array[mid] == key) {
            return mid;
        } else if (array[mid] > key) {
            return binarySearch(array, key, low, mid - 1);  // Recursive call for left half
        } else {
            return binarySearch(array, key, mid + 1, high);  // Recursive call for right half
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 11, 13, 15, 17};
        System.out.println(binarySearch(array, 7, 0, array.length - 1));  // Output: 3
    }
}
```

---

## Recursion vs. Iteration

Every recursive problem can be solved using **iteration** (loops), and vice versa. The decision to use recursion depends on the problem at hand:
- **Recursion** is useful when the problem can naturally be divided into smaller subproblems.
- **Iteration** is often more efficient in terms of memory, as recursion uses the call stack.

### Example: Factorial with Iteration

Here is how the factorial can be calculated using iteration instead of recursion:

```java
public class IterativeFactorial {
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));  // Output: 120
    }
}
```

---

## Homework Exercises

1. **Factorial with Recursion**
   - Write a recursive method that calculates the factorial of a number. Test it with various values of `n`.

2. **Fibonacci with Recursion**
   - Write a recursive method that calculates the nth Fibonacci number. Print the first 10 Fibonacci numbers.

3. **Binary Search with Recursion**
   - Write a recursive method that performs binary search on a sorted array. Test it with different values.

4. **Palindrome Checker**
   - Write a recursive method that checks if a string is a palindrome (reads the same forward and backward).

5. **Sum of Digits**
   - Write a recursive method that returns the sum of the digits of a given integer.

6. **Merge Sort Implementation**
   - Write a recursive merge sort algorithm to sort an array of integers. Test the implementation with arrays of different sizes.

---

## Runestone Exercises

To practice further and explore the concepts from this unit, complete the exercises in Runestone’s Unit 10:

- [Runestone Unit 10 Exercises](https://runestone.academy/ns/books/published//csawesome/Unit10-Recursion/toctree.html)

