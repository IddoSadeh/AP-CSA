# Unit 7: ArrayLists

In the previous unit, we explored **arrays**—a fixed-size data structure that holds elements of the same type. Now, in Unit 7, we will focus on **ArrayLists**, a more flexible data structure that allows for dynamic resizing. **ArrayLists** are part of Java’s `java.util` package and are an essential tool for managing collections of data that may grow or shrink during the execution of a program.


## Packages and Imports

The **ArrayList** class belongs to the `java.util` package. In Java, a **package** is a collection of related classes. We have already used classes from the `java.lang` package, such as `String` and `Math`, which are automatically available to us without needing to explicitly import them. However, classes in other packages, such as `ArrayList` from `java.util`, need to be imported before we can use them.

There are two ways to import classes from a package:

### Importing a Single Class

If you only need to use a specific class from a package, you can import it directly using its **fully-qualified name**:

```java
// Import just the ArrayList class from java.util
import java.util.ArrayList;
```

Once this import statement is added, you can refer to `ArrayList` directly without having to specify `java.util.ArrayList` every time.

### Importing All Classes from a Package

If you plan to use multiple classes from the same package, you can use a **wildcard** import to import all the classes in that package:

```java
// Import everything in java.util, including ArrayList and other classes like Scanner
import java.util.*;
```

While this approach brings in all the classes from `java.util`, such as `ArrayList`, `Scanner`, and `HashMap`, it’s important to note that using wildcard imports can sometimes lead to conflicts if classes from different packages have the same name. For most Java packages, this won’t be an issue, but it's something to be aware of.

### The AP Exam and Imports

Don’t worry about adding import statements on the AP CSA exam. Any classes you need for the exam will be imported for you, and you won’t need to memorize import statements.


## What is an ArrayList?

An **ArrayList** is a resizable array that can dynamically grow and shrink as elements are added or removed. Unlike arrays, which have a fixed size, ArrayLists can change in size as needed. This makes them a versatile tool for storing collections of data in real-world applications.

### Key Characteristics of ArrayLists
- **Resizable**: ArrayLists can grow or shrink during runtime.
- **Mutable**: Their contents can be changed (elements can be added, removed, or modified).
- **Part of the `java.util` package**: To use ArrayLists, you need to import the package.

```java
import java.util.ArrayList;
```



## Declaring and Creating ArrayLists

To declare and create an ArrayList, you need to specify the type of objects the ArrayList will hold. The type is placed in angle brackets `< >`.

```java
ArrayList<Type> name = new ArrayList<Type>();
```

Here is an example of an ArrayList of `String` objects:

```java
ArrayList<String> names = new ArrayList<String>();
```

### Primitive Types and ArrayLists

ArrayLists cannot store primitive types directly (like `int`, `double`, etc.). Instead, Java provides **wrapper classes** for primitive types:
- `Integer` for `int`
- `Double` for `double`
- `Boolean` for `boolean`

Example:

```java
ArrayList<Integer> numbers = new ArrayList<Integer>();
```



## Common Operations with ArrayLists

### Adding Elements

You can add elements to an ArrayList using the `add()` method:

```java
names.add("Alice");
names.add("Bob");
```

You can also add an element at a specific index:

```java
names.add(1, "Charlie");  // Inserts "Charlie" at index 1
```

### Accessing Elements

You can retrieve elements using the `get()` method:

```java
String name = names.get(0);  // Retrieves the first element
```

### Modifying Elements

To modify an element in the ArrayList, use the `set()` method:

```java
names.set(0, "Eve");  // Changes the first element to "Eve"
```

### Removing Elements

To remove elements from an ArrayList, use the `remove()` method. You can remove an element by its index or by specifying the object to be removed:

```java
names.remove(0);  // Removes the element at index 0
names.remove("Charlie");  // Removes the object "Charlie"
```

### Getting the Size of an ArrayList

To find out how many elements are currently in an ArrayList, use the `size()` method:

```java
int size = names.size();  // Returns the number of elements in the list
```



## Traversing ArrayLists

### Using a `for` Loop

You can traverse an ArrayList using a `for` loop, just like with arrays:

```java
for (int i = 0; i < names.size(); i++) {
    System.out.println(names.get(i));
}
```

### Using a **for-each** Loop

A simpler way to traverse an ArrayList is to use a **for-each** loop:

```java
for (String name : names) {
    System.out.println(name);
}
```



## Converting Arrays to ArrayLists

You can convert an array to an ArrayList using the `Arrays.asList()` method:

```java
import java.util.Arrays;
import java.util.ArrayList;

String[] array = {"Alice", "Bob", "Charlie"};
ArrayList<String> list = new ArrayList<String>(Arrays.asList(array));
```

## Introducing Big O Notation

Before we dive into the **searching** and **sorting** algorithms, it’s essential to understand **Big O notation**, which is used to describe the performance or complexity of an algorithm. Big O notation provides a way to express how the runtime of an algorithm changes relative to the size of the input.

### What Does Big O Measure?

Big O notation gives us a high-level understanding of:
1. **Time complexity**: How the runtime of an algorithm increases as the input size increases.
2. **Space complexity**: How the amount of memory used by an algorithm increases as the input size increases.

### Common Big O Notations

- **O(1)**: Constant time. The runtime does not depend on the size of the input. Examples include accessing an element in an array by index.
  
  Example:
  ```java
  int number = array[5];  // O(1)
  ```

- **O(n)**: Linear time. The runtime grows proportionally to the input size. An example is a loop that iterates through every element of an array or ArrayList.

  Example:
  ```java
  for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);  // O(n)
  }
  ```

- **O(n^2)**: Quadratic time. The runtime grows proportionally to the square of the input size. Nested loops that iterate over the same data set often have this complexity.

  Example:
  ```java
  for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array.length; j++) {
          // Some operation on array[i] and array[j]  // O(n^2)
      }
  }
  ```

- **O(log n)**: Logarithmic time. The runtime increases logarithmically as the input size increases. Binary search is an example of an O(log n) algorithm.

  Example:
  ```java
  // Binary search algorithm // O(log n)
  ```

- **O(n log n)**: Log-linear time. This is commonly seen in more efficient sorting algorithms like **Merge Sort** and **Quick Sort**.

By understanding Big O notation, we can now evaluate the efficiency of different **searching** and **sorting** algorithms, which will be crucial for solving problems in the most optimal way.



Now that we've introduced **Big O notation**, let's proceed with searching and sorting algorithms like **linear search**, **binary search**, **selection sort**, and **insertion sort**, as described in the previous sections of Unit 7.


## Searching Algorithms

One of the strengths of computers is their ability to **search** through data efficiently. For the AP Computer Science A exam, you need to be familiar with two types of searching algorithms: **linear search** and **binary search**.

### Sequential Search (Linear Search)

**Linear search** looks through each element of an array or ArrayList one by one until it finds the desired value. This is the only method that works on unsorted data.

```java
public static int linearSearch(ArrayList<Integer> list, int value) {
    for (int i = 0; i < list.size(); i++) {
        if (list.get(i) == value) {
            return i;
        }
    }
    return -1;  // If the value is not found
}
```

### Binary Search

**Binary search** is a more efficient algorithm but can only be used on **sorted data**. It repeatedly divides the search space in half and checks the middle value.

```java
public static int binarySearch(ArrayList<Integer> list, int value) {
    int left = 0, right = list.size() - 1;
    while (left <= right) {
        int mid = (left + right) / 2;
        if (list.get(mid) == value) {
            return mid;
        } else if (list.get(mid) < value) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }
    return -1;  // If the value is not found
}
```

### Runtime Complexity

- **Linear search** has a runtime of `O(n)`—it checks each element one by one.
- **Binary search** has a runtime of `O(log n)`—it divides the search space in half each time.

#### Watch Binary Search Video:
- [Binary Search](https://www.youtube.com/watch?v=fDKIpRe8GW4)



## Sorting Algorithms

Sorting data efficiently is another important task. You should be familiar with the following sorting algorithms.

### Selection Sort

**Selection sort** repeatedly selects the smallest element from the unsorted part of the array and swaps it with the first unsorted element. It’s simple but has a runtime of `O(n^2)`.

```java
public static void selectionSort(ArrayList<Integer> list) {
    for (int i = 0; i < list.size() - 1; i++) {
        int minIndex = i;
        for (int j = i + 1; j < list.size(); j++) {
            if (list.get(j) < list.get(minIndex)) {
                minIndex = j;
            }
        }
        int temp = list.get(minIndex);
        list.set(minIndex, list.get(i));
        list.set(i, temp);
    }
}
```

#### Watch Selection Sort Video:
- [Selection Sort](https://www.youtube.com/watch?v=g-PGLbMth_g)

### Insertion Sort

**Insertion sort** builds the sorted array one element at a time by comparing and inserting the next unsorted element into its correct position. Like selection sort, it has a runtime of `O(n^2)`.

```java
public static void insertionSort(ArrayList<Integer> list) {
    for (int i = 1; i < list.size(); i++) {
        int key = list.get(i);
        int j = i - 1;
        while (j >= 0 && list.get(j) > key) {
            list.set(j + 1, list.get(j));
            j--;
        }
        list.set(j + 1, key);
    }
}
```

#### Watch Insertion Sort Video:
- [Insertion Sort](https://www.youtube.com/watch?v=JU767SDMDvA)



## Homework Exercises

### ArrayList Operations

1. **Create and Manipulate an ArrayList**
   - Create an ArrayList that holds 10 random numbers between 1 and 10.
   - Print the list.
   - Find the sum of all the numbers in the list.

2. **Modify the ArrayList Based on Conditions**
   - Add random numbers to the list until the sum is greater than 100.
   - Find the size of your new list and print it.
   - Find the smallest value in the list, remove it, and replace it with a number twice its size.
   - Sort the list from smallest to largest.

3. **Linear Search**:
   - Write a method that uses **linear search** to find a value in an ArrayList of integers. The method should return the index of the value if found, or `-1` if not found.

4. **Binary Search**:
   - Write a method that uses **binary search** to find a value in a sorted ArrayList of integers. Test your method by first sorting the list, then using the search method.

5. **Sort the List**:
   - Write a method to sort an ArrayList using **selection sort** and another using **insertion sort**. Compare their runtimes using different sizes of lists.



## Runestone Exercises

To practice further and explore the concepts from this unit, complete the exercises in Runestone’s Unit 7:

- [Runestone Unit 7 Exercises](https://runestone.academy/ns/books/published//csawesome/Unit7-ArrayList/toctree.html)