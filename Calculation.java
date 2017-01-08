package javatutorials;
/* Simple Inheritance in Java */

class Calc {
	public int add(int a , int b)
	{
		return (a+b);
	}
	
	public int diff(int a , int b)
	{
		return (a-b);
	}
}

public class Calculation extends Calc {

	public int mul(int a , int b)
	{
		return (a*b);
	}
	
	public static void main (String args[])
	{
		int a=4,b=2;
		Calculation c = new Calculation();
		
	   System.out.println(c.mul(a, b));
	   System.out.println(c.add(a, b));
	   System.out.println(c.diff(a, b));
	}
	
}
