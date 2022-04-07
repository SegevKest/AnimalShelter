import java.util.ArrayList;

public class petShelterMain {

	
	
	public static void main(String[] args) {

		// Create the array list of the shelter
		ArrayList<Animal> shelter = new ArrayList<Animal>();
		
		// Create all objects of animals
		Eagle eagle1 = new Eagle(1,"Eagy","black");
		Penguin ping = new Penguin(2,"Pengi","Yellow and white");
		SingingBird singBird = new SingingBird(3,"Dolli","Red", "Taki","09-8765432");
		
		
		// Clone - Part C in the First Question
		// the new eagle object - after the clone
		SingingBird singBird2 = null;
		
		try {
			singBird2 = (SingingBird)singBird.clone();
			
			// If the clone was successfull - display the new object and its origin
			System.out.println("Before editing the fields of the cloned");
			System.out.println("Origin Animal -> "+singBird.toString());
			System.out.println("Clone Animal -> "+singBird2.toString());
			
			// Edit the fields of the cloned object
			singBird2.setName("Soundy");
			singBird2.setColor("Green");
			singBird2.setAge(15);
			singBird2.owner.setNameOfOwner("Segev");
			singBird2.owner.setPhoneNumberOfOwner("052");

			// If the clone was successfull - display the new object and its origin
			System.out.println("After editing cloned fields");
			System.out.println("Origin Animal -> "+singBird.toString());
			System.out.println("Clone of original, after modifications -> "+singBird2.toString());
						
		} catch (CloneNotSupportedException e) {};
		 
		
		// Add the animals to the shelter
		shelter.add(eagle1);
		shelter.add(ping);
		shelter.add(singBird);
		shelter.add(singBird2);
		
		
		System.out.println("\nOur Shelter\n");
		for (Animal animal : shelter) {	
			
			System.out.println(animal.toString());
			
			//Animal is eating
			animal.eat();
			
			// Sleep after eating
			animal.sleep();
			
			// Activate the Birds Fly method
			if (animal instanceof Birds) {
				((Birds) animal).fly();
			}
			
			// activate the method for animal - depending on their kind
			if ( animal instanceof SingingBird)	{
				((SingingBird) animal).sing();
			}
			else if (animal instanceof Eagle)	{
				((Eagle) animal).hunt();
			}
			else if (animal instanceof Penguin)	{
				((Penguin) animal).cuddle();
			}
		}
	  }
}
