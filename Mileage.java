/** Justin Hass and Gabrielle Fuchs
	09-19-2019
	Miles Per Gallon Calculator
	Mileage.java*/

import java.util.Scanner;

public class Mileage {
	
	public static void main (String[] args) {
		//declare Scanner
		Scanner kb = new Scanner(System.in);
		//declare variables to contain input
		
		double miles;
		//contain user 
		double gallons;
		double mpg;
		do{
		//Print detail header
		System.out.println("Miles per Gallon Calculator");
		//request miles driven
		System.out.println("\nHow many miles have you driven.");
			//collect miles
			miles = Double.parseDouble(kb.nextLine());
			
		//request gallons driven
		System.out.println("How many gallons did you use?");
			//collect gallons
			gallons = Double.parseDouble(kb.nextLine());

		//calculate mpg
		mpg = miles / gallons;

		System.out.println("You drove " + miles + " miles, and used " + gallons + ", \nfor a total Miles per Gallon of " + mpg + ".\n");	
		}while (miles != 000);
		
	}
}