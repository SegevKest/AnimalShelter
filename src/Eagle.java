
public class Eagle extends Birds{
	
	
	
	public Eagle(int age, String name, String color) {
		super(age, name, color);

	}
	
	// Return the full String of an eagle
	public String toString() {
		return "\nEagle, "+ super.toString();
	}
	
	// Implement the Sleep - of Animal
	public void sleep() {
		System.out.println("Sleep On high trees");
	}

	// Implement the eat method  - of Animal
	public void eat() {
		System.out.println("Eat corpses of dead animals");
	}
	
	// Implement the fly method from Birds
	public void fly() {
		System.out.println("Fly fast in the sky");	
	}
	

	// Equals
	@Override
	public boolean equals(Object obj) {
		
		if (obj == null || !(obj instanceof Eagle))
			return false;
		
		return super.equals(obj);
	}
	
	
	// Private Method
	// Will print message of looking for pray
	public void hunt() {
		System.out.println("Fly and look for a pray on ground");
	}
}
