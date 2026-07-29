/* createting for the paramertized 
  step1 .
  creat a class
  class Student {

    String name;
    int age;
  step2.
  Create a Parameterized Constructor
  Student(String n, int a) {
    name = n;
    age = a;
}
  
  step 3.
  Create a Method
  void display() {
    System.out.println("Name : " + name);
    System.out.println("Age : " + age);
}
  step 4.
  Create the Object
Student s1 = new Student("Shankaragouda", 22);

This is the important line.

Java executes it like this:

First
new Student("Shankaragouda",22)

Creates the object.

Second

Java calls:

Student(String n,int a)

So,

n = "Shankaragouda"
a = 22
Third

These lines execute:

name = n;
age = a;

That means:

name = "Shankaragouda"
age = 22

The object now stores:

Student Object

name = Shankaragouda
age  = 22
Step 5.
 Call display()
s1.display();

Output:

Name : Shankaragouda
Age : 22
  
  */



/*============================
 
 new Student("Shankaragouda",22)
             │
             ▼
Object is created
             │
             ▼
Constructor Student(String n, int a) is called
             │
             ▼
n = "Shankaragouda"
a = 22
             │
             ▼
name = n
age = a
             │
             ▼
Object stores:
name = Shankaragouda
age = 22
 */






package Oops;
class Student3 {

    String name;
    int age;

    Student3(String n, int a) {
        name = n;
        age = a;
    }
    void display() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}



public class parameterize {

	public static void main(String[] args) {
		 Student3 s1 = new Student3("Shankaragouda", 22);

	        s1.display();

	}

}
