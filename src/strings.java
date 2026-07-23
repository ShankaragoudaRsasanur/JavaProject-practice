
/*String

A String is a collection of characters.

A String stores text such as:

Name  City Email Password  Address
 
       
 Why do we use String?

We use Strings whenever we need to store text.

Examples
Student Name
College Name


How to Create a String

There are 2 ways.

Method 1 (Most Common):it uses less memory.

public class Main {

    public static void main(String[] args) {

        String name = "Shankar";

        System.out.println(name);

    }
}


Method 2

Using new keyword


public class Main {

    public static void main(String[] args) {

        String name = new String("Shankar");

        System.out.println(name);

    }

}


Difference

Method 1

String s = "Java";

Method 2

String s = new String("Java");

Both print the same output.


String Memory

Example

String s1 = "Java";
String s2 = "Java";

Java stores only one copy of "Java" in the String Pool, and both s1 and s2 refer to it.


String is Immutable


Immutable means cannot be changed.

Example

String name = "Java";

name.concat(" Full Stack");

System.out.println(name);

Output

Java

Why?

Because concat() creates a new String, but we didn't store it.

Correct way

String name = "Java";

name = name.concat(" Full Stack");

System.out.println(name);

Output

Java Full Stack




String Methods

These methods are used 

1. length()

Returns the total number of characters.

Example

public class Main {

    public static void main(String[] args) {

        String name = "Shankar";

        System.out.println(name.length());

    }

}

Output

7

Explanation

S h a n k a r
1 2 3 4 5 6 7
2. toUpperCase()

Converts all letters to uppercase.

String name = "java";

System.out.println(name.toUpperCase());

Output

JAVA
3. toLowerCase()
String name = "JAVA";

System.out.println(name.toLowerCase());

Output

java
4. charAt()

Returns the character at the given index.

String name = "Java";

System.out.println(name.charAt(0));

Output

J

More examples

name.charAt(1)

Output

a

Indexes

J  a  v  a
0  1  2  3
5. contains()

Checks whether a String contains another String.

String sentence = "I love Java";

System.out.println(sentence.contains("Java"));

Output

true
6. startsWith()
String name = "Shankar";

System.out.println(name.startsWith("Sh"));

Output

true
7. endsWith()
String file = "resume.pdf";

System.out.println(file.endsWith(".pdf"));

Output

true
8. equals()

Compares the contents of two Strings.

String s1 = "Java";
String s2 = "Java";

System.out.println(s1.equals(s2));

Output

true
9. equalsIgnoreCase()

Ignores uppercase and lowercase differences.

String s1 = "java";
String s2 = "JAVA";

System.out.println(s1.equalsIgnoreCase(s2));

Output

true
10. concat()

Joins two Strings.

String first = "Java";
String second = " Full Stack";

System.out.println(first.concat(second));

Output

Java Full Stack
11. substring()

Extracts part of a String.

String word = "Programming";

System.out.println(word.substring(0, 7));

Output

Program

Indexes

P r o g r a m m i n g
0 1 2 3 4 5 6 7 8 9 10

The start index is included, and the end index is excluded.

12. replace()

Replaces characters or words.

String word = "Java";

System.out.println(word.replace("J", "K"));

Output

Kava
13. trim()

Removes spaces from the beginning and end.

String name = "   Java   ";

System.out.println(name.trim());

Output

Java
14. isEmpty()

Checks if the String is empty.

String s = "";

System.out.println(s.isEmpty());

Output

true
15. indexOf()

Returns the first index of a character.

String word = "Programming";

System.out.println(word.indexOf('g'));

Output

3


Difference between == and equals()

This is a very common interview question.

Using ==
String s1 = new String("Java");
String s2 = new String("Java");

System.out.println(s1 == s2);

Output

false

== compares whether both variables refer to the same object.

Using equals()
String s1 = new String("Java");
String s2 = new String("Java");

System.out.println(s1.equals(s2));

Output

true

equals() compares the actual text inside the Strings.

*/









public class strings {

	public static void main(String[] args) {
		String username = "admin";
        String password = "Java123";

        if (username.equals("admin") && password.equals("Java123")) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Invalid Username or Password");
        }

    }



	}


