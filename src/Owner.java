
public class Owner {

	
	private String name;
	private String phoneNumber;
	
	
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
	
	public String toString() {
		return name+ ", phone: "+phoneNumber;
	}
}
