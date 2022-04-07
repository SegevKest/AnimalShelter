// A class represent an owner of an animal
// Contains name and phone number as attributes
public class Owner implements Cloneable{

	
	private String name;
	private String phoneNumber;
	
	// constructor
	public Owner( String nameOfOwner, String phoneOfOwner) {
		name = nameOfOwner;
		phoneNumber = phoneOfOwner;
	}
	
	// Get the name of the Owner
	public String getNameOfOwner(){
		return name;
	}
	
	// Get the Phone number of the Owner
	public String getPhoneOfOwner(){
		return phoneNumber;
	}
	
	// Set the name of the Owner
	public void setNameOfOwner(String newName) {
		name = newName;
	}
	
	// Set the Phone number of the Owner
	public void setPhoneNumberOfOwner(String newPhoneNumber) {
		phoneNumber = newPhoneNumber;
	}
	
	// ToString method to print the Owner
	public String toString() {
		return name+ ", phone: "+phoneNumber;
	}
	
	// Owner will contain the cloneable interface to apply deep copy
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
