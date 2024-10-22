/*
 *	 Name of Program File: Lifeboats.java
	 Author: Oshan Thapa
	 Date: Oct 6, 2024 10:00 PM
	 Description: This program calculates the number of lifeboats required to save all the people on a ship. 
	  			It also calculates the number and percentage of people rescued, drowned, and any additional spaces in the lifeboats.
 */

import java.util.Scanner;

public class Lifeboats {
	public static void main(String[] args) {
		// Create a scanner object for input
		Scanner input = new Scanner(System.in);

		// Variables to store user inputs
		String nameShip = "";
		int totalPeopleOnShip, availableLifeboats, maxCapacityofALifeboat, minLifeBoatsRequired, numberOfPeopleRescued;
		double totalPeopleRescuedPercent;

		// Get the name of the ship from the user
		System.out.println("      Lifeboat Requirements Analysis     ");
		System.out.println("The name of the ship = ");
		nameShip = input.nextLine();

		// Get the number of people on the ship and ensure it's a positive value
		do {
			System.out.println("The number of people on the ship is = ");
			totalPeopleOnShip = input.nextInt();
		} while (totalPeopleOnShip < 0);

		// Get the number of lifeboats and ensure it's a positive value
		do {
			System.out.println("The number of Life boats = ");
			availableLifeboats = input.nextInt();
		} while (availableLifeboats < 0);

		// Get the maximum capacity of a lifeboats and ensure it's a positive value
		do {
			System.out.println("The maximum number of people one lifeboat can occupy = ");
			maxCapacityofALifeboat = input.nextInt();
		} while (maxCapacityofALifeboat < 0);

		// Calculate the total capacity of the available Lifeboats
		int totalMaxCapacityofLifeboats = maxCapacityofALifeboat * availableLifeboats;

		System.out.println("The name of the ship is " + nameShip);

		// Case 1: Total capacity of Lifeboats is greater than or equal to the number of
		// people on the ship
		if (totalMaxCapacityofLifeboats > totalPeopleOnShip) {
			// Calculate the minimum number of Lifeboats required
			minLifeBoatsRequired = totalPeopleOnShip / maxCapacityofALifeboat;

			if (totalPeopleOnShip % maxCapacityofALifeboat != 0) {
				minLifeBoatsRequired++; // This handles the decimal portion truncated by int and adds an extra lifeboat
			}

			// Number of people that can be rescued
			numberOfPeopleRescued = Math.max(totalPeopleOnShip, totalMaxCapacityofLifeboats);

			// Calculate the percentage of people rescued
			totalPeopleRescuedPercent = (numberOfPeopleRescued / totalPeopleOnShip) * 100;

			// Calculate any additional spaces left in the Lifeboats
			int addPeople = totalMaxCapacityofLifeboats - totalPeopleOnShip;

			// Output the results
			System.out.println(
					"The minimum number of lifeboats required to carry all the people = " + minLifeBoatsRequired);
			System.out.println("The number of people that drowned = O ");
			System.out.println("The number of people that would be rescued if the available lifeboats were filled = "
					+ numberOfPeopleRescued);
			System.out.printf(
					"The percentage of people that would be rescued if the available lifeboats were filled = %.2f%% ",
					totalPeopleRescuedPercent);
			System.out
					.println("\nThe number of additional people that could be carried by the lifeboats = " + addPeople);
		}

		// Case 2: Total capacity of Lifeboats is less than the number of people on the
		// ship
		else if (totalMaxCapacityofLifeboats < totalPeopleOnShip) {

			// Calculate the minimum number of Lifeboats required
			minLifeBoatsRequired = (totalPeopleOnShip / maxCapacityofALifeboat);

			if (totalPeopleOnShip % maxCapacityofALifeboat != 0) {
				minLifeBoatsRequired++; // This handles the decimal portion truncated by int and adds an extra lifeboat
			}

			// Number of people that can be rescued (equal to total capacity of Lifeboats)
			numberOfPeopleRescued = totalMaxCapacityofLifeboats;

			// Calculate the percentage of people rescued type casting int to double for
			// getting decimal values and store in double data type variable
			totalPeopleRescuedPercent = ((double) (numberOfPeopleRescued) / (double) (totalPeopleOnShip)) * 100;

			// Number of people who would drown
			int totalPeopleDrowned = totalPeopleOnShip - numberOfPeopleRescued;

			// Calculate the percentage of people drowned and type casting
			double totalPeopleDrownedPercent = ((double) (totalPeopleDrowned) / (double) (numberOfPeopleRescued)) * 100;

			// Output the results
			System.out.println(
					"The minimum number of lifeboats required to carry all the people = " + minLifeBoatsRequired);
			System.out.println("The number of people that would be rescued if the available lifeboats were filled = "
					+ totalMaxCapacityofLifeboats);
			System.out.printf(
					"The percentage of people that would be rescued if the available lifeboats were filled = %.2f%%\n",
					totalPeopleRescuedPercent);
			System.out.println("The number of people that drowned = " + totalPeopleDrowned);
			System.out.printf("The percentage of people that drowned = %.2f%%", totalPeopleDrownedPercent);
		}

		// Case 2: Total capacity of Lifeboats is equal to the number of people on the
		// ship
		else {

			// Calculate the minimum number of Lifeboats required (even though it would not
			// be enough)
			minLifeBoatsRequired = totalPeopleOnShip / maxCapacityofALifeboat;

			// Number of people that can be rescued (equal to total capacity of Lifeboats)
			numberOfPeopleRescued = availableLifeboats * maxCapacityofALifeboat;

			// Calculate the percentage of people rescued (that would be 100% in this case)
			totalPeopleRescuedPercent = (numberOfPeopleRescued / totalPeopleOnShip) * 100;

			// Output the results
			System.out.println(
					"The minimum number of lifeboats required to carry all the people = " + minLifeBoatsRequired);
			System.out.println("The number of people that drowned = O ");
			System.out.println("The number of people that would be rescued if the available lifeboats were filled = "
					+ numberOfPeopleRescued);
			System.out.printf(
					"The percentage of people that would be rescued if the available lifeboats were filled = =%.2f%% ",
					totalPeopleRescuedPercent);
			System.out.println("My name is Oshan");

		}
		input.close();
	}

	public static void showName() {
		System.out.println("Sagar Chauhan edited");
	}
}
