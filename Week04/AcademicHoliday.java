package Week04;
import java.util.Scanner;

/**
 * A program that prints the holiday associated with the selected month in the 2021-2022 academic year.
 *
 * Purdue University -- CS18000 -- Spring 2022 -- Homework 04 -- Walkthrough
 *
 * @author Purdue CS
 * @version January 10, 2021
 */

public class AcademicHoliday {
    public static void main(String[] args) {
        String holiday = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pick a number between 1-6 to select a holiday!");
        System.out.println("1. July");
        System.out.println("2. September");
        System.out.println("3. October");
        System.out.println("4. November");
        System.out.println("5. January");
        System.out.println("6. March");

        // Storing the user's input in month.
        int month = scanner.nextInt();
        scanner.nextLine(); // Eat the newline character
        
        holiday = switch(month) {
	        case 1 -> "Independence Day Holiday";
	        case 2 -> "Labor Day";
	        case 3 -> "October Break";
	        case 4 -> "Thanksgiving Vacation";
	        case 5 -> "Martin Luther King Jr. Day";
	        case 6 -> "Spring Vacation";
	        default -> "";
        };

        
        if (!holiday.isEmpty()) // If holiday is not empty, print the holiday.
        	System.out.printf("The holiday is: %s!\n", holiday);
        else // Otherwise, print the error statement.
        	System.out.println("That's not a valid number!");
        
        scanner.close(); // Close the scanner object.

    }
}
