// Class represent a Penguin 
// The Penguin contains a cuddle method as the unique method
public class Penguin extends Birds{
	
	// constructor
	public Penguin(int age, String name, String color) {
		super(age, name, color);
	}
	
	// Return the full String of a Pengiun
	public String toString() {
		return "\nPenguin, "+ super.toString();
	}
	

	// Implement the Sleep - of Animal
	public void sleep() {
		System.out.println("Sleep while standing");
	}
	
	// Implement the eat method  - of Animal
	public void eat() {
		System.out.println("Eat fish from the sea");
	}
		
	// Implement the fly method from Birds
	public void fly() {
		System.out.println("Cant Fly - My wings are weak :(");	
	}
	
	// Private Method
	// Will print message of Cuddle
	public void cuddle() {
		System.out.println("Its Cold! - lets all cuddle to keep us warm");
	}
	
	
	// Equals
	@Override
	public boolean equals(Object obj) {
		
		if (obj == null || !(obj instanceof Penguin))
			return false;
		
		return super.equals(obj);
	}
	
}
