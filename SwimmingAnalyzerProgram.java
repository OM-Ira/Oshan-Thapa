
/*
 *	 Name of Program File: SwimmingAnalyzerProgram.java
	 Author: Oshan Thapa
	 Date: Oct 18, 2024 02:00 PM
	 Description: This program allows user to track their average, fastest, slowest, and difference between slowest and fastest swimming time. 
 */


import java.util.Scanner;
public class SwimmingAnalyzerProgram {

	public static void main(String[] args) 
	{
       Scanner scanner = new Scanner(System.in);
		
       System.out.print(" Swimming Analyzing Progam ");
		// Asking user for their gender
        System.out.print("Enter your gender (Male/Female): ");
        String gender = scanner.nextLine();

        // Asking for the number of times to record their swimming time
        System.out.print("How many swim times would you like to record? ");
        int numTimes = scanner.nextInt();

        // Creating an array to store the swim times
        double[] swimTimes = new double[numTimes];

        // Recording the swim times
        for (int i = 0; i < numTimes; i++) {
            System.out.print("Enter time in seconds for swim " + (i + 1) + ": ");
            swimTimes[i] = scanner.nextDouble();
        }

        // Calling methods for data analysis
        double averageTime = calculateAverage(swimTimes);
        double fastestTime = findFastest(swimTimes);
        double slowestTime = findSlowest(swimTimes);
        double timeDifference = calculateDifference(fastestTime, slowestTime);

        // Displaying the results
        if (gender.equals("Male"))
        {
        	System.out.println("\n Male Results:");
        }
        else
        {	
        	System.out.println("\n Female Results:");
        }
        System.out.printf("Average swim time: %.2f seconds\n", averageTime);
        System.out.printf("Fastest swim time: %.2f seconds\n", fastestTime);
        System.out.printf("Slowest swim time: %.2f seconds\n", slowestTime);
        System.out.printf("Difference between fastest and slowest: %.2f seconds\n", timeDifference);

        scanner.close();
    }

    // Method to calculate the average swim time
    public static double calculateAverage(double[] times) {
        double sum = 0;
        for (double time : times) {
            sum += time;
        }
        return sum / times.length;
    }

    // Method to find the fastest swim time
    public static double findFastest(double[] times) {
        double fastest = times[0];
        for (double time : times) {
            if (time < fastest) {
                fastest = time;
            }
        }
        return fastest;
    }

    // Method to find the slowest swim time
    public static double findSlowest(double[] times) {
        double slowest = times[0];
        for (double time : times) {
            if (time > slowest) {
                slowest = time;
            }
        }
        return slowest;
    }

    // Method to calculate the difference between fastest and slowest swim times
    public static double calculateDifference(double fastest, double slowest) 
    {
        return slowest - fastest;
    }
} 