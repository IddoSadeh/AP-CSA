# Unit 9: Inheritance

In the previous units, we explored topics such as **classes**, **objects**, and **arrays**, which are essential components of object-oriented programming. In Unit 9, we will focus on one of the most important concepts in object-oriented programming: **inheritance**. **Inheritance** allows you to create a new class that is based on an existing class, promoting code reuse and a hierarchical structure.

## What is Inheritance?

**Inheritance** is a mechanism in Java that allows one class to inherit the properties and methods of another class. The class that inherits the properties is called the **subclass** or **child class**, and the class whose properties are inherited is called the **superclass** or **parent class**.

### Example:

```java
public class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

public class Dog extends Animal {
    public void makeSound() {
        System.out.println("Woof");
    }
}
```

In this example, the `Dog` class **inherits** from the `Animal` class. The `makeSound()` method in the `Dog` class **overrides** the one from `Animal`.



## Subclass Extends Superclass

In Java, a **subclass** is created using the `extends` keyword. This indicates that the subclass inherits from the superclass.

```java
public class Car {
    // Superclass code
}

public class ElectricCar extends Car {
    // Subclass code
}
```

In this example, `ElectricCar` is a subclass of `Car`. This means `ElectricCar` inherits all the methods and properties of the `Car` class.



## Why Use Inheritance?

Inheritance allows for:
- **Code reuse**: Common functionality in a superclass can be reused in subclasses.
- **Polymorphism**: You can use a superclass reference to refer to a subclass object, allowing for dynamic method binding.
- **Organized code**: Inheritance promotes a hierarchical organization of classes, making the code more modular and easier to manage.



## Is-A vs. Has-A Relationship

In object-oriented programming, we distinguish between **Is-A** and **Has-A** relationships.

### Is-A Relationship (Inheritance)
- Describes an inheritance relationship.
- Example: A `Dog` **is-a** `Animal`.

### Has-A Relationship (Composition)
- Describes a composition relationship where one class contains another class as a member.
- Example: A `Car` **has-a** `Engine`.



## Inheritance and Constructors

Constructors are not inherited. However, a subclass can call the constructor of its superclass using the `super` keyword.

### Example:

```java
public class Animal {
    public Animal() {
        System.out.println("Animal created");
    }
}

public class Dog extends Animal {
    public Dog() {
        super();  // Calls the Animal constructor
        System.out.println("Dog created");
    }
}
```

In this example, the `Dog` constructor first calls the `Animal` constructor using `super()`.



## Overriding Methods

**Method overriding** occurs when a subclass provides its own implementation of a method that is already defined in its superclass. The method in the subclass must have the same signature as the one in the superclass.

```java
public class Animal {
    public void makeSound() {
        System.out.println("Animal sound");
    }
}

public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}
```

The `@Override` annotation tells the compiler that the method is being overridden.



## Overloading Methods

**Method overloading** is different from overriding. In method overloading, multiple methods in the same class have the same name but different parameter lists.

```java
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
}
```

In this case, `add()` is overloaded with different parameter types.



## Inherited Getters and Setters

When a subclass inherits from a superclass, it also inherits the getter and setter methods of the superclass.

```java
public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Student extends Person {
    // Inherits getName() and setName()
}
```

The `Student` class inherits the `getName()` and `setName()` methods from the `Person` class.



## The `super` Keyword

The `super` keyword is used to refer to the superclass in a subclass. It can be used to:
- **Call superclass constructors**: `super()` or `super(arguments)`
- **Access superclass methods**: `super.methodName()`



## Inheritance Hierarchies

An **inheritance hierarchy** consists of multiple levels of inheritance where a subclass itself has other subclasses. Java supports single inheritance, meaning a class can only extend one superclass, but it can have many subclasses.



## Polymorphism

**Polymorphism** allows a superclass reference to refer to objects of its subclasses. This allows for dynamic method binding where the method that gets executed is determined at runtime.

```java
public class Animal {
    public void makeSound() {
        System.out.println("Animal sound");
    }
}

public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();  // Superclass reference to subclass object
        myDog.makeSound();  // Outputs: Woof
    }
}
```



## The `Object` Class

In Java, every class implicitly inherits from the **Object** class if no other superclass is specified. The `Object` class provides several useful methods, such as `toString()`, `equals()`, and `hashCode()`.



## Homework Exercises

1. **Create a Pet Hierarchy**  
   - Create a superclass `Pet` with attributes `name` and `age`.
   - Create subclasses `Dog`, `Cat`, and `Bird` that extend from `Pet`.
   - Override the `makeSound()` method for each subclass.
   - Create an array or ArrayList of `Pet` objects and loop through it to call the `makeSound()` method on each pet.

2. **Vehicle Hierarchy**  
   - Create a `Vehicle` superclass with attributes `make` and `model`.
   - Create subclasses `Car`, `Truck`, and `Motorcycle` that extend from `Vehicle`.
   - Implement methods in each subclass to describe the type of vehicle.
   - Write a program that demonstrates polymorphism by creating a list of `Vehicle` objects.

3. **Polymorphism Example**  
   - Create an inheritance hierarchy of `Shape` classes, with subclasses such as `Circle`, `Square`, and `Triangle`.
   - Implement a method `calculateArea()` in each subclass.
   - Use polymorphism to store different shapes in a list and calculate their areas.



## Runestone Exercises

To practice further and explore the concepts from this unit, complete the exercises in Runestone’s Unit 9:

- [Runestone Unit 9 Exercises](https://runestone.academy/ns/books/published//csawesome/Unit9-Inheritance/toctree.html).

