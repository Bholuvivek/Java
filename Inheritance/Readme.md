# Java Inheritance and Types

Inheritance is a fundamental concept in Java programming that enables a class to inherit properties and behaviors from another class. This promotes code reusability and helps create a hierarchical structure in object-oriented programming.

## Understanding Inheritance

### Superclass

A superclass (also known as a parent class or base class) is the class whose properties and behaviors are inherited by another class, known as the subclass. Superclasses provide a blueprint for common attributes and methods that can be shared among multiple classes.

### Subclass

A subclass (also known as a child class or derived class) is a class that inherits properties and behaviors from a superclass. The subclass can extend or override the inherited features and may introduce additional attributes and methods.

## Types of Inheritance

### 1. Single Inheritance

In single inheritance, a subclass inherits from only one superclass. This is a straightforward form of inheritance.

**Example:**
```java
public class Animal {
    // Fields and methods of the Animal class
}

public class Dog extends Animal {
    // Fields and methods specific to the Dog class
}
