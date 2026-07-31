/*package Oops;

public class methodsTHERORY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
Methods
Interview Question: What is a Method in Java?
Definition

A method is a block of code that performs a specific task. It is used to avoid writing the same code again and again.

Syntax
returnType methodName() {

    // Code

}
Example
class Student {

    void study() {
        System.out.println("Student is studying");
    }

}

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.study();

    }

}
Output
Student is studying
Explanation
void study()
void → Method does not return any value.
study → Method name.
s1.study();

Calls the method.

Real-Time Example

WhatsApp:

sendMessage()
makeCall()
deleteChat()

Bank App:

deposit()
withdraw()
checkBalance()
Interview Answer

A method is a block of code used to perform a specific task. It improves code reusability and readability.

2. Constructor
Interview Question: What is a Constructor?
Definition

A constructor is a special method that is called automatically when an object is created.

It is used to initialize object data.

Rules
Constructor name must be the same as the class name.
It has no return type.
It is called automatically.
Syntax
class Student {

    Student() {

    }

}
Example
class Student {

    Student() {
        System.out.println("Constructor Called");
    }

}

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();

    }

}
Output
Constructor Called
Execution Flow
new Student()

↓

Constructor Executes

↓

Object Created
Real-Time Example

When a user registers in an app:

User u1 = new User();

The constructor can initialize the user's details.

Interview Answer

A constructor is a special member of a class that is automatically executed when an object is created. It is mainly used to initialize object variables.

3. Default Constructor
Interview Question: What is a Default Constructor?
Definition

A constructor with no parameters is called a default constructor.

Syntax
Student() {

}
Example
class Student {

    Student() {
        System.out.println("Default Constructor");
    }

}

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();

    }

}
Output
Default Constructor
Real-Time Example

When you don't need to pass any information while creating an object.

Example:

Student s1 = new Student();
Interview Answer

A default constructor is a constructor that has no parameters. It is used to create an object without passing any values.

4. Parameterized Constructor
Interview Question: What is a Parameterized Constructor?
Definition

A constructor that accepts parameters is called a parameterized constructor.

It is used to initialize objects with different values.

Syntax
Student(String name, int age) {

}
Example
class Student {

    String name;
    int age;

    Student(String name, int age) {

        this.name = name;
        this.age = age;

    }

    void display() {

        System.out.println(name);
        System.out.println(age);

    }

}

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student("Rahul", 22);

        s1.display();

    }

}
Output
Rahul
22
Execution Flow
new Student("Rahul",22)

↓

Parameter name = Rahul

↓

Parameter age = 22

↓

this.name = name

↓

this.age = age

↓

Object Stores Rahul and 22
Real-Time Example

Employee:

Employee e1 = new Employee("Rahul",30000);

Product:

Product p1 = new Product("Laptop",50000);
Interview Answer

A parameterized constructor is a constructor that accepts parameters. It is used to initialize objects with different values during object creation.

5. this Keyword
Interview Question: What is the this keyword?
Definition

The this keyword refers to the current object of the class.

It is mainly used to distinguish instance variables from constructor parameters when they have the same name.

Example
class Student {

    String name;

    Student(String name) {

        this.name = name;

    }

}
Explanation

There are two name variables.

Instance variable:

String name;

Constructor parameter:

Student(String name)

To store the parameter value into the object's variable, we write:

this.name = name;

This means:

Object's name = Parameter name
Real-Time Example
Employee e1 = new Employee("Sahana");

Constructor receives:

name = Sahana

Then:

this.name = name;

Stores "Sahana" in the object's name field.

Interview Answer

The this keyword refers to the current object. It is commonly used to access instance variables and to differentiate them from local variables or constructor parameters with the same name.

Quick Interview Revision
Topic	One-Line Interview Answer
Method	A method is a block of code used to perform a specific task.
Constructor	A constructor is a special member that runs automatically when an object is created.
Default Constructor	A constructor with no parameters.
Parameterized Constructor	A constructor that accepts parameters to initialize objects with values.
this Keyword	Refers to the current object and is used to access instance variables or resolve naming conflicts.
     */
