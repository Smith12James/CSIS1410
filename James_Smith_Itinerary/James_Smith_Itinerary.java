/**
 * 
 * @author James Smith
 * @version 1.0.1
 * 
 * This program will prompt for an entry of where you'd like to travel
 * and then print the route based on where you'd like to go first to last
 *
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.lang.StringBuilder;

public class James_Smith_Itinerary {
	
	public static void main(String[] args) {
		
		intro();
		
		String dest = "\tDestination: ";
		String done = "done";
		String destination = "";
		Scanner input = new Scanner(System.in);
		int comp = destination.compareToIgnoreCase(done);
		ArrayList<String> locations = new ArrayList<String>();
		
		/**
		 * This while loop is used to properly declare "destination"
		 * and then prompt for another destination while adding the users
		 * input into the array.
		 */
		
		while (comp != 0) {
			
			
			System.out.printf("\n" + dest);
			destination = input.nextLine();
			destination = destination.toUpperCase();
			comp = destination.compareToIgnoreCase(done);
			
			if (comp != 0) {
			
				locations.add(destination);
			
			}
		} 
		
		input.close();
		
		itinerary(locations);
		

		
	}
	
	private static void intro() {
		
		String introduction = "This program will prompt you for a series of destinations.\nThen it will display your travel route based on your entries\n";
		String prompt = "\nPlease enter your destinations [Enter 'done' when finished]: ";
		

		System.out.println(introduction + prompt);
		
	}
	
	private static void itinerary(ArrayList<String> arr) {
		
		StringBuilder sb1 = new StringBuilder();
		System.out.print("\nItinerary: " + arr.get(0));
		
		for (int i = 1; i < arr.size(); i++) {
			
			sb1.append(" to " + arr.get(i));
			
		}
		
		System.out.print(sb1);
		
	}

}
