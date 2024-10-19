# Unit 5: Classes and Objects

In previous units, we covered topics like **Boolean expressions**, **conditional statements**, and **loops**, which allowed us to control the flow of our programs. Now, in Unit 5, we will explore **classes** and **objects**, fundamental components of object-oriented programming (OOP). By writing your own classes, you can model real-world entities, define their structure (attributes), and behavior (methods).

## Anatomy of a Java Class

A class is a blueprint for creating objects. When you define a class, you are essentially defining a new abstract data type. Instances of this class (objects) can be created, and they hold specific data and behavior.

To write a class, you start with a `public` keyword, followed by `class`, the name of the class, and the class body enclosed in curly braces `{}`.

### Example:

```java
public class Car {
    // Instance variables
    private String brand;
    private int speed;

    // Constructor
    public Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // Method to display information
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
    }
}
```

In this `Car` class:
- **Attributes**: `brand` and `speed` store the object's state.
- **Constructor**: Initializes the object’s attributes when an object is created.
- **Method**: `displayInfo()` prints the car’s details.

### Creating an Object

```java
Car myCar = new Car("Toyota", 100);
myCar.displayInfo();
```

### Key Components of a Java Class

- **Instance Variables (Attributes)**: These hold the data for each object.
- **Methods**: Define the behavior of objects.
- **Constructors**: Special methods used to initialize an object.
- **Access Modifiers**: Keywords like `public` and `private` that control the visibility of attributes and methods.



## Parts of a Java Class

### Comments (Preconditions and Postconditions)

As your programs become more complex, comments become a critical tool for improving readability and maintainability. You should include comments explaining:
- **Preconditions**: Conditions that must be true before a method is called.
- **Postconditions**: Conditions that must be true after a method finishes execution.

For example:

```java
// Preconditions: speed must be a non-negative integer.
// Postconditions: speed is increased by the given value.
public void accelerate(int increment) {
    this.speed += increment;
}
```

### Using Methods

Methods are used to reduce the complexity of code and to promote code reusability. By encapsulating behavior in methods, you can organize your code more effectively and avoid repetition.

```java
public void accelerate(int increment) {
    speed += increment;
}
```

In this example, the `accelerate` method increases the car's speed by a given amount.



## Static Variables and Methods

**Static variables and methods** belong to the class itself, rather than to any specific instance of the class. Static members are shared across all instances of a class.

### Example: Static Method

```java
public class MathHelper {
    // Static method
    public static int add(int a, int b) {
        return a + b;
    }
}

// Usage without creating an object
int result = MathHelper.add(5, 3);
```

### Static Variables

Static variables maintain their value across all instances of the class. The static keyword is placed right after the `public` or `private` modifier and before the type:

```java
public class Car {
    public static int numberOfCars = 0;
    private String brand;
    private int speed;

    public Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
        numberOfCars++;  // Increment count when a new car is created
    }
}
```

Each time a `Car` object is created, the static variable `numberOfCars` is incremented.



## Scope and Access Control

Java provides **access control** to protect the data inside classes. The two most common access modifiers are:
- **public**: Accessible from anywhere.
- **private**: Accessible only within the class.

### Example: Using `public` and `private`

```java
public class Person {
    public String name;      // public field
    private int age;         // private field

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // public method to access private age field
    public int getAge() {
        return age;
    }

    // public method to modify private age field
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }
}
```

### Accessing Fields in Another Class

```java
public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alice", 25);

        // Accessing the public field
        System.out.println("Name: " + person.name);

        // Accessing the private field directly: Not allowed
        // System.out.println("Age: " + person.age); // Error: age has private access

        // Accessing the private field using the public getter
        System.out.println("Age: " + person.getAge());
    }
}
```



## The `this` Keyword

The `this` keyword is used to refer to the current object within a method or constructor. It helps resolve ambiguity between instance variables and method parameters when they have the same name.

### Example:

```java
public class Student {
    private String name;

    public Student(String name) {
        this.name = name;  // 'this.name' refers to the instance variable
    }
}
```

In this example, `this.name` refers to the instance variable, while `name` refers to the parameter.



## Solved Exercises

### Example 1: Creating a Simple Class

Here’s how to create a `Book` class and use its methods to manipulate and display its attributes:

```java
public class Book {
    private String title;
    private String author;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Setter for title
    public void setTitle(String title) {
        this.title = title;
    }

    // Method to display book information
    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Testing the Book class
public class Main {
    public static void main(String[] args) {
        Book myBook = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        myBook.displayBookInfo();

        // Modify the title
        myBook.setTitle("1984");
        myBook.displayBookInfo();
    }
}
```



## Homework Exercises

1. **Movie Class**  
   Create a class called `Movie` with attributes `title`, `director`, and `rating`. Implement constructors, getters, and setters. Add a method that checks if the movie is rated PG-13 or higher.

2. **BankAccount Class**  
   Create a `BankAccount` class with attributes `accountNumber`, `balance`, and `ownerName`. Include methods to deposit and withdraw money, and to check the balance.

3. **Circle Class**  
   Create a class `Circle` with the attributes `radius`. Include methods to calculate the area and the circumference of the circle.

4. **Student Class**  
   Write a `Student` class with attributes `name` and `grade`. Create a method that checks if the student has passed (grade >= 60).



## Runestone Exercises

To practice further and explore the concepts from this unit, complete the exercises in Runestone’s Unit 5:

- [Runestone Unit 5 Exercises](https://runestone.academy/ns/books/published//csawesome/Unit5-Writing-Classes/toctree.html)