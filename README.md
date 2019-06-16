# Design patterns cheat sheet

## Strategy

- The strategy pattern defines a family of algorithms, encapsulates each 
one, and makes them interchangeable.Strategy lets the algorithm vary 
independently from clients that use it
- *Change* is the only thing that is constant always and everywhere
- Take what varies and "encapsulate" it so it won't affect the rest of 
your code
- [Code](src/main/java/strategy/pattern/App.java)

## Observer 
- The observer pattern defines a `one-to-many` dependency between 
objects so that when one object changes state, all of its dependencies
re notified and updated automatically. 
- JDK supports **Observer pattern**, `java.util.Observable` and 
`java.util.Observer`
- [Code](src/main/java/observer/pattern/App.java)

## Design principles

- Identify the aspects of your application that vary and separate from 
what stays the same
- Program to an interface (supertype), not an implementation
- Favor composition over inheritance
- Strive for loosely coupled designs between objects that interact.
