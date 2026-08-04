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





private
    ↓
Data is Protected 

Setter
    ↓
Stores or Updates Data 

Getter
    ↓
Reads or Returns Data 




Difference Between Getter and Setter
Getter	                           Setter
Used to read data	           Used to store/update data
Returns a value	               Does not return a value (void)
Starts with get               	Starts with set
Example: getName()	          Example: setName()

/*public class programTheory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

private
   ↓
Protect the data 

Setter
   ↓
Stores the data 

Getter
   ↓
Reads the data 





 example on gitter and setter  both 
 
 
class Student {

    // Private variables
    private String name;
    private int age;

    // Setter Method for Name
    public void setName(String name) {
        this.name = name;
    }

    // Setter Method for Age
    public void setAge(int age) {
        this.age = age;
    }

    // Getter Method for Name
    public String getName() {
        return name;
    }

    // Getter Method for Age
    public int getAge() {
        return age;
    }
}

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();

        // Setting values
        s1.setName("Shankaragouda");
        s1.setAge(22);

        // Getting values
        System.out.println("Student Name : " + s1.getName());
        System.out.println("Student Age : " + s1.getAge());

    }

}
   example on bank hiolder

Imagine you have a bank account.

Your account details are:

Account Holder : Shankaragouda
Balance : ₹50000

Should everyone be able to change your balance directly?

account.balance = 1000000;

 No.

So we make the variables private and use Setter and Getter.

Complete Program
class BankAccount {

    private String accountHolder;
    private int balance;

    // Setter for Account Holder
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    // Setter for Balance
    public void setBalance(int balance) {
        this.balance = balance;
    }

    // Getter for Account Holder
    public String getAccountHolder() {
        return accountHolder;
    }

    // Getter for Balance
    public int getBalance() {
        return balance;
    }
}

public class Main {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.setAccountHolder("Shankaragouda");
        account.setBalance(50000);

        System.out.println("Account Holder : " + account.getAccountHolder());
        System.out.println("Balance : " + account.getBalance());

    }

}
Output
Account Holder : Shankaragouda
Balance : 50000


*/
