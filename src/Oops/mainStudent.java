package Oops;


class Student1 {

    Student1() {
        System.out.println("Constructor Called");
    }

    void study() {
        System.out.println("Student is studying");
    }
}

public class mainStudent {

    public static void main(String[] args) {

        Student1 s1 = new Student1();

        s1.study();

    }
}
/*Student s1 = new Student();

Student1        → Class name
s1             → Reference variable
new Student1()  → Creates the object
Student1()      → Constructor (runs automatically)

Student      s1      =      new Student1();
   ↑          ↑                 ↑
Class      Reference        Creates Object
 Name       Variable
 
 
What happens internally?

When Java reaches this line:

new Student1();

Java does this:

 Creates a Student object in memory.
 Calls the constructor automatically.

The constructor is:

Student() {
    System.out.println("Student Object Created");
}

So the output is:

Student Object Created
*/