
public abstract class Birds extends Animal{

	
	public Birds(int age, String name, String color) {
		super(age, name, color);
	}
	
	public String toString() {
		
		return "From the Bird Family - " +super.toString();
	}
	
	// Equals
	@Override
	public boolean equals(Object obj) {
		
		if (obj == null || !(obj instanceof Birds))
			return false;
		
		return super.equals(obj);
	}
	
	// All birds will have a method of Fly
	public abstract void fly();
}
