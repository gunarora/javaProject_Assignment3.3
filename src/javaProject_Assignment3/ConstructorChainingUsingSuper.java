package javaProject_Assignment3; //Package declaration is mandatory

/*This assignment will help you to master in OOPS and super and this keyword.*/

//using super keyword showing constructor chaining
public class ConstructorChainingUsingSuper {

	 public static void main(String args[])
	    {
	        // calls parameterized constructor 4
	        Derived obj = new Derived("test");
	 
	        // Calls No-argument constructor
	     }
}
//Base Class
class Base
{
    String name;
 
    // default constructor 1
    Base()
    {
        this("");
        System.out.println("No-argument constructor of" + 
                                           " base class");
    }
 
    // parameterized constructor 2
    Base(String name)
    {
        this.name = name;
        System.out.println("Calling parameterized constructor"
                                              + " of base");
    }
}
 //Derived class inheriting base class
class Derived extends Base
{
    // default constructor 3
    Derived()
    {
        System.out.println("No-argument constructor " + 
                           "of derived");
    }
 
    // parameterized constructor 4
    Derived(String name)
    {
        // invokes base class constructor 2 of argument
    	//Super using for calling constructor 
        super(name);
        System.out.println("Calling parameterized " + 
                           "constructor of derived");
    }
 
   
}
