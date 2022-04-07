// Class represent a singing bird as a pet 
// The bird contains a sing method as the unique method and the ownerField 
public class SingingBird extends Birds implements Cloneable{

	public Owner owner;
	
	// constructor of singing bird - also creates the owner Object
	public SingingBird(int age, String name, String color, String nameOfOwner, String phoneOfOwner) {
		super(age, name, color);
		owner = new Owner(nameOfOwner, phoneOfOwner);
	}
	
	// Return the full String of a SingingBird
	public String toString() {
		return "\n"+owner.toString()+ ", Owns a Singing Bird, "+ super.toString() ;
	}
	
	// Implement the Sleep - of Animal
	public void sleep() {
		System.out.println("Sleep in a cage");
	}
	
	// Implement the eat method  - of Animal
	public void eat() {
		System.out.println("Eat birds food from the shop");
	}
	

	// Implement the fly method from Birds
	public void fly() {
		System.out.println("Please open the cage to let me fly");	
	}
	
	// Equals override
	@Override
	public boolean equals(Object obj) {
		
		if (obj == null || !(obj instanceof SingingBird))
			return false;
		
		return super.equals(obj);
	}
	
	
	// Private Method
	// Will print message of Singing
	public void sing() {
		System.out.println("Sing - Lalalala");
	}

	
	// The Clone method from the Cloneable interface - override to to apply the deep copy
	@Override
	public Object clone() throws CloneNotSupportedException {
		
		// Clone the current singingBird
		SingingBird singB = (SingingBird)super.clone();
		
		// Clone the owner object itself
		singB.owner = (Owner)owner.clone();
		
		// return the deep copy object
		return singB;
	}

}
