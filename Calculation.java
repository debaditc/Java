package javatutorials;
/* Simple Inheritance in Java 
 * super cannot be called from static function
 * super can be used to access method and variables from parent class
 * Here, Calc is Super class 
 * Calculation extends Calc to access add and diff function
 * */

class Calc {
	public void add(int a , int b)
	{
		System.out.println(a+b);
	}
	
	public void diff(int a , int b)
	{
		System.out.println(a-b);
	}
}

public class Calculation extends Calc {

	public int calc(int a , int b)
	{
		super.diff(a, b);
		super.add(a, b);
		return (a*b);
	}
	
	public static void main (String args[])
	{
	   int a=4,b=2;
	   Calculation c = new Calculation();
		
	   System.out.println(c.calc(a,b));
	   
	   //Without super - call method from base class
	   c.add(a, b);
	}
	
}
