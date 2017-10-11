package javaProject_Assignment3; //Package declaration is mandatory

/*This assignment will help you to master in OOPS and super and this keyword.*/
//using this keyword showing constructor chaining
public class ConstructorChaining {

	public static void main(String[] args) {
	 new ThisChain();

	}

}
//within same class Using this() keyword
class ThisChain
{
 // default constructor 1
 // default constructor will call another constructor
 // using this keyword from same class
 ThisChain()
 {
     // calls constructor 2
     this(5);
     System.out.println("The Default constructor");
 }

 // parameterized constructor 2
 ThisChain(int x)
 {
     // calls constructor 3
     this(5, 15);
     System.out.println(x);
 }

 // parameterized constructor 3
 ThisChain(int x, int y)
 {
     System.out.println(x * y);
 }
}

	

