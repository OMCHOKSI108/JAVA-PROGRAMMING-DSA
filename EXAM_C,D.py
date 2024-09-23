''' 
Question 1: Library Management System
Scenario: You are tasked with implementing a simple library management system.

Requirements:

Create a base class Book with title, author, and ISBN fields. Provide appropriate methods to set and get these properties.

Derive a class EBook from Book with an additional field fileSize (in MB). Implement methods to set and get the fileSize.

Create an interface LibraryOperations with methods addBook(Book book) and findBookByTitle(String title). Implement this interface in a class Library which uses an ArrayList<Book> to manage the books.

Demonstrate the use of this and super keywords where applicable.

Handle possible exceptions such as NullPointerException and IllegalArgumentException in your methods.

Requirements:

Implement the classes and methods in Java.

Write a main method to test the functionality of adding and retrieving books from the library.

===============================================================================

Question 2: Dynamic String Operations

Scenario: You need to implement a text manipulation utility.

Requirements:

Create a class TextManipulator with a method reverseWords(String input) that reverses the order of words in a given string. Use StringBuilder for efficient manipulation.

Implement another method removeDuplicateChars(String input) that removes duplicate characters from a string using StringBuffer.

Include exception handling for cases where the input string might be null or empty.

Requirements:

Implement the class and methods in Java.

Write a main method to demonstrate the functionality of reversing words and removing duplicates.
===============================================================================


Question 3: Generics and Collections

Scenario: You are working with a collection of different types of items.

Requirements:

Create a generic class Storage<T> that can store and retrieve items of any type.

Implement methods addItem(T item) and getItem(int index). Use an ArrayList<T> to store the items.

Create a specific instance of Storage to hold Integer items and another instance to hold String items.

Demonstrate how to use these instances by adding and retrieving items, and handle cases where the index might be out of bounds.

Requirements:

Implement the generic class and methods in Java.

Write a main method to test the functionality of storing and retrieving different types of items.
===============================================================================

Question 4: Inheritance and Interfaces

Scenario: You are implementing a payment processing system.

Requirements:

Create an abstract class Payment with methods processPayment(double amount) and getPaymentDetails().

Derive classes CreditCardPayment and PayPalPayment from Payment. Implement specific behaviour for each payment type.

Define an interface Transaction with a method executeTransaction(Payment payment).

Implement this interface in a class TransactionProcessor that processes the payment by invoking processPayment and prints payment details.

Requirements:

Implement the abstract class, derived classes, and interface in Java.

Write a main method to demonstrate how to process different types of payments using TransactionProcessor.
===============================================================================

Question 5: Exception Handling and Access Specifiers

Scenario: You are developing a simple calculator application.

Requirements:

Create a class Calculator with methods for basic arithmetic operations: add, subtract, multiply, and divide.

Ensure that the divide method handles division by zero by throwing an ArithmeticException.

Use access specifiers to control the visibility of methods and fields.

Implement a method performOperation(String operation, double a, double b) that uses a switch statement to call the appropriate arithmetic method and handles any exceptions that might be thrown.

Requirements:

Implement the class and methods in Java.

Write a main method to test the calculator with different operations and handle any exceptions that arise.

Instructions:
1. Upload your code file .java and video before 11:10AM
'''