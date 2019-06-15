# 'Head First Design Patterns' cheat sheet

## Strategy

- The strategy pattern defines a family of algorithms, encapsulates each 
one, and makes them interchangeable.Strategy lets the algorithm vary 
independently from clients that use it.
- ***Change*** is the only thing that is constant always and everywhere! 
- take what varies and "encapsulate" it so it won't affect the rest of 
your code.

## Design principles

- Identify the aspects of your application that vary and separate from 
what stays the same.
- Program to an interface (supertype), not an implementation.
- Favor composition over inheritance
