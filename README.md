# First
Assignment 1
1. Phone class.
1.	Create a Phone class that contains the number, model, and weight variables.
2.	Create three instances of this class.
3.	Print the values of their variables to the console.
4.	Add methods to the Phone class: receiveCall, has one parameter - the name of the caller. Prints the message “{name} is ringing” to the console. getNumber method - returns the phone number. Call these methods for each of the objects.
5.	Add a constructor to the Phone class that takes three parameters as input to initialize the class variables - number, model and weight.
6.	Add a constructor that takes two parameters as input to initialize class variables - number, model.
7.	Add constructor without parameters.
8.	Call a constructor with two parameters from a constructor with three parameters.
9.	Add an overloaded receiveCall method that takes two parameters - the name of the caller and the phone number of the caller. Call this method.
10.	Create a sendMessage method with variable length arguments. This method accepts as input the phone numbers to which the message will be sent. The method prints the numbers of these phones to the console.
11.	Change the Phone class to match the JavaBean concept. 

2. Person class
Create a Person class that contains:
1.	variables fullName, age;
2.	the move() and talk() methods, in which it is easy to display the message "Such and such a Person is talking" on the console.
3.	Add two constructors - Person() and Person(fullName, age).
4.	Create two objects of this class. One object is initialized with the Person() constructor, the other with Person(fullName, age).

3. Matrix class
Create class "Matrix". The class must have the following variables:
1.	two-dimensional array of real numbers;
2.	the number of rows and columns in the matrix.
The class must have the following methods:

1.	addition with another matrix;
2.	multiplication by a number;
3.	printout;
4.	matrix multiplication - optional.
4. Library readers
Define a Reader class that stores the following information about the library user:
1.	FULL NAME,
2.	library card number
3.	faculty,
4.	Date of Birth,
5.	phone.
6.	takeBook(), returnBook() methods.
7.	Develop a program that creates an array of objects of a given class.
8.	Overload the takeBook(), returnBook() methods:
- takeBook, which will accept the number of books taken. Displays the message "Petrov VV took 3 books" on the console.
- takeBook, which will accept a variable number of book titles. Displays the message "Petrov VV took books: Adventures, Dictionary, Encyclopedia" on the console.
- takeBook, which will accept a variable number of objects of the Book class (create a new class containing the name and author of the book). Displays the message "Petrov VV took books: Adventures, Dictionary, Encyclopedia" on the console.
9.	Similarly, overload the returnBook() method. Displays the message "Petrov VV returned the books: Adventures, Dictionary, Encyclopedia" to the console. Or "V. V. Petrov returned 3 books."

