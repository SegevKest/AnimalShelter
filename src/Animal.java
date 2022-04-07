
// This is the main class of the Hierarchy of Animals
// This is abstract class, with all attributes for the subclasses
public abstract class Animal implements Cloneable{
	
	protected int _age;
	protected String _name;
	protected String _color;
	
	
	// Constructor
	public Animal(int age, String name, String color) {
		_age = age;
		_name = name;
		_color = color;
	}
	
	// The toString method - returns all the attributes of the animal
	public String toString() {
		return "Name: "+_name + ", Age: "+_age+", Colored: "+ _color+"\n";
	}
	
	
	// The Clone method from the Cloneable interface
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	// Equals override
	@Override
	public boolean equals(Object obj) {
		
		if (obj == null || !(obj instanceof Animal))
			return false;
		
		return _name == ((Animal)obj)._name &&
				_color == ((Animal)obj)._color &&
				_age == ((Animal)obj)._age;
	}
	
	
	// Getters and setters
	
	// Return the age of the Animal
	public int getAge() {
		return _age;
	}
	// Return the Name of the Animal
	public String getName() {
		return _name;
	}
	// Return the Color of the Animal
	public String getColor() {
		return _color;
	}
	
	// set new Age of the Animal
	public void setAge(int newAge) {
		 _age = newAge;
	}
	// set new Name of the Animal
	public void setName(String newName) {
		 _name = newName;
	}
	// set new Color of the Animal
	public void setColor(String newColor) {
		_color = newColor;
	}
	
	
	//Sleep and Eat methods - to implement while inheriting from Animal class
	public abstract void sleep();
	public abstract void eat();
	


}
