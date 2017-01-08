
//Abstract class
/*
 * Abstract classes may or may not contain abstract methods, i.e., methods without body ( public void get(); )

But, if a class has at least one abstract method, then the class must be declared abstract.

If a class is declared abstract, it cannot be instantiated.

To use an abstract class, you have to inherit it from another class, provide implementations to the abstract methods in it.

If you inherit an abstract class, you have to provide implementations to all the abstract methods in it.
 */


 abstract class calc1 
{
	private int a = 10,b = 20;

	//Parameterized Constructor in abstract class
	calc1 (int a,int b)
	{
		this.a=a;
		this.b=b;
		calca(a,b);
	}
	
	public void calca (int a , int b)
	{
		System.out.println(a+b);
	}
	public int geta()
	{
		return(a);
	}
	public int getb()
	{
		return(b);
	}
}

class MathsCalc1 extends calc1{

	// Get the private values from abstract class
	MathsCalc1(int a, int b) {
		super(a, b);
	}
	 
	 
 }
 
public  class MathsCalc  {

	public static void main(String args[])
	{
		System.out.println("Hello 1");
		calc1 c = new MathsCalc1(30,20);
		
		System.out.println("Hello 2");
		calc1 c1 = new MathsCalc1(11,23);
		
		//Get private values directly from abstract class methods 
		int a1=c.geta(),b1=c.getb();
		
		System.out.println("Hello 3");
		MathsCalc1 c2 = new MathsCalc1(a1,b1);
		c.calca(a1,b1);
		System.out.println("Bye");
		
	}
}

