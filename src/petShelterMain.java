import java.util.ArrayList;

public class petShelterMain {

	
	
	public static void main(String[] args) {

		// Create the array list of the shelter
		ArrayList<Animal> shelter = new ArrayList<Animal>();
		
		// Create all objects of animals
		Eagle eagle1 = new Eagle(1,"Eagy","black");
		Penguin ping = new Penguin(2,"Pengi","yellow");
		SingingBird singBird = new SingingBird(3,"Dolli","Red", "Segev","09-8765432");
		
		// the new eagle object - after the clone
		Eagle eagle2 = null;
		
		try {
			eagle2 = (Eagle)eagle1.clone();
			
			// If the clone was successfull - display the new object and its origin
			System.out.println("Origin Animal Object -> "+eagle1.toString());
			System.out.println("Clone of original Animal -> "+eagle2.toString());
			
			eagle2.setName("Davi");
			eagle2.setColor("Shoko");
			eagle2.setAge(15);
			
			// If the clone was successfull - display the new object and its origin
			System.out.println("Origin Animal -> "+eagle1.toString());
			System.out.println("Clone of original, after modifications -> "+eagle2.toString());
						
		} catch (CloneNotSupportedException e) {};
		 
		
		// Add the animals to the shelter
		shelter.add(eagle1);
		shelter.add(ping);
		shelter.add(singBird);
		shelter.add(eagle2);
		
		
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
