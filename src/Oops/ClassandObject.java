package Oops;

class Student {
	String name ="shankaragouda";
	int age = 22;
	void study() {
		System.out.println("student is studying");
		
	}
}

public class ClassandObject {

	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println(s1.name);
		System.out.println(s1.age);
		s1.study();
	}

}
/*
 Let's understand it step by step.

Case 1: Without call() Method 
class Mobile {

    String brand = "Samsung";

}

public class Main {

    public static void main(String[] args) {

        Mobile phone = new Mobile();

        System.out.println(phone.brand);

    }

}
Output
Samsung

===>This program works perfectly.

Why?

Because you're only accessing the variable brand. You are not calling any method.

Case 2: With call() Method
class Mobile {

    String brand = "Samsung";

    void call() {
        System.out.println("Calling...");
    }

}

public class Main {

    public static void main(String[] args) {

        Mobile phone = new Mobile();

        System.out.println(phone.brand);

        phone.call();

    }

}
Output
Samsung
Calling...

Here:

phone.call();

calls the call() method.

Why Do We Create Methods?

A class contains two things:

1. Variables (Data)

Example:

String brand = "Samsung";

This stores information.

2. Methods (Behavior)

Example:

void call() {
    System.out.println("Calling...");
}

This performs an action.

Think of a mobile phone.

Data (Variables):

Brand
Model
Price

Behavior (Methods):

Call
Message
Camera
Play Music

So in Java:

class Mobile {

    String brand = "Samsung";   // Data

    void call() {               // Behavior
        System.out.println("Calling...");
    }

}
What does void mean?
void call()

Let's break it down.

void

Means:

"This method does not return any value."

Example:

void call() {
    System.out.println("Calling...");
}

It only prints a message.

It does not return anything.

What if we use int instead of void?
int price() {
    return 20000;
}

Now the method returns an integer.

System.out.println(phone.price());
Output
20000
Difference
void
void call() {
    System.out.println("Calling...");
}

Returns:

 Nothing

int
int getPrice() {
    return 20000;
}

Returns:

 20000

String
String getBrand() {
    return "Samsung";
}

Returns:

 "Samsung"

Easy Rule

If a method only performs an action, use:

void

Examples:

void study()
void drive()
void call()
void playMusic()

If a method gives back a value, use the appropriate return type:

int
double
String
boolean
char
 */



/*Student 1
Name : Shankaragouda
Age  : 22

Student 2
Name : Sahana
Age  : 21

Student 3
Name : Rahul
Age  : 23

A normal constructor cannot do this because it always assigns the same values.*/ 

