# Design patterns cheat sheet

## Strategy

- The ***strategy pattern*** defines a family of algorithms, encapsulates each 
one, and makes them interchangeable. Strategy lets the algorithm vary 
independently from clients that use it
- *Change* is the only thing that is constant always and everywhere
- Take what varies and "encapsulate" it so it won't affect the rest of 
your code
- [Code](src/main/java/strategy/App.java)

## Observer 
- The ***observer pattern*** defines a `one-to-many` dependency between 
objects so that when one object changes state, all of its dependencies
re notified and updated automatically
- JDK supports **Observer pattern**, `java.util.Observable` and 
`java.util.Observer`
- [Code](src/main/java/observer/App.java)

## Decorator 
- The ***decorator pattern*** attaches additional responsibilities to an
object dynamically. Decorators provide a flexible alternative to 
subclassing for extending functionality
- Decorators have the same supertype as objects they decorate
-  You can use one or more decorators to wrap an object
- Given that the decorator has the same supertype as the object it 
decorates, we can pass around a decorated object in place of the 
original (wrapped) object
- The decorator adds its own behavior either before and/or after 
delegating to the object it decorates to do the rest of the job
- Objects can be decorated at any time, so we can decorate objects 
dynamically at runtime with as many decorators as we like
- [Code](src/main/java/decorator/App.java)

## Factory
- The ***factory method pattern*** defines an interface for creating an 
object, but lets subclasses decide which class to instantiate. Factory
method lets a class defer instantiation to subclasses  
- Pattern gives us a way to encapsulate the instantiation of concrete 
type
- [Code](src/main/java/factory/App.java)

## Singleton
- The ***singleton pattern*** ensures a class has only one instance, 
and provides a global point access to it
- Synchronizing a method can decrease performance by a factor of 100,
so if a high traffic part of your code begins using `getInstance()`, you
may have to reconsider using eager initialization of singleton
- [Code](src/main/java/singleton/App.java)

## Command
- The ***command pattern*** encapsulates a request as an object, thereby
letting you parametrize other objects with different requests, queue or 
log requests, and support undoable operations
- [NoCommand](src/main/java/command/NoCommand.java) object is
an example of a *null object*. A null object is useful when you don't 
have a meaningful object to return, adn yet you want to remove the 
responsibility for handling **null** from client
- Command give is a way to package a piece of computation and pass it 
around as a first-class object

## Adapter
- The ***adapter pattern*** converts the interface of the class into 
another interface the clients expect. Adapter lets class work together 
that couldn't otherwise because of incompatible interfaces
- [Code](src/main/java/adapter/App.java)

## Template method
- The ***template method pattern*** defines the skeleton of an algorithm 
in a method, deferring some steps to subclasses.Template method lets 
subclasses redefine certain steps of an algorithm without changing the
algorithm's structure
- [Code](src/main/java/template_method/App.java)

## Iterator
- The ***iterator pattern*** provides a way to access the elements of
an aggregate object sequentially without exposing its underlying 
representation 
- [Code](src/main/java/iterator/App.java)

## Composite
- The ***composite pattern*** allows you to compose objects into tree 
structures to represent part-whole hierarchies. Composite lets clients 
treat individual objects and compositions of objects uniformly
- Using composite structure we can apply the same operations over both 
composites and individual objects. In other words, in most cases we can 
ignore the difference between compositions of objects and individual 
objects
- [Code](src/main/java/composite/App.java)

## Design principles

- Identify the aspects of your application that vary and separate from 
what stays the same
- Program to an interface (supertype), not an implementation
- Favor composition over inheritance
- Strive for loosely coupled designs between objects that interact
- Classes should be open for extension but closed for modification
- Depend upon abstraction. Do not depend upon concrete classes
    - No variable should hold a reference to concrete class
    - No class should derive from a concrete class
    - No method should override an implemented method of any of its base 
    classes
- A class should have only one reason to change