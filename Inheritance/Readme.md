# Java Inheritance and Types

Inheritance is a fundamental concept in Java programming that enables a class to inherit properties and behaviors from another class. This promotes code reusability and helps create a hierarchical structure in object-oriented programming.

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
```
### 2. Multilevel Inheritance

Multilevel inheritance involves a chain of inheritance where a class extends another class, and then another class extends that class. This creates a hierarchy of classes.

 **Example:**
```java
public class Animal {
    // Fields and methods of the Animal class
}

public class Mammal extends Animal {
    // Fields and methods specific to Mammals
}

public class Dog extends Mammal {
    // Fields and methods specific to Dogs
}
```
3. Hierarchical Inheritance
Hierarchical inheritance is a form of inheritance where multiple classes inherit from a single superclass. This creates a tree-like structure of classes.

```java
public class Vehicle {
    // Fields and methods common to all vehicles
}

public class Car extends Vehicle {
    // Fields and methods specific to cars
}

public class Motorcycle extends Vehicle {
    // Fields and methods specific to motorcycles
}
```
#4 Multiple
- It is not supported diractly but it can be achieve with the help of interface.
- Java supports multiple inheritance through interfaces. A class can implement multiple interfaces to achieve functionality from various sources.


**Example**
 ```java
  public interface Swimmer {
    void swim();
}

public interface Flyer {
    void fly();
}

public class Duck implements Swimmer, Flyer {
    @Override
    public void swim() {
        // Swim implementation
    }

    @Override
    public void fly() {
        // Fly implementation
    }
}
```

#5. Hybrid Inheritence.

Hybrid inheritance is a combination of multiple types of inheritance. It often involves a mix of single inheritance, multiple inheritance (through interfaces), and/or multilevel inheritance.

```java
public interface Swimmer {
    void swim();
}

public interface Flyer {
    void fly();
}

public class Duck implements Swimmer, Flyer {
    @Override
    public void swim() {
        // Swim implementation
    }

    @Override
    public void fly() {
        // Fly implementation
    }
}
```
