//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  Variables & Operations Lab
// Java Week 01 Lab  
//
package week01;

public class Week01VariablesAndOperationsLab {

	public static void main(String[] args) {
		
		System.out.println("Week 1 Lab");

		// 1. Create a variable to hold the quantity of 
		//		available plane seats left on a flight	
		System.out.println("\nQuestion 1:");
		int availablePlaneSeats = 5;
		System.out.println(availablePlaneSeats);

		
		// 2. Create a variable to hold the cost of groceries at checkout
		System.out.println("\nQuestion 2");
		double groceryCostAtCheckout=32.12;
		System.out.println(groceryCostAtCheckout);
		
		
		// 3. Create a variable to hold a person's middle initial
		System.out.println("\nQuestion 3");
		char middleInitial='N';
		System.out.println(middleInitial);

	
		// 4. Create a variable to hold true if it's hot outside 	
	//		and false if it's cold outside
		System.out.println("\nQuestion 4");
		boolean isHotOutside=true;
		System.out.println(isHotOutside);
		
		// 5. Create a variable to hold a customer's first name
		System.out.println("\nQuestion 5");
		String customersFirstName="Lee";
		System.out.println(customersFirstName);
		
		// 6. Create a variable to hold a street address
		System.out.println("\nQuestion 6");
		String streetAddress="16101 N Glacier Peak, Nampa, ID 83651";
		System.out.println(streetAddress);
		
		// 7. Print all variables to the console
		System.out.println("\nQuestion 7");
		System.out.println(availablePlaneSeats);
		System.out.println(groceryCostAtCheckout);
		System.out.println(middleInitial);
		System.out.println(isHotOutside);
		System.out.println(customersFirstName);
		System.out.println(streetAddress);
		

		// 8. A customer booked 2 plane seats, 
		//		remove 2 seats from the available seats variable
		System.out.println("\nQuestion 8");
		int seatsLeft=availablePlaneSeats-2;
		System.out.println(seatsLeft);
		
		// 9. Impulse candy bar purchase, add 2.15 to the grocery total
		// 		costOfGroceries = costOfGroceries + 2.15;
		System.out.println("\nQuestion 9");
		double newCostAtCheckout=groceryCostAtCheckout+2.15;
		System.out.println(newCostAtCheckout);
		
		// 10.  The birth certificate was printed incorrectly, 
		//		change the middle initial to something else
		System.out.println("\nQuestion 10");
		char correctMiddleInitial='M';
		System.out.println(correctMiddleInitial);

		// 11.  The season has changed, update the hot outside 
		//			variable to be opposite of what it was
		System.out.println("\nQuestion 11");
		boolean isHotOutside1=false;
		System.out.println(isHotOutside1);

		// 12.  Create a new variable called full name using the customer's first name, 
		//			the middle initial, and a last name of your choice
		System.out.println("\nQuestion 12");
		String lastName= "Blaylock";
		String fullName=customersFirstName+" "+ middleInitial+" "+lastName;
		System.out.println(fullName);
		
		// 13.  Print a line to the console that introduces the customer and says they live
		// 			at the address variable
		System.out.println("\nQuestion 13");
		String customerIntro="Hi I'm"+" "+fullName+"and I live at"+" "+ streetAddress;
		System.out.println(customerIntro);
		
	}
}
