package Oops;

/*
 this.name  → Object's variable

=

name       → Value received from the constructor
 this.name = name;
│           │
│           └── Value coming into the constructor
│
└── Variable inside the object
 Object variable = Value received from the constructor
 */
class Student4 {

    String name;
    int age;

    Student4(String name, int age) {

        this.name = name;
        this.age = age;

    }

    void display() {

        System.out.println("Name : " + this.name);
        System.out.println("Age : " + this.age);

    }
}

public class thisKey {

    public static void main(String[] args) {

        Student4 s1 = new Student4("Shankaragouda", 22);

        s1.display();

    }
}