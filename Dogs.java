package javatutorials;

class Animals {

	public void move ()
	{
		System.out.println("Animals move");
	}
	
}

public class Dogs extends Animals {
	
	public void move ()
	{
		System.out.println("Dogs move");
	}
	
	public void bark ()
	{
		System.out.println("Dogs bark");
	}
	
	public static void main (String args[])
	{
		// Animal reference and Animal as object
		Animals a = new Animals();
		
		// Dogs reference and Dogs as object
		Dogs b = new Dogs();
		
		// Animal reference and DOGS as object
		Animals c = new Dogs();
		
		// Method overide 
		a.move();
		b.move();
		b.bark();
		c.move();
		
		//The below statement wont work as bark is not part of Animals class
		//c.bark()
		
	}
	
	
}
