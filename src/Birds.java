
// the second class inside the hierarchy - All birds are animals
// Doesnt contain new attributes, only the fly method for birds and overrides equals and toString
public abstract class Birds extends Animal{

	// constructor
	public Birds(int age, String name, String color) {
		super(age, name, color);
	}
	
	// The tostring method for birds
	public String toString() {
		
		return "From the Bird Family - " +super.toString();
	}
	
	// Equals override
	@Override
	public boolean equals(Object obj) {
		
		if (obj == null || !(obj instanceof Birds))
			return false;
		
		return super.equals(obj);
	}
	
	
	// All birds will have a method of Fly
	public abstract void fly();
	
}
