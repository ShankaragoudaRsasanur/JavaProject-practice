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
