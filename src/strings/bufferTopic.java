
/*A StringBuffer is a class in Java used to store and modify text.
 string  buffer can be change d aftefr the  its created.
 
 
 you cannnot changed the value directly  but we can create new string.
 with buffer we can add more text to the same object
 
 
 
 We use StringBuffer when we need to:

Add text repeatedly
Delete text
Replace text
Reverse text

It is more efficient than creating many new Strings.
 
 
 Example 1: Print a StringBuffer
public class Demo {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Java");

        System.out.println(sb);

    }

}
Output
Java


Example 2: append()
Purpose

Adds text to the end.

Code
public class Demo {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Java");

        sb.append(" Full Stack");

        System.out.println(sb);

    }

}
Output
Java Full Stack
Explanation

Before:

Java

After:

Java Full Stack

append() adds new text at the end.

Example 3: insert()
Purpose

Inserts text at a specific position.

Code
public class Demo {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Java");

        sb.insert(4, " Programming");

        System.out.println(sb);

    }

}
Output
Java Programming
Explanation

Indexes:

J  a  v  a
0  1  2  3

Index 4 is after the last character, so " Programming" is inserted there.

Example 4: delete()
Purpose

Deletes characters between two indexes.

Code
public class Demo {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Java Full Stack");

        sb.delete(4, 9);

        System.out.println(sb);

    }

}
Output
Java Stack
Explanation

delete(start, end) removes characters from the start index up to (but not including) the end index.

Example 5: replace()
Purpose

Replaces part of the text.

Code
public class Demo {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Java");

        sb.replace(0, 4, "Python");

        System.out.println(sb);

    }

}
Output
Python
Explanation

Characters from index 0 to 3 are replaced with "Python".

Example 6: reverse()
Purpose

Reverses the text.

Code
public class Demo {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Java");

        sb.reverse();

        System.out.println(sb);

    }

}
Output
avaJ
Example 7: length()
Purpose

Returns the number of characters.

Code
public class Demo {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Java");

        System.out.println(sb.length());

    }

}
Output
4

Example 8: charAt()
Purpose

Returns the character at a specific index.

Code
public class Demo {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Java");

        System.out.println(sb.charAt(2));

    }

}
Output
v
 
 --------------------------------------------------------------------------------------
 
 Easy Memory Trick

Remember this:

String
↓
Cannot Change
❌
StringBuffer
↓
Can Change
+
Safe
🐢 (slightly slower)
StringBuilder
↓
Can Change
+
Fast
🚀
For your interviews

Just remember these three points:

String → Immutable (cannot change).
StringBuffer → Mutable and thread-safe.
StringBuilder → Mutable and faster, but not thread-safe.
 
 
 
 */















package strings;

public class bufferTopic {

	public static void main(String[] args) {
		/*StringBuffer sb = new StringBuffer("java");
		System.out.println(sb);*/
		
		
		
		
		/*append() adds new text at the end
		StringBuffer sb =new StringBuffer("java");
		sb.append("fullstack");
		System.out.println(sb);*/
		
		/* insert() insert the text speicfic posistion
		StringBuffer sb =new StringBuffer("java");
		sb.insert(4, "programming");
		System.out.println(sb);    optput java programmimg*/
		
		
		/* delete() Deletes characters between two indexes.
		StringBuffer sb =new StringBuffer("java full stack");
		sb.delete(4,9);
		System.out.println(sb);output :java stack    */
		
		/* replace() replace the part of text*/
		 StringBuffer sb =new StringBuffer("java full stack");
		 sb.replace(0,4,"python");
		 System.out.println(sb);//
		 
		 
		 
		 
		 
		
	}

}















