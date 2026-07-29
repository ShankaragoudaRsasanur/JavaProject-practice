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
