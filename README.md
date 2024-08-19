## LibraryManagementSystem
a brief case study for OOP principles

# Encapsulation:

Classes: Create classes for `Book`, `User`, `Librarian`, and `Member`.
Private Attributes: Use private attributes to store data like book details, user information, and loan records. Expose necessary functionality through public methods.

# Abstraction:

Abstract Classes: Implement abstract base classes for `User` (with subclasses like `Librarian` and `Member`) and Book (with subclasses like `PrintedBook`, `eBook`).
Method Abstraction: Define abstract methods in base classes that must be implemented in subclasses, such as `borrowBook()`.

# Inheritance:

Book Inheritance: Create subclasses for different types of books (e.g., `PrintedBook`, `eBook`) that inherit from a common `Book` class.

# Polymorphism:

Overriding Methods: Override methods in subclasses to provide specific behavior. For instance, override the `borrowBook()` method in the Member class to include different rules for different user types.
