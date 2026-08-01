package encapsulation;
/*   Encapsulation means keeping data safe
   by making variables private and accessing
   them through getter and setter methods.
   
   Instead,we protect the variable using private
   
   private means:
   These variables cannot be accessed directly 
   from outside the class.
   
 */


/*
 
  
  private
 
    ↓
Protect the variable

set()
↓
Store the value

get()
↓
Read the value





Getter and Setter in Java
What is a Getter?
Definition

A Getter is a public method that is used to read (get) the value of a private variable.

Purpose
To read the value of a private variable.
To provide controlled access to data.
Used in Encapsulation.
Syntax
public dataType getVariableName() {
    return variableName;
}


Example
private String name;

public String getName() {
    return name;
}

How it works

When you write:

System.out.println(s1.getName());

Java calls:

getName()

It returns:

name

Output:   Rahul

Real-Time Example
ATM

When you check your account balance:

Check Balance

The ATM shows your balance.

Similarly,

getBalance();

returns the account balance.




What is a Setter?
Definition

A Setter is a public method that is used to store (set) or update the value of a private variable.

Purpose
To store data.
To update data.
To provide controlled access to private variables.

Syntax
public void setVariableName(dataType variableName) {
    this.variableName = variableName;
}

Example
private String name;

public void setName(String name) {
    this.name = name;
}


How it works

When you write:

s1.setName("Rahul");

Java sends:

name = Rahul

Then executes:

this.name = name;

The object's variable becomes:

name = Rahul
Real-Time Example
ATM

When you deposit money:

Deposit ₹5000

The ATM stores the money in your account.

Similarly,

setBalance(5000);

stores or updates the balance.

Interview Answer

A Setter is a public method used to store or update the value of a private variable.



/*public class programTheory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
*/
